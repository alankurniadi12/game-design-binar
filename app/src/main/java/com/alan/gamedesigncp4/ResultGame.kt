package com.alan.gamedesigncp4

import android.util.Log

open class ResultGame(val activity: MainActivity) {


    open fun playerChoiceGunting(player: String, com: String) {
        //Show choice to Logging
        Log.d(activity.TAG, "Player memilih: $player")
        Log.d(activity.TAG, "COM memilih: $com")
        if (player == Utils.SCISSORS && com == activity.comList[0]) {
            val plyer = SetBgPlayerChoice(activity, Utils.SCISSORS)
            val comp = SetBgComChoice(activity, Utils.SCISSORS)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.draw)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.DRAW}")

        } else if (player == Utils.SCISSORS && com == activity.comList[1]) {
            val plyer = SetBgPlayerChoice(activity, Utils.SCISSORS)
            val comp = SetBgComChoice(activity, Utils.ROCK)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.com_win)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.COM_WIN}")

        } else if (player == Utils.SCISSORS && com == activity.comList[2]) {
            val plyer = SetBgPlayerChoice(activity, Utils.SCISSORS)
            val comp = SetBgComChoice(activity, Utils.PAPER)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.you_win)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.YOU_WIN}")
        }
    }

    open fun playerChoiceBatu(player: String, com: String) {
        //Show choice to Logging
        Log.d(activity.TAG, "Player memilih: $player")
        Log.d(activity.TAG, "COM memilih: $com")
        if (player == Utils.ROCK && com == activity.comList[0]) {
            val plyer = SetBgPlayerChoice(activity, Utils.ROCK)
            val comp = SetBgComChoice(activity, Utils.SCISSORS)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.you_win)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.YOU_WIN}")

        } else if (player == Utils.ROCK && com == activity.comList[1]) {
            val plyer = SetBgPlayerChoice(activity, Utils.ROCK)
            val comp = SetBgComChoice(activity, Utils.ROCK)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.draw)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.DRAW}")

        } else if (player == Utils.ROCK && com == activity.comList[2]) {
            val plyer = SetBgPlayerChoice(activity, Utils.ROCK)
            val comp = SetBgComChoice(activity, Utils.PAPER)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.com_win)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.COM_WIN}")
        }
    }

    open fun playerChoiceKertas(player: String, com: String) {
        //Show choice to Logging
        Log.d(activity.TAG, "Player memilih: $player")
        Log.d(activity.TAG, "COM memilih: $com")
        if (player == Utils.PAPER && com == activity.comList[0]) {
            val plyer = SetBgPlayerChoice(activity, Utils.PAPER)
            val comp = SetBgComChoice(activity, Utils.SCISSORS)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.com_win)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.COM_WIN}")

        } else if (player == Utils.PAPER && com == activity.comList[1]) {
            val plyer = SetBgPlayerChoice(activity, Utils.PAPER)
            val comp = SetBgComChoice(activity, Utils.ROCK)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.you_win)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.YOU_WIN}")

        } else if (player == Utils.PAPER && com == activity.comList[2]) {
            val plyer = SetBgPlayerChoice(activity, Utils.PAPER)
            val comp = SetBgComChoice(activity, Utils.PAPER)
            comp.backgroundChoice()
            plyer.backgroundChoice()
            activity.imgVersus.setImageResource(R.drawable.draw)

            //Show result to Logging
            Log.d(activity.TAG, "Hasilnya adalah: ${Utils.DRAW}")
        }
    }
}