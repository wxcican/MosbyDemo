package com.fuicuiedu.idedemo.mosbydemo.mosby;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public interface MyView extends MvpView{

    void showPrb();

    void hidePrb();

    void showMsg(String msg);
}
