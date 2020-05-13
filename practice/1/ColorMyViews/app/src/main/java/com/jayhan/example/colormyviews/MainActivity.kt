package com.jayhan.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setListener()
    }

    private fun makeColored(view: View) {
        when (view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.red_button->box_three_text.setBackgroundResource(R.color.my_red)
            R.id.green_button->box_four_text.setBackgroundResource(R.color.my_green)
            R.id.yellow_button->box_five_text.setBackgroundResource(R.color.my_yellow)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }

    private fun setListener() {
        val boxOneText = box_one_text
        val boxTwoText = box_two_text
        val boxThreeText = box_three_text
        val boxFourText = box_four_text
        val boxFiveText = box_five_text
        val rootConstraintLayout = constraint_layout

        val redButton = red_button
        val greenButton = green_button
        val yellowButton = yellow_button

        val clickableViews: List<View> = listOf(
            boxOneText,
            boxTwoText,
            boxThreeText,
            boxFourText,
            boxFiveText,
            rootConstraintLayout,
            redButton,
            greenButton,
            yellowButton
        )

        for (item in clickableViews) {
            item.setOnClickListener {
                makeColored(it)
            }
        }
    }
}
