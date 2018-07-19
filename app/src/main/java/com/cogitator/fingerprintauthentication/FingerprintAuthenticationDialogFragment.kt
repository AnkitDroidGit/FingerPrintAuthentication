package com.cogitator.fingerprintauthentication

import android.content.SharedPreferences
import android.hardware.fingerprint.FingerprintManager
import android.support.v4.app.DialogFragment
import android.view.inputmethod.InputMethodManager

import android.content.Context
import android.content.SharedPreferences
import android.hardware.fingerprint.FingerprintManager
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

/**
 * @author Ankit Kumar on 19/07/2018
 */
class FingerprintAuthenticationDialogFragment :DialogFragment(), TextView.OnEditorActionListener,
        FingerprintUiHelper.Callback{
    private lateinit var callback: Callback
    private lateinit var cryptoObject: FingerprintManager.CryptoObject
    private lateinit var fingerprintUiHelper: FingerprintUiHelper
    private lateinit var inputMethodManager: InputMethodManager
    private lateinit var sharedPreferences: SharedPreferences

    private var stage = Stage.FINGERPRINT
}