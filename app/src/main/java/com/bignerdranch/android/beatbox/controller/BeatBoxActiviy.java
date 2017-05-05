package com.bignerdranch.android.beatbox.controller;

import android.support.v4.app.Fragment;

public class BeatBoxActiviy extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return BeatBoxFragment.newInstance();
    }
}
