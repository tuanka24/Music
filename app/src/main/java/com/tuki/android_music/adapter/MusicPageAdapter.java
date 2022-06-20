package com.tuki.android_music.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.tuki.android_music.fragment.AlbumFragment;
//import com.tuki.android_music.fragment.ArtistFragment;
import com.tuki.android_music.fragment.SingerFragment;
import com.tuki.android_music.fragment.SongFragment;

public class MusicPageAdapter extends FragmentPagerAdapter {
    private String[] titles =  new String[] {"Song", "Album", "Artitst"};

    public MusicPageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public MusicPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new SongFragment();
                break;
            case 1:
                return new AlbumFragment();
            case
                    2: return new SingerFragment();

        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
