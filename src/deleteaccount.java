
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * deleteaccount.java
 *
 * Created on 5 Apr, 2019, 1:04:34 AM
 */
/**
 *
 * @author Sarthak
 */
public class deleteaccount extends javax.swing.JFrame {

    /** Creates new form deleteaccount */
    public static admin_portal lpg;
    public deleteaccount(admin_portal lpg) {
        this. lpg=lpg;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        loginfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        chooser = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-15404816,true));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DELETE ACCOUNT");
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 50, 395, 47);

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(620, 60, 90, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14));
        jLabel2.setText("Enter Username:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(200, 180, 150, 50);

        loginfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginfieldActionPerformed(evt);
            }
        });
        jPanel1.add(loginfield);
        loginfield.setBounds(380, 190, 200, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14));
        jLabel4.setText("Select type:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(200, 270, 130, 50);

        Submit.setFont(new java.awt.Font("Dialog", 0, 14));
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);
        Submit.setBounds(310, 420, 160, 30);

        chooser.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Student", "Teacher", "Administrator" }));
        jPanel1.add(chooser);
        chooser.setBounds(380, 280, 140, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\mp\\event.jpg")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(90, 30, 90, 90);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

    lpg.setVisible(true);
    this.dispose();
    
}//GEN-LAST:event_backActionPerformed

private void loginfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginfieldActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_loginfieldActionPerformed

private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed

    String id=loginfield.getText();
    String type= chooser.getSelectedItem().toString();
    if(id.isEmpty())
        JOptionPane.showMessageDialog(this,"Please enter username and password.");
    
    else
    {
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagement","root", "");
            Statement st = (Statement) con.createStatement();
            String query="DELETE FROM users WHERE loginid='"+id+"'and usert='"+type+"';";
            st.executeUpdate(query);
            JOptionPane.showMessageDialog(this,"Deleted account successfully.");
            loginfield.setText("");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"There was an error connecting to database.");
        }
    }
}//GEN-LAST:event_SubmitActionPerformed

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
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deleteaccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new deleteaccount(lpg).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Submit;
    private javax.swing.JButton back;
    private javax.swing.JComboBox chooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField loginfield;
    // End of variables declaration//GEN-END:variables
}
