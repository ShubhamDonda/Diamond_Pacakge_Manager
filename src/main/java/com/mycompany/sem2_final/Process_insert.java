/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sem2_final;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Admin
 */
public class Process_insert extends javax.swing.JFrame {

    /**
     * Creates new form Process_insert
     */
    Connection con=null;
    PreparedStatement pst = null;
    
    public Process_insert() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lbl_processcodeprocessinsrt = new javax.swing.JLabel();
        lbl_processnameprocessinsrt = new javax.swing.JLabel();
        txt_processcodeprocessinsrt = new javax.swing.JTextField();
        txt_processnameprocessinsrt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_processinsrt = new javax.swing.JTable();
        btn_insrtprocessinsrt = new javax.swing.JButton();
        btn_process = new javax.swing.JButton();
        btn_ruf = new javax.swing.JButton();
        btn_emp = new javax.swing.JButton();
        btn_ruf1 = new javax.swing.JButton();
        btn_ruf3 = new javax.swing.JButton();
        btn_ruf4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DIAMOND MANAGEMENT SYSTEM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Process Insert");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel2)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        lbl_processcodeprocessinsrt.setText("Process Code:");
        lbl_processcodeprocessinsrt.setName("lbl_processcode"); // NOI18N

        lbl_processnameprocessinsrt.setText("Process  Name:");
        lbl_processnameprocessinsrt.setName("lbl_processname"); // NOI18N

