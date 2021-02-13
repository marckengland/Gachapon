
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
public class mathIntermediate extends javax.swing.JFrame {

    Random random = new Random();
    int correct, r1 ,r2, sign, x;
    char s;
    
    int n = 10;
    int round = 0;
    int score = 0;
    
    public mathIntermediate() {
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
        
        r1 = random.nextInt(99);
        r2 = random.nextInt(99);
        sign = random.nextInt(4) % 4;
        
        if (sign==0) {
            s = 47;
            correct = r1 / r2; 
            }
            else if (sign==1) {
                s = 42;
                correct = r1 * r2; 
            }
                else if (sign==2) {
                    s = 45;
                    correct = r1 - r2; 
                }
                    else {
                        s = 43;
                        correct = r1 + r2; 
                    }
        
        CW.setText("");
        answer.setText("");
        update();
    }
    
    public void update(){
        questionLabel.setText(r1 + "" + s + "" + r2);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        mmLabel = new javax.swing.JLabel();
        scoreLabel = new javax.swing.JLabel();
        selectLabel = new javax.swing.JLabel();
        scoreL = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CW = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        qBG = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        answer = new javax.swing.JTextField();
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

        scoreLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        scoreLabel.setForeground(new java.awt.Color(255, 255, 255));
        scoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(scoreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 400, 50));

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

        scoreL.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 24)); // NOI18N
        scoreL.setForeground(new java.awt.Color(255, 255, 255));
        scoreL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scoreL.setText("SCORE");
        scoreL.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(scoreL, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 80, -1));

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

        questionLabel.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 36)); // NOI18N
        questionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        questionLabel.setToolTipText("");
        questionLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        questionLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(questionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 590, 130));

        qBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Question.png"))); // NOI18N
        jPanel1.add(qBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 230));

        back.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Back button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        answer.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 36)); // NOI18N
        answer.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        answer.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        answer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerActionPerformed(evt);
            }
        });
        jPanel1.add(answer, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 460, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/BG.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       this.dispose();
       new mathDifficulty().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void mmLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mmLabelMouseClicked
       this.dispose();
       new Home().setVisible(true);
    }//GEN-LAST:event_mmLabelMouseClicked

    private void selectLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectLabelMouseClicked
       this.dispose();
       new Topic().setVisible(true);
    }//GEN-LAST:event_selectLabelMouseClicked

    private void answerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerActionPerformed
        int ans = Integer.parseInt(answer.getText());
        
        if (ans==correct){
            CW.setText("Correct Answer!");
            score++;
        }
        else{
            System.out.println(correct);
            CW.setText("Wrong Answer!");
        }
        
        Timer sleep = new Timer(2000, e -> {
            r1 = random.nextInt(99);
            r2 = random.nextInt(99);
            sign = random.nextInt(4) % 4;

            if (sign==0) {
            s = 47;
            correct = r1 / r2; 
            }
            else if (sign==1) {
                s = 42;
                correct = r1 * r2; 
            }
                else if (sign==2) {
                    s = 45;
                    correct = r1 - r2; 
                }
                    else {
                        s = 43;
                        correct = r1 + r2; 
                    }
            
            CW.setText("");
            answer.setText("");
            update();
            round++;
 
            
            if(round==n){
                back.hide();
                jPanel1.hide();
                qBG.hide();
                CW.hide();
                questionLabel.hide();

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
    }//GEN-LAST:event_answerActionPerformed

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
    private javax.swing.JTextField answer;
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mmLabel;
    private javax.swing.JLabel qBG;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JLabel scoreL;
    private javax.swing.JLabel scoreLabel;
    private javax.swing.JLabel selectLabel;
    // End of variables declaration//GEN-END:variables
}
