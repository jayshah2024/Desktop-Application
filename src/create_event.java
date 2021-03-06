
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Date;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * create_event.java
 *
 * Created on 23 Mar, 2019, 12:45:48 PM
 */
/**
 *
 * @author Sarthak
 */
public class create_event extends javax.swing.JFrame {

    /** Creates new form create_event */
    public static String who,what;
    public static stu_fac_login lpg;
    public create_event(stu_fac_login lpg,String who,String what) {
        this.lpg=lpg;
        this.who=who;
        this.what=what;
        initComponents();
        projector.setVisible(false);
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
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        cdate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        capacity = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        projector = new javax.swing.JCheckBox();
        classt = new javax.swing.JCheckBox();
        audo = new javax.swing.JCheckBox();
        submit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        lab = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        time = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(-12783376,true));
        jPanel1.setLayout(null);

        jLabel1.setText("Event name:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 140, 70, 23);

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(220, 140, 147, 22);

        jLabel2.setText("Description:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 230, 57, 14);

        jScrollPane1.setViewportView(desc);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(220, 210, 176, 65);

        jLabel3.setText("Date(YYYY-MM-DD):");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 320, 130, 30);
        jPanel1.add(cdate);
        cdate.setBounds(220, 320, 150, 30);

        jLabel4.setText("Capacity:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 410, 60, 14);
        jPanel1.add(capacity);
        capacity.setBounds(220, 400, 70, 30);

        jLabel5.setText("Specific requirements:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(560, 200, 160, 20);

        projector.setBackground(new java.awt.Color(-12783376,true));
        projector.setText("Projector");
        projector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectorActionPerformed(evt);
            }
        });
        jPanel1.add(projector);
        projector.setBounds(580, 360, 90, 23);

        classt.setBackground(new java.awt.Color(-12783376,true));
        classt.setText("Class");
        classt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                classtActionPerformed(evt);
            }
        });
        jPanel1.add(classt);
        classt.setBounds(580, 240, 70, 23);

        audo.setBackground(new java.awt.Color(-12783376,true));
        audo.setText("Audotorium");
        audo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audoActionPerformed(evt);
            }
        });
        jPanel1.add(audo);
        audo.setBounds(580, 280, 100, 23);

        submit.setBackground(new java.awt.Color(-1,true));
        submit.setFont(new java.awt.Font("Serif", 0, 14));
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(380, 453, 90, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sarthak\\Desktop\\mp\\event.jpg")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 20, 90, 90);

        jLabel7.setFont(new java.awt.Font("Serif", 1, 36));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Create event");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(150, 30, 500, 60);

        back.setBackground(new java.awt.Color(-1,true));
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(600, 50, 60, 30);

        lab.setBackground(new java.awt.Color(-12783376,true));
        lab.setText("Lab");
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });
        jPanel1.add(lab);
        lab.setBounds(580, 320, 43, 23);

        jLabel8.setText("Time:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(500, 130, 70, 40);

        time.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "Noon", "Evening" }));
        jPanel1.add(time);
        time.setBounds(590, 140, 100, 20);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_nameActionPerformed

private void projectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectorActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_projectorActionPerformed

private void audoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audoActionPerformed
if(audo.isSelected()){classt.setSelected(false);lab.setSelected(false); projector.setVisible(false);projector.setSelected(false);
}
}//GEN-LAST:event_audoActionPerformed

private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
    
    lpg.setVisible(true);
    this.dispose();
    
}//GEN-LAST:event_backActionPerformed

