
import java.awt.Color;
import java.util.Random;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marck England
 */
public class logicIntermediate extends javax.swing.JFrame {

    Random randomizer = new Random();
    
    int n = 10;
    int round = 0;
    int question = 0;
    int score = 0;
    
    String[][] quiz = new String[n][6];
    
    public logicIntermediate() {
        initComponents();
       
        jPanel3.setBackground(new Color(0,0,0,100));
        jPanel4.setBackground(new Color(153,153,255,100));
        selectLabel.setBackground(new Color(255,255,255,100));
        mmLabel.setBackground(new Color(255,255,255,100));
        
        jPanel3.hide();
        jPanel4.hide();
        scoreL.hide();
        scoreLabel.hide();
        selectLabel.hide();
        mmLabel.hide();
        
        a1.hide();
        a2.hide();
        b1.hide();
        b2.hide();
        c1.hide();
        c2.hide();
        d1.hide();
        d2.hide();
        
        initData();
        update();
    }
    
    public void update(){
        questionLabel.setText(quiz[question][0]);
        a.setText(quiz[question][1]);
        b.setText(quiz[question][2]);
        c.setText(quiz[question][3]);
        d.setText(quiz[question][4]);
        a1.setText(quiz[question][1]);
        b1.setText(quiz[question][2]);
        c1.setText(quiz[question][3]);
        d1.setText(quiz[question][4]);
        a2.setText(quiz[question][1]);
        b2.setText(quiz[question][2]);
        c2.setText(quiz[question][3]);
        d2.setText(quiz[question][4]);
    }
    
