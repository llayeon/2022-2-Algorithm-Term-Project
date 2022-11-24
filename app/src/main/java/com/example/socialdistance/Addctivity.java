package com.example.socialdistance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Addctivity extends AppCompatActivity implements ActivityCompat.OnRequestPermissionsResultCallback {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        EditText className = findViewById(R.id.className);
        EditText firstnumber = findViewById(R.id.firstNum);
        EditText secondnumber = findViewById(R.id.secondNum);

        Button check_add = findViewById(R.id.check_add);

        check_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //확인 버튼 누르면 메인화면으로 돌아감
                String classname = className.getText().toString();
                String first= firstnumber.getText().toString();
                String second = secondnumber.getText().toString();

                //메인으로 돌아갈때 입력필드의 입력값을 되돌려준다
                Intent intent = new Intent();
                intent.putExtra("className",classname);
                intent.putExtra("firstnumber",first);
                intent.putExtra("secondnumber",second);
                setResult(RESULT_OK,intent);
                finish();
            }
        });



    }
}