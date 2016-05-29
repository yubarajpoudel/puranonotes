package com.yuvi.puranonotes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.yuvi.puranonotes.model.HomeItem;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.mtoolbar);
        setSupportActionBar(toolbar);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv_mainList);
        rv.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        rv.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new HomeViewHolder(getLayoutInflater().inflate(R.layout.row_homeitem, parent, false));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                if (holder instanceof HomeViewHolder) {
                    HomeItem item = HomeItem.getList().get(position);
                    HomeViewHolder mHolder = (HomeViewHolder) holder;
                    mHolder.tv_title.setText(item.name.toUpperCase());
                    mHolder.iv_thumb.setImageResource(item.icon);
                }
            }

            @Override
            public int getItemCount() {
                return HomeItem.getList().size();
            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), AddProductActivity.class));
            }
        });


    }

    class HomeViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_thumb;
        TextView tv_title;

        public HomeViewHolder(View view) {
            super(view);

            iv_thumb = (ImageView) view.findViewById(R.id.iv_thumb);
            tv_title = (TextView) view.findViewById(R.id.tv_title);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
