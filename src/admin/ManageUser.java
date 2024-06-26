/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;


import admin.adminDashboard;
import carinventory.loginForm;
import config.Session;

import config.dbConnector;
import admin.individualPrinting;
import java.awt.Color;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import user.createUserForm;
import static user.createUserForm.getHeightFromWidth;

/**
 *
 * @author Alfred
 */
public class ManageUser extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public ManageUser() {
        initComponents();
        displayData();
        
    }
    public  ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
    ImageIcon MyImage = null;
        if(ImagePath !=null){
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        
    int newHeight = getHeightFromWidth(ImagePath, label.getWidth());

    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(label.getWidth(), newHeight, Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;
}
       Color navcolor = new Color(102,102,102);
       Color hovercolor = new Color(0,204,0);
       
public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT u_id,u_fname,u_lname,u_email,u_type,u_status FROM tbl_user");
            usersTable  .setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
        
        }
        
    
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        acc_id = new javax.swing.JLabel();
        acc_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_edit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        print = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        acc_lname = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        mp = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        mu = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(102, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(usersTable);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 600, 430));

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BACK");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 18)); // NOI18N
        jLabel4.setText("MANAGE USER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 502, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 50));

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 210, 13));

        acc_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_id.setText("Id");
        jPanel7.add(acc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 138, -1, -1));

        acc_name.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_name.setText("Admin");
        acc_name.setToolTipText("");
        jPanel7.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 70, 10));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-admin-96.png"))); // NOI18N
        jPanel7.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        p_add.setBackground(new java.awt.Color(102, 102, 102));
        p_add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 204, 0), null, null));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ADD");
        p_add.add(jLabel2);
        jLabel2.setBounds(80, 10, 32, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-25 (1).png"))); // NOI18N
        p_add.add(jLabel8);
        jLabel8.setBounds(50, 10, 25, 30);

        jPanel7.add(p_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 190, 42));

        p_edit.setBackground(new java.awt.Color(102, 102, 102));
        p_edit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 0), null, null));
        p_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_editMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_editMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_editMouseExited(evt);
            }
        });
        p_edit.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EDIT");
        p_edit.add(jLabel6);
        jLabel6.setBounds(80, 10, 40, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-edit-25.png"))); // NOI18N
        p_edit.add(jLabel11);
        jLabel11.setBounds(50, 10, 30, 20);

        jPanel7.add(p_edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 41));

        print.setBackground(new java.awt.Color(102, 102, 102));
        print.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 0), null, null));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        print.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PRINT");
        print.add(jLabel9);
        jLabel9.setBounds(90, 10, 50, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-print-30.png"))); // NOI18N
        print.add(jLabel10);
        jLabel10.setBounds(50, 0, 30, 40);

        jPanel7.add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, 190, 40));

        acc_lname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        acc_lname.setText("Admin");
        acc_lname.setToolTipText("");
        jPanel7.add(acc_lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 70, 20));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 230, 610));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Account List");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 630, 10));

        mp.setBackground(new java.awt.Color(102, 102, 0));
        mp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 0), null, null));
        mp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mpMouseExited(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-product-30.png"))); // NOI18N
        jLabel14.setText("Manage Products ");

        javax.swing.GroupLayout mpLayout = new javax.swing.GroupLayout(mp);
        mp.setLayout(mpLayout);
        mpLayout.setHorizontalGroup(
            mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mpLayout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        mpLayout.setVerticalGroup(
            mpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mpLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.add(mp, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, 150, -1));

        mu.setBackground(new java.awt.Color(102, 102, 0));
        mu.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 0), null, null));
        mu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                muMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                muMouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-user-30.png"))); // NOI18N
        jLabel15.setText(" Manage Users");

        javax.swing.GroupLayout muLayout = new javax.swing.GroupLayout(mu);
        mu.setLayout(muLayout);
        muLayout.setHorizontalGroup(
            muLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muLayout.createSequentialGroup()
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        muLayout.setVerticalGroup(
            muLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(muLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(mu, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 150, -1));

        jPanel9.setBackground(new java.awt.Color(102, 102, 0));
        jPanel9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 204), new java.awt.Color(0, 255, 0), null, null));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-order-30.png"))); // NOI18N
        jLabel17.setText("Manage Orders");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 854, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Session sess = Session.getInstance();
        
       if(sess.getUid()== 0){
        JOptionPane.showMessageDialog(null,"No account,LOGIN FIRST!");
        loginForm lf = new loginForm();
        lf.setVisible(true);
        this.dispose();
        }else{
       
           acc_id.setText(""+sess.getUid());
           acc_name.setText(""+sess.getFname());
           acc_lname.setText(""+sess.getLname());
       }
        
    }//GEN-LAST:event_formWindowActivated

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered

       p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
       p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
       createUserForm crf = new createUserForm();
       crf.setVisible(true);
        crf.remove.setEnabled(false);
      crf.select.setEnabled(true);
       this.dispose();
       
     
      
    }//GEN-LAST:event_p_addMouseClicked

    private void p_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseExited
         p_edit.setBackground(navcolor);
    }//GEN-LAST:event_p_editMouseExited

    private void p_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseEntered
          p_edit.setBackground(hovercolor);
    }//GEN-LAST:event_p_editMouseEntered

    private void p_editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_editMouseClicked
          int rowIndex = usersTable.getSelectedRow();  
             
       if(rowIndex < 0){
       JOptionPane.showMessageDialog(null,"Please Select an Item ");
       }else{
       try{ 
       dbConnector dbc = new dbConnector();
       TableModel tbl = usersTable.getModel();
       ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
        if(rs.next()){
          createUserForm crf = new createUserForm();
          crf.uid.setText(""+rs.getInt("u_id"));
          crf.fn.setText(""+rs.getString("u_fname"));
          crf.ln.setText(""+rs.getString("u_lname"));
          crf.em.setText(""+rs.getString("u_email"));
          crf.un.setText(""+rs.getString("u_username"));
          crf.ps.setText(""+rs.getString("u_password"));
          crf.ut.setSelectedItem(""+rs.getString("u_type"));
          crf.us.setSelectedItem(""+rs.getString("u_status"));
          crf.image.setIcon(crf.ResizeImage(rs.getString("u_image"),null,crf.image));
          crf.oldpath = rs.getString("u_image");
          crf.path = rs.getString("u_image");
          crf.destination = rs.getString("u_image");
          crf.add.setEnabled(false);
          crf.update.setEnabled(true);
          crf.setVisible(true);
          if(rs.getString("u_image").isEmpty()){
              crf.select.setEnabled(true);
              crf.remove.setEnabled(false);
          }else{
              crf.select.setEnabled(false);
              crf.remove.setEnabled(true);
          }
          
          this.dispose();
          }
       }catch(SQLException ex){
       System.out.println(""+ex);
                   
          
    }      
       }
       
    }//GEN-LAST:event_p_editMouseClicked

    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
         int rowIndex = usersTable.getSelectedRow();  
             
       if(rowIndex < 0){
       JOptionPane.showMessageDialog(null,"Please Select an Item ");
       }else{
       try{ 
       dbConnector dbc = new dbConnector();
       TableModel tbl = usersTable.getModel();
       ResultSet rs = dbc.getData("SELECT * FROM tbl_user WHERE u_id = '"+tbl.getValueAt(rowIndex, 0)+"'");
        if(rs.next()){
          individualPrinting ipt = new individualPrinting();
          ipt.uid.setText(""+rs.getInt("u_id"));
          ipt.fn.setText(""+rs.getString("u_fname"));
          ipt.ln.setText(""+rs.getString("u_lname"));
          ipt.em.setText(""+rs.getString("u_email"));
          ipt.un.setText(""+rs.getString("u_username"));
          ipt.ut.setText(""+rs.getString("u_type"));
          ipt.us.setText(""+rs.getString("u_status"));
          ipt.image.setIcon(ipt.ResizeImage(rs.getString("u_image"),null,ipt.image));
          ipt.setVisible(true);
          this.dispose();
          }
       }catch(SQLException ex){
       System.out.println(""+ex);
                   
          
    }      
       }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print.setBackground(hovercolor);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print.setBackground(navcolor);
    }//GEN-LAST:event_printMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
          adminDashboard adm = new adminDashboard();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void mpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mpMouseClicked
        ManageProducts mp = new ManageProducts();
        mp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mpMouseClicked

    private void mpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mpMouseEntered
        mp.setBackground(hovercolor);
    }//GEN-LAST:event_mpMouseEntered

    private void mpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mpMouseExited
        Color navcolor = new Color(102,102,0);
        mp.setBackground(navcolor);
    }//GEN-LAST:event_mpMouseExited

    private void muMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muMouseClicked
        ManageUser usf = new ManageUser();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_muMouseClicked

    private void muMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muMouseEntered
        mu.setBackground(hovercolor);
    }//GEN-LAST:event_muMouseEntered

    private void muMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muMouseExited
        Color navcolor = new Color(102,102,0);
        mu.setBackground(navcolor);
    }//GEN-LAST:event_muMouseExited

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
       ManageOrder mo = new ManageOrder();
        mo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        jPanel9.setBackground(hovercolor);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        Color navcolor = new Color(102,102,0);
        jPanel9.setBackground(navcolor);
    }//GEN-LAST:event_jPanel9MouseExited
       
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
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc_id;
    private javax.swing.JLabel acc_lname;
    private javax.swing.JLabel acc_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mp;
    private javax.swing.JPanel mu;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_edit;
    private javax.swing.JPanel print;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}
