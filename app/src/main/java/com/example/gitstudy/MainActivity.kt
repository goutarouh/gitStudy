package com.example.gitstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("hasegawa", "hasegawaのログ")

        Log.i("hasegawa", "三回目のコミットはこちら")

        Log.i("hasegawa", "四回目はこちら")

        Log.i("hasegawa", "さらに変更するよ")

        Log.i("hasegawa", "まだまだ変更するよ")
    }


    fun Hoge() {
        Log.i("hasegawa", "こっちも変更しておきます。")
    }

    fun featureHasegawa() {
        Log.i("hasegawa", "feature_hasegawaの機能です(変更)")
    }
}