private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed

    String na=name.getText(),des=desc.getText(),ca=capacity.getText(),dat=cdate.getText(),pr=" ",vc=" ",vla=" ",vau=" ";
    if(na.isEmpty() || des.isEmpty() || (!(classt.isSelected() || audo.isSelected() || lab.isSelected())) || ca.isEmpty() || dat.isEmpty())
        JOptionPane.showMessageDialog(this, "Please enter values for all fields.");
    else
    {
            try 
            {
                Date da = Date.valueOf(dat);
                if(projector.isSelected())pr="Projector";
                if(classt.isSelected())vc="Class";
                String s=time.getSelectedItem().toString();
                java.sql.Date cd=new java.sql.Date(System.currentTimeMillis());
                if(da.getTime()<cd.getTime())JOptionPane.showMessageDialog(this, "Please enter valid date.");
                else
                {
                    Class.forName("java.sql.DriverManager");
                    Connection con= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/eventmanagement","root", "");
                    String str="SELECT * from venues where vcapacity >= "+ca+" and ( vcl = '"+vc+"' and ( vaudo = '"+vau+"' and ( vlab = '"+vla+"' and vproj = '"+pr+"' ) ) ) ORDER BY vcapacity;";
                    Statement ps=(Statement) con.createStatement();
                    ResultSet rs=ps.executeQuery(str);
                    boolean b=true,t=false;
                    rs.beforeFirst();
                    while(rs.next() && b==true)
                    {
                        String vna=rs.getString("vname");
                        String quer="SELECT * FROM events where evenue = '"+vna+"' and ( date = '"+dat+"' and time = '"+s+"' ); ";
                        Statement st= (Statement)con.createStatement();
                        ResultSet rs1=st.executeQuery(quer);
                        if(rs1.next())
                        {
                            continue;
                        }
                        else
                        {
                            quer="INSERT INTO events  VALUES ('"+na+"', '"+des+"', '"+dat+"', '"+ca+"', '"+vna+"', '"+s+"', '"+who+"', '"+pr+"', '"+vc+"', '"+vau+"', '"+vla+"', 'No')";
                            st.executeUpdate(quer);
                            b=false;t=true;
                            if(t)JOptionPane.showMessageDialog(this, "Event successfully created.");
                            lpg.setVisible(true);
                            this.dispose();
                        }
                    }
                    if(!t && vc=="Class" && pr==" ")
                    {
                        str="SELECT * from venues where vcapacity >= "+ca+" and ( vcl = '"+vc+"' and ( vaudo = '"+vau+"' and ( vlab = '"+vla+"' and vproj = 'Projector' ) ) ) ORDER BY vcapacity;";
                        rs=ps.executeQuery(str);
                        rs.beforeFirst();
                        while(rs.next() && b==true)
                        {
                            String vna=rs.getString("vname");
                            String quer="SELECT * FROM events where evenue = '"+vna+"' and ( date = '"+dat+"' and time = '"+s+"' ); ";
                            Statement st= (Statement)con.createStatement();
                            ResultSet rs1=st.executeQuery(quer);
                            if(rs1.next())
                            {
                                continue;
                            }
                            else
                            {
                                quer="INSERT INTO events  VALUES ('"+na+"', '"+des+"', '"+dat+"', '"+ca+"', '"+vna+"', '"+s+"', '"+who+"', 'Projector', '"+vc+"', '"+vau+"', '"+vla+"', 'No')";
                                st.executeUpdate(quer);
                                b=false;t=true;
                                if(t)JOptionPane.showMessageDialog(this, "Event successfully created.");
                                lpg.setVisible(true);
                                this.dispose();
                            }
                        }
                    }
                    if(!t)JOptionPane.showMessageDialog(this,"No suitable class found.");
                }
            } 
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(this, " "+e);
            }
    }
    
    
}//GEN-LAST:event_submitActionPerformed

private void classtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_classtActionPerformed

    if(classt.isSelected()){audo.setSelected(false);lab.setSelected(false); projector.setVisible(true);
    } 
    if(!classt.isSelected())projector.setVisible(false);
    
}//GEN-LAST:event_classtActionPerformed

private void labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActionPerformed

    if(lab.isSelected()){audo.setSelected(false);classt.setSelected(false);projector.setVisible(false);projector.setSelected(false);
    } 
    
}//GEN-LAST:event_labActionPerformed

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
            java.util.logging.Logger.getLogger(create_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(create_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(create_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(create_event.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new create_event(lpg,who,what).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox audo;
    private javax.swing.JButton back;
    private javax.swing.JTextField capacity;
    private javax.swing.JTextField cdate;
    private javax.swing.JCheckBox classt;
    private javax.swing.JTextPane desc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox lab;
    private javax.swing.JTextField name;
    private javax.swing.JCheckBox projector;
    private javax.swing.JButton submit;
    private javax.swing.JComboBox time;
    // End of variables declaration//GEN-END:variables
}