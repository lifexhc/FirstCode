package com.xuhongchuan.fragmenttest;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);

        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);

//        Button button1 = (Button) findViewById(R.id.button1);
//        button1.setOnClickListener(this);
//
//        Button button2 = (Button) findViewById(R.id.button2);
//        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
//                AnotherRightFragment fragment = new AnotherRightFragment();
//                FragmentManager fragmentManager = getFragmentManager();
//                FragmentTransaction transaction = fragmentManager.beginTransaction();
//                transaction.replace(R.id.right_layout, fragment);
//                transaction.addToBackStack(null);
//                transaction.commit();
                break;
//            case R.id.button1:
//                Intent intent1 = new Intent(MainActivity.this, DialogActivity.class);
//                startActivity(intent1);
//                break;
//            case R.id.button2:
//                Intent intent2 = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent2);
//                break;
            default:
                break;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart");
    }
}
