package com.alan.gamedesigncp4

import com.alan.gamedesigncp4.Utils.ROCK
import com.alan.gamedesigncp4.Utils.SCISSORS
import com.alan.gamedesigncp4.Utils.PAPER

class SetBgComChoice(
    val activity: MainActivity,
    val com: String) {

    fun backgroundChoice() {
        if (com == SCISSORS) {
            activity.imgComGunting.setBackgroundColor(activity.resources.getColor(R.color.bg_choice))
            activity.imgComBatu.setBackgroundColor(0)
            activity.imgComKertas.setBackgroundColor(0)
        } else if (com == ROCK) {
            activity.imgComGunting.setBackgroundColor(0)
            activity.imgComBatu.setBackgroundColor(activity.resources.getColor(R.color.bg_choice))
            activity.imgComKertas.setBackgroundColor(0)
        }else if (com == PAPER) {
            activity.imgComBatu.setBackgroundColor(0)
            activity.imgComGunting.setBackgroundColor(0)
            activity.imgComKertas.setBackgroundColor(activity.resources.getColor(R.color.bg_choice))
        }
    }
}