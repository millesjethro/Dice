package com.auf.dice

class Dice {
    var dice1 = (1..10).random()
    var dice2 = (1..20).random()
    var dice3 = (1..30).random()
    var luckynum1 = 7
    var luckynum2 = 16
    var luckynum3 = 18
    var lnum1: Boolean = false
    var lnum2: Boolean = false
    var lnum3: Boolean = false


    private fun luckynum(){
        (luckynum1 != dice1).also { lnum1 = it }
        (luckynum2 != dice2).also { lnum2 = it }
        (luckynum3 != dice3).also { lnum3 = it }
    }

    val lnnum = luckynum()
}