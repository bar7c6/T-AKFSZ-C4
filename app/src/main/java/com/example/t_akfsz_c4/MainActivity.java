package com.example.t_akfsz_c4;

//Android 实战开发 chapter 4 基本控件与事件处理

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private void initView(){

        TextView txv = findViewById(R.id.tx1);
        txv.setText("iam text view ");
        txv.setTextSize(20);

        EditText editText = findViewById(R.id.edittx);
        editText.getText().toString();
        editText.setInputType(InputType.TYPE_CLASS_TEXT);

        Button button = findViewById(R.id.btn);
        button.setVisibility(View.VISIBLE);

        ImageView imageView = findViewById(R.id.image_view);
        imageView.setVisibility(View.VISIBLE);
        imageView.setImageResource(R.mipmap.image_1);

        RadioGroup radioGroup = findViewById(R.id.radio_group);
        radioGroup.check(R.id.radio_btn1);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

    }
}