package com.cguevarag.eheartbp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.DisplayMetrics;
import android.view.View;

public class GoogleAccountsActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pop_window);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int w = dm.widthPixels;
        int h = dm.heightPixels;
        getWindow().setLayout((int) (w * .7), (int) (h * .7));

    }

    public void login2(View view) {
        startActivity(new Intent(GoogleAccountsActivity.this, ObtainPressureActivity.class));

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(new Intent(GoogleAccountsActivity.this, ObtainPressureActivity.class));
            }
        };
    }

}
