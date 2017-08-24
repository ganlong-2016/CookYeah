package com.qxf.archer.cookman.ui.splash;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;
import com.qxf.archer.cookman.constant.Constant;
import com.qxf.archer.cookman.entity.CookTypeEntity;
import com.qxf.archer.cookman.net.NetClient;

import java.util.ArrayList;

import rx.functions.Func1;

/**
 * 类描述：
 * <p>
 * 作者：Administrator on 2017/8/24 0024 15:56
 * 邮箱：377289596@qq.com
 */

public class SplashPresenter extends MvpBasePresenter<SplashView> {

    public void getData() {

        NetClient.getInstance()
                .getApi()
                .getCookType(Constant.KEY)
                .map(new Func1<CookTypeEntity, ArrayList<String>>() {
                    @Override
                    public ArrayList<String> call(CookTypeEntity cookTypeEntity) {
//                        for (int i = 0; i < cookTypeEntity.; i++) {
//
//                        }
                        return null;
                    }
                });
    
    }
}
