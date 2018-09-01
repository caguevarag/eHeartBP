package com.cguevarag.eheartbp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class ViewMeasurementActivity extends AppCompatActivity {

    EditText[] fields;
    View.OnFocusChangeListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_measurement);
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

        listener = new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Globals.sys = fields[0].getText().toString();
                Globals.dia = fields[1].getText().toString();
                Globals.pul = fields[2].getText().toString();
            }
        };

        fields = new EditText[3];
        fields[0] = findViewById(R.id.editSys);
        fields[1] = findViewById(R.id.editDia);
        fields[2] = findViewById(R.id.editPul);

        fields[0].setText(Globals.sys);
        fields[1].setText(Globals.dia);
        fields[2].setText(Globals.pul);

        for (EditText f : fields)
            f.setOnFocusChangeListener(listener);
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
}
