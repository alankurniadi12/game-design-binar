package com.alan.gamedesigncp4

import com.alan.gamedesigncp4.Utils.ROCK
import com.alan.gamedesigncp4.Utils.SCISSORS
import com.alan.gamedesigncp4.Utils.PAPER

class SetBgPlayerChoice(
    private val activity: MainActivity,
    private val player: String) {

    fun backgroundChoice() {
        if (player == SCISSORS) {
            activity.imgScissors.setBackgroundColor(activity.resources.getColor(R.color.bg_choice))
            activity.imgRock.setBackgroundColor(0)
            activity.imgPaper.setBackgroundColor(0)
        } else if (player == ROCK) {
            activity.imgScissors.setBackgroundColor(0)
            activity.imgRock.setBackgroundColor(activity.resources.getColor(R.color.bg_choice))
            activity.imgPaper.setBackgroundColor(0)
        }else if (player == PAPER) {
            activity.imgPaper.setBackgroundColor(activity.resources.getColor(R.color.bg_choice))
            activity.imgRock.setBackgroundColor(0)
            activity.imgScissors.setBackgroundColor(0)
        }
    }

}