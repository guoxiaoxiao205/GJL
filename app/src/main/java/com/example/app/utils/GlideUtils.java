package com.example.app.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.target.BitmapImageViewTarget;

/**
 * Created by guoxiao on 16/10/24.
 * glide图片加载
 */
public class GlideUtils {

    /**
     * 加载string格式的图片
     * 缓存为内存磁盘
     */
    public static void display(Context context, ImageView imageView, String url, int src) {
        Glide.with(context)
                .load(url)
                .placeholder(src)
                .error(src)
                .diskCacheStrategy(DiskCacheStrategy.ALL)//default
                .into(imageView);

    }

    /**
     * 加载string格式的图片
     * 缓存为内存磁盘
     */
    public static void display(Context context, ImageView imageView, String url) {
        Glide.with(context)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)//default
                .into(imageView);
    }


    /**
     * 加载图片并显示成圆形
     */
    public static void displayRoundImage(final Context context, final ImageView imageView, String url, int src) {
        Glide.with(context)
                .load(url)
                .asBitmap()
                .placeholder(src)
                .error(src)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(new BitmapImageViewTarget(imageView) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        super.setResource(resource);
                        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                        roundedBitmapDrawable.setCircular(true);
                        imageView.setImageDrawable(roundedBitmapDrawable);
                    }
                });
    }
}
