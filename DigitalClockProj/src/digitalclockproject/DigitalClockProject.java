/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalclockproject;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author ayush
 */
public class DigitalClockProject extends TimerTask {

    static display clockDesign;
    int c_t = 0;
    int a_t = 0;
    boolean imageset = true;
    static FrameAlarm alarmDesign = new FrameAlarm();
    static DigitalClock clock = new DigitalClock();
    static Alarm alarm = new Alarm();
    static STOP Stop_alarm = new STOP();
    boolean flag = true;
    public static void main(String[] args) throws IOException, FontFormatException {
        // TODO code application logic here
        //Application.launch();
        clockDesign = new display(clock.gethour(),true);
        clockDesign.setVisible(true);
        //clockDesign.getHours1().setBackground(new Color(0,0,0));
        clockDesign.getAlarm().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alarmDesign.setVisible(true);
                alarmDesign.getSetAlarm().addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alarm.setAlarmHour(Integer.parseInt(alarmDesign.getHours().getText().toString()));
                        alarm.setAlarmMinute(Integer.parseInt(alarmDesign.getMinutes().getText().toString()));
                        Alarm.setFlag(1);
                        clockDesign.setVisible(true);
                    }
                });
            }
        });

        Timer timer = new Timer();
        timer.schedule(new DigitalClockProject(), 0, 1000);
    }

    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
        Image img = icon.getImage();
        Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(resizedImage);
    }

    @Override
    public void run() {

        clock.settimezone(" ");
        clock.setformat(12);
        clock.display(String.valueOf(clockDesign.getTimezones().getSelectedItem().toString()), Integer.parseInt(clockDesign.getFormat().getSelectedItem().toString().substring(0, 2)));
        if(flag)
        {
            flag =false;
            clockDesign.dispose();
            
            try {
                clockDesign = new display(clock.gethour(),true);
            } catch (IOException ex) {
                Logger.getLogger(DigitalClockProject.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FontFormatException ex) {
                Logger.getLogger(DigitalClockProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        clockDesign.setVisible(true);
        //clockDesign.getHours1().setBackground(new Color(0,0,0));
        clockDesign.getAlarm().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alarmDesign.setVisible(true);
                alarmDesign.getSetAlarm().addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alarm.setAlarmHour(Integer.parseInt(alarmDesign.getHours().getText().toString()));
                        alarm.setAlarmMinute(Integer.parseInt(alarmDesign.getMinutes().getText().toString()));
                        Alarm.setFlag(1);
                        clockDesign.setVisible(true);
                    }
                });
            }
        });
        }
        clockDesign.changetextcolor(clockDesign.getTextchoser().getSelectedItem().toString());
        c_t = clock.getminute();
        if(c_t != a_t)
        {
            a_t = c_t;
            clockDesign.setq();
        }
        if(clockDesign.getColorchooser().getSelectedItem().toString().equals("image"))
        {
            if(imageset == false)
            {
            imageset = true;
            clockDesign.dispose();
            try {
                clockDesign = new display(clock.gethour(),true);
            } catch (IOException ex) {
                Logger.getLogger(DigitalClockProject.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FontFormatException ex) {
                Logger.getLogger(DigitalClockProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        clockDesign.setVisible(true);
        clockDesign.setq();
        //clockDesign.getHours1().setBackground(new Color(0,0,0));
        clockDesign.getAlarm().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alarmDesign.setVisible(true);
                alarmDesign.getSetAlarm().addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alarm.setAlarmHour(Integer.parseInt(alarmDesign.getHours().getText().toString()));
                        alarm.setAlarmMinute(Integer.parseInt(alarmDesign.getMinutes().getText().toString()));
                        Alarm.setFlag(1);
                        clockDesign.setVisible(true);
                    }
                });
            }
        });
        }
        }
        else if(!clockDesign.getColorchooser().getSelectedItem().toString().equals("choose")){ 
        if(imageset==false)
        {
            clockDesign.changebackcolor(clockDesign.getColorchooser().getSelectedItem().toString());
        }
        else 
        {
            imageset = false;
             clockDesign.dispose();
            try {
                clockDesign = new display(clock.gethour(),false);
            } catch (IOException ex) {
                Logger.getLogger(DigitalClockProject.class.getName()).log(Level.SEVERE, null, ex);
            } catch (FontFormatException ex) {
                Logger.getLogger(DigitalClockProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        clockDesign.setVisible(true);
        //clockDesign.getHours1().setBackground(new Color(0,0,0));
        clockDesign.getAlarm().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                alarmDesign.setVisible(true);
                alarmDesign.getSetAlarm().addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        alarm.setAlarmHour(Integer.parseInt(alarmDesign.getHours().getText().toString()));
                        alarm.setAlarmMinute(Integer.parseInt(alarmDesign.getMinutes().getText().toString()));
                        Alarm.setFlag(1);
                        clockDesign.setVisible(true);
                    }
                });
            }
        });
        clockDesign.changebackcolor(clockDesign.getColorchooser().getSelectedItem().toString());
        }
        }
        
        
        
        if (clock.getformat() == 12) {
            clockDesign.getjTextField2().setText(clock.getampm());
        } else {
            clockDesign.getjTextField2().setText("");
        }
        clockDesign.getHour2().setText(String.valueOf(clock.gethour() % 10));
        clockDesign.getHour1().setText(String.valueOf(clock.gethour() / 10));

        clockDesign.getMinutes2().setText(String.valueOf(clock.getminute() % 10));
        clockDesign.getMinutes1().setText(String.valueOf(clock.getminute() / 10));
        clockDesign.getSeconds().setText(String.valueOf(clock.getsecond()));
        if(clockDesign.getDate_format_coser().getSelectedItem().toString().equals("DD/MM/YYYY"))
        {
        clockDesign.getDate().setText(String.valueOf(clock.getdate()));
        clockDesign.getMonth().setText(String.valueOf(clock.getmonth()));
        clockDesign.getYear().setText(String.valueOf(clock.getyear()));
        }
        else{
        clockDesign.getDate().setText(String.valueOf(clock.getmonth()));
        clockDesign.getMonth().setText(String.valueOf(clock.getdate()));
        clockDesign.getYear().setText(String.valueOf(clock.getyear()));
        }
        if (Alarm.getFlag() == 1 && Alarm.getPlay() == 0) {
            alarm.activateAlarm(12, Integer.parseInt(alarmDesign.getHours().getText().toString()), Integer.parseInt(alarmDesign.getMinutes().getText().toString()), "PM", clock.getday());
        }

        

    }

}
