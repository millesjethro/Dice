package com.auf.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbtn = findViewById<Button>(R.id.rollbtn)
        val dices1 = findViewById<TextView>(R.id.dice1)
        val dices2 = findViewById<TextView>(R.id.dice2)
        val dices3 = findViewById<TextView>(R.id.dice3)
        val luck1 = findViewById<TextView>(R.id.lon1)
        val luck2 = findViewById<TextView>(R.id.lon2)
        val luck3 = findViewById<TextView>(R.id.lon3)
        val check = findViewById<CheckBox>(R.id.checkBox)
        var checker1: Boolean = false
        var checker2: Boolean = false
        var checker3: Boolean = false
            rollbtn.setOnClickListener {
            val die = Dice()

            dices1.text = "Dice 1: "+die.dice1.toString()
            dices2.text = "Dice 2: "+die.dice2.toString()
            dices3.text = "Dice 3: "+die.dice3.toString()


            if(die.lnum1){
                luck1.text = "Not"
                checker1 = false
            }
            else{
                luck1.text = "Lucky"
                checker1 = true
            }

            if(die.lnum2){
                luck2.text = "Not"
                checker2 = true
            }
            else{
                luck2.text = "Lucky"
                checker2 = true
            }

            if(die.lnum3){
                luck3.text = "Not"
                checker3 = true
            }
            else{
                luck3.text = "lucky"
                checker3 = true
            }

            if(check.isChecked){
                 if(!checker1 && !checker2 && !checker3){
                    var toast = Toast.makeText(applicationContext, "You Won",Toast.LENGTH_SHORT)
                    toast.show()
                 } else {
                    var toast = Toast.makeText(applicationContext, "You Lose",Toast.LENGTH_SHORT)
                    toast.show()
                }
            }

            }
    }
}