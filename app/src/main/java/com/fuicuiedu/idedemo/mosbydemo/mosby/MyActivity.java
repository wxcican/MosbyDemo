package com.fuicuiedu.idedemo.mosbydemo.mosby;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fuicuiedu.idedemo.mosbydemo.R;
import com.hannesdorfmann.mosby.mvp.MvpActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MyActivity extends MvpActivity<MyView, MyPresenter> implements MyView {

    @BindView(R.id.my_prb)
    ProgressBar myPrb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public MyPresenter createPresenter() {
        return new MyPresenter();
    }

    @Override
    public void showPrb() {
        myPrb.setVisibility(View.VISIBLE);
    }

    @Override
    public void hidePrb() {
        myPrb.setVisibility(View.GONE);
    }

    @Override
    public void showMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.my_btn)
    public void onClick() {
        getPresenter().login();
    }
}
