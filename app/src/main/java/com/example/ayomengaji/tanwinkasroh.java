package com.example.ayomengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.media.MediaPlayer;

public class tanwinkasroh extends AppCompatActivity {
    ImageButton pindah,show,hide ;
    ImageView TampilGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwinkasroh);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.tampil_in);
        show = (ImageButton) findViewById(R.id.alif);
        hide = (ImageButton) findViewById(R.id.ba);
        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anime_scale);
        show.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });

        hide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });

        //Untuk Menambahkan Button Suara
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_kasroh_iin); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_kasroh_bin);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_kasroh_tin);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_kasroh_sin);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_kasroh_jin);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_kasroh_hin);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_kasroh_khin);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_kasroh_din);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_kasroh_dzin);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.button); //
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_kasroh_sin);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.tanwin_kasroh_shin);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_kasroh_dhin);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_kasroh_thin);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_kasroh_dziin);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_kasroh_iin);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_kasroh_ghin);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_kasroh_fin);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_kasroh_qin);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_kasroh_kin);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.button);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_kasroh_nin);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.tanwin_kasroh_win);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_kasroh_hiin);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_kasroh_yin);


        ImageButton ButtonSuara = (ImageButton) this.findViewById(R.id.alif); //fariabel button
        ImageButton ButtonSuara2 = (ImageButton) this.findViewById(R.id.ba);
        ImageButton ButtonSuara3 = (ImageButton) this.findViewById(R.id.ta);
        ImageButton ButtonSuara4 = (ImageButton) this.findViewById(R.id.tsa);
        ImageButton ButtonSuara5 = (ImageButton) this.findViewById(R.id.ja);
        ImageButton ButtonSuara6 = (ImageButton) this.findViewById(R.id.ha);
        ImageButton ButtonSuara7 = (ImageButton) this.findViewById(R.id.kha);
        ImageButton ButtonSuara8 = (ImageButton) this.findViewById(R.id.da);
        ImageButton ButtonSuara9 = (ImageButton) this.findViewById(R.id.dza);
        ImageButton ButtonSuara10 = (ImageButton) this.findViewById(R.id.ro);
        ImageButton ButtonSuara11 = (ImageButton) this.findViewById(R.id.za);
        ImageButton ButtonSuara12 = (ImageButton) this.findViewById(R.id.sin);
        ImageButton ButtonSuara13 = (ImageButton) this.findViewById(R.id.syin);
        ImageButton ButtonSuara14 = (ImageButton) this.findViewById(R.id.sod);
        ImageButton ButtonSuara15 = (ImageButton) this.findViewById(R.id.dho);
        ImageButton ButtonSuara16 = (ImageButton) this.findViewById(R.id.tho);
        ImageButton ButtonSuara17 = (ImageButton) this.findViewById(R.id.zha);
        ImageButton ButtonSuara18 = (ImageButton) this.findViewById(R.id.ain);
        ImageButton ButtonSuara19 = (ImageButton) this.findViewById(R.id.ghain);
        ImageButton ButtonSuara20 = (ImageButton) this.findViewById(R.id.fa);
        ImageButton ButtonSuara21 = (ImageButton) this.findViewById(R.id.kof);
        ImageButton ButtonSuara22 = (ImageButton) this.findViewById(R.id.ka);
        ImageButton ButtonSuara23 = (ImageButton) this.findViewById(R.id.lam);
        ImageButton ButtonSuara24 = (ImageButton) this.findViewById(R.id.mim);
        ImageButton ButtonSuara25 = (ImageButton) this.findViewById(R.id.nun);
        ImageButton ButtonSuara26 = (ImageButton) this.findViewById(R.id.wau);
        ImageButton ButtonSuara27 = (ImageButton) this.findViewById(R.id.haa);
        ImageButton ButtonSuara28 = (ImageButton) this.findViewById(R.id.ya);

        /*Menghidupkan Suara */
        ButtonSuara.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.in);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.bin);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tin);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tsin);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jin);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hin);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.khin);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.din);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dzin);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.rin);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zin);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sin);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.syin);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.shin);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dhin);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.thin);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zhin);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ngin);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ghin);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fin);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.qin);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kin);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lin);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.min);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nin);
                TampilGambar.startAnimation(animScale);
                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.win);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hiin);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.yin);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });


        pindah = findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tanwinkasroh.this, Tanwin.class);
                startActivity(intent);
            }
        });
    }
}