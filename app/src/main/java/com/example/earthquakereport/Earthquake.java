package com.example.earthquakereport;
public class Earthquake {
    private double magnitude;
    private String location;
    private String date;
    private long mTimeInMilliseconds;
    private  String url;

    Earthquake(double m, String l, Long timeInMilliseconds,String url)
    {
        magnitude=m;
        location=l;
        mTimeInMilliseconds = timeInMilliseconds;
        this.url=url;
    }

    public String getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public double getMagnitude() {
        return magnitude;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl(){return this.url;}
}

