package asus.com.bwie.bwmarket.model;


import java.util.Map;

import asus.com.bwie.bwmarket.callback.MyCallBack;

public interface Imodel {

    //登录注册
    void startRequestData(String urlData, Map<String,String> map, Class clazz, MyCallBack myCallBack);
    //圈子列表
    void getCircleData(String urlData,int page,int count,Class clazz,MyCallBack myCallBack);
    //首页轮播
    void getXBannerData(String urlData,Class clazz,MyCallBack myCallBack);
}
