package com.example.ayomengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;

import java.util.Random;

public class Game extends AppCompatActivity {
    ImageButton pindah;
    ImageButton jw1,jw2,jw3;
    ImageView soal;
    int s,s1,j1,j2,j3;
    int skor=0;
    hijaiyahgame Hijaiyah = new hijaiyahgame();
    int n = Hijaiyah.getjumlah();

    boolean jawabanbenar = true;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        pindah = findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Game.this, MainActivity.class);
                startActivity(intent);
            }
        });

        soal = (ImageView) findViewById(R.id.soal);
        jw1 = (ImageButton)findViewById(R.id.jawaban1);
        jw2 = (ImageButton)findViewById(R.id.jawaban2);
        jw3 = (ImageButton)findViewById(R.id.jawaban3);

        final MediaPlayer SuaraButton = MediaPlayer.create(this, R.raw.button);
        newlevel();

        jw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j1 ==s);
            }
        });

        jw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j2 ==s);
            }
        });

        jw3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isCorrect(j3 ==s);
            }
        });
    }

    public void newlevel(){
        s = Hijaiyah.getrandomhuruf();
        s1 = Hijaiyah.getrandomhuruf();
        int i = new Random().nextInt(3) + 1;

        if(i==1){
            j1 = s;
        }
        else{
            j1 = Hijaiyah.getrandomhuruf();
        }

        if(i ==2){
            j2 = s;
        }
        else {
            j2 = Hijaiyah.getrandomhuruf();
        }
        if(i ==3){
            j3 = s;
        }
        else{
            j3 = Hijaiyah.getrandomhuruf();
        }

        soal.setBackgroundResource(Hijaiyah.getimagesoal(s));
        jw1.setBackgroundResource(Hijaiyah.getimagejwbn(j1));
        jw2.setBackgroundResource(Hijaiyah.getimagejwbn(j2));
        jw3.setBackgroundResource(Hijaiyah.getimagejwbn(j3));
    }

    public void isCorrect(boolean input){
        TextView tampilSkor =(TextView) findViewById(R.id.skor);

        if(input && i <n){
            MediaPlayer benar = MediaPlayer.create(getBaseContext(),R.raw.benar);
            skor +=10;
            benar.start();
            newlevel();
            i++;
        }else{
            MediaPlayer salah = MediaPlayer.create(getBaseContext(),R.raw.salah);
            skor -=5;
            salah.start();
        }

        tampilSkor.setText("SKOR : "+ skor);
    }
}