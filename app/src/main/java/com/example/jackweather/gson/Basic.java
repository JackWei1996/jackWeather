package com.example.jackweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 19604 on 3/4/2018.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
