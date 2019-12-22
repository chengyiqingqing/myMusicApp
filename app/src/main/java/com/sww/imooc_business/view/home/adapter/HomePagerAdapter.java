package com.sww.imooc_business.view.home.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sww.imooc_business.model.CHANNEL;
import com.sww.imooc_business.view.discory.DiscoryFragment;
import com.sww.imooc_business.view.friend.FriendFragment;
import com.sww.imooc_business.view.mine.MineFragment;

public class HomePagerAdapter extends FragmentPagerAdapter {

    private CHANNEL[] mList;

    public HomePagerAdapter(FragmentManager fm, CHANNEL[] mList) {
        super(fm);
        this.mList = mList;
    }

    @Override
    public Fragment getItem(int postion) {
        int type = mList[postion].getValue();
        switch (type) {
            case CHANNEL.MINE_ID:
                return MineFragment.newInstance();
            case CHANNEL.DISCORY_ID:
                return DiscoryFragment.newInstance();
            case CHANNEL.FRIEND_ID:
                return FriendFragment.newInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mList == null ? 0 : mList.length;
    }
}
