package com.yogeshkumar.letsgo;

import android.content.res.Configuration;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.Toast;

import com.github.developer__.BeforeAfterSlider;

public class MainActivity extends AppCompatActivity {
BeforeAfterSlider mySlider;
    ImageButton left,right;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mySlider=(BeforeAfterSlider)findViewById(R.id.before_after_slider_id);
left=(ImageButton)findViewById(R.id.imageButton);
        right=(ImageButton)findViewById(R.id.imageButton2);
        String imgUrl1 = "https://goo.gl/YRxlCq";
        String imgUrl2 = "https://goo.gl/v7kocq";
     mySlider.setBeforeImage(imgUrl1).setAfterImage(imgUrl2);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
           getSupportActionBar().hide();
        }
        else {
            getWindow().clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
           getSupportActionBar().show();
        }
    }

    public void onleft(View v){
        Toast.makeText(this, "left is clicked", Toast.LENGTH_SHORT).show();
        showMessage();
    }
    public void onright(View v){
        Toast.makeText(this, "right is clicked", Toast.LENGTH_SHORT).show();
    showMessage();
    }
    public void showMessage(){

        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setCancelable(true).
                setTitle("django").
                setMessage("this is interesting")
                .show();
    }
}
