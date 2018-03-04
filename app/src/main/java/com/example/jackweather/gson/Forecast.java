package com.example.jackweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 19604 on 3/4/2018.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;

    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
