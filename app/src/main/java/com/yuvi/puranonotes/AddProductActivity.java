package com.yuvi.puranonotes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;

/**
 * Created by yubraj on 5/29/16.
 */
public class AddProductActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addproduct);
        setUpToolbarWithDefault((Toolbar) findViewById(R.id.mtoolbar));
    }
}
