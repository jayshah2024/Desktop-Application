/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * stu_fac_login.java
 *
 * Created on 22 Mar, 2019, 10:53:38 PM
 */
/**
 *
 * @author Sarthak
 */
public class stu_fac_login extends javax.swing.JFrame {

    /** Creates new form stu_fac_login */
    public static Login lpg;
    public static String who,what;
    public stu_fac_login(Login lpg,String who,String what) {
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
        cancelevent = new javax.swing.JButton();
        viewupcoming = new javax.swing.JButton();
        createevent = new javax.swing.JButton();
        viewpast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-15404816,true));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(-16777216,true), 4));
        jPanel1.setLayout(null);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Serif", 0, 36));
        jTextPane1.setText(" Welcome        to event   portal");
        jTextPane1.setAlignmentX(1000.0F);
        jTextPane1.setAlignmentY(2.0F);
        jScrollPane1.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 170, 220, 280);

        cancelevent.setBackground(new java.awt.Color(-1,true));
        cancelevent.setFont(new java.awt.Font("Serif", 1, 14));
        cancelevent.setText("Cancel Event");
        cancelevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canceleventActionPerformed(evt);
            }
        });
        jPanel1.add(cancelevent);
        cancelevent.setBounds(580, 320, 160, 130);

        viewupcoming.setBackground(new java.awt.Color(-1,true));
        viewupcoming.setFont(new java.awt.Font("Serif", 1, 12));
        viewupcoming.setText("View upcoming events");
        viewupcoming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewupcomingActionPerformed(evt);
            }
        });
        jPanel1.add(viewupcoming);
        viewupcoming.setBounds(320, 320, 160, 130);

        createevent.setBackground(new java.awt.Color(-1,true));
        createevent.setFont(new java.awt.Font("Serif", 1, 14));
        createevent.setText("Create Event");
        createevent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createeventActionPerformed(evt);
            }
        });
        jPanel1.add(createevent);
        createevent.setBounds(320, 170, 160, 130);

        viewpast.setBackground(new java.awt.Color(-1,true));
        viewpast.setFont(new java.awt.Font("Serif", 1, 14));
        viewpast.setText("View past events");
        viewpast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpastActionPerformed(evt);
            }
        });
        jPanel1.add(viewpast);
        viewpast.setBounds(580, 170, 160, 130);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\mp\\event.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 20, 100, 90);

        jLabel2.setBackground(new java.awt.Color(-9319960,true));
        jLabel2.setFont(new java.awt.Font("Serif", 1, 24));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EVENT PORTAL");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 30, 490, 70);

        logout.setBackground(new java.awt.Color(-1,true));
        logout.setFont(new java.awt.Font("Serif", 1, 14));
        logout.setText("LOGOUT");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout);
        logout.setBounds(640, 40, 100, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 526, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void createeventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createeventActionPerformed
create_event pg=new create_event(this,who,what);
this.setVisible(false);
pg.setVisible(true);
}//GEN-LAST:event_createeventActionPerformed

private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
    
    lpg.setVisible(true);
    this.dispose();
    
}//GEN-LAST:event_logoutActionPerformed

private void viewupcomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewupcomingActionPerformed
    stu_viewevents pg=new stu_viewevents(this,1);
    pg.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_viewupcomingActionPerformed

private void viewpastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpastActionPerformed
    stu_viewevents pg=new stu_viewevents(this,2);
    pg.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_viewpastActionPerformed

private void canceleventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canceleventActionPerformed

    cancel_event pg= new cancel_event(this,who,what);
    pg.setVisible(true);
    this.setVisible(false);
    
}//GEN-LAST:event_canceleventActionPerformed

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
            java.util.logging.Logger.getLogger(stu_fac_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stu_fac_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stu_fac_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stu_fac_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new stu_fac_login(lpg,who,what).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelevent;
    private javax.swing.JButton createevent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton logout;
    private javax.swing.JButton viewpast;
    private javax.swing.JButton viewupcoming;
    // End of variables declaration//GEN-END:variables
}
