package com.yuvi.puranonotes.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yubraj on 5/31/16.
 */

public class Items {

    public String name, name_desc, price;

    public Items(String name, String name_desc, String price) {
        this.name = name;
        this.name_desc = name_desc;
        this.price = price;
    }


    public static List<Items> getItemList() {
        List<Items> itemsList = new ArrayList<>();
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        itemsList.add(new Items("Electronics device theory", "A freshed only read once and can be used for all the faculty third semester. first come first serve.", "50"));
        return itemsList;
    }

}
