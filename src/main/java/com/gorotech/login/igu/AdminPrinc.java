
package com.gorotech.login.igu;

import com.gorotech.login.logica.Controller;
import com.gorotech.login.logica.User;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AdminPrinc extends javax.swing.JFrame {
    Controller control;
    User usr;
    public AdminPrinc(Controller control, User usr) {
        initComponents();
        this.control = control;
        this.usr = usr;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        btnCreateUser = new javax.swing.JButton();
        btnEditUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
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

        btnCreateUser.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        btnCreateUser.setText("Crear Usuario");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnEditUser.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        btnEditUser.setText("Editar Usuario");
        btnEditUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("Ubuntu Light", 0, 18)); // NOI18N
        btnDeleteUser.setText("Borrar Usuario");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNameUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefreshTable, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        UsersTable.setModel(tableModel);
        
    }
    
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
       UserRegistration  usuReg = new UserRegistration(control);
       usuReg.setVisible(true);
       usuReg.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        //validate that the table is not empty
        if(UsersTable.getRowCount()>0){
            //check that selected elements exist in the table
            if(UsersTable.getSelectedRow()!=-1){
                //get the id of the element to delete
                int id_user = Integer.parseInt(String.valueOf(UsersTable.getValueAt(UsersTable.getSelectedRow(), 0)));
                //call the delete method
                control.deleteUser(id_user);
                //message to the user of successful deletion
                showMessage("User deleted successfully", "Info","Successful user deletion");
                loadTable();
            }
            else{
                showMessage("No record has been selected", "Error","Deletion error");
            }
        }
        else{
            showMessage("The table is empty", "Error","Deletion error");
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    private void btnEditUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditUserActionPerformed
        //validate that the table is not empty
        if(UsersTable.getRowCount()>0){
            //check that selected elements exist in the table
            if(UsersTable.getSelectedRow()!=-1){
                //get the id of the element to delete
                int id_user = Integer.parseInt(String.valueOf(UsersTable.getValueAt(UsersTable.getSelectedRow(), 0)));
                EditionUser EditingScreen = new EditionUser(control, id_user);
                EditingScreen.setVisible(true);
                EditingScreen.setLocationRelativeTo(null);
            }
            else{
                showMessage("No record has been selected", "Error","Error editing");
            }
        }
        else{
            showMessage("The table is empty", "Error","Error editing");
        }    
    }//GEN-LAST:event_btnEditUserActionPerformed

    private void btnRefreshTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshTableActionPerformed
        loadTable();
    }//GEN-LAST:event_btnRefreshTableActionPerformed
    
    public void showMessage(String message, String type, String title){
        JOptionPane optionPane = new JOptionPane(message);
        if(type.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if(type.equals("Error")){
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(title);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable UsersTable;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnEditUser;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRefreshTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNameUser;
    // End of variables declaration//GEN-END:variables
}
