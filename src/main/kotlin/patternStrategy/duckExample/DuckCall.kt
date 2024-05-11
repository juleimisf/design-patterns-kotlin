package patternStrategy.duckExample

import patternStrategy.duckExample.quackBehavour.QuackBehavior

class DuckCall(var _quackBehavior: QuackBehavior) {

    fun performQuack(){
        _quackBehavior.quack()
    }

    fun setQuackBehavior(qb: QuackBehavior) {
        _quackBehavior = qb
    }
}