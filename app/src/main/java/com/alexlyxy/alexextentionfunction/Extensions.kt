package com.alexlyxy.alexextentionfunction

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.showToast (text: String){
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}

fun AppCompatActivity.openFragment(fragment :Fragment){
    supportFragmentManager
        .beginTransaction()
        .replace(R.id.holder, fragment)
        .commit()
}
fun Fragment.openFragment(fragment :Fragment) {
    (activity as AppCompatActivity).supportFragmentManager
        .beginTransaction()
        .replace(R.id.holder,fragment)
        .commit()
}