package com.huawei.scheduled.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtis {

    private final static String sdf = "yyyy-MM-dd HH:mm:ss";

    public static String getDateTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);
        return simpleDateFormat.format(new Date());
    }

    public static String getDateTime(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);
        return simpleDateFormat.format(new Date());
    }

    public static String getDateTime(Long date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(sdf);
        return simpleDateFormat.format(date);
    }
}