    public void initData(){
        // Question
        quiz[0][0] = "<html><p align=\"center\">ATNHG, DKCMB, CVPJI, GNFPE, EXRLK, JQISH, GZTNM, _____</p></html>"; 
        
        // Choices
        quiz[0][1] = "A. RIJTU";
        quiz[0][2] = "B. PQMTH"; // Correct Answer
        quiz[0][3] = "C. MTLVK";
        quiz[0][4] = "D. HSKUJ";
        quiz[0][5] = "3"; // Index of the Correct Answer
        
        // Question
        quiz[1][0] = "<html><p align=\"center\">FISH : SCHOOL</p></html>"; 
        
        // Choices
        quiz[1][1] = "A. WOLF : PACK";
        quiz[1][2] = "B. COW : FARM"; // Correct Answer
        quiz[1][3] = "C. HERD : PEACOCK";
        quiz[1][4] = "D. ELEPHANT : JUNGLE";
        quiz[1][5] = "1"; // Index of the Correct Answer
        
        
        // Question
        quiz[2][0] = "<html><p align=\"center\">PASTORAL : RURAL</p></html>"; 
        
        // Choices
        quiz[2][1] = "A. SLEEPY : NOCTURNAL";
        quiz[2][2] = "B. METROPOLITAN : URBAN";
        quiz[2][3] = "C. HARVEST : AUTUMN"; // Correct Answer
        quiz[2][4] = "D. AGRARIAN : BENEVOLENT";
        quiz[2][5] = "2"; // Index of the Correct Answer
        
        
        // Question
        quiz[3][0] = "<html><p align=\"center\">Suresh, the son of Mahesh is married to Sia, whose sister Jia is married to Amar, the brother of Suresh. How is Jia related to Mahesh?</p></html>"; 
        
        // Choices
        quiz[3][1] = "A. Daughter-in-Law";
        quiz[3][2] = "B. Cousin";
        quiz[3][3] = "C. Sister-in-Law";
        quiz[3][4] = "D. Sister";
        quiz[3][5] = "1"; // Index of the Correct Answer
        
        
        // Question
        quiz[4][0] = "<html><p align=\"center\">Smith said, “Lilly is wife of the grandson of my sister’s mother.” How is Smith related to Lilly?</p></html>"; 
        
        // Choices
        quiz[4][1] = "A. Father";
        quiz[4][2] = "B. Father-in-Law";
        quiz[4][3] = "C. Brother-in-Law";
        quiz[4][4] = "D. Grandfather";
        quiz[4][5] = "2"; // Index of the Correct Answer
        
        
        // Question
        quiz[5][0] = "<html><p align=\"center\">In the school midterm exams, David has lower marks than Dechen, but has more than Sonam. However, Karma also has more marks than David. Who has the lowest mark?</p></html>"; 
        
        // Choices
        quiz[5][1] = "A. David";
        quiz[5][2] = "B. Dechen";
        quiz[5][3] = "C. Sonam";
        quiz[5][4] = "D. Karma";
        quiz[5][5] = "4"; // Index of the Correct Answer
        
        
        // Question
        quiz[6][0] = "<html><p align=\"center\">David prefers Economics to Math, English to Social science, and Political Science to History. If she prefers Math to History, and Social science to Math, which is David’s least preferred subject?</p></html>"; 
        
        // Choices
        quiz[6][1] = "A. History";
        quiz[6][2] = "B. Math";
        quiz[6][3] = "C. Social Science";
        quiz[6][4] = "D. Economics";
        quiz[6][5] = "1"; // Index of the Correct Answer
        
        
        // Question
        quiz[7][0] = "<html><p align=\"center\">In a maths class Riki divides 60 chalk sticks by half and adds fifteen. What answer does she show the Class?</p></html>"; 
        
        // Choices
        quiz[7][1] = "A. 129 Chalk Sticks";
        quiz[7][2] = "B. 130 Chalk Sticks";
        quiz[7][3] = "C. 135 Chalk Sticks";
        quiz[7][4] = "D. 145 Chalk Sticks";
        quiz[7][5] = "3"; // Index of the Correct Answer
        
        
        // Question
        quiz[8][0] = "<html><p align=\"center\">What day comes three days after the day which comes two days after the day which comes immediately after the day which comes two days after Monday?</p></html>"; 
        
        // Choices
        quiz[8][1] = "A. Monday";
        quiz[8][2] = "B. Tuesday";
        quiz[8][3] = "C. Wednesday";
        quiz[8][4] = "D. Sunday";
        quiz[8][5] = "2"; // Index of the Correct Answer
        
        // Question
        quiz[9][0] = "<html><p align=\"center\">The day before yesterday was Saturday. What day will it be the day after tomorrow?</p></html>"; 
        
        // Choices
        quiz[9][1] = "A. Tuesday";
        quiz[9][2] = "B. Wednesday";
        quiz[9][3] = "C. Thursday";
        quiz[9][4] = "D. Friday";
        quiz[9][5] = "1"; // Index of the Correct Answer
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        mmLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        tokenLabel = new javax.swing.JLabel();
        tokenL = new javax.swing.JLabel();
        plusLabel = new javax.swing.JLabel();
        scoreL = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CW = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        qBG = new javax.swing.JLabel();
        a1 = new javax.swing.JLabel();
        a2 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        b1 = new javax.swing.JLabel();
        b2 = new javax.swing.JLabel();
        b = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        c = new javax.swing.JLabel();
        d1 = new javax.swing.JLabel();
        d2 = new javax.swing.JLabel();
        d = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gachapon");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mmLabel.setBackground(new java.awt.Color(255, 255, 255));
        mmLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        mmLabel.setForeground(new java.awt.Color(255, 255, 255));
        mmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mmLabel.setText("MAIN MENU");
        mmLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        mmLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mmLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mmLabelMouseClicked(evt);
            }
        });
        jPanel4.add(mmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, 50));

        selectLabel.setBackground(new java.awt.Color(255, 255, 255));
        selectLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        selectLabel.setForeground(new java.awt.Color(255, 255, 255));
        selectLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        selectLabel.setText("SELECT TOPIC");
        selectLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        selectLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        selectLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectLabelMouseClicked(evt);
            }
        });
        jPanel4.add(selectLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 170, 50));

        tokenLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        tokenLabel.setForeground(new java.awt.Color(255, 255, 255));
        tokenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tokenLabel.setText("0");
        tokenLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(tokenLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 50, 90));

        tokenL.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        tokenL.setForeground(new java.awt.Color(255, 255, 255));
        tokenL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tokenL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/tokenIcon.png"))); // NOI18N
        tokenL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(tokenL, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 80, -1));

        plusLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        plusLabel.setForeground(new java.awt.Color(255, 255, 255));
        plusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        plusLabel.setText("+");
        plusLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(plusLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 50, 90));

        scoreL.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        scoreL.setForeground(new java.awt.Color(255, 255, 255));
        scoreL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreL.setText("SCORE");
        scoreL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(scoreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 80, -1));

        scoreLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setText("0");
        scoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 170, 50));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 400, 200));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CW.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        CW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CW.setToolTipText("");
        CW.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CW.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(CW, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 590, 20));

        questionLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 14)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setToolTipText("");
        questionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        questionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 590, 130));

        qBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Question.png"))); // NOI18N
        jPanel1.add(qBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 230));

        a1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/correct.png"))); // NOI18N
        a1.setToolTipText("");
        a1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        a1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a1MouseClicked(evt);
            }
        });
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 330, 80));

        a2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        a2.setForeground(new java.awt.Color(255, 255, 255));
        a2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/wrong.png"))); // NOI18N
        a2.setToolTipText("");
        a2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        a2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                a2MouseClicked(evt);
            }
        });
        jPanel1.add(a2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 330, 80));

        a.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/a.png"))); // NOI18N
        a.setToolTipText("");
        a.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        a.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aMouseClicked(evt);
            }
        });
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 330, 80));

        b1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/correct.png"))); // NOI18N
        b1.setToolTipText("");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b1MouseClicked(evt);
            }
        });
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 330, 80));

        b2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/wrong.png"))); // NOI18N
        b2.setToolTipText("");
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b2MouseClicked(evt);
            }
        });
        jPanel1.add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 330, 80));

        b.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        b.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/b.png"))); // NOI18N
        b.setToolTipText("");
        b.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        b.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bMouseClicked(evt);
            }
        });
        jPanel1.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 330, 80));

        c1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/correct.png"))); // NOI18N
        c1.setToolTipText("");
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c1MouseClicked(evt);
            }
        });
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 330, 80));

        c2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        c2.setForeground(new java.awt.Color(255, 255, 255));
        c2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/wrong.png"))); // NOI18N
        c2.setToolTipText("");
        c2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                c2MouseClicked(evt);
            }
        });
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 330, 80));

        c.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/c.png"))); // NOI18N
        c.setToolTipText("");
        c.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        c.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cMouseClicked(evt);
            }
        });
        jPanel1.add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, 330, 80));

        d1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        d1.setForeground(new java.awt.Color(255, 255, 255));
        d1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/correct.png"))); // NOI18N
        d1.setToolTipText("");
        d1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        d1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d1MouseClicked(evt);
            }
        });
        jPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 330, 80));

        d2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        d2.setForeground(new java.awt.Color(255, 255, 255));
        d2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/wrong.png"))); // NOI18N
        d2.setToolTipText("");
        d2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        d2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                d2MouseClicked(evt);
            }
        });
        jPanel1.add(d2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 330, 80));

        d.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        d.setForeground(new java.awt.Color(255, 255, 255));
        d.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        d.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/d.png"))); // NOI18N
        d.setToolTipText("");
        d.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        d.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dMouseClicked(evt);
            }
        });
        jPanel1.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, 330, 80));

        back.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Back button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/BG.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       this.dispose();
       new logicDifficulty().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void aMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aMouseClicked
       if(quiz[question][5]=="1"){
           a1.show();
           b2.show();
           c2.show();
           d2.show();
           a.hide();
           b.hide();
           c.hide();
           d.hide();
           score++;
       }else{
           if(quiz[question][5]=="2"){
                a2.show();
                b1.show();
                c2.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="3"){
                a2.show();
                b2.show();
                c1.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="4"){
                a2.show();
                b2.show();
                c2.show();
                d1.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
           
       }
       
       Timer sleep = new Timer(2000, e -> {
           a1.hide();
           a2.hide();
           b1.hide();
           b2.hide();
           c1.hide();
           c2.hide();
           d1.hide();
           d2.hide();
           
           a.show();
           b.show();
           c.show();
           d.show();
           
           question = randomizer.nextInt(n);
           update();
           round += 1;
           
           if(round == n){
                back.hide();
                jPanel1.hide();
                qBG.hide();
                CW.hide();
                questionLabel.hide();
                a.hide();
                b.hide();
                c.hide();
                d.hide();

                jPanel3.show();
                jPanel4.show();
                scoreL.show();
                scoreLabel.show();
                selectLabel.show();
                mmLabel.show();
                
                //Home.hScore += score;
                //Home.tokenEarn += (score*3);
                
                scoreLabel.setText(""+score);
                round = 0;
            }
       });
       
       sleep.setRepeats(false);
       sleep.start();
    }//GEN-LAST:event_aMouseClicked

    private void mmLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmLabelMouseClicked
       this.dispose();
       new Home().setVisible(true);
    }//GEN-LAST:event_mmLabelMouseClicked

    private void selectLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLabelMouseClicked
       this.dispose();
       new Topic().setVisible(true);
    }//GEN-LAST:event_selectLabelMouseClicked

    private void bMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMouseClicked
       if(quiz[question][5]=="2"){
           a2.show();
           b1.show();
           c2.show();
           d2.show();
           a.hide();
           b.hide();
           c.hide();
           d.hide();
           score++;
       }else{
           if(quiz[question][5]=="1"){
                a1.show();
                b2.show();
                c2.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="3"){
                a2.show();
                b2.show();
                c1.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="4"){
                a2.show();
                b2.show();
                c2.show();
                d1.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
       }
       
       Timer sleep = new Timer(2000, e -> {
           a1.hide();
           a2.hide();
           b1.hide();
           b2.hide();
           c1.hide();
           c2.hide();
           d1.hide();
           d2.hide();
           
           a.show();
           b.show();
           c.show();
           d.show();
           
           question = randomizer.nextInt(n);
           update();
           round += 1;
           
           if(round == n){
                back.hide();
                jPanel1.hide();
                qBG.hide();
                CW.hide();
                questionLabel.hide();
                a.hide();
                b.hide();
                c.hide();
                d.hide();

                jPanel3.show();
                jPanel4.show();
                scoreL.show();
                scoreLabel.show();
                selectLabel.show();
                mmLabel.show();
                
                //Home.hScore += score;
                //Home.tokenEarn += (score*3);
                
                scoreLabel.setText(""+score);
                round = 0;
            }
       });
       
       sleep.setRepeats(false);
       sleep.start();
    }//GEN-LAST:event_bMouseClicked

    private void cMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cMouseClicked
       if(quiz[question][5]=="3"){
           a2.show();
           b2.show();
           c1.show();
           d2.show();
           a.hide();
           b.hide();
           c.hide();
           d.hide();
           score++;
       }else{
           if(quiz[question][5]=="1"){
                a1.show();
                b2.show();
                c2.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="2"){
                a2.show();
                b1.show();
                c2.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="4"){
                a2.show();
                b2.show();
                c2.show();
                d1.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
       }
       
       Timer sleep = new Timer(2000, e -> {
           a1.hide();
           a2.hide();
           b1.hide();
           b2.hide();
           c1.hide();
           c2.hide();
           d1.hide();
           d2.hide();
           
           a.show();
           b.show();
           c.show();
           d.show();
           
           question = randomizer.nextInt(n);
           update();
           round += 1;
           
           if(round == n){
                back.hide();
                jPanel1.hide();
                qBG.hide();
                CW.hide();
                questionLabel.hide();
                a.hide();
                b.hide();
                c.hide();
                d.hide();

                jPanel3.show();
                jPanel4.show();
                scoreL.show();
                scoreLabel.show();
                selectLabel.show();
                mmLabel.show();
                
                //Home.hScore += score;
                //Home.tokenEarn += (score*3);
                
                scoreLabel.setText(""+score);
                round = 0;
            }
       });
       
       sleep.setRepeats(false);
       sleep.start();
    }//GEN-LAST:event_cMouseClicked

    private void dMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseClicked
       if(quiz[question][5]=="4"){
           a2.show();
           b2.show();
           c2.show();
           d1.show();
           a.hide();
           b.hide();
           c.hide();
           d.hide();
           score++;
       }else{
           if(quiz[question][5]=="1"){
                a1.show();
                b2.show();
                c2.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="2"){
                a2.show();
                b1.show();
                c2.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
            if(quiz[question][5]=="3"){
                a2.show();
                b2.show();
                c1.show();
                d2.show();
                a.hide();
                b.hide();
                c.hide();
                d.hide();
            }
       }
       
       Timer sleep = new Timer(2000, e -> {
           a1.hide();
           a2.hide();
           b1.hide();
           b2.hide();
           c1.hide();
           c2.hide();
           d1.hide();
           d2.hide();
           
           a.show();
           b.show();
           c.show();
           d.show();
           
           question = randomizer.nextInt(n);
           update();
           round += 1;
           
           if(round == n){
                back.hide();
                jPanel1.hide();
                qBG.hide();
                CW.hide();
                questionLabel.hide();
                a.hide();
                b.hide();
                c.hide();
                d.hide();

                jPanel3.show();
                jPanel4.show();
                scoreL.show();
                scoreLabel.show();
                selectLabel.show();
                mmLabel.show();
                
                //Home.hScore += score;
                //Home.tokenEarn += (score*3);
                
                scoreLabel.setText(""+score);
                round = 0;
            }
       });
       
       sleep.setRepeats(false);
       sleep.start();
    }//GEN-LAST:event_dMouseClicked

    private void a1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_a1MouseClicked

    private void b1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b1MouseClicked

    private void c1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c1MouseClicked

    private void d1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d1MouseClicked

    private void a2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_a2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_a2MouseClicked

    private void b2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_b2MouseClicked

    private void c2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_c2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_c2MouseClicked

    private void d2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_d2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_d2MouseClicked

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
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gacha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and dcurrencythe form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gacha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CW;
    private javax.swing.JLabel a;
    private javax.swing.JLabel a1;
    private javax.swing.JLabel a2;
    private javax.swing.JLabel b;
    private javax.swing.JLabel b1;
    private javax.swing.JLabel b2;
    private javax.swing.JLabel back;
    private javax.swing.JLabel c;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel d;
    private javax.swing.JLabel d1;
    private javax.swing.JLabel d2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mmLabel;
    private javax.swing.JLabel plusLabel;
    private javax.swing.JLabel qBG;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel scoreL;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel selectLabel;
    private javax.swing.JLabel tokenL;
    private javax.swing.JLabel tokenLabel;
    // End of variables declaration//GEN-END:variables
}
