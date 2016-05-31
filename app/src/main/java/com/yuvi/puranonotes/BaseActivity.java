package com.yuvi.puranonotes;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

/**
 * Created by yubraj on 5/29/16.
 */
public class BaseActivity extends AppCompatActivity {

    protected void setUpToolbarWithDefault(Toolbar toolbar) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;

        }
        return super.onOptionsItemSelected(item);
    }

    public void toast(String mesg) {
        Toast.makeText(this, mesg, Toast.LENGTH_SHORT).show();
    }


}
