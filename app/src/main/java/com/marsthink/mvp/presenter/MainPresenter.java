/*
 *     Copyright (c) 2016 Meituan Inc.
 *
 *     The right to copy, distribute, modify, or otherwise make use
 *     of this software may be licensed only pursuant to the terms
 *     of an applicable Meituan license agreement.
 *
 */

package com.marsthink.mvp.presenter;

import android.support.annotation.NonNull;

public class MainPresenter implements MainContract.Presenter {
    public static final String TAG = "gaode_map";
    private MainContract.View mMapView;

    public MainPresenter(@NonNull MainContract.View mMapView) {
        this.mMapView = mMapView;
    }

    @Override
    public void getMovie() {
        /*
        * 网络操作
        * */
        String movie = "摔跤吧爸爸";
        mMapView.showMovie(movie);
    }
}