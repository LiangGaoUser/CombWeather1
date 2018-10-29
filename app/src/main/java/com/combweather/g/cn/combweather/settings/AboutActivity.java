package com.combweather.g.cn.combweather.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.combweather.g.cn.combweather.JavaBean.User;
import com.combweather.g.cn.combweather.R;
import com.combweather.g.cn.combweather.common.TopBar;
import com.combweather.g.cn.combweather.homepage.LoginActivity;

import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        initAction();//设置标题栏
    }

    private void initAction() {
        TextView tvBack = (TextView) findViewById(R.id.tv_action1);
        findViewById(R.id.tv_action2).setVisibility(View.INVISIBLE);
        //为“返回”添加点击事件
        tvBack.setText("返回");
        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutActivity.this, SettingsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
