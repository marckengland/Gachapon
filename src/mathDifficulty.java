
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marck England
 */
public class mathDifficulty extends javax.swing.JFrame {

    /**
     * Creates new form Gacha
     */
    public mathDifficulty() {
        initComponents();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        chooseDifficulty = new javax.swing.JLabel();
        easy = new javax.swing.JLabel();
        hard = new javax.swing.JLabel();
        intermediate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Select Difficulty");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 640));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Quiz/Back button.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 50));

        chooseDifficulty.setBackground(new java.awt.Color(0, 0, 0));
        chooseDifficulty.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        chooseDifficulty.setForeground(new java.awt.Color(255, 255, 255));
        chooseDifficulty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseDifficulty.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Difficulty/difficulty.png"))); // NOI18N
        chooseDifficulty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chooseDifficultyMouseClicked(evt);
            }
        });
        jPanel1.add(chooseDifficulty, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 690, 140));

        easy.setBackground(new java.awt.Color(0, 0, 0));
        easy.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        easy.setForeground(new java.awt.Color(255, 255, 255));
        easy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        easy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Difficulty/EASY.png"))); // NOI18N
        easy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                easyMouseClicked(evt);
            }
        });
        jPanel1.add(easy, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 620, 140));

        hard.setBackground(new java.awt.Color(0, 0, 0));
        hard.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        hard.setForeground(new java.awt.Color(255, 255, 255));
        hard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Difficulty/HARD.png"))); // NOI18N
        hard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hardMouseClicked(evt);
            }
        });
        jPanel1.add(hard, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 620, 130));

        intermediate.setBackground(new java.awt.Color(0, 0, 0));
        intermediate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        intermediate.setForeground(new java.awt.Color(255, 255, 255));
        intermediate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        intermediate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Difficulty/INTERMEDIATE.png"))); // NOI18N
        intermediate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                intermediateMouseClicked(evt);
            }
        });
        jPanel1.add(intermediate, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, 130));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMGs/Difficulty/BG.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void easyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_easyMouseClicked
       this.dispose();
       new mathEasy().setVisible(true);
    }//GEN-LAST:event_easyMouseClicked

    private void intermediateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_intermediateMouseClicked
       this.dispose();
       new mathIntermediate().setVisible(true);
    }//GEN-LAST:event_intermediateMouseClicked

    private void hardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hardMouseClicked
       this.dispose();
       new mathHard().setVisible(true);
    }//GEN-LAST:event_hardMouseClicked

    private void chooseDifficultyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chooseDifficultyMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chooseDifficultyMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        new Topic().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

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
    private javax.swing.JLabel back;
    private javax.swing.JLabel chooseDifficulty;
    private javax.swing.JLabel easy;
    private javax.swing.JLabel hard;
    private javax.swing.JLabel intermediate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
