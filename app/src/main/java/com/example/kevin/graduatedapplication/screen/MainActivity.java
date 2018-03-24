package com.example.kevin.graduatedapplication.screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kevin.graduatedapplication.R;

public class MainActivity extends AppCompatActivity {
    private Button btnSingleMode,btnMutipleMode,btnSettingMode,btnRuleMode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSingleMode =(Button)findViewById(R.id.button1);
        Button nextPageBtn1=(Button)findViewById(R.id.button1);
        nextPageBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,SingleModeActivity.class);
                startActivity(intent);
            }
        });
        btnMutipleMode =(Button)findViewById(R.id.button2);
        Button nextPageBtn2=(Button)findViewById(R.id.button2);
        nextPageBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,MutipleModeActivity.class);
                startActivity(intent);
            }
        });
        btnSettingMode =(Button)findViewById(R.id.button3);
        Button nextPageBtn3=(Button)findViewById(R.id.button3);
        nextPageBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,SettingModeActivity.class);
                startActivity(intent);
            }
        });
        btnRuleMode =(Button)findViewById(R.id.button4);
        Button nextPageBtn4=(Button)findViewById(R.id.button4);
        nextPageBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,RuleModeActivity.class);
                startActivity(intent);
            }
        });

    }
}
