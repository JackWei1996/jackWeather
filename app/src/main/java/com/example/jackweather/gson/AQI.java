package com.example.jackweather.gson;

/**
 * Created by 19604 on 3/4/2018.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
