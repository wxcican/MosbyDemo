package com.fuicuiedu.idedemo.mosbydemo.MyMvp;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

//因为有抽象方法，所以是抽象类
public abstract class MyMvpActivity<V extends MyMvpView,
        P extends MyMvpPresenter>
        extends AppCompatActivity
        //实现View接口
        implements MyMvpView{

    //一定要写，所以抽象了
    public abstract P creatPresenter();

    //业务类
    private P p;

    //拿到我的业务类，方便调用
    public P getPresenter(){
        return p;
    }
}
