package com.bwf.cn.mysharedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by BWF on 2016/8/12.
 */
public class OtherActivity extends AppCompatActivity {
    private TitleBar titleBar;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otheractivity);
        titleBar = (TitleBar) findViewById(R.id.titlebar);
    }
}
