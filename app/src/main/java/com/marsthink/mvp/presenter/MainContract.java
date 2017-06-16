/*
 *     Copyright (c) 2016 Meituan Inc.
 *
 *     The right to copy, distribute, modify, or otherwise make use
 *     of this software may be licensed only pursuant to the terms
 *     of an applicable Meituan license agreement.
 *
 */

package com.marsthink.mvp.presenter;

public interface MainContract {
    interface View {
        void showMovie(String movies);
    }

    interface Presenter {
        void getMovie();
    }
}
