#Usage


##AndroidManifest.xml

```
<intent-filter>
    <action android:name="net.sinproject.android.txiicha.ACTION_SHOW_TWEET" />
    <category android:name="android.intent.category.DEFAULT" />
</intent-filter>
```

##Java
```
getIntent.getExtras.getString(key)
```
##Kotlin
```
intent.extras.getString(key)
```

##ShowTweetData
| key | value | type |
| :-- | :-- | :-- |
| Intent.EXTRA_TEXT | Tweet text | String |
| id | Tweet id | String |
| created_at | tweet created at  | String |
| source | Client name | String |
| in_reply_to_status_id | In reply to status id | String |
| user_screen_name | User screen name | String |
| user_name | User name | String |
| user_id | User id | String |
| user_profile_image_url_original | Original size user profile image url | String |
| user_profile_image_url_bigger | Bigger size user profile image url | String |
| user_profile_image_url_normal | Normal size user profile image url | String |
| user_profile_image_url_min | Min size user profile image url | String |
