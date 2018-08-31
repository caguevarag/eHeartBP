package com.cguevarag.eheartbp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ObtainPressureActivity extends AppCompatActivity {
    Button ob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obtain_pressure);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        ob = findViewById(R.id.obtainButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.e_heart_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuActions.options(this,item);
    }

    public void obtain(View view) {
        ob.setBackgroundColor(Color.GRAY);
        ob.setText("Cargando...");

        new Thread() {
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //ob.setBackgroundColor(R.color.colorAccent);
                //ob.setText(R.string.obtain);
                startActivity(new Intent(ObtainPressureActivity.this, ViewMeasurementActivity.class));
            }
        }.start();
    }
}
