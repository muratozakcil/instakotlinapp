package com.muratozakcil.instakotlinapp.Home


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.muratozakcil.instakotlinapp.R
import com.muratozakcil.instakotlinapp.utils.BottomNavigationViewHelper
import com.muratozakcil.instakotlinapp.utils.HomePagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private val ACTIVITY_NO = 0
    private val TAG = "HomeActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setupNavigationView()
        setupHomeViewPager()
    }

    fun setupNavigationView()
    {
        BottomNavigationViewHelper.setupBottomNavigationView(bottomNavigationView)
        BottomNavigationViewHelper.setupNavigation(this,bottomNavigationView)
        val menu = bottomNavigationView.menu
        val menuItem = menu.getItem(ACTIVITY_NO)
        menuItem.setChecked(true)

    }

    fun setupHomeViewPager()
    {
        var homePagerAdapter = HomePagerAdapter(supportFragmentManager)
        homePagerAdapter.addFragment(CameraFragment())
        homePagerAdapter.addFragment(HomeFragment())
        homePagerAdapter.addFragment(MessagesFragment())

        homeViewPager.adapter = homePagerAdapter

        homeViewPager.setCurrentItem(1)

    }


}
