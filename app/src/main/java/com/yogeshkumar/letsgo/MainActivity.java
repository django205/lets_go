package com.yogeshkumar.letsgo;

import android.app.ActionBar;
import android.content.res.Configuration;
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
        String imgUrl1 = "http://storage.googleapis.com/ix_choosemuse/uploads/2016/02/android-logo.png";
        String imgUrl2 = "http://www.heise.de/imgs/18/1/4/5/4/0/3/1/kotlin-746417a7cc2556af.jpeg";
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
    }
    public void onright(View v){
        Toast.makeText(this, "right is clicked", Toast.LENGTH_SHORT).show();
    }
}
