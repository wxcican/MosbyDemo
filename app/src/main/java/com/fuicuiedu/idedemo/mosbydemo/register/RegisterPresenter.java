package com.fuicuiedu.idedemo.mosbydemo.register;

import android.os.AsyncTask;

/**
 * Created by Administrator on 2016/11/22 0022.
 */

public class RegisterPresenter {

    private RegisterActivity registerActivity;

    public RegisterPresenter(RegisterActivity registerActivity) {
        this.registerActivity = registerActivity;
    }

    public void register(){
        registerActivity.showPrb();
        new MyAsyncTask().execute();
    }


    class MyAsyncTask extends AsyncTask<Void,Void,Void>{
        @Override
        protected Void doInBackground(Void... params) {
            try {
                Thread.sleep(3000);
                registerActivity = null;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            registerActivity.showMsg("注册成功！");
            registerActivity.hidePrb();
        }
    }
}
