package com.fuicuiedu.idedemo.mosbydemo.register;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.fuicuiedu.idedemo.mosbydemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends AppCompatActivity {


    @BindView(R.id.register_prb)
    ProgressBar registerPrb;

    /**
     * 视图与业务
     * <p>
     * 视图：
     * 两个edittext
     * button
     * progressbar
     * <p>
     * 视图操作：
     * progressbar 显示
     * progressbar 隐藏
     * toast 显示提示信息
     * <p>
     * 业余：
     * 网络注册请求，拿到结果，通知视图更新
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ButterKnife.bind(this);
    }

    public void showPrb() {
        registerPrb.setVisibility(View.VISIBLE);
    }

    public void hidePrb() {
        registerPrb.setVisibility(View.GONE);
    }

    public void showMsg(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.register_btn)
    public void onClick() {
        new RegisterPresenter(this).register();

        finish();
        System.gc();
    }
}
