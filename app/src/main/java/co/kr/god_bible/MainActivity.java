package co.kr.god_bible;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(co.kr.bible_renewal.R.layout.activity_main);


        findViewById(co.kr.bible_renewal.R.id.start_btn).setOnClickListener(btnListener);
        findViewById(co.kr.bible_renewal.R.id.stop_btn).setOnClickListener(btnListener);


    }


    View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View v) {

            Intent intent = null;


            switch (v.getId()) {
                case co.kr.bible_renewal.R.id.start_btn:
                    intent = new Intent(MainActivity.this, ScreenService.class);
                    startService(intent);
                    break;
                case co.kr.bible_renewal.R.id.stop_btn:
                    intent = new Intent(MainActivity.this, ScreenService.class);
                    stopService(intent);
                    break;

            }
        }
    };


}