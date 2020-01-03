package pe.com.peruapps

import pe.com.peruapps.testexampleapp.models.Info
import pe.com.peruapps.testexampleapp.di.Module

/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Peru Apps
 * Lima, Peru.
 **/
/**Nota: se usa la notación @Module debido a que habría un conflicto con el original*/
class TestModule: Module() {
    override fun sayLoveDagger2(): Info {
        return Info("Test Love")
    }
}