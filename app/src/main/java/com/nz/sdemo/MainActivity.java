package com.nz.sdemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.hhhaiai.nzlist.memory.ProcessHolder;
import me.hhhaiai.nzlist.ui.NzListActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnGoGo:
                start();
                break;
            default:
                break;
        }
    }

    private void start() {

        ProcessHolder.getInstance().addPorceser(new PortToServer());
        Intent intent = new Intent(MainActivity.this, NzListActivity.class);
        intent.putExtra(
                NzListActivity.SHOW_SYSTEM, NzListActivity.ESHOWSTATUS_SHOW_SYSTEM_HAS_LUNCH);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
