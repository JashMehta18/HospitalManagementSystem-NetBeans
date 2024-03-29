


import hmsDirectories.DoctorDirectory;
import hmsClass.Doctor;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DoctorLoginScreen extends javax.swing.JFrame {
    public static String deEmail="";
    public static int deID;
    /**
     * Creates new form DoctorLoginScreen
     */
    public DoctorLoginScreen() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }
    public void clearAllFields(){
        
        docEmail.setText("");
        docPass.setText("");
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

        DoctorLogin = new javax.swing.JPanel();
        email = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        docEmail = new javax.swing.JTextField();
        docPass = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        back = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DoctorLogin.setLayout(new java.awt.GridBagLayout());

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setText("Doctor Email ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 142, 0, 0);
        DoctorLogin.add(email, gridBagConstraints);

        password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        password.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 175, 0, 0);
        DoctorLogin.add(password, gridBagConstraints);

        docEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docEmailActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 11, 0, 0);
        DoctorLogin.add(docEmail, gridBagConstraints);

        docPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docPassActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 124;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 11, 0, 0);
        DoctorLogin.add(docPass, gridBagConstraints);

        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 55, 0);
        DoctorLogin.add(login, gridBagConstraints);

        back.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        back.setText("<Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 175, 55, 0);
        DoctorLogin.add(back, gridBagConstraints);

        clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 55, 0);
        DoctorLogin.add(clear, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome To Doctor Login Page!!!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 410;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 0, 0, 0);
        DoctorLogin.add(jLabel1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DoctorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DoctorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        clearAllFields();
    }//GEN-LAST:event_clearActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        DoctorLoginScreen dl = new DoctorLoginScreen();
        MainLoginScreen ms = new MainLoginScreen();
        ms.setVisible(true);
        dl.setVisible(false);
        super.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String idPattern ="[0-9]+";
        String emailPattern = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        boolean loginUser = false;
        ArrayList<Doctor> doctorDirectory = DoctorDirectory.arrayReturn();

        String dpass = new String(docPass.getPassword());
        String demail = docEmail.getText();
        int docID;
        if ( docEmail.getText().isEmpty() | docPass.getPassword().length==0){
            JOptionPane.showMessageDialog(this, "Please Fill all the fields" , "Warning", JOptionPane.ERROR_MESSAGE);
        }else if(!docEmail.getText().matches(emailPattern)){
            JOptionPane.showMessageDialog(this, "Enter valid Email", "Warning", JOptionPane.ERROR_MESSAGE);
        }
        else{
            for(Doctor doctor: doctorDirectory){

                if (doctor.emailP.equals(demail) && doctor.password.equals(dpass)) {
                    loginUser = true;
                    deID=doctor.idP;
                    break;
                } else {
                    loginUser = false;
                }
            }
            if (loginUser) {
                JOptionPane.showMessageDialog(this, "Login Successfull");
                deEmail= docEmail.getText();
                DoctorLoginScreen dl = new DoctorLoginScreen();
                DoctorMainScreen dm = new DoctorMainScreen();
                dl.setVisible(false);
                dm.setVisible(true);
                super.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Please enter Correct Email / Password", "Warning",
                    JOptionPane.WARNING_MESSAGE);

            }
            clearAllFields();
        }

    }//GEN-LAST:event_loginActionPerformed

    private void docPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docPassActionPerformed

    private void docEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_docEmailActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DoctorLogin;
    private javax.swing.JButton back;
    private javax.swing.JButton clear;
    private javax.swing.JTextField docEmail;
    private javax.swing.JPasswordField docPass;
    private javax.swing.JLabel email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JLabel password;
    // End of variables declaration//GEN-END:variables
}
