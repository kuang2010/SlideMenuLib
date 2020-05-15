package com.kuang2010.slidemenulib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.kuang2010.menu.SlidingMenu;

public class MainActivity extends AppCompatActivity {

    private SlidingMenu mMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = new SlidingMenu(this);
        mMenu.setMode(SlidingMenu.LEFT);// 左侧菜单
        mMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);//屏幕中任何地方都可以拖出slidemenu
//        menu.setTouchModeAbove(SlidingMenu.TOUCHMODE_NONE);//不可以拖出slidemenu
        mMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);// 左侧菜单显示完全后剩余的宽度
//        menu.setBehindWidth(R.dimen.menu_width);
        mMenu.setFadeDegree(0.9f);
        mMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        mMenu.setMenu(R.layout.layout_menu);

        initEvent();
    }

    private void initEvent() {
        findViewById(R.id.tv_hello).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMenu.toggle();
            }
        });
    }
}
