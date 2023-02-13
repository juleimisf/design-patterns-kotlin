package state.simpleExample

import state.simpleExample.Context


interface State {
    fun action(context : Context)
    fun print() : String
}