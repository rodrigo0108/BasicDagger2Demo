package pe.com.peruapps.testexampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //DaggerMagicBox is an auto-generated implementation of the @component interface defined
        DaggerMagicBox.create().poke(this)
        txtTest.text = info.text
    }


}
