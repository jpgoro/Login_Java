
package com.gorotech.login.igu;

import com.gorotech.login.logica.Controller;
import com.gorotech.login.logica.User;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class UserPrinc extends javax.swing.JFrame {

    Controller control;
    User usr;
    public UserPrinc(Controller control, User usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        btnRefreshTable = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        txtNameUser = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu Light", 1, 36)); // NOI18N
        jLabel1.setText("Sistema Administrador de Usuarios");

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(UsersTable);

        btnRefreshTable.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        btnRefreshTable.setText("Recargar Tabla");
        btnRefreshTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshTableActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        txtNameUser.setEditable(false);
        txtNameUser.setFont(new java.awt.Font("Liberation Sans", 0, 14)); // NOI18N
        txtNameUser.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 684, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(88, 88, 88)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.txtNameUser.setText(usr.getNameUser());
        loadTable();
    }//GEN-LAST:event_formWindowOpened
    
    private void loadTable() {
        //Define the model we want the table to have
        DefaultTableModel tableModel = new DefaultTableModel(){
        //Makes rows and columns uneditable
        public boolean IsCellEditable(int row, int colum){
            return false;
        }
        };
        //Column names are established
        String titles[] = {"Id","User","Rol"};
        //Assigns the names to the model
        tableModel.setColumnIdentifiers(titles);
        //Assingns the model to the table
        
        //Bring the list of users from the database
        List<User> UsersList = control.bringUsers();
        //Checks if the list is empty
        if(UsersList!=null){
            //Go through the list
            for(User usu : UsersList){
                Object[] obj = {usu.getId(),usu.getNameUser(),usu.getaRol().getRolName()};
                //Adds it as a row to the table
                tableModel.addRow(obj);
            }
        }
        //2:09:34
        UsersTable.setModel(tableModel);
        
    }
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        loadTable();
        //02:10:12
    }//GEN-LAST:event_btnRefreshTableActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration//GEN-END:variables


}
