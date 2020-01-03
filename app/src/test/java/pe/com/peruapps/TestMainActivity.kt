package pe.com.peruapps

import dagger.Component
import junit.framework.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import pe.com.peruapps.testexampleapp.Constants.HELLO
import pe.com.peruapps.testexampleapp.Constants.LOVE
import pe.com.peruapps.testexampleapp.DaggerMagicBox
import pe.com.peruapps.testexampleapp.Info
import pe.com.peruapps.testexampleapp.MagicBox
import pe.com.peruapps.testexampleapp.Module
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Peru Apps
 * Lima, Peru.
 **/

class TestMainActivity {

    @Inject
    @field:Named(LOVE) lateinit var infoLove: Info
    @Inject
    @field:Named(HELLO) lateinit var infoHello: Info

    @Before
    fun setup() {
        DaggerTestMagicBox
            .builder().module(TestModule()).build().poke(this)
    }

    @Test
    fun simpleTest() {
        assertEquals("Test Love", infoLove.text)
        assertEquals("Hello Dagger 2", infoHello.text)}
}
