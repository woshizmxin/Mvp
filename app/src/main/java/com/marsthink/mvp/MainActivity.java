/*
 *     Copyright (c) 2016 Meituan Inc.
 *
 *     The right to copy, distribute, modify, or otherwise make use
 *     of this software may be licensed only pursuant to the terms
 *     of an applicable Meituan license agreement.
 *
 */

package com.marsthink.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.marsthink.mvp.presenter.MainContract;
import com.marsthink.mvp.presenter.MainPresenter;

public class MainActivity extends Activity implements MainContract.View {
    MainPresenter mainPresenter;
    TextView txt_movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_movie = (TextView)findViewById(R.id.txt_movie);
        mainPresenter = new MainPresenter(this);
        findViewById(R.id.btn_movie).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.getMovie();
            }
        });
    }

    @Override
    public void showMovie(String movies) {
        txt_movie.setText(movies);
    }
}
