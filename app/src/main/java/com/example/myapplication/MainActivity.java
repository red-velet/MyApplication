package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("chiou", "hello world");
        setContentView(R.layout.activity_main);
        TextView customView = findViewById(R.id.tv);
        customView.setText("食肉何曾尽虎头，卅年书剑海天秋。\n" +
                "\n" +
                "文章幸未逢黄祖，襆被今犹窘马周。\n" +
                "\n" +
                "自是汝才难用世，岂真吾相不当侯？\n" +
                "\n" +
                "须知少日拏云志，曾许人间第一流");
        //获取按钮，添加点击事件
        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SongActivity.class);
                startActivity(intent);
            }
        });
        toTextContent(R.id.btn2TextContent);
        toMyPage(R.id.btn2TextSize, TextSize.class);
        toMyPage(R.id.btn2TextColor, TextColor.class);
        toMyPage(R.id.btn2ViewBorder, ViewBorder.class);
        toMyPage(R.id.btn2LinearLayout, LinearLayout.class);
        toMyPage(R.id.btn2RelativeLayout, RelativeLayout.class);
        toMyPage(R.id.btn2GridLayout, GridLayout.class);
        toMyPage(R.id.btn2ScrollViewLayout, ScrollViewLayout.class);
        toMyPage(R.id.btn2Button, MyButton.class);
        toMyPage(R.id.btn2Image, Image.class);
    }

    public void toTextContent(int id) {
        Button btn = findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, TextContent.class);
                startActivity(intent);
            }
        });
    }

    public void toMyPage(int id, Class<?> clazz) {
        Button btn = findViewById(id);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, clazz);
                startActivity(intent);
            }
        });
    }
}