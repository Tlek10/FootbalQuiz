package com.example.tlekquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tlekquizapp.R;
import com.example.tlekquizapp.playActivity;
import com.example.tlekquizapp.settingActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void main_btn(View view) {
        int viewId = view.getId();
        if (viewId == R.id.btn_play) {
            startActivity(new Intent(MainActivity.this , playActivity.class));
        } else if (viewId == R.id.btn_setting) {
            startActivity(new Intent(MainActivity.this , settingActivity.class));
        } else if (viewId == R.id.btn_exit) {
            this.finishAffinity();
        }
    }

}