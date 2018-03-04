package com.example.jackweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 19604 on 3/4/2018.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
