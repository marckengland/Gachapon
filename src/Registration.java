
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Marck England
 */
public class Registration extends javax.swing.JFrame {

    /*File file = new File("C:\\");
    int ln;
    String Username,Password,Email;
    int uid = 100000000;*/
    
    public Registration() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public void registerUser() {
		DBConnection connectNow = new DBConnection();
		Connection connectDB = connectNow.getConnection();
		
		String username = user.getText();
                String password = pass.getText();
		String emailadd = email.getText();
		
		// === Check if any field is blank ===
		if (!username.equals("") && !emailadd.equals("") && !password.equals("")) {
                    
			if (password.length() > 6) {
					
					// === Check if user name or email is existing ===
					String verifyLogin = "SELECT * FROM gachaponacc WHERE user = '" + username + "' OR email = '" + emailadd + "'";
	
					try {
						Statement statement = connectDB.createStatement();
						ResultSet queryResult = statement.executeQuery(verifyLogin);
						
						if (queryResult.next()) {
                                                        JOptionPane.showMessageDialog(null,"Username or email is already been used!");
							System.out.println("Username or email is already been used!");
						} else {
							String insertFields = "INSERT INTO gachaponacc(user, pass, email, atscore, tokens) VALUES ('";
							String insertValues = username + "','" + password + "','"+ emailadd + "','" + 0 + "','" + 10000 +"')";
							String insertToRegister = insertFields + insertValues;
							
							try {
								Statement state = connectDB.createStatement();
								state.executeUpdate(insertToRegister);	
							} catch (Exception e) {
								e.printStackTrace();
								e.getCause();
							}
							
							JOptionPane.showMessageDialog(null,"User has been registered!");
						}
						
					} catch (Exception e) {
						e.printStackTrace();
						e.getCause();
						System.out.println("Exception!");
					}
				
			} else 
                                JOptionPane.showMessageDialog(null,"Password is too short");
			
		} else 
                        JOptionPane.showMessageDialog(null,"Any field cannot be blank!");
		
	}
    
    /*void createFolder(){
        if(!file.exists()){
            file.mkdirs();
        }
    }
    
    void readFile(){
        try {
            FileReader fileRead = new FileReader(file+"\\logins.txt");
            System.out.println("file exists!");
        } catch (FileNotFoundException ex) {
            try {
                FileWriter fireWrite = new FileWriter(file+"\\logins.txt");
                System.out.println("File created");
            } catch (IOException ex1) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
    }
    
    void addData(String usr,String pswd,String mail){
        
        try {
            RandomAccessFile accessFile = new RandomAccessFile(file+"\\logins.txt", "rw");
            for(int i=0;i<ln;i++){
                accessFile.readLine();
            }
            //if condition added after video to have no lines on first entry
            if(ln>0){
            accessFile.writeBytes("\r\n");
            accessFile.writeBytes("\r\n");
            }
            accessFile.writeBytes("Username:"+usr+ "\r\n");
            accessFile.writeBytes("Password:"+pswd+ "\r\n");
            accessFile.writeBytes("Email:"+mail);
            //uid ++;
            //accessFile.writeBytes("UID:"+uid);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    void checkData(String usr,String pswd){
    
        try {
            RandomAccessFile accessFile = new RandomAccessFile(file+"\\logins.txt", "rw");
            for(int i=0;i<ln;i+=4){
                System.out.println("count "+i);
            
            
            Username=accessFile.readLine().substring(9);
            Password=accessFile.readLine().substring(9);
            
            if(usr.equals(Username) & pswd.equals(Password)){
                JOptionPane.showMessageDialog(null, "Username already exists!");
            }else{
                addData(user.getText(),pass.getText(),email.getText());
                JOptionPane.showMessageDialog(null, "User Registered!");
                user.setText("");
                pass.setText("");
                email.setText("");
            }
            for(int k=1;k<=2;k++){
                    accessFile.readLine();
            }
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
    
    void countLines(){
        try {
            ln=0;
            RandomAccessFile accessFile = new RandomAccessFile(file+"\\logins.txt", "rw");
            for(int i=0;accessFile.readLine()!=null;i++){
                ln++;
            }
            System.out.println("number of lines:"+ln);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        email = new javax.swing.JTextField();
        register = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginhere = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gachapon");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user.setToolTipText("");
        user.setName("user"); // NOI18N
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, -1));

        pass.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 160, -1));

        email.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        email.setName("pass"); // NOI18N
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 160, -1));

        register.setBackground(new java.awt.Color(153, 204, 255));
        register.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        register.setText("Sign Up");
        register.setOpaque(true);
        register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerMouseClicked(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 160, 30));

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Password:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username:");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        loginhere.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        loginhere.setForeground(new java.awt.Color(0, 102, 204));
        loginhere.setText("Already have an account?");
        loginhere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginhereMouseClicked(evt);
            }
        });
        jPanel1.add(loginhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email Address:");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 400, 260));

        jLabel3.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account Sign Up");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked
        /*createFolder(); 
        readFile();
        countLines();
        //checkData(user.getText(),pass.getText());
        addData(user.getText(),pass.getText(),email.getText());
        try{
            String sql = "INSERT INTO gachaponacc"
            +"(user, pass, email,atscore,tokens)"
            +"VALUES (?,?,?,0,10000)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/gachapondb","root","");
            pst = con.prepareStatement(sql);
            pst.setString(1,user.getText());
            pst.setString(2,pass.getText());
            pst.setString(3,email.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"User Registered!");
        }
        catch(SQLException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, ex);
        }*/
        //JOptionPane.showMessageDialog(null,"User Registered!");
        registerUser();
        user.setText("");
        pass.setText("");
        email.setText("");
    }//GEN-LAST:event_registerMouseClicked

    private void loginhereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginhereMouseClicked
        this.dispose();
        new Main().setVisible(true);
    }//GEN-LAST:event_loginhereMouseClicked

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loginhere;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel register;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
