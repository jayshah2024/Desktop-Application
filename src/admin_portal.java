/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * admin_portal.java
 *
 * Created on 23 Mar, 2019, 10:49:16 PM
 */
/**
 *
 * @author Sarthak
 */
public class admin_portal extends javax.swing.JFrame {

    /** Creates new form admin_portal */
    public static Login lpg;
    public static String who,what;
    public admin_portal(Login lpg,String who,String what) {
        this.lpg=lpg;
        this.who=who;
        this.what=what;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        add_accounts = new javax.swing.JButton();
        add_venue = new javax.swing.JButton();
        delete_accounts = new javax.swing.JButton();
        manage_events = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-13434881,true));
        jPanel1.setLayout(null);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Serif", 0, 36));
        jTextPane1.setText(" Welcome  to   administrator   portal");
        jTextPane1.setAlignmentX(1000.0F);
        jTextPane1.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 200, 220, 304);

        add_accounts.setBackground(new java.awt.Color(-1,true));
        add_accounts.setFont(new java.awt.Font("Serif", 1, 14));
        add_accounts.setText("Add Accounts");
        add_accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_accountsActionPerformed(evt);
            }
        });
        jPanel1.add(add_accounts);
        add_accounts.setBounds(350, 200, 160, 130);

        add_venue.setBackground(new java.awt.Color(-1,true));
        add_venue.setFont(new java.awt.Font("Serif", 1, 14));
        add_venue.setText("Add Venue");
        add_venue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_venueActionPerformed(evt);
            }
        });
        jPanel1.add(add_venue);
        add_venue.setBounds(350, 380, 160, 130);

        delete_accounts.setBackground(new java.awt.Color(-1,true));
        delete_accounts.setFont(new java.awt.Font("Serif", 1, 14));
        delete_accounts.setText("Delete Accounts");
        delete_accounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_accountsActionPerformed(evt);
            }
        });
        jPanel1.add(delete_accounts);
        delete_accounts.setBounds(590, 200, 160, 130);

        manage_events.setBackground(new java.awt.Color(-1,true));
        manage_events.setFont(new java.awt.Font("Serif", 1, 14));
        manage_events.setText("Manage Events ");
        manage_events.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manage_eventsActionPerformed(evt);
            }
        });
        jPanel1.add(manage_events);
        manage_events.setBounds(590, 380, 160, 130);

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGEMENT PORTAL");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 50, 319, 65);

        logout.setBackground(new java.awt.Color(-1,true));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(630, 60, 115, 39);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\mp\\event.jpg")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 20, 124, 118);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void add_accountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_accountsActionPerformed

    addaccount pg= new addaccount(this);
    this.setVisible(false);
    pg.setVisible(true);
    
}//GEN-LAST:event_add_accountsActionPerformed

private void add_venueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_venueActionPerformed

    add_venue pg=new add_venue(this);
    pg.setVisible(true);
    this.setVisible(false);
    
}//GEN-LAST:event_add_venueActionPerformed

private void delete_accountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_accountsActionPerformed

    deleteaccount pg= new deleteaccount(this);
    this.setVisible(false);
    pg.setVisible(true);
    
}//GEN-LAST:event_delete_accountsActionPerformed

private void manage_eventsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manage_eventsActionPerformed

    manage_events pg=new manage_events(this);
    pg.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_manage_eventsActionPerformed

private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed

    lpg.setVisible(true);
    this.dispose();
    
}//GEN-LAST:event_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(admin_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_portal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new admin_portal(lpg,who,what).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_accounts;
    private javax.swing.JButton add_venue;
    private javax.swing.JButton delete_accounts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton manage_events;
    // End of variables declaration//GEN-END:variables
}
