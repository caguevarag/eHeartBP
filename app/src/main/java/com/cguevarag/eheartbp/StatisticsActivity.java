package com.cguevarag.eheartbp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class StatisticsActivity extends AppCompatActivity {

    boolean showDay;
    ImageView i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        showDay = true;
        i = findViewById(R.id.statisticsView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.e_heart_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return MenuActions.options(this, item);
    }

    public void change(View view) {
        showDay = !showDay;

        if (showDay)
            i.setImageDrawable(getResources().getDrawable(R.drawable.estadisticas_dia));
        else
            i.setImageDrawable(getResources().getDrawable(R.drawable.estadisticas_mes));
    }
}
