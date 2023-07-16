package com.example.kinopoiskup.presentation


import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.service.textservice.SpellCheckerService
import android.text.Html
import android.view.*
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import androidx.viewpager.widget.ViewPager.OnPageChangeListener
import com.example.kinopoiskup.R
import com.example.kinopoiskup.entity.Session


class WelcomeActivity : AppCompatActivity() {

        private var viewPager: ViewPager? = null
        private var myViewPagerAdapter: MyViewPagerAdapter? = null
        private var dotsLayout: LinearLayout? = null
        private lateinit var dots: Array<TextView?>
        private var layouts: IntArray? = null
        private var btnSkip: TextView? = null

    private lateinit var session: Session


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            session = Session(this)
            if (!session.isFirstTimeLaunch()) {
                launchHomeScreen()
                finish()
            }

                window.decorView.systemUiVisibility =
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN

            setContentView(R.layout.activity_welcome)
            viewPager = findViewById<View>(R.id.view_pager) as ViewPager
            dotsLayout = findViewById<View>(R.id.layoutDots) as LinearLayout
            btnSkip = findViewById<View>(R.id.btn_skip) as TextView //Button

            layouts = intArrayOf(
                R.layout.welcome_slide1,
                R.layout.welcome_slide2,
                R.layout.welcome_slide3,

            )

            addBottomDots(0)
            changeStatusBarColor()
            myViewPagerAdapter = MyViewPagerAdapter()
            viewPager!!.adapter = myViewPagerAdapter
            viewPager!!.addOnPageChangeListener(viewPagerPageChangeListener)
            btnSkip!!.setOnClickListener {
                    launchHomeScreen()
            }

        }

        private fun addBottomDots(currentPage: Int) {
            dots = arrayOfNulls(layouts!!.size)

            dotsLayout!!.removeAllViews()
            for (i in dots.indices) {
                dots[i] = TextView(this)
                dots[i]!!.text = Html.fromHtml("&#8226;")
                dots[i]!!.textSize = 35f
                dots[i]!!.setTextColor(Color.LTGRAY)
                dotsLayout!!.addView(dots[i])
            }

            if (dots.size > 0) dots[currentPage]!!.setTextColor(Color.BLACK)
        }



        private fun launchHomeScreen() {
            session.setFirstTimeLaunch(false)
            startActivity(Intent(this@WelcomeActivity, MainActivity::class.java))
            finish()
        }


        var viewPagerPageChangeListener: OnPageChangeListener = object : OnPageChangeListener {
            override fun onPageSelected(position: Int) {
                addBottomDots(position)
            }

            override fun onPageScrolled(arg0: Int, arg1: Float, arg2: Int) {
                if (arg0 == 2) launchHomeScreen()
            }
            override fun onPageScrollStateChanged(arg0: Int) {
            }
        }

        /**
         * Making notification bar transparent
         */
        private fun changeStatusBarColor() {
                val window: Window = window
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
                window.setStatusBarColor(Color.TRANSPARENT)

        }

        /**
         * View pager adapter
         */
        inner class MyViewPagerAdapter : PagerAdapter() {
            private var layoutInflater: LayoutInflater? = null
            override fun instantiateItem(container: ViewGroup, position: Int): Any {
                layoutInflater =
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
                val view: View = layoutInflater!!.inflate(layouts!![position], container, false)
                container.addView(view)
                return view
            }

            override fun getCount(): Int {
                return layouts!!.size
            }

            override fun isViewFromObject(view: View, obj: Any): Boolean {
                return view == obj
            }

            override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
                val view: View = `object` as View
                container.removeView(view)
            }
        }
    }

