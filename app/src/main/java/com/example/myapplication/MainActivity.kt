package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLanzar(view: View) {
        var sumaDado1:Int = 0
       val dado1 = Dado(numLados = 6)
        val valorDado1 = dado1.lanzar()
        sumaDado1 = sumaDado1 + valorDado1
        when(valorDado1){
            1 ->  imageView.setImageResource(R.drawable.dice_1)
            2 ->  imageView.setImageResource(R.drawable.dice_2)
            3 ->  imageView.setImageResource(R.drawable.dice_3)
            4 ->  imageView.setImageResource(R.drawable.dice_4)
            5 ->  imageView.setImageResource(R.drawable.dice_5)
            6 ->  imageView.setImageResource(R.drawable.dice_6)
        }
        var sumaDado2: Int  = 0
        val dado2 = Dado(numLados = 6)
        val valorDado2 = dado2.lanzar()
        sumaDado2 = valorDado2 + sumaDado2
        when(valorDado2){
            1 ->  imageView2.setImageResource(R.drawable.dice_1)
            2 ->  imageView2.setImageResource(R.drawable.dice_2)
            3 ->  imageView2.setImageResource(R.drawable.dice_3)
            4 ->  imageView2.setImageResource(R.drawable.dice_4)
            5 ->  imageView2.setImageResource(R.drawable.dice_5)
            6 ->  imageView2.setImageResource(R.drawable.dice_6)
        }
        if (sumaDado1>sumaDado2){
            val tvDado: TextView = findViewById(R.id.textView)
            tvDado.text =  "Jugador 1 gana con " + " " + sumaDado1.toString() + " " + "puntos"
        }
        if(sumaDado2>sumaDado1){
            val tvDado: TextView = findViewById(R.id.textView)
            tvDado.text =  "Jugador 2 gana con " + " " +  sumaDado2.toString() + " " + "puntos"
        }
        if (sumaDado1 == sumaDado2){
            val tvDado: TextView = findViewById(R.id.textView)
            tvDado.text =  "Jugadores empatados con " +  " " + sumaDado1.toString() + " " + "puntos"
        }
    }
}