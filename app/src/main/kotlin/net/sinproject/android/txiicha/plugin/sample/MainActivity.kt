package net.sinproject.android.txiicha.plugin.sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataTextView: TextView = findViewById(R.id.data_text) as TextView
        if ("net.sinproject.android.txiicha.ACTION_SHOW_TWEET" == intent.action) {
            dataTextView.text = getShowTweetText(intent)
        }
    }

    private fun getShowTweetText(intent: Intent): String {
        val tweetText = intent.extras.getString(Intent.EXTRA_TEXT) ?: "empty"
        val id = intent.extras.getString("id") ?: "empty"
        val latitude = intent.extras.getString("latitude") ?: "empty"
        val longitude = intent.extras.getString("longitude") ?: "empty"
        val createdAt = intent.extras.getString("created_at") ?: "empty"
        val source = intent.extras.getString("source") ?: "empty"
        val inReplyToStatusId = intent.extras.getString("in_reply_to_status_id") ?: "empty"
        val userScreenName = intent.extras.getString("user_screen_name") ?: "empty"
        val userName = intent.extras.getString("user_name") ?: "empty"
        val userId = intent.extras.getString("user_id") ?: "empty"
        val userProfileImageUrl = intent.extras.getString("user_profile_image_url") ?: "empty"
        val userProfileImageUrlMini = intent.extras.getString("user_profile_image_url_mini") ?: "empty"
        val userProfileImageUrlNormal = intent.extras.getString("user_profile_image_url_normal") ?: "empty"
        val userProfileImageUrlBigger = intent.extras.getString("user_profile_image_url_bigger") ?: "empty"
        return "【tweet_text】 " + tweetText + "\n" +
                "【id】 " + id + "\n" +
                "【latitude】 " + latitude + "\n" +
                "【longitude】 " + longitude + "\n" +
                "【created_at】 " + createdAt + "\n" +
                "【source】 " + source + "\n" +
                "【in_reply_to_status_id】 " + inReplyToStatusId + "\n" +
                "【user_screen_name】 " + userScreenName + "\n" +
                "【user_name】 " + userName + "\n" +
                "【user_id】 " + userId + "\n" +
                "【user_profile_image_url】 " + userProfileImageUrl + "\n" +
                "【user_profile_image_url_mini】 " + userProfileImageUrlMini + "\n" +
                "【user_profile_image_url_normal】 " + userProfileImageUrlNormal + "\n" +
                "【user_profile_image_url_bigger】 " + userProfileImageUrlBigger
    }
}
