package com.fuicuiedu.idedemo.mosbydemo.MyMvp;

import java.util.List;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class MyMvpPresenter<V extends MyMvpView> {


    private V v;

    //经常要用View接口，所以写在父类，方便调用
    public V getView(){
        if (v == null){
            //抛异常，等等
        }
        return v;
    }

}
