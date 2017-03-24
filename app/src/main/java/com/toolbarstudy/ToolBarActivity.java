package com.toolbarstudy;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * 展示ToolBar基本用法的Activity
 * Created by liu on 2017/3/24.
 */

public class ToolBarActivity extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        initToolbar();
    }

    private void initToolbar() {
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        toolbar.setNavigationIcon(R.mipmap.nav_icon);//设置导航栏图标
        toolbar.setLogo(R.mipmap.ic_launcher);//设置logo
        toolbar.setTitle("Title");//设置title
        toolbar.setTitleTextColor(Color.WHITE);//设置title的颜色
        toolbar.setSubtitle("Subtitle");//设置Subtitle
        toolbar.setSubtitleTextColor(Color.WHITE);//设置Subtitle的颜色
        toolbar.inflateMenu(R.menu.tool_bar);//设置menu
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()){
                    case R.id.refresh_icon:case R.id.item01:case R.id.item02:
                        Toast.makeText(ToolBarActivity.this,item.getTitle(),Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
