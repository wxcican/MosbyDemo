package com.fuicuiedu.idedemo.mosbydemo.mosby;

import android.os.AsyncTask;

import com.hannesdorfmann.mosby.mvp.MvpNullObjectBasePresenter;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class MyPresenter extends MvpNullObjectBasePresenter<MyView>{

    public void login(){
        getView().showPrb();
        new MyAsyncTask().execute();
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

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            getView().showMsg("背对疾风吧！");
            getView().hidePrb();
        }
    }

}
