package com.sherif.nearbyplaces.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toolbar
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.sherif.nearbyplaces.R
import com.sherif.nearbyplaces.ui.explore.ExploreListViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ExploreListViewModel



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        viewModel = ViewModelProviders.of(this).get(ExploreListViewModel::class.java)

        textchossenmode.setOnClickListener(View.OnClickListener {
       viewModel.switchModeCLickListener
            viewModel.modeMessage.observe(this, Observer {modeMessage ->textchossenmode.text = modeMessage })

    })

    }
}