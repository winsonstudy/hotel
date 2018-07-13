package com.ott.plugin.service;

interface IMyService{  
    String Authentication(String jsonStr);
    String QueryUserInfo(String jsonStr);
    String ValidatePassword(String jsonStr);
    String UpdatePassword(String jsonStr);
    String FindPassword(String jsonStr);
    String QueryOrderList(String jsonStr);
    String Unsubscribe(String jsonStr);
    String QueryBilldetail(String jsonStr);
    String BindMobile(String jsonStr);
    String GetArea(String jsonStr);
    String ValueAddedOrder(String jsonStr);
    String OrderContinue(String jsonStr);
    int SetExtData(String source, String key, String data);
    String OpenMulticast(String jsonStr);
    String Idtification(String jsonStr);
    String GetTradeName (String jsonStr);
    String TradeReport(String jsonStr);
    String UpdateChildLockPassword(String jsonStr);
    String getMultiParams(String jsonStr);
    String getIPTVPlayUrl(String jsonStr);
} 