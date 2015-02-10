package com.tistory.codedragon.ex76librarylab;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.tistory.codedragon.userlibrary.Message;

public class MainActivity extends Activity {

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView)findViewById(R.id.tvMessage);

        Message libraryMessage = new Message();
        tvMessage.setText(libraryMessage.speakHello("I'm CodeDragon"));
    }
}
