
import hmsDirectories.CommunityDirectory;
import hmsClass.Community;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class CommunityLoginScreen extends javax.swing.JFrame {
    public static String admincom="";
    public static String adminName="";
    public static int adminID;
    /**
     * Creates new form CommunityLogin
     */
    public CommunityLoginScreen() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    private void clearAllFields(){
        
        communityEmail.setText("");
        communityPass.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        Community_Email = new javax.swing.JLabel();
        CommunityPassword = new javax.swing.JLabel();
        communityEmail = new javax.swing.JTextField();
        communityPass = new javax.swing.JPasswordField();
        Login = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new java.awt.GridBagLayout());

        Community_Email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Community_Email.setText("Admin Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(54, 344, 0, 0);
        jPanel1.add(Community_Email, gridBagConstraints);

        CommunityPassword.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CommunityPassword.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 352, 0, 0);
        jPanel1.add(CommunityPassword, gridBagConstraints);

        communityEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(51, 12, 0, 340);
        jPanel1.add(communityEmail, gridBagConstraints);

        communityPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                communityPassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 117;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 12, 0, 340);
        jPanel1.add(communityPass, gridBagConstraints);

        Login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 24, 190, 0);
        jPanel1.add(Login, gridBagConstraints);

        Back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Back.setText("<Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 333, 190, 0);
        jPanel1.add(Back, gridBagConstraints);

        Clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 18, 190, 0);
        jPanel1.add(Clear, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Welcome Community Admin!!!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(164, 390, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void communityPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityPassActionPerformed

    private void communityEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_communityEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_communityEmailActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
        String idPattern ="[0-9]+";
        String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean loginUser=false;

        String cpass = new String(communityPass.getPassword());
        String cemail = communityEmail.getText();
        if (communityEmail.getText().isEmpty() | communityPass.getPassword().length==0){
            JOptionPane.showMessageDialog(this, "Please Fill all the fields" , "Warning", JOptionPane.ERROR_MESSAGE);
        }else if(!communityEmail.getText().matches(emailPattern)){
            JOptionPane.showMessageDialog(this, "Enter valid Email", "Warning", JOptionPane.ERROR_MESSAGE);
        }//password validation left
        else{
            for(Community com : CommunityDirectory.arrayReturn()){
               if (com.emailP.equals(cemail) && com.password.equals(cpass)) {
                    loginUser = true;
                    admincom=com.communityP;
                    adminName = com.nameP;
                    adminID = com.idP;
                    break;
                } else {
                    loginUser = false;
                }
            }
        if(loginUser == true){
             JOptionPane.showMessageDialog(this, "Login Successfull", "Success", JOptionPane.INFORMATION_MESSAGE);
             CommunityLoginScreen cl = new CommunityLoginScreen();
             CommunityMainScreen cm = new CommunityMainScreen();
             cl.setVisible(false);
             cm.setVisible(true);
             super.dispose();
        }else{
             JOptionPane.showMessageDialog(this, "Enter Valid Email and Password", "Warning", JOptionPane.ERROR_MESSAGE);

        }
        clearAllFields();
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clearAllFields();
    }//GEN-LAST:event_ClearActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        CommunityLoginScreen cl = new CommunityLoginScreen();
        MainLoginScreen ms = new MainLoginScreen();
        ms.setVisible(true);
        cl.setVisible(false);
        super.dispose();
    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel CommunityPassword;
    private javax.swing.JLabel Community_Email;
    private javax.swing.JButton Login;
    private javax.swing.JTextField communityEmail;
    private javax.swing.JPasswordField communityPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}