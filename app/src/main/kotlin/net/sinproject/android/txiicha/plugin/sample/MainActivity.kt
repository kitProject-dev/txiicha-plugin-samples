package net.sinproject.android.txiicha.plugin.sample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import net.sinproject.android.txiicha.plugin.sample.Utils.TxiichaPluginShowTweetSample

class MainActivity : AppCompatActivity() {

    val ACTION_SHOW_TWEET = "net.sinproject.android.txiicha.ACTION_SHOW_TWEET"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val dataTextView: TextView = findViewById(R.id.data_text) as TextView
        if (ACTION_SHOW_TWEET == intent.action) {
            dataTextView.text = TxiichaPluginShowTweetSample.getShowTweetText(intent)
        }
    }
}
