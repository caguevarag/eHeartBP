package com.cguevarag.eheartbp;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;

public class MenuActions {

    public static boolean options(Activity act, MenuItem item) {

        switch (item.getItemId()) {
            case R.id.get_pressure:
                act.startActivity(new Intent(act, ObtainPressureActivity.class));
                return true;
            case R.id.record:
                act.startActivity(new Intent(act, RecordsActivity.class));
                return true;
            case R.id.statistics:
                act.startActivity(new Intent(act, StatisticsActivity.class));
                return true;
            case R.id.settings:
                act.startActivity(new Intent(act, SettingsActivity.class));
                return true;
            case R.id.close_session:
                act.startActivity(new Intent(act, MainActivity.class));
                return true;
            default:
                return act.getParent().onOptionsItemSelected(item);
        }
    }
}
