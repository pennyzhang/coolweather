package com.example.mp.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by mp on 18-3-7.
 */

public class Town extends DataSupport {
    private int id;
    private String townName;
    private String weatherId;
    private int cityId;

}
