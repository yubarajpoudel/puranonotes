package com.yuvi.puranonotes;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import com.yuvi.puranonotes.model.HomeItem;
import com.yuvi.puranonotes.model.Items;

/**
 * Created by yubraj on 5/31/16.
 */

public class ItemListActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemlist);
        setUpToolbarWithDefault((Toolbar) findViewById(R.id.mtoolbar));
        getSupportActionBar().setTitle("Item Lists");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getWindow().setStatusBarColor(getResources().getColor(R.color.primary_dark));
        }
        RecyclerView rv = (RecyclerView) findViewById(R.id.rv_itemlist);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setAdapter(new RecyclerView.Adapter() {
            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                return new ItemViewHolder(getLayoutInflater().inflate(R.layout.row_item_detail, parent, false));
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
                if (holder instanceof ItemViewHolder) {
                    Items item = Items.getItemList().get(position);
                    ItemViewHolder mHolder = (ItemViewHolder) holder;
                    mHolder.tv_title.setText(item.name.toUpperCase());
                    mHolder.tv_title_desc.setText(item.name_desc);
                    mHolder.tv_price.setText("Rs " + item.price);
                }
            }

            @Override
            public int getItemCount() {
                return HomeItem.getList().size();
            }
        });


    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        TextView tv_title, tv_title_desc, tv_price;
        Button btn_buy, btn_reserve;

        public ItemViewHolder(View view) {
            super(view);
            tv_title = (TextView) view.findViewById(R.id.tv_title);
            tv_title_desc = (TextView) view.findViewById(R.id.tv_title_desc);
            tv_price = (TextView) view.findViewById(R.id.tv_price);
            btn_buy = (Button) view.findViewById(R.id.btn_buy);
            btn_reserve = (Button) view.findViewById(R.id.btn_book);
            btn_buy.setOnClickListener(listener);
            btn_reserve.setOnClickListener(listener);
        }
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            int id = view.getId();
            if (id == R.id.btn_book) {
                toast("Book is ordered and will be contacted soon");
            } else {
                toast("Book is reserved, please be confirm as soon as possible");
            }
        }

    };

}
