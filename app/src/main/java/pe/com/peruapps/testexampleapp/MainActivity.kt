package pe.com.peruapps.testexampleapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import pe.com.peruapps.testexampleapp.Constants.HELLO
import pe.com.peruapps.testexampleapp.Constants.LOVE
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    //Inject se encarga de proporcionar lo que definimos en nuestro módulo en el contexto referenciado
    //Named usa de @Qualifier, que funciona como un árbitro para decidir cúando usar que
    @Inject @field:Named(LOVE) lateinit var infoLove: Info
    @Inject @field:Named(HELLO) lateinit var infoHello: Info

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerMagicBox es una implementación autogenerada de la interfaz @componente definida
        DaggerMagicBox.create().poke(this)
        txtTest.text = "${infoLove.text} ${infoHello.text}"
    }


}
