package com.yazhi1992.practice.immersion_status_bar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gyf.barlibrary.ImmersionBar;
import com.yazhi1992.practice.R;

public class ImmersionBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_immersion_bar);

        StatusBarUtils.with(this)
                .setColor(getResources().getColor(R.color.blue))
                .init();

//        ImmersionBar.with(this)
//                .keyboardEnable(true)  //解决软键盘与底部输入框冲突问题
//                .init();

    }
}