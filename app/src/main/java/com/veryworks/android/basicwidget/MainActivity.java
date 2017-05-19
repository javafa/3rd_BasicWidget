package com.veryworks.android.basicwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    // 1. 위젯 변수를 선언
    Button btnDog, btnPig, btnHorse;
    ToggleButton toggleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. 위젯변수를 화면과 연결
        btnDog = (Button) findViewById(R.id.btnDog);
        btnPig = (Button) findViewById(R.id.btnPig);
        btnHorse = (Button) findViewById(R.id.btnHorse);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton);

        // 3. 클릭리스너 연결
        btnDog.setOnClickListener(   this   );  // 리스너에 this(뭔가)를 넘겨주면
        btnPig.setOnClickListener(this);        // 해당 이벤트가 발생시 this(뭔가)를 호출해준다.
        btnHorse.setOnClickListener(this);

        toggleButton.setOnCheckedChangeListener(this); // 체크드체인지리스너 <- ! 클릭 리스너가 아님
    }

    @Override
    public void onClick(View v) {  // 시스템의 이벤트 리스너를 통해 호출된다
        switch(v.getId()){
            case R.id.btnDog:
                Toast.makeText(this, "멍멍~", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnPig:
                Toast.makeText(this, "꿀꿀~", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHorse:
                Toast.makeText(this,"이힝~", Toast.LENGTH_SHORT).show();
                break;
            case R.id.toggleButton:

                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        
    }
}
