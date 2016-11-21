package net.sinproject.android.txiicha.plugin.sample.Utils

import android.content.Intent

object TxiichaPluginShowTweetSample {

    enum class Extra {
        tweet_text,
        id,
        created_at,
        source,
        in_reply_to_status_id,
        user_screen_name,
        user_name,
        user_id,
        user_profile_image_url_original,
        user_profile_image_url_bigger,
        user_profile_image_url_normal,
        user_profile_image_url_mini
    }

    val EMPTY_TEXT = "empty"
    var mIntent: Intent = Intent()

    fun getShowTweetText(intent: Intent): String {
        mIntent = intent
        return getText(Intent.EXTRA_TEXT) +
                getText(Extra.id.name) +
                getText(Extra.created_at.name) +
                getText(Extra.source.name) +
                getText(Extra.in_reply_to_status_id.name) +
                getText(Extra.user_screen_name.name) +
                getText(Extra.user_name.name) +
                getText(Extra.user_id.name) +
                getText(Extra.user_profile_image_url_original.name) +
                getText(Extra.user_profile_image_url_mini.name) +
                getText(Extra.user_profile_image_url_normal.name) +
                getText(Extra.user_profile_image_url_bigger.name)
    }

    private fun getText(extra: String): String {
        val intentText = mIntent.extras.getString(extra) ?: EMPTY_TEXT
        return "【$extra】 $intentText\n"
    }
}