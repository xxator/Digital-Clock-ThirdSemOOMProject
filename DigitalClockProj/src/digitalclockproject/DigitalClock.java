/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitalclockproject;

import java.io.DataOutput;
import java.io.IOException;
import java.io.Serializable;
import java.time.Clock;
import java.time.ZoneId;
import java.lang.Object;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;
/**
 *
 * @author ASUS
 */
public class DigitalClock  implements Serializable
{
    private static int hour;
    private static int minute;
    private static int second;
    private static int date;
    private static int month;
    private static int year;
    private static String day;
    private static String ampm;
    private static int format;
    private static String timezone;

public int gethour() {
        return hour;
    }

    public  int getminute() {
        return minute;
    }

    public int getsecond() {
        return second;
    }

    public  int getdate() {
        return date;
    }

    public  int getmonth() {
        return month;
    }

    public int getyear() {
        return year;
    }

    public String getday() {
        return day;
    }

    public int getformat() {
        return format;
    }

    public String gettimezone() {
        return timezone;
    }
    
    public  String getampm() {
        return ampm;
    }

    public  void sethour(int hour) {
        DigitalClock.hour = hour;
    }

    public  void setminute(int minute) {
        DigitalClock.minute = minute;
    }

    public  void setsecond(int second) {
        DigitalClock.second = second;
    }

    public  void setdate(int date) {
        DigitalClock.date = date;
    }

    public void setmonth(int month) {
        DigitalClock.month = month;
    }

    public  void setyear(int year) {
        DigitalClock.year = year;
    }

    public  void setday(String day) {
        DigitalClock.day = day;
    }

    public  void setformat(int format) {
        DigitalClock.format = format;
    }

    public  void settimezone(String timezone) {
        DigitalClock.timezone = timezone;
    }
    
    public  void setampm(String a) {
        DigitalClock.ampm = a;
    }
       
    public  void display(String zoneId, int form)
    {
        if ( !gettimezone().equals(zoneId) ){
            ZoneId zone = ZoneId.of(zoneId);
            ZonedDateTime time = ZonedDateTime.now(zone);
            
            setsecond(time.getSecond());
            setminute(time.getMinute());
            sethour(time.getHour());
            setdate(time.getDayOfMonth());
            setmonth(time.getMonthValue());
            setyear(time.getYear());
            setday(time.getDayOfWeek().name());
            
            settimezone(zoneId);
            setformat(24);
        }
        
        if ( form != getformat() ){
            if ( form == 12 ){
                if ( gethour() > 12 ){
                    sethour(gethour() - 12);
                    setampm("PM");
                }
                else if ( gethour() == 12 ){
                    setampm("PM");
                }
                else{
                    setampm("AM");
                }
            }
            if ( form == 24 ){
                if ( getampm().equals("PM") && gethour() != 12 ){
                    sethour(gethour() + 12);
                }
                else if ( getampm().equals("AM") && gethour() == 12 ){
                    sethour(0);
                }
            }
            setformat(form);
        }       
    }
}
