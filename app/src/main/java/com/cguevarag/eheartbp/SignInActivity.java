package com.cguevarag.eheartbp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void login(View view){
        startActivity(new Intent(this,GetPressureActivity.class));
    }
}
