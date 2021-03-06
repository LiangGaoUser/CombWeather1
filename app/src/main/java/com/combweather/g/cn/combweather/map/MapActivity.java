package com.combweather.g.cn.combweather.map;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.combweather.g.cn.combweather.R;
import com.combweather.g.cn.combweather.common.TopBar;

public class MapActivity extends AppCompatActivity {

    private TopBar topBar;
    private Button bn_topbar_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        topBar = new TopBar(MapActivity.this);
        initTopBar();//设置标题栏


    }

    private void initTopBar() {
        topBar.setTitleName("地 图");
        topBar.setMenuVisible(View.INVISIBLE);
    }
}
