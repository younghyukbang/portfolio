package com.example.bagunic.log;

import android.app.Application;

import com.kakao.sdk.common.KakaoSdk;

public class GlobalApplication extends Application {
    private static GlobalApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        // 네이티브 앱 키로 초기화
        KakaoSdk.init(this, "cb0e5cbdd1de26a67c82df289641311e");
    }
}