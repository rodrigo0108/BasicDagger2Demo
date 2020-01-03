package pe.com.peruapps.testexampleapp.di

import dagger.Component
import pe.com.peruapps.testexampleapp.activities.Storage
import pe.com.peruapps.testexampleapp.annotation.MagicScope

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Peru Apps
 * Lima, Peru.
 **/
@MagicScope
@Component
interface Magic2Box {
    fun poke(storage: Storage)
}