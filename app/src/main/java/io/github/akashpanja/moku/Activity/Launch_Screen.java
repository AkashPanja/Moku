package io.github.akashpanja.moku.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import io.github.akashpanja.moku.R;
import io.github.akashpanja.moku.resource.FontManager;

public class Launch_Screen extends AppCompatActivity {

    Handler handler = new Handler();
    private int STORAGE_PERMISSION_CODE = 23;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch__screen);
        Typeface materialIcon = Typeface.createFromAsset(getAssets(), "fonts/materialicon.ttf");

        Animation animation= AnimationUtils.loadAnimation(Launch_Screen.this,R.anim.fan);

        ImageView logo=(ImageView) findViewById(R.id.launchScreenLogo);

        logo.setAnimation(animation);

        requestStoragePermission();
        FontManager fontManager=new FontManager(this.getApplicationContext());

        title=(TextView) findViewById(R.id.launchScreenTitle);
        title.setTypeface(FontManager.getProductIcon());

    }

    private void requestStoragePermission(){

        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.READ_EXTERNAL_STORAGE)){
            //If the user has denied the permission previously your code will come to this block
            //Here you can explain why you need this permission
            //Explain here why you need this permission
        }
        ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},STORAGE_PERMISSION_CODE);
    }

    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

        if(requestCode == STORAGE_PERMISSION_CODE){

            if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){

                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent intent = new Intent(Launch_Screen.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }, 1500);
            }else{
                finish();
            }
        }
    }

}
