package com.example.attracti.buttomsheet;

/**
 * Created by Iryna on 6/24/16.
 *
 * This class responsible for the item inside the RecyclerView
 *
 */

public class Item {
    private int mDrawableRes;

    private String mTitle;

    public Item(int drawable, String title) {
        mDrawableRes = drawable;
        mTitle = title;
    }

    public int getDrawableResource() {
        return mDrawableRes;
    }

    public String getTitle() {
        return mTitle;
    }
}
