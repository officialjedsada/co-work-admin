package com.android.cowork.admin.ui.home.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.android.cowork.admin.ui.home.HomeActivity
import com.android.cowork.admin.ui.home.approve.ApproveFragment
import com.android.cowork.admin.ui.home.comment.CommentFragment

class Pager(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment = when (position) {
        0 -> ApproveFragment()
        else -> CommentFragment()
    }

    override fun getCount(): Int = 2

    override fun getPageTitle(position: Int): CharSequence? = when (position) {
        0 -> HomeActivity.tab1
        else -> HomeActivity.tab2
    }
}