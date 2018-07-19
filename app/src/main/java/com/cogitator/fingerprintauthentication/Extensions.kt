package com.cogitator.fingerprintauthentication

import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * @author Ankit Kumar on 19/07/2018
 */

fun AppCompatActivity.showToast(text: String) {
    Toast.makeText(this, text, Toast.LENGTH_LONG).show()
}