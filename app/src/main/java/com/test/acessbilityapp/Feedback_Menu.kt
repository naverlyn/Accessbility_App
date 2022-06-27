package com.test.acessbilityapp

import android.media.Rating
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.test.acessbilityapp.databinding.ActivityFeedbackMenuBinding
import org.w3c.dom.Text

class Feedback_Menu : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityFeedbackMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityFeedbackMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        //rating
        val ratingBar = findViewById<RatingBar>(R.id.rating_bar)
        val feedback: Button = findViewById(R.id.feedback_btn)
        val label_rating: TextView = findViewById(R.id.rating_label)
        ratingBar?.setOnClickListener{
            val message = ratingBar.rating.toString()
            label_rating.text = message
        }
        feedback?.setOnClickListener { view ->
            Snackbar.make(view, "Terimakasih sudah memberikan kami feedback", Snackbar.LENGTH_LONG)
                .setAction("Action",null).show()
        }
//        val navController = findNavController(R.id.nav_host_fragment_content_feedback_menu)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_feedback_menu)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}