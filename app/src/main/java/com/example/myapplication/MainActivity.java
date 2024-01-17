package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("chiou","hello world");
        setContentView(R.layout.activity_main);
        TextView customView = findViewById(R.id.tv);
        customView.setText("食肉何曾尽虎头，卅年书剑海天秋。\n" +
                "\n" +
                "文章幸未逢黄祖，襆被今犹窘马周。\n" +
                "\n" +
                "自是汝才难用世，岂真吾相不当侯？\n" +
                "\n" +
                "须知少日拏云志，曾许人间第一流");
    }
}