package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;
/*
  城市基本信息
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
