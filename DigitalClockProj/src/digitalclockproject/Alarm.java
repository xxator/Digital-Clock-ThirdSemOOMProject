package digitalclockproject;

import static digitalclockproject.DigitalClockProject.Stop_alarm;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.lang.Object;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javafx.animation.Animation;
import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.MediaPlayer.Status;
import javafx.embed.swing.JFXPanel;
import javafx.util.Duration;

public class Alarm {

    private static int alarmHour;
    private static int alarmMinute;
    private static int alarmSecond;
    private static String alarmSignal;
    private static int flag = 0;
    private static int play = 0;
    private static int stop = 0;
    private static STOP Stop_alarm = new STOP();

    public static void setStop(int stop) {
        Alarm.stop = stop;
    }

    public static void setPlay(int play) {
        Alarm.play = play;
    }

    public static int getPlay() {
        return play;
    }

    public static void setFlag(int flag) {
        Alarm.flag = flag;
    }

    public static int getFlag() {
        return flag;
    }

    public static int getAlarmHour() {
        return alarmHour;
    }

    public static int getAlarmMinute() {
        return alarmMinute;
    }

    public static int getAlarmSecond() {
        return alarmSecond;
    }

    public static String getAlarmSignal() {
        return alarmSignal;
    }

    public static void setAlarmHour(int alarmHour) {
        Alarm.alarmHour = alarmHour;
    }

    public static void setAlarmMinute(int alarmMinute) {
        Alarm.alarmMinute = alarmMinute;
    }

    public static void setAlarmSecond(int alarmSecond) {
        Alarm.alarmSecond = alarmSecond;
    }

    public static void setAlarmSignal(String s) {
        Alarm.alarmSignal = s;
    }

    public static void activateAlarm(int form, int h, int m, String a, String d) {
        String playId;
        playId = d + ".mp3";
        if (form == 24) {
            if (a.equals("PM") && h != 12) {
                h = h + 12;
            } else if (a.equals("AM") && h == 12) {
                h = 0;
            }
        }

        setAlarmSignal(" ");
        final JFXPanel fxPanel = new JFXPanel();

        if (h == new DigitalClock().gethour() && m == new DigitalClock().getminute()) {
            Timer t = new Timer();
            // Your database code here
            Media hit = new Media(new File(playId).toURI().toString());
            System.out.println("x");
            MediaPlayer mediaPlayer = new MediaPlayer(hit);
            play = 1;

            mediaPlayer.setCycleCount(1500);
            mediaPlayer.play();

            Stop_alarm.setVisible(true);
            Stop_alarm.getjButton1().addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    mediaPlayer.stop();
                    Stop_alarm.dispose();
                }
            });

        }

    }

    public static STOP getStop_alarm() {
        return Stop_alarm;
    }

}
