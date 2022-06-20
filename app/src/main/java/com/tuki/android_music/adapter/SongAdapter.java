package com.tuki.android_music.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.tuki.android_music.Model.ListSong;
import com.tuki.android_music.R;
import com.tuki.android_music.callback.OnWallpaperItemClickListener;

import java.util.List;

public class SongAdapter<OnWallpaperItemClickListener> extends RecyclerView.Adapter<SongAdapter.ViewHolder>{

    private List<ListSong> songAdapters;
    private Context context;
    private OnWallpaperItemClickListener callack;

    public SongAdapter(List<ListSong> songAdapters, Context context, OnWallpaperItemClickListener callack) {
        this.songAdapters = songAdapters;
        this.context = context;
        this.callack = callack;
    }

    @NonNull
    @Override
    public SongAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_song, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SongAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
