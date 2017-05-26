package com.monad.noisecontrolsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.monad.noisecontrolsystem.Activity.MainActivity;

import io.realm.Realm;


public class Intro extends AppCompatActivity {
    Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

//        Realm.init(getApplicationContext());
//        realm = Realm.getDefaultInstance();
//
//
//        RealmQuery<Myinfo> query = realm.where(Myinfo.class);
//        RealmResults<Myinfo> result = query.findAll();
//
//        if(result.size() == 0) {
//            Log.i("Log", "처음");
//        } else {
//            Log.i("Log", "setting complete");
//        }

        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
        finish();
    }


}
