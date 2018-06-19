package com.muratozakcil.instakotlinapp.Profile

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.muratozakcil.instakotlinapp.R
import com.muratozakcil.instakotlinapp.utils.BottomNavigationViewHelper
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 4
    private val TAG = "ProfileActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

         setupToolbar()
               setupNavigationView()
         }

private fun setupToolbar() {
    imgProfileSettings.setOnClickListener {

        var intent = Intent(this,ProfileSettingsActivity::class.java)
        startActivity(intent)

    }
}


fun setupNavigationView()
    {
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }
}
