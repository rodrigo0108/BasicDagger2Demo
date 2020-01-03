package pe.com.peruapps.testexampleapp.activities

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import kotlinx.android.synthetic.main.activity_main2.*
import pe.com.peruapps.testexampleapp.R
import pe.com.peruapps.testexampleapp.annotation.MagicScope
import pe.com.peruapps.testexampleapp.di.DaggerMagic2Box
import pe.com.peruapps.testexampleapp.di.Magic2Box
import javax.inject.Inject

class Main2Activity : AppCompatActivity() {

    private lateinit var magicBox: Magic2Box

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        magicBox = DaggerMagic2Box.create()

        /**
         * Cuando se hace clic en el botón btn_create, se creará un nuevo almacenamiento y se lo pincha
         * con el magic2Box para crear la variable miembro dentro. Luego se imprime en un text view.*/

        btn_create.setOnClickListener {
            val storage = Storage()
            magicBox.poke(storage)
            text_view.text = "Unique ${storage.uniqueMagic.count}" + "\nNormal ${storage.normalMagic.count} "
        }
    }

}

class Storage {
    @Inject lateinit var uniqueMagic: UniqueMagic
    @Inject lateinit var normalMagic: NormalMagic
}

/**
 * Aquí hay 2 variables para mostrar una con @MagicScope y otra sin esta. Es decir, UniqueMagic será
 * único, así que lo defino con @MagicScope. Y para NormalMagic, no tiene un alcance */

var staticCounter = 0

@MagicScope
class UniqueMagic @Inject constructor() {
    val count = staticCounter++
}

class NormalMagic @Inject constructor() {
    val count = staticCounter++
}