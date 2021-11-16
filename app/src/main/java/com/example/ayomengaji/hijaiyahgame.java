package com.example.ayomengaji;

import java.util.Random;

public class hijaiyahgame {
    private int listhuruf[] = {
            R.drawable.pilhuham,
            R.drawable.pilhujim,
            R.drawable.pilhulamalif,
            R.drawable.pilihhurfshod,
            R.drawable.pilihhurufsya,
            R.drawable.pilihhurufta,
            R.drawable.piludal
    };

    private int listhuruf2[] = {
            R.drawable.jawabanhamzah,
            R.drawable.jawabanja,
            R.drawable.jawabanlamalif,
            R.drawable.jawabansho,
            R.drawable.jawabansa,
            R.drawable.jawabanta,
            R.drawable.jawabandal,
            R.drawable.jawabanha,
            R.drawable.jawabanba,
            R.drawable.jawabanla,
            R.drawable.jawabanalif,
            R.drawable.jawabanha,
            R.drawable.jawabantha,
            R.drawable.jawabanwa,
            R.drawable.jawabansho,
            R.drawable.jawabandoo,
            R.drawable.jawabandzal,

    };
    public int[] getlist(){
        return listhuruf;
    }
    public int[] getlist2(){
        return listhuruf2;
    }

    public int getrandomhuruf(){
        int rnd = new Random().nextInt(listhuruf.length);
        return rnd;
    }

    public int getimagesoal(int i){
        return listhuruf[i];
    }

    public int getimagejwbn(int i){
        return listhuruf2[i];
    }

    public int getjumlah(){
        return listhuruf.length;
    }
    public int getjumlah2(){
        return listhuruf2.length;
    }
}

