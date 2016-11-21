package com.fuicuiedu.idedemo.mosbydemo;

import android.os.AsyncTask;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/21 0021.
 */

public class MainPresenter {

    private List<String> mData;
    private MainActivity mainActivity;

    public MainPresenter(MainActivity mainActivity){
        mData = new ArrayList<>();
        this.mainActivity = mainActivity;
    }

    public void loadData(){
        //异步加载数据
        mainActivity.showPrb();//显示加载动画
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();
    }


    class MyAsyncTask extends AsyncTask<Void,Void,Void>{
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        //ctrl + o 。。。重写方法
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            for(int i = 0 ;i<30;i++){
                mData.add("测试数据 = " + i);
            }
            mainActivity.hidePrb();//结束加载动画
            mainActivity.setData(mData);
        }
    }

}