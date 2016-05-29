package com.yuvi.puranonotes.model;

import com.yuvi.puranonotes.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubraj on 5/29/16.
 */
public class HomeItem {

    public String name;
    public int icon;

    public HomeItem(String name, int icon) {
        this.name = name;
        this.icon = icon;
    }

    public static List<HomeItem> getList(){
        List<HomeItem> homeItemList = new ArrayList<HomeItem>();
            homeItemList.add(new HomeItem("civil", R.drawable.civil));
            homeItemList.add(new HomeItem("mechanical", R.drawable.mechanical));
            homeItemList.add(new HomeItem("computer", R.drawable.computer));
            homeItemList.add(new HomeItem("electronics", R.drawable.elcetronics));
            homeItemList.add(new HomeItem("architecture", R.drawable.architecture));
            homeItemList.add(new HomeItem("industrial", R.drawable.industrial));
            homeItemList.add(new HomeItem("electrical", R.drawable.electrical));
            homeItemList.add(new HomeItem("argiculture", R.drawable.agriculture));
        return homeItemList;
    }


}
