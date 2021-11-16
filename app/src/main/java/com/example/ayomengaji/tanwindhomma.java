package com.example.ayomengaji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.media.MediaPlayer;
import android.widget.ImageView;

public class tanwindhomma extends AppCompatActivity {
    ImageButton pindah,show,hide ;
    ImageView TampilGambar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwindhomma);
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY;
        decorView.setSystemUiVisibility(uiOptions);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.tampil_un);
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
        final MediaPlayer SuaraAlif = MediaPlayer.create(this, R.raw.tanwin_domah_un); //Memanggil nama lagu
        final MediaPlayer SuaraBa = MediaPlayer.create(this, R.raw.tanwin_domah_bun);
        final MediaPlayer SuaraTa = MediaPlayer.create(this, R.raw.tanwin_domah_tun);
        final MediaPlayer SuaraSa = MediaPlayer.create(this, R.raw.tanwin_domah_tsun);
        final MediaPlayer SuaraJim = MediaPlayer.create(this, R.raw.tanwin_domah_jun);
        final MediaPlayer SuaraHa = MediaPlayer.create(this, R.raw.tanwin_domah_hun);
        final MediaPlayer SuaraKho = MediaPlayer.create(this, R.raw.tanwin_domah_khun);
        final MediaPlayer SuaraDal = MediaPlayer.create(this, R.raw.tanwin_domah_dun);
        final MediaPlayer SuaraDzal = MediaPlayer.create(this, R.raw.tanwin_domah_dzun);
        final MediaPlayer SuaraRo = MediaPlayer.create(this, R.raw.tanwin_domah_run);
        final MediaPlayer SuaraJa = MediaPlayer.create(this, R.raw.tanwin_domah_zun);
        final MediaPlayer SuaraSin = MediaPlayer.create(this, R.raw.tanwin_domah_sun);
        final MediaPlayer SuaraSyin = MediaPlayer.create(this, R.raw.tanwin_domah_syun);
        final MediaPlayer SuaraShad = MediaPlayer.create(this, R.raw.tanwin_domah_shun);
        final MediaPlayer SuaraDod = MediaPlayer.create(this, R.raw.tanwin_domah_dhun);
        final MediaPlayer SuaraTo = MediaPlayer.create(this, R.raw.tanwin_domah_thun);
        final MediaPlayer SuaraDo = MediaPlayer.create(this, R.raw.tanwin_domah_dzuun);
        final MediaPlayer SuaraAin = MediaPlayer.create(this, R.raw.tanwin_domah_uun);
        final MediaPlayer SuaraGin = MediaPlayer.create(this, R.raw.tanwin_domah_ghun);
        final MediaPlayer Suarafa = MediaPlayer.create(this, R.raw.tanwin_domah_fun);
        final MediaPlayer SuaraKof = MediaPlayer.create(this, R.raw.tanwin_domah_qun);
        final MediaPlayer SuaraKaf = MediaPlayer.create(this, R.raw.tanwin_domah_kun);
        final MediaPlayer SuaraLam = MediaPlayer.create(this, R.raw.tanwin_domah_lun);
        final MediaPlayer SuaraMim = MediaPlayer.create(this, R.raw.tanwin_domah_mun);
        final MediaPlayer SuaraNun = MediaPlayer.create(this, R.raw.tanwin_domah_nun);
        final MediaPlayer SuaraWawu = MediaPlayer.create(this, R.raw.tanwin_domah_wun);
        final MediaPlayer SuaraHA = MediaPlayer.create(this, R.raw.tanwin_domah_huun);
        final MediaPlayer SuaraYa = MediaPlayer.create(this, R.raw.tanwin_domah_yun);

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
                TampilGambar.setImageResource(R.drawable.un);
                TampilGambar.startAnimation(animScale);
                SuaraAlif.start();
            }
        });

        ButtonSuara2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.bun);
                TampilGambar.startAnimation(animScale);
                SuaraBa.start();
            }
        });

        ButtonSuara3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tun);
                TampilGambar.startAnimation(animScale);
                SuaraTa.start();
            }
        });

        ButtonSuara4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.tsun);
                TampilGambar.startAnimation(animScale);
                SuaraSa.start();
            }
        });
        ButtonSuara5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.jun);
                TampilGambar.startAnimation(animScale);
                SuaraJim.start();
            }
        });
        ButtonSuara6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.hun);
                TampilGambar.startAnimation(animScale);
                SuaraHa.start();
            }
        });
        ButtonSuara7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.khun);
                TampilGambar.startAnimation(animScale);
                SuaraKho.start();
            }
        });

        ButtonSuara8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dun);
                TampilGambar.startAnimation(animScale);
                SuaraDal.start();
            }
        });

        ButtonSuara9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dzun);
                TampilGambar.startAnimation(animScale);
                SuaraDzal.start();
            }
        });
        ButtonSuara10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.run);
                TampilGambar.startAnimation(animScale);
                SuaraRo.start();
            }
        });
        ButtonSuara11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zuun);
                TampilGambar.startAnimation(animScale);
                SuaraJa.start();
            }
        });

        ButtonSuara12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.sun);
                TampilGambar.startAnimation(animScale);
                SuaraSin.start();
            }
        });
        ButtonSuara13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.syun);
                TampilGambar.startAnimation(animScale);
                SuaraSyin.start();
            }
        });
        ButtonSuara14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.shun);
                TampilGambar.startAnimation(animScale);
                SuaraShad.start();
            }
        });

        ButtonSuara15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.dhun);
                TampilGambar.startAnimation(animScale);
                SuaraDod.start();
            }
        });
        ButtonSuara16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.thun);
                TampilGambar.startAnimation(animScale);
                SuaraTo.start();
            }
        });
        ButtonSuara17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.zhuun);
                TampilGambar.startAnimation(animScale);
                SuaraDo.start();
            }
        });
        ButtonSuara18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.gun);
                TampilGambar.startAnimation(animScale);
                SuaraAin.start();
            }
        });

        ButtonSuara19.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.ghun);
                TampilGambar.startAnimation(animScale);
                SuaraGin.start();
            }
        });
        ButtonSuara20.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.fun);
                TampilGambar.startAnimation(animScale);
                Suarafa.start();
            }
        });
        ButtonSuara21.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.qun);
                TampilGambar.startAnimation(animScale);
                SuaraKof.start();
            }
        });
        ButtonSuara22.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kun);
                TampilGambar.startAnimation(animScale);
                // TODO Auto-generated method stub
                SuaraKaf.start();
            }
        });
        ButtonSuara23.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.lun);
                TampilGambar.startAnimation(animScale);
                SuaraLam.start();
            }
        });

        ButtonSuara24.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.mun);
                TampilGambar.startAnimation(animScale);
                SuaraMim.start();
            }
        });
        ButtonSuara25.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.nun);
                TampilGambar.startAnimation(animScale);
                SuaraNun.start();
            }
        });
        ButtonSuara26.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.wuun);
                TampilGambar.startAnimation(animScale);
                SuaraWawu.start();
            }
        });
        ButtonSuara27.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.huun);
                TampilGambar.startAnimation(animScale);
                SuaraHA.start();
            }
        });
        ButtonSuara28.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                TampilGambar.setImageResource(R.drawable.yuun);
                TampilGambar.startAnimation(animScale);
                SuaraYa.start();
            }
        });


        pindah = findViewById(R.id.back);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(tanwindhomma.this, Tanwin.class);
                startActivity(intent);
            }
        });
    }
}