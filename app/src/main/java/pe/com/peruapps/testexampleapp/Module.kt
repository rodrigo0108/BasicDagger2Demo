package pe.com.peruapps.testexampleapp

import dagger.Module
import dagger.Provides
import pe.com.peruapps.testexampleapp.Constants.HELLO
import pe.com.peruapps.testexampleapp.Constants.LOVE
import javax.inject.Named

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Lima, Peru.
 **/

//Un módulo se usa como una bolsa, para almacenar un repositorio del objeto provisto para inyección
@Module
open class Module {
    //Provides no puede funcionar por si mismo, necesita de un módulo
    @Provides @Named(LOVE)
    open  fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2")
    }
    @Provides @Named(HELLO)
    open  fun sayHelloDagger2(): Info {
        return Info("Hello Dagger 2")
    }
}