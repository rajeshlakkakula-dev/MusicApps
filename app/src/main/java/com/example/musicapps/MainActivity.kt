package com.example.musicapps

import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {

    var LEFT_VOLUME = 1.0f
    var RIGHT_VOLUME = 1.0f
    var NO_LOOP = 1

    var mCSound by Delegates.notNull<Int>()
    var mDSound by Delegates.notNull<Int>()
    var mESound by Delegates.notNull<Int>()
    var mFSound by Delegates.notNull<Int>()
    var mGSound by Delegates.notNull<Int>()
    var mASound by Delegates.notNull<Int>()
    var mBSound by Delegates.notNull<Int>()

    lateinit var mSoundPool: SoundPool

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mSoundPool = SoundPool.Builder().setMaxStreams(7).build()

        mCSound = mSoundPool.load(applicationContext, R.raw.note1_c, 1)
        mDSound = mSoundPool.load(applicationContext, R.raw.note2_d, 1)
        mESound = mSoundPool.load(applicationContext, R.raw.note3_e, 1)
        mFSound = mSoundPool.load(applicationContext, R.raw.note4_f, 1)
        mGSound = mSoundPool.load(applicationContext, R.raw.note5_g, 1)
        mASound = mSoundPool.load(applicationContext, R.raw.note6_a, 1)
        mBSound = mSoundPool.load(applicationContext, R.raw.note7_b, 1)


    }

    fun playC(view: View) {

        mSoundPool.play(mCSound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)

    }

    fun playD(view: View) {
        mSoundPool.play(mDSound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)
    }

    fun playE(view: View) {
        mSoundPool.play(mESound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)
    }

    fun playF(view: View) {
        mSoundPool.play(mFSound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)
    }

    fun playG(view: View) {
        mSoundPool.play(mASound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)
    }

    fun playA(view: View) {
        mSoundPool.play(mCSound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)
    }

    fun playB(view: View) {

        mSoundPool.play(mBSound, LEFT_VOLUME, RIGHT_VOLUME, 0, NO_LOOP, 1.0f)
    }


}