package com.example.socialdistance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    Button newClass;
    Button array_first;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newClass = findViewById(R.id.newClass3);
        array_first = findViewById(R.id.array1);
        //activity_main에 id가 btn_add인 버튼과 연결해준다
        Button btn_add = findViewById(R.id.btn_add);

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //현재 페이지 MainActivity에서 Addactivity로 넘어가겠다
                Intent intent = new Intent(getApplicationContext(),Addctivity.class);
                //액티비티 이동
                getAddctivityResult.launch(intent); //startActivityForResult랑 동일한 기능 수행
            }


        });


    }

    private final ActivityResultLauncher<Intent> getAddctivityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            result -> {
                //add로부터 돌아올때 add에서 벌어진 결과값을 받아올수있는 통로
                if(result.getResultCode() == RESULT_OK){
                    //입력 값을 메인에 받아서 버튼의 text변경
                    newClass.setText(result.getData().getStringExtra("className"));
                    newClass.setVisibility(newClass.VISIBLE);
                    array_first.setText(result.getData().getStringExtra("firstnumber"));
                    array_first.setVisibility(array_first.VISIBLE);
                }
            }
    );


    String firstN = array_first.getText().toString();

    public void gotoselect(View view){
        Intent intent2 = new Intent(MainActivity.this,SelectActivity.class);
        intent2.putExtra("firstN",firstN);
        startActivity(intent2);
        finish();
    }


}