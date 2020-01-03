package pe.com.peruapps

import dagger.Component
import pe.com.peruapps.testexampleapp.di.MagicBox
import pe.com.peruapps.testexampleapp.di.Module

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Peru Apps
 * Lima, Peru.
 **/

/**A diferencia de TestBag, aquí necesito tener la notación @Component . Note que para TestMagicBox,
 * tiene que apuntar módulos = [Module::class] en vez de módulo = [TestModule::class]. Esto es porque
 * TestModule no tiene @Module establecido en él.*/
@Component(modules = [Module::class])
interface TestMagicBox : MagicBox {
    fun poke(app: TestMainActivity)
}