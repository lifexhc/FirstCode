package com.xuhongchuan.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button mButton;
    private EditText mEditText;
    private ImageView mImageView;
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.button);
        mEditText = (EditText) findViewById(R.id.edit_text);
        mImageView = (ImageView) findViewById(R.id.image_view);
        mProgressBar = (ProgressBar) findViewById(R.id.progress_bar);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
//                String inputText = mEditText.getText().toString();
//                Toast.makeText(this, inputText, Toast.LENGTH_SHORT).show();

//                mImageView.setImageResource(R.drawable.jelly_bean);

//                if (mProgressBar.getVisibility() == View.GONE) {
//                    mProgressBar.setVisibility(View.VISIBLE);
//                } else {
//                    mProgressBar.setVisibility(View.GONE);
//                }

//                int progress = mProgressBar.getProgress();
//                progress += 10;
//                mProgressBar.setProgress(progress);

//                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
//                dialog.setTitle("This is dialog");
//                dialog.setMessage("Something important");
//                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener(){
//                            @Override
//                            public void onClick(DialogInterface dialog, int which) {
//
//                            }
//                        }
//                );
//                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
//                            @Override
//                            public void onClick(DialogInterface dialog, int which){
//
//                            }
//                        }
//                );
//                dialog.show();

                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgresssDialog");
                progressDialog.setMessage("Loading...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
