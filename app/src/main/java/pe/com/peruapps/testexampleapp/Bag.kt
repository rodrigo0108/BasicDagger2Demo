package pe.com.peruapps.testexampleapp

import dagger.Module
import dagger.Provides

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Peru Apps
 * Lima, Peru.
 **/
@Module
open class Bag {
    @Provides
    open fun sayLoveDagger2(): Info {
        return Info("Love Dagger 2")
    }
}