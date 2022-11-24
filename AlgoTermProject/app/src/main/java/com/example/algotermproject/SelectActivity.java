package com.example.algotermproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SelectActivity extends AppCompatActivity {

    // xml에서 만들 뷰들을 제어하기 위한 참조변수들을 MainActivity의 멤버변수로 선언
    ImageView iV1,iV2,iV3,iV4,iV5,iV6,iV7,iV8,iV9,iV10,iV11,iV12,iV13,iV14,iV15,iV16,iV17,iV18,iV19,iV20,iV21,iV22,iV23,iV24,iV25,iV26,iV27,iV28,iV29,iV30;
    Button btn;

    // 이미지뷰를 클릭하였을 때 차례로 국기 이미지가 변경되는 코드를 연습하기 위한 int형 변수
    int num=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        // xml에서 작성한 View들 id로 찾아와서 참조하기
        iV1= findViewById(R.id.imageView1);
        iV2= findViewById(R.id.imageView2);
        iV3= findViewById(R.id.imageView3);
        iV4= findViewById(R.id.imageView4);
        iV5= findViewById(R.id.imageView5);
        iV6= findViewById(R.id.imageView6);
        iV7= findViewById(R.id.imageView7);
        iV8= findViewById(R.id.imageView8);
        iV9= findViewById(R.id.imageView9);
        iV10= findViewById(R.id.imageView10);
        iV11= findViewById(R.id.imageView11);
        iV12= findViewById(R.id.imageView12);
        iV13= findViewById(R.id.imageView13);
        iV14= findViewById(R.id.imageView14);
        iV15= findViewById(R.id.imageView15);
        iV16= findViewById(R.id.imageView16);
        iV17= findViewById(R.id.imageView17);
        iV18= findViewById(R.id.imageView18);
        iV19= findViewById(R.id.imageView19);
        iV20= findViewById(R.id.imageView20);
        iV21= findViewById(R.id.imageView21);
        iV22= findViewById(R.id.imageView22);
        iV23= findViewById(R.id.imageView23);
        iV24= findViewById(R.id.imageView24);
        iV25= findViewById(R.id.imageView25);
        iV26= findViewById(R.id.imageView26);
        iV27= findViewById(R.id.imageView27);
        iV28= findViewById(R.id.imageView28);
        iV29= findViewById(R.id.imageView29);
        iV30= findViewById(R.id.imageView30);





        // 버튼 4개의 클릭에 반응하기 위한 리스너 설정
        // 리스너는 저 아래 onCreate()메소드 밖에 MainActivity의 멤버변수로서 생성하였음.
        // 1개의 리스너객체가 4개의 버튼 클릭에 모두 반응
        iV1.setOnClickListener(listener);
        iV2.setOnClickListener(listener);
        iV3.setOnClickListener(listener);
        iV4.setOnClickListener(listener);
        iV5.setOnClickListener(listener);
        iV6.setOnClickListener(listener);
        iV7.setOnClickListener(listener);
        iV8.setOnClickListener(listener);
        iV9.setOnClickListener(listener);
        iV10.setOnClickListener(listener);
        iV1.setOnClickListener(listener);
        iV2.setOnClickListener(listener);
        iV3.setOnClickListener(listener);
        iV4.setOnClickListener(listener);
        iV5.setOnClickListener(listener);
        iV6.setOnClickListener(listener);
        iV7.setOnClickListener(listener);
        iV8.setOnClickListener(listener);
        iV9.setOnClickListener(listener);
        iV10.setOnClickListener(listener);



        //이미지뷰를 클릭하는 것을 듣는 리스너 생성 및 추가
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //이미지뷰가 보여주는 이미지를 변경하기 : 특별한 상황이 아니면 이미지의 파일명 알파벳 abc순으로 이미지가 관리되고 있어서
                //처음 이미지에 숫자 1을 더하면 다음그림을 지정할 수 있게됨. [ 정확한 내용은 R.java에 대한 이해 필요 ]
                iv.setImageResource(R.drawable.check);
            }
        });
    }//onCreate Method..

    //클릭을 듣는 리스너 객체 생성
    View.OnClickListener listener= new View.OnClickListener(){

        //콜백메소드
        @Override
        public void onClick(View view) {
            //버튼을 클릭하면 실행되는 영역

            int id= view.getId();//4개의 버튼 중 현재 클릭된 버튼뷰의 id들 얻어오기
            switch ( id ){
                case R.id.btn01:
                //이미지뷰가 보여주는 이미지를 변경하기
                iv.setImageResource(R.drawable.check);
                break;

                case R.id.btn02:
                iv.setImageResource(R.drawable.check);
                break;

                case R.id.btn03:
                iv.setImageResource(R.drawable.check);
                break;

                case R.id.btn04:
                iv.setImageResource(R.drawable.check);
                break;
            }

        }
    };

}