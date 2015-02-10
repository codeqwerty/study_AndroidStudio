package kr.android.seekbar;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;


public class MainActivity extends Activity {
	
	ImageView imageView;
	SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imageView = (ImageView)findViewById(R.id.ivAndroid);
        seekBar = (SeekBar)findViewById(R.id.sbSeekBar);
        
        //seekBar �ʱ�ȭ
        seekBar.setMax(255);		//SeekBar �ִ����	: 255
        seekBar.setProgress(225);	//SeekBar �ʱⰪ		: 255	
        
        //�͸���Ŭ������ �̺�Ʈ �ڵ鷯 ����
        seekBar.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){

        	//seekBar ���� ���� �� ������ ImageView�� ���� ����
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
										//minSDKVersion = 16
				//ImageView�� ���� ����
				imageView.setImageAlpha(seekBar.getProgress());
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				
			}
        	
        });
    }
}
