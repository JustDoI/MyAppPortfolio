package com.rxy.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_fif).setOnClickListener(this);
        findViewById(R.id.bt_sec).setOnClickListener(this);
        findViewById(R.id.bt_thi).setOnClickListener(this);
        findViewById(R.id.bt_fou).setOnClickListener(this);
        findViewById(R.id.bt_fif).setOnClickListener(this);
        findViewById(R.id.bt_six).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_fir:
                showToast("This button will launch my Spotify Streamer app");
                break;
            case R.id.bt_sec:
                showToast("This button will launch my scores app");
                break;
            case R.id.bt_thi:
                showToast("This button will launch my library app");
                break;
            case R.id.bt_fou:
                showToast("This button will launch my build it bigger app");
                break;
            case R.id.bt_fif:
                showToast("This button will launch my xyz reader app");
                break;
            case R.id.bt_six:
                showToast("This button will launch my own app");
                break;
        }
    }

    private void showToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
