package pe.com.peruapps.testexampleapp

import dagger.Component


/**
 * Created by Rodrigo Ramos on 03/01/2020.
 * rodrigo.ramos@peruapps.com.pe
 *
 * Lima, Peru.
 **/

/**Los componentes mantienen unido todo.
 * Son una forma de decirle a Dagger 2 qué dependencias se deben
 * agrupar y poner a disposición de una instancia determinada para que se
 * puedan usar. Proporcionan una forma para que una clase solicite
 * dependencias que se inyectan a través de su anotación @Inject. **/

@Component(modules = [Module::class])
interface MagicBox{
    fun poke(app: MainActivity)
}