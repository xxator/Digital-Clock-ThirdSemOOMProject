package digitalclockproject;

import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.Insets;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author This PC
 */
class BgPanel extends JPanel {
    Image bg = new ImageIcon("water.jpg").getImage();
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
    }
}

public class display extends javax.swing.JFrame {

    public JTextField getDate() {
        return date;
    }


    public JMenu getjMenu1() {
        return jMenu1;
    }

    public void setjMenu1(JMenu jMenu1) {
        this.jMenu1 = jMenu1;
    }

    public JTextField getHour1() {
        return hour1;
    }

    public void setHour1(JTextField hour1) {
        this.hour1 = hour1;
    }

    public JComboBox<String> getDate_format_coser() {
        return date_format_coser;
    }

   
    public void setDate_format_coser(JComboBox<String> date_format_coser) {
        this.date_format_coser = date_format_coser;
    }

    public JComboBox<String> getTextchoser() {
        return textchoser;
    }

    public void setTextchoser(JComboBox<String> textchoser) {
        this.textchoser = textchoser;
    }

    public JTextField getHour2() {
        return hour2;
    }

    public void setHour2(JTextField hour2) {
        this.hour2 = hour2;
    }

    public JEditorPane getjEditorPane1() {
        return jEditorPane1;
    }

    public void setjEditorPane1(JEditorPane jEditorPane1) {
        this.jEditorPane1 = jEditorPane1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public JTextField getjTextField2() {
        return jTextField2;
    }

    public void setjTextField2(JTextField jTextField2) {
        this.jTextField2 = jTextField2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JTextField getMinutes1() {
        return minutes1;
    }

    public void setMinutes1(JTextField minutes1) {
        this.minutes1 = minutes1;
    }

    public JTextField getMinutes2() {
        return minutes2;
    }

    public void setMinutes2(JTextField minutes2) {
        this.minutes2 = minutes2;
    }

 
  

    public JScrollPane getjScrollPane7() {
        return jScrollPane7;
    }

    public void setjScrollPane7(JScrollPane jScrollPane7) {
        this.jScrollPane7 = jScrollPane7;
    }

    public JTextField getjTextField1() {
        return hour1;
    }

    public void setjTextField1(JTextField jTextField1) {
        this.hour1 = jTextField1;
    }

    public JMenu getOptions() {
        return options;
    }

    public void setOptions(JMenu options) {
        this.options = options;
    }


    public void setDate(JTextField date) {
        this.date = date;
    }


    public JButton getSetTime() {
        return alarm;
    }

    public void setSetTime(JButton setTime) {
        this.alarm = setTime;
    }


    public JButton getAlarm() {
        return alarm;
    }

    public void setAlarm(JButton alarm) {
        this.alarm = alarm;
    }

    public JList<String> getjList1() {
        return jList1;
    }

    public void setjList1(JList<String> jList1) {
        this.jList1 = jList1;
    }

    public JComboBox<String> getColorchooser() {
        return colorchooser;
    }

    public void setColorchooser(JComboBox<String> colorchooser) {
        this.colorchooser = colorchooser;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JPanel getjPanel2() {
        return jPanel2;
    }

    public void setjPanel2(JPanel jPanel2) {
        this.jPanel2 = jPanel2;
    }

    public JTextField getMonth() {
        return month;
    }

    public void setMonth(JTextField month) {
        this.month = month;
    }

    public JTextField getYear() {
        return year;
    }

    public void setYear(JTextField year) {
        this.year = year;
    }

    public JTextField getSeconds() {
        return seconds;
    }

    public void setSeconds(JTextField seconds) {
        this.seconds = seconds;
    }

  

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }
     
  
    private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
    Image img = icon.getImage();  
    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
    return new ImageIcon(resizedImage);
    }
    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JLabel getQuote() {
        return quote;
    }

    public void setQuote(JLabel quote) {
        this.quote = quote;
    }

    public void setim(int t){
          if(t>18 || t<5){
             ImageIcon imageIcon = new ImageIcon("background.jpg"); // load the image to a imageIcon
             Image image = imageIcon.getImage(); // transform it 
             Image newimg = image.getScaledInstance(700, 450,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
             imageIcon = new ImageIcon(newimg);  // transform it back
             setContentPane(new JLabel(imageIcon));
             }
             else
             {
              
             ImageIcon imageIcon = new ImageIcon("background.jpg"); // load the image to a imageIcon
             Image image = imageIcon.getImage(); // transform it 
             Image newimg = image.getScaledInstance(700, 450,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
             imageIcon = new ImageIcon(newimg);  // transform it back
             setContentPane(new JLabel(imageIcon));
             
             }
    }


    /**
     * Creates new form display
     */
    public void setq(){
        
       quote.setText("<html>" + quotes[aux] + "</html>");
        aux=(aux+1)%quotes.length;
    }
    int aux = 0;
    String[] quotes = {"“And now, let us believe in a long year that is given to us, new, untouched, full of things that have never been.” -Rainer Maria Rilke",
                            "“Anyone who thinks gardening begins in the spring and ends in the fall is missing the best part of the whole year; for gardening begins in January with the dream.” -Josephine Nuese",
                            "“When it rains, look for rainbows. When it’s dark, look for stars.” -Unknown",
                            "“Too often we underestimate the power of touch. A smile. A kind word. A listening ear. An honest compliment.Or the smallest act of caring. All of which have the potential to turn a life around.” -Leo Buscaglia",
                            "“What good is the warmth of summer without the chill of winter.” -John Steinbeck ",
                            "”Make the best use of what is in your power, and take the rest as it happens.” -Epictetus ",
                            "“Let us be grateful to people who make us happy. They are the charming gardeners who make our souls blossom.” -Marcel Proust ", 
                            " “Go forward in life with a twinkle in your eye and a smile on your face, but with a great and strong purpose in your heart.” -Gordon B. Hinckley",
                            "“Never let life impede on your ability to manifest your dreams. Dig deeper into your dreams and deeper into yourself and believe that anything is possible, and make it happen” -Coren Nemec ", 
                            "“Twenty years from now, you will be more disappointed by the things that you didn’t do than by the ones that you did do. So throw off the bowlines. Sail away from safe harbor. Catch the trade winds in your sails. Explore. Dream. Discover.” -Mark Twain ", 
                            "“By all these lovely tokens, September days are here, with summer’s best of weather and autumn’s best of cheer.” -H.H. Jackson ",
                            " “Do the best you can until you know better. Then when you know better, do better.” ",
                            "“It was one of those March days when the sun shines hot and the wind blows cold: when it is summer in the light, and winter in the shade.” -Charles Dickens"};
    public display(int t,boolean i) throws IOException, FontFormatException {
        String[] timeZones = {"Asia/Kolkata","Europe/Berlin","Europe/Moscow","Africa/Johannesburg","Europe/London","America/Phoenix","America/New_York","Africa/Harare","America/Los_Angeles","Asia/Bangkok","America/Detroit"};
        String[] color = {"choose","image","White","Green","Blue","Yellow","Black","Red"};
        String[] textcolor = {"White","Green","Blue","Yellow","Black","Red"};
        String[] date_format = {"DD/MM/YYYY","MM/DD/YYYY"};
        int aux = 0;
              
             setLayout(new BorderLayout());      
             //ImageIcon icon = new ImageIcon("C:\\Users\\This PC\\Desktop\\DigitalClockProj\\back2.png ");
            if(i)
            {
             setim(t);
            }
     
        
        
        initComponents();
        /*InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("fontbc.ttf");
        Font font = Font.createFont(Font.TRUETYPE_FONT, stream).deriveFont(48f);*/
        String filename="fontbc.ttf";
    Font font = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
    Font fonts = Font.createFont(Font.TRUETYPE_FONT, new File(filename));
    font = font.deriveFont(Font.PLAIN,125);
    fonts = font.deriveFont(Font.PLAIN,30);
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    ge.registerFont(font);
        
        hour1.setFont(font);
        hour2.setFont(font);
        minutes1.setFont(font);
        minutes2.setFont(font);
        date.setFont(fonts);
        month.setFont(fonts);
        year.setFont(fonts);
        fonts = font.deriveFont(Font.PLAIN,50);
        seconds.setFont(fonts);
        
        
        
        // jScrollPane4.getViewport().setOpaque(false);
         //jScrollPane.getViewport().setOpaque(false);
        // jScrollPane2.getViewport().setOpaque(false);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2); 
        
        for(String s : timeZones){
            this.timezones.addItem(s);
        }
        for(String s : date_format){
            this.date_format_coser.addItem(s);
        }
        for(String s : color){
            this.colorchooser.addItem(s);
            //this.textchoser.addItem(s);
        }
        for(String s : textcolor){
           // this.colorchooser.addItem(s);
            this.textchoser.addItem(s);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        options = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jScrollPane7 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        alarm = new javax.swing.JButton();
        timezones = new javax.swing.JComboBox<>();
        format = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        hour1 = new javax.swing.JTextField();
        hour2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        minutes2 = new javax.swing.JTextField();
        minutes1 = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        month = new javax.swing.JTextField();
        year = new javax.swing.JTextField();
        seconds = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        quote = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        colorchooser = new javax.swing.JComboBox<>();
        testcolor = new javax.swing.JLabel();
        textchoser = new javax.swing.JComboBox<>();
        dateformat = new javax.swing.JLabel();
        date_format_coser = new javax.swing.JComboBox<>();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        options.setText("jMenu1");

        jMenu1.setText("jMenu1");

        jScrollPane7.setViewportView(jEditorPane1);

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBounds(new java.awt.Rectangle(700, 360, 700, 360));
        setPreferredSize(new java.awt.Dimension(710, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(710, 450));

        alarm.setFont(new java.awt.Font("Old English Text MT", 1, 14)); // NOI18N
        alarm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/digitalclockproject/alarm.png"))); // NOI18N
        alarm.setBorder(null);
        alarm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alarmActionPerformed(evt);
            }
        });

        timezones.setBackground(new java.awt.Color(0, 0, 0));
        timezones.setFont(new java.awt.Font("NSimSun", 2, 11)); // NOI18N
        timezones.setForeground(new java.awt.Color(0, 153, 153));
        timezones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {}));
        timezones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        timezones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timezonesActionPerformed(evt);
            }
        });

        format.setBackground(new java.awt.Color(0, 0, 0));
        format.setFont(new java.awt.Font("NSimSun", 2, 11)); // NOI18N
        format.setForeground(new java.awt.Color(0, 153, 153));
        format.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "24 hours","12 hours"}));
        format.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        format.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Chiller", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Select TimeZone");

        jLabel2.setFont(new java.awt.Font("Chiller", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Time Format");

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        hour1.setFont(new java.awt.Font("Segoe UI", 0, 125)); // NOI18N
        hour1.setForeground(new java.awt.Color(0, 153, 153));
        hour1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hour1.setBorder(null);
        hour1.setOpaque(false);
        hour1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour1ActionPerformed(evt);
            }
        });

        hour2.setFont(new java.awt.Font("Segoe UI", 0, 125)); // NOI18N
        hour2.setForeground(new java.awt.Color(0, 153, 153));
        hour2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        hour2.setBorder(null);
        hour2.setOpaque(false);
        hour2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hour2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hour2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hour2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hour1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setOpaque(false);

        minutes2.setFont(new java.awt.Font("Segoe UI", 0, 125)); // NOI18N
        minutes2.setForeground(new java.awt.Color(0, 153, 153));
        minutes2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minutes2.setBorder(null);
        minutes2.setOpaque(false);
        minutes2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutes2ActionPerformed(evt);
            }
        });

        minutes1.setFont(new java.awt.Font("Segoe UI", 0, 125)); // NOI18N
        minutes1.setForeground(new java.awt.Color(0, 153, 153));
        minutes1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        minutes1.setBorder(null);
        minutes1.setOpaque(false);
        minutes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minutes1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(minutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minutes2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minutes1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minutes2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        date.setEditable(false);
        date.setBackground(java.awt.Color.lightGray);
        date.setFont(new java.awt.Font("Arial", 3, 25)); // NOI18N
        date.setForeground(new java.awt.Color(0, 153, 153));
        date.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date.setText("Date");
        date.setBorder(null);
        date.setOpaque(false);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });

        month.setEditable(false);
        month.setBackground(java.awt.Color.lightGray);
        month.setFont(new java.awt.Font("Arial", 3, 25)); // NOI18N
        month.setForeground(new java.awt.Color(0, 153, 153));
        month.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        month.setText("Date");
        month.setBorder(null);
        month.setOpaque(false);

        year.setEditable(false);
        year.setBackground(java.awt.Color.lightGray);
        year.setFont(new java.awt.Font("Arial", 3, 25)); // NOI18N
        year.setForeground(new java.awt.Color(0, 153, 153));
        year.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        year.setText("Date");
        year.setBorder(null);
        year.setOpaque(false);
        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        seconds.setFont(new java.awt.Font("Centaur", 0, 48)); // NOI18N
        seconds.setForeground(new java.awt.Color(0, 153, 153));
        seconds.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        seconds.setOpaque(false);
        seconds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("/");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("/");

        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);

        jPanel4.setPreferredSize(new java.awt.Dimension(280, 360));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Need Of the 'Hour'");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        quote.setBackground(new java.awt.Color(0, 153, 153));
        quote.setFont(new java.awt.Font("Segoe Print", 2, 18)); // NOI18N
        quote.setForeground(new java.awt.Color(255, 255, 255));
        quote.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quote.setText("asdfgjdeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee");
        quote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        quote.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(quote, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(quote, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 204, 204));
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Chiller", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Background Color");

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));
        jPanel6.setForeground(new java.awt.Color(0, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        colorchooser.setBackground(new java.awt.Color(0, 0, 0));
        colorchooser.setFont(new java.awt.Font("NSimSun", 2, 11)); // NOI18N
        colorchooser.setForeground(new java.awt.Color(0, 153, 153));
        colorchooser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        colorchooser.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                colorchooserComponentAdded(evt);
            }
        });
        colorchooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorchooserActionPerformed(evt);
            }
        });

        testcolor.setFont(new java.awt.Font("Chiller", 3, 18)); // NOI18N
        testcolor.setForeground(new java.awt.Color(0, 153, 153));
        testcolor.setText("Text Color");

        textchoser.setBackground(new java.awt.Color(0, 0, 0));
        textchoser.setFont(new java.awt.Font("NSimSun", 2, 11)); // NOI18N
        textchoser.setForeground(new java.awt.Color(0, 153, 153));
        textchoser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        textchoser.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                textchoserComponentAdded(evt);
            }
        });
        textchoser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textchoserActionPerformed(evt);
            }
        });

        dateformat.setFont(new java.awt.Font("Chiller", 3, 18)); // NOI18N
        dateformat.setForeground(new java.awt.Color(0, 153, 153));
        dateformat.setText("Date Format");

        date_format_coser.setBackground(new java.awt.Color(0, 0, 0));
        date_format_coser.setFont(new java.awt.Font("NSimSun", 2, 11)); // NOI18N
        date_format_coser.setForeground(new java.awt.Color(0, 153, 153));
        date_format_coser.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        date_format_coser.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentRemoved(java.awt.event.ContainerEvent evt) {
                date_format_coserComponentRemoved(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(alarm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(timezones, 0, 124, Short.MAX_VALUE)
                                    .addComponent(format, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(seconds, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(testcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(114, 114, 114))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(dateformat, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(date_format_coser, 0, 124, Short.MAX_VALUE)
                                .addComponent(textchoser, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(colorchooser, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel4});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {colorchooser, date_format_coser, format, timezones});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(month, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(year, javax.swing.GroupLayout.Alignment.LEADING)))
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(alarm, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(timezones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(format, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addComponent(seconds))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(testcolor)
                            .addComponent(textchoser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_format_coser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateformat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(colorchooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {date, month, year});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {format, timezones});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alarmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alarmActionPerformed

    private void timezonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timezonesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timezonesActionPerformed

    private void hour1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hour1ActionPerformed

    private void hour2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hour2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hour2ActionPerformed

    private void minutes2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutes2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutes2ActionPerformed

    private void minutes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minutes1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minutes1ActionPerformed

    private void secondsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondsActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void colorchooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorchooserActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_colorchooserActionPerformed

    private void colorchooserComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_colorchooserComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_colorchooserComponentAdded

    private void textchoserComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_textchoserComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_textchoserComponentAdded

    private void textchoserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textchoserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textchoserActionPerformed

    private void date_format_coserComponentRemoved(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_date_format_coserComponentRemoved
        // TODO add your handling code here:
    }//GEN-LAST:event_date_format_coserComponentRemoved

    private void formatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formatActionPerformed

    public JComboBox<String> getFormat() {
        return format;
    }

    public JComboBox<String> getTimezones() {
        return timezones;
    }

    public void changebackcolor(String s)
    {
        if(s.equals("Red"))
         this.getContentPane().setBackground(Color.red);
        else if(s.equals("Green"))
         this.getContentPane().setBackground(Color.green); 
        else if(s.equals("Black"))
         this.getContentPane().setBackground(Color.black); 
        else if(s.equals("White"))
         this.getContentPane().setBackground(Color.white); 
        else if(s.equals("Yellow"))
         this.getContentPane().setBackground(Color.yellow);
        else if(s.equals("Blue"))
         this.getContentPane().setBackground(Color.blue); 
        //System.out.println(color);
        else if(s.equals("Day"))
        {
          
        }
        
        repaint();
    }
    public void changetextcolor(String s)
    {
        if(s.equals("Red")){
             minutes1.setForeground(Color.red);
             minutes2.setForeground(Color.red);
             hour1.setForeground(Color.red);
             hour2.setForeground(Color.red);
             seconds.setForeground(Color.red);
             date.setForeground(Color.red);
             month.setForeground(Color.red);
             year.setForeground(Color.red);
             
        }
        
        else if(s.equals("Green")){
             minutes1.setForeground(Color.green);
             minutes2.setForeground(Color.green);
             hour1.setForeground(Color.green);
             hour2.setForeground(Color.green);
             seconds.setForeground(Color.green);
             date.setForeground(Color.green);
             month.setForeground(Color.green);
             year.setForeground(Color.green);
        }
        else if(s.equals("Black"))
         {
             minutes1.setForeground(Color.black);
             minutes2.setForeground(Color.black);
             hour1.setForeground(Color.black);
             hour2.setForeground(Color.black);
             seconds.setForeground(Color.black);
             date.setForeground(Color.black);
             month.setForeground(Color.black);
             year.setForeground(Color.black);
             
        }
        else if(s.equals("White"))
        {
             minutes1.setForeground(Color.white);
             minutes2.setForeground(Color.white);
             hour1.setForeground(Color.white);
             hour2.setForeground(Color.white);
             seconds.setForeground(Color.white);
             date.setForeground(Color.white);
             month.setForeground(Color.white);
             year.setForeground(Color.white);
        }
        else if(s.equals("Yellow"))
        {
             minutes1.setForeground(Color.yellow);
             minutes2.setForeground(Color.yellow);
             hour1.setForeground(Color.yellow);
             hour2.setForeground(Color.yellow);
             seconds.setForeground(Color.yellow);
             date.setForeground(Color.yellow);
             month.setForeground(Color.yellow);
             year.setForeground(Color.yellow);
        }
        else if(s.equals("Blue"))
        {
             minutes1.setForeground(Color.blue);
             minutes2.setForeground(Color.blue);
             hour1.setForeground(Color.blue);
             hour2.setForeground(Color.blue);
             seconds.setForeground(Color.blue);
             date.setForeground(Color.blue);
             month.setForeground(Color.blue);
             year.setForeground(Color.blue);
        }
        repaint();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new display(7,false).setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
                } catch (FontFormatException ex) {
                    Logger.getLogger(display.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alarm;
    private javax.swing.JComboBox<String> colorchooser;
    private javax.swing.JTextField date;
    private javax.swing.JComboBox<String> date_format_coser;
    private javax.swing.JLabel dateformat;
    private javax.swing.JComboBox<String> format;
    private javax.swing.JTextField hour1;
    private javax.swing.JTextField hour2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField minutes1;
    private javax.swing.JTextField minutes2;
    private javax.swing.JTextField month;
    private javax.swing.JMenu options;
    private javax.swing.JLabel quote;
    private javax.swing.JTextField seconds;
    private javax.swing.JLabel testcolor;
    private javax.swing.JComboBox<String> textchoser;
    private javax.swing.JComboBox<String> timezones;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
