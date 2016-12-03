package com.scnu.zhou.edittextdemo3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.scnu.zhou.widget.SixNumEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 使用
        SixNumEditText sixNumEditText = (SixNumEditText) findViewById(R.id.sixNumEditText);
        sixNumEditText.input(1);
        sixNumEditText.backspace();
        sixNumEditText.setOnCompleteInputListener(new SixNumEditText.OnCompleteInputListener() {
            @Override
            public void onCompleteInput() {
                // 输入完成
            }
        });
    }
}
