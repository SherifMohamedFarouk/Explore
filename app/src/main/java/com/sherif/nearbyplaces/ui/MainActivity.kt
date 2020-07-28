package com.sherif.nearbyplaces.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.sherif.nearbyplaces.R
import com.sherif.nearbyplaces.ui.explore.ExploreListViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: ExploreListViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(ExploreListViewModel::class.java)
    }
}