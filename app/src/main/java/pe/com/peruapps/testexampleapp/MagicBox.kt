package pe.com.peruapps.testexampleapp

import dagger.Component

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Peru Apps
 * Lima, Peru.
 **/
@Component(modules = [Bag::class])
interface MagicBox{
    fun poke(app: MainActivity)
}