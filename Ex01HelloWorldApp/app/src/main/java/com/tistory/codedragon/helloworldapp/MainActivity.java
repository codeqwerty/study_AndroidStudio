package com.tistory.codedragon.helloworldapp;

import android.app.Activity;
import android.os.Bundle;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    기본 형태 만들기 단계
//    1)	ActionBarActivity-> Activity로 수정
//    2)	onCreate 밑에 있는 두개의 오버라이드 함수 삭제

}
