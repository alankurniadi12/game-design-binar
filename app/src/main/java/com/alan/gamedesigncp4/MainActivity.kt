package com.alan.gamedesigncp4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.alan.gamedesigncp4.Utils.ROCK
import com.alan.gamedesigncp4.Utils.SCISSORS
import com.alan.gamedesigncp4.Utils.PAPER

class MainActivity : AppCompatActivity(), View.OnClickListener {
    //Player
    val imgScissors: ImageView by lazy { findViewById(R.id.img_gunting) }
    val imgRock: ImageView by lazy { findViewById(R.id.img_batu) }
    val imgPaper: ImageView by lazy { findViewById(R.id.img_kertas) }

    //COM
    val imgComGunting: ImageView by lazy { findViewById(R.id.img_com_gunting) }
    val imgComBatu: ImageView by lazy { findViewById(R.id.img_com_batu) }
    val imgComKertas: ImageView by lazy { findViewById(R.id.img_com_kertas) }

    private val imgRefresing: ImageView by lazy { findViewById(R.id.img_refresh) }
    val imgVersus: ImageView by lazy { findViewById(R.id.img_vs) }

    val TAG = MainActivity::class.java.simpleName
    val comList = listOf("GUNTING", "BATU", "KERTAS")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgRock.setOnClickListener(this)
        imgPaper.setOnClickListener(this)
        imgScissors.setOnClickListener(this)
        imgRefresing.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val resultGame = ResultGame(this)
        when(v) {
            imgScissors -> resultGame.playerChoiceGunting(SCISSORS, comList.random())
            imgRock -> resultGame.playerChoiceBatu(ROCK, comList.random())
            imgPaper -> resultGame.playerChoiceKertas(PAPER, comList.random())
            imgRefresing -> {
                finish()
                startActivity(intent)
                Toast.makeText(this, "Mulai Ulang", Toast.LENGTH_SHORT).show()
            }
        }
    }
}