        txt_processcodeprocessinsrt.setBackground(new java.awt.Color(204, 204, 255));
        txt_processcodeprocessinsrt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_processcodeprocessinsrt.setName("txt_processcode"); // NOI18N
        txt_processcodeprocessinsrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_processcodeprocessinsrtActionPerformed(evt);
            }
        });

        txt_processnameprocessinsrt.setBackground(new java.awt.Color(204, 204, 255));
        txt_processnameprocessinsrt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_processnameprocessinsrt.setName("txt_processname"); // NOI18N
        txt_processnameprocessinsrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_processnameprocessinsrtActionPerformed(evt);
            }
        });

        tbl_processinsrt.setBackground(new java.awt.Color(204, 204, 255));
        tbl_processinsrt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbl_processinsrt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "process code", "process name"
            }
        ));
        jScrollPane1.setViewportView(tbl_processinsrt);

        btn_insrtprocessinsrt.setBackground(new java.awt.Color(204, 204, 255));
        btn_insrtprocessinsrt.setText("Insert");
        btn_insrtprocessinsrt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_insrtprocessinsrt.setName("btn_insertprocessinsert"); // NOI18N
        btn_insrtprocessinsrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insrtprocessinsrtActionPerformed(evt);
            }
        });

        btn_process.setText("Packet");
        btn_process.setName("btn_addpcktinsert"); // NOI18N
        btn_process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_processActionPerformed(evt);
            }
        });

        btn_ruf.setText("Ruf");
        btn_ruf.setName("btn_addpcktinsert"); // NOI18N
        btn_ruf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rufActionPerformed(evt);
            }
        });

        btn_emp.setText("Emp");
        btn_emp.setName("btn_addpcktinsert"); // NOI18N
        btn_emp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empActionPerformed(evt);
            }
        });

        btn_ruf1.setText("Issue");
        btn_ruf1.setName("btn_addpcktinsert"); // NOI18N
        btn_ruf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ruf1ActionPerformed(evt);
            }
        });

        btn_ruf3.setText("Receive");
        btn_ruf3.setName("btn_addpcktinsert"); // NOI18N
        btn_ruf3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ruf3ActionPerformed(evt);
            }
        });

        btn_ruf4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_ruf4.setText("Logout");
        btn_ruf4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_ruf4.setName("btn_addpcktinsert"); // NOI18N
        btn_ruf4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ruf4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_processcodeprocessinsrt)
                    .addComponent(lbl_processnameprocessinsrt))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_processcodeprocessinsrt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_processnameprocessinsrt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_insrtprocessinsrt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btn_emp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(112, 112, 112)
                        .addComponent(btn_ruf3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btn_ruf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ruf1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_ruf4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_process, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_processcodeprocessinsrt)
                            .addComponent(txt_processcodeprocessinsrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_processnameprocessinsrt)
                            .addComponent(txt_processnameprocessinsrt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_insrtprocessinsrt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ruf1)
                    .addComponent(btn_ruf)
                    .addComponent(btn_process))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ruf3)
                    .addComponent(btn_emp)
                    .addComponent(btn_ruf4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_processcodeprocessinsrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_processcodeprocessinsrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_processcodeprocessinsrtActionPerformed

    private void txt_processnameprocessinsrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_processnameprocessinsrtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_processnameprocessinsrtActionPerformed

    private void btn_insrtprocessinsrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insrtprocessinsrtActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String query ="INSERT INTO `process`(`process_code`, `process_name`) VALUES (?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diamond_packager","root","");
            pst=con.prepareStatement(query);
            pst.setString(1,txt_processcodeprocessinsrt.getText());
            pst.setString(2,txt_processnameprocessinsrt.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"PROCESS DETAILS INSERTED SUCCESSFULLY");

            Statement st = con.createStatement();
            String sql = "SELECT * FROM process";
            ResultSet rs = st.executeQuery(sql);
            int c=0;
            while(rs.next())
            {
                String process_code = String.valueOf(rs.getInt("process_code"));
                String process_name = rs.getString("process_name");

                String tbData[] = {process_code, process_name,};
                DefaultTableModel tblModel = (DefaultTableModel)tbl_processinsrt.getModel();
                tblModel.setRowCount(c++);
                tblModel.addRow(tbData);
            }
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_btn_insrtprocessinsrtActionPerformed

    private void btn_processActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_processActionPerformed
        // TODO add your handling code here:
        new Packet_insert().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_processActionPerformed

    private void btn_rufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rufActionPerformed
        // TODO add your handling code here:
        new ruf_insert().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_rufActionPerformed

    private void btn_empActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empActionPerformed
        // TODO add your handling code here:
        new emp_insert().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_empActionPerformed

    private void btn_ruf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ruf1ActionPerformed
        // TODO add your handling code here:
        new IssueInsert().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ruf1ActionPerformed

    private void btn_ruf3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ruf3ActionPerformed
        // TODO add your handling code here:
        new ReceiveInsert().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ruf3ActionPerformed

    private void btn_ruf4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ruf4ActionPerformed
        // TODO add your handling code here:
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_ruf4ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/diamond_packager","root","");
        Statement st = con.createStatement();
            String sql = "SELECT * FROM process";
            ResultSet rs = st.executeQuery(sql);
            int c=0;
            while(rs.next())
            {
                String process_code = String.valueOf(rs.getInt("process_code"));
                String process_name = rs.getString("process_name");

                String tbData[] = {process_code, process_name,};
                DefaultTableModel tblModel = (DefaultTableModel)tbl_processinsrt.getModel();
                tblModel.setRowCount(c++);
                tblModel.addRow(tbData);
            }
        }
        catch(Exception ex)
        {
         JOptionPane.showMessageDialog(null, ex);   
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Process_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Process_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Process_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Process_insert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Process_insert().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_emp;
    private javax.swing.JButton btn_insrtprocessinsrt;
    private javax.swing.JButton btn_process;
    private javax.swing.JButton btn_ruf;
    private javax.swing.JButton btn_ruf1;
    private javax.swing.JButton btn_ruf3;
    private javax.swing.JButton btn_ruf4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_processcodeprocessinsrt;
    private javax.swing.JLabel lbl_processnameprocessinsrt;
    private javax.swing.JTable tbl_processinsrt;
    private javax.swing.JTextField txt_processcodeprocessinsrt;
    private javax.swing.JTextField txt_processnameprocessinsrt;
    // End of variables declaration//GEN-END:variables
}
