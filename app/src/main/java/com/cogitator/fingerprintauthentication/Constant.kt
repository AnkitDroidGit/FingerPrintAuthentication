package com.cogitator.fingerprintauthentication

/**
 * @author Ankit Kumar on 19/07/2018
 */

@JvmField
val DEFAULT_KEY_NAME = "default_key"

/**
 * Enumeration to indicate which authentication method the user is trying to authenticate with.
 */
enum class Stage { FINGERPRINT, NEW_FINGERPRINT_ENROLLED, PASSWORD }