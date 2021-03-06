/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarList;

/**
 *
 * @author choud
 */
public class ViewJPanel extends javax.swing.JPanel {
    CarList listOfCars;
    private boolean isAvailable;
    int selectedRow;
    /**
     * Creates new form ViewJPanel
     */
    public ViewJPanel(CarList listOfCars) throws ParseException {
        initComponents();
        this.listOfCars = listOfCars;
       // readCSVFile();
        populateTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblViewTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCar = new javax.swing.JTable();
        lblSeats = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCertiYear = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        txtManufacture = new javax.swing.JTextField();
        lblManufacture = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        lblSerialNumber = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        txtModelName = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblManuYear = new javax.swing.JLabel();
        txtManufactureYear = new javax.swing.JTextField();
        txtExpiration = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnAvailable = new javax.swing.JRadioButton();
        btnNA = new javax.swing.JRadioButton();
        btnSave = new javax.swing.JButton();
        lblCount = new javax.swing.JLabel();
        lblRowCount = new javax.swing.JLabel();
        lbltTimeUpdateName = new javax.swing.JLabel();
        lblUpdatedTime = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        lblViewTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblViewTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewTitle.setText("Car Details");

        jScrollPane1.setAutoscrolls(true);

        tableCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial Number", "Manufacturer", "Model ", "Manufacturer Year", "City", "Seats", "Maintainence Certificate Expired?", "Availabliity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCar.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tableCar);

        lblSeats.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSeats.setText("Total Seats:");

        lblCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCity.setText("Car City:");

        lblCertiYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCertiYear.setText("Maintainence Certificate Expiration Date:");

        lblStatus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStatus.setText("Car Status:");

        txtManufacture.setEditable(false);
        txtManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufactureActionPerformed(evt);
            }
        });

        lblManufacture.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManufacture.setText("Car Manufacturer:");

        txtSerialNo.setEditable(false);

        lblSerialNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSerialNumber.setText("Car Serial Number:");

        txtSeats.setEditable(false);

        txtModelName.setEditable(false);

        lblModel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblModel.setText("Car Model Name:");

        txtCity.setEditable(false);

        lblManuYear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblManuYear.setText("Car Manufacture Year: ");

        txtManufactureYear.setEditable(false);

        txtExpiration.setEditable(false);

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnView.setText("View ");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAvailable.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAvailable.setText("Avaliable");
        btnAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailableActionPerformed(evt);
            }
        });

        btnNA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNA.setText("Not Avaliable");
        btnNA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNAActionPerformed(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCount.setText("Total Rows:");

        lblRowCount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lbltTimeUpdateName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbltTimeUpdateName.setText("Last Updated Time:");

        lblUpdatedTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnImport.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(lblManuYear)
                                    .addGap(27, 27, 27)
                                    .addComponent(txtManufactureYear))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(lblManufacture)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(176, 176, 176)
                                        .addComponent(lblSeats)
                                        .addGap(27, 27, 27)
                                        .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(133, 133, 133)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblSerialNumber)
                                        .addComponent(lblModel))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSerialNo)
                                        .addComponent(txtModelName)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(181, 181, 181)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblStatus)
                                                .addComponent(lblCity)))
                                        .addComponent(lblCertiYear, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(27, 27, 27)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCity)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnNA, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnSave))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(275, 275, 275)
                            .addComponent(lblViewTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbltTimeUpdateName, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUpdatedTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblRowCount)
                                        .addGap(57, 57, 57))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnImport)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnView)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnUpdate)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnDelete)))))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblViewTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCount)
                    .addComponent(lblRowCount))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnImport))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSerialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManuYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAvailable))
                .addGap(9, 9, 9)
                .addComponent(btnNA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtExpiration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertiYear, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUpdatedTime, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                    .addComponent(lbltTimeUpdateName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufactureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtManufactureActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
            //making fields non-editable
            txtCity.setEditable(false);
            txtManufacture.setEditable(false);
            txtSerialNo.setEditable(false);
            txtModelName.setEditable(false);
            txtSeats.setEditable(false);
            txtExpiration.setEditable(false);
            txtManufactureYear.setEditable(false);
            btnAvailable.setEnabled(false);
            btnNA.setEnabled(false);
            btnSave.setEnabled(false);
        btnAvailable.setEnabled(false);
        btnNA.setEnabled(false);
        selectedRow = tableCar.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
        Car selectedCar = (Car) model.getValueAt(selectedRow, 0);
        
        txtCity.setText(selectedCar.getCarCity());
        txtExpiration.setText(selectedCar.getCarMaintainenceCertificate());
        txtManufacture.setText(selectedCar.getCarManufacturer());
        txtManufactureYear.setText(String.valueOf(selectedCar.getCarManufacturerYear()));
        txtModelName.setText(selectedCar.getCarModel());
        txtSeats.setText(String.valueOf(selectedCar.getNoOfSeats()));
        txtSerialNo.setText(selectedCar.getCarLicenceNo());
        lblUpdatedTime.setText(listOfCars.getUpdatedTime());
        if(selectedCar.isIsAvailable() == true){
            btnAvailable.setSelected(true);
            btnNA.setSelected(false);
        }
        else{
             btnNA.setSelected(true);
             btnAvailable.setSelected(false);
        }
         btnSave.setEnabled(false);
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            // TODO add your handling code here:
            selectedRow = tableCar.getSelectedRow();
            
            if(selectedRow<0){
                JOptionPane.showMessageDialog(this, "Please select a row to delete");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
            Car selectedCar = (Car) model.getValueAt(selectedRow, 0);
            
            listOfCars.deleteCar(selectedCar);
            JOptionPane.showMessageDialog(this, "Deleted the car successfully");
            
            populateTable();
            
            txtManufacture.setText("");
            txtModelName.setText("");
            txtSerialNo.setText("");
            txtSeats.setText("");
            txtManufactureYear.setText("");
            txtCity.setText("");
            btnAvailable.setSelected(false);
            btnNA.setSelected(false);
            txtExpiration.setText("");
            
        } catch (ParseException ex) {
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        selectedRow = tableCar.getSelectedRow();
            
            if(selectedRow<0){
                JOptionPane.showMessageDialog(this, "Please select a row to update");
                return;
            }
            //Editable
            txtCity.setEditable(true);
            txtManufacture.setEditable(true);
            txtSerialNo.setEditable(true);
            txtModelName.setEditable(true);
            txtSeats.setEditable(true);
            txtExpiration.setEditable(true);
            txtManufactureYear.setEditable(true);
            btnAvailable.setEnabled(true);
            btnNA.setEnabled(true);
            btnSave.setEnabled(true);
            //txtStatus.setEditable(true);
            
            DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
            Car selectedCar = (Car) model.getValueAt(selectedRow, 0);
            
            
            txtCity.setText(selectedCar.getCarCity());
            txtExpiration.setText(selectedCar.getCarMaintainenceCertificate());
            txtManufacture.setText(selectedCar.getCarManufacturer());
            txtManufactureYear.setText(String.valueOf(selectedCar.getCarManufacturerYear()));
            txtModelName.setText(selectedCar.getCarModel());
            txtSeats.setText(String.valueOf(selectedCar.getNoOfSeats()));
            txtSerialNo.setText(selectedCar.getCarLicenceNo());
            if(selectedCar.isIsAvailable() == true){
                btnAvailable.setSelected(true);
                btnNA.setSelected(false);
            }
            else{
                btnNA.setSelected(true);
                btnAvailable.setSelected(false);
            }
            
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailableActionPerformed
        // TODO add your handling code here:
        if(btnAvailable.isSelected() == true){
            btnNA.setSelected(false);
            isAvailable = true;
        }
    }//GEN-LAST:event_btnAvailableActionPerformed

    private void btnNAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNAActionPerformed
        // TODO add your handling code here:
        if(btnNA.isSelected() == true){
            btnAvailable.setSelected(false);
            isAvailable = false;
        }
    }//GEN-LAST:event_btnNAActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            // TODO add your handling code here:
             if(txtManufacture.getText().length() > 0 && txtModelName.getText().length() > 0 &&
                txtSerialNo.getText().length() > 0 && txtManufactureYear.getText().length() > 0 &&
                txtSeats.getText().length() > 0 && txtCity.getText().length() > 0 &&
                txtExpiration.getText().length() > 0){
            selectedRow = tableCar.getSelectedRow();

            DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
            Car selectedCar = (Car) model.getValueAt(selectedRow, 0);
            
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            String manufacturer = txtManufacture.getText();
            String modelName = txtModelName.getText();
            String serialNo = txtSerialNo.getText();
            int manufactureYear = Integer.parseInt(txtManufactureYear.getText());
            int seats = Integer.parseInt(txtSeats.getText());
            String city = txtCity.getText();
            boolean status = isAvailable;
            String expirationDate = txtExpiration.getText();           
           
            selectedCar.setCarManufacturer(manufacturer);
            selectedCar.setCarModel(modelName);
            selectedCar.setCarLicenceNo(serialNo);
            selectedCar.setCarManufacturerYear(manufactureYear);
            selectedCar.setNoOfSeats(seats);
            selectedCar.setCarCity(city);
            selectedCar.setIsAvailable(status);
            selectedCar.setCarMaintainenceCertificate(expirationDate);
            
            JOptionPane.showMessageDialog(this, "Car updated!");
            Date date = new Date();
            listOfCars.setUpdatedTime(format.format(date));

            populateTable();

             }
             else{
                 JOptionPane.showMessageDialog(this, "Please Update with appropriate details");
             }
        } catch (ParseException ex) {
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        try {
            // TODO add your handling code here:
            
            SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            Date date = new Date();
            listOfCars.setUpdatedTime(format.format(date));
//            DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
//            model.setRowCount(0);
            readCSVFile();
            populateTable();
            lblUpdatedTime.setText(listOfCars.getUpdatedTime());
            
        } catch (ParseException ex) {
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnImportActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnAvailable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnImport;
    private javax.swing.JRadioButton btnNA;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCertiYear;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCount;
    private javax.swing.JLabel lblManuYear;
    private javax.swing.JLabel lblManufacture;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblRowCount;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUpdatedTime;
    private javax.swing.JLabel lblViewTitle;
    private javax.swing.JLabel lbltTimeUpdateName;
    private javax.swing.JTable tableCar;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtExpiration;
    private javax.swing.JTextField txtManufacture;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModelName;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSerialNo;
    // End of variables declaration//GEN-END:variables

    private void populateTable() throws ParseException {
        //readCSVFile();
        DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
        model.setRowCount(0);
        int i = 0, count = 0;
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date currentDatenow = new Date();
        String currentFormattedDate = format.format(currentDatenow);
        
        for(Car c : listOfCars.getListOfCars()){
            Object[] o = new Object[8];
            
            o[i++] = c;
            o[i++] = c.getCarManufacturer();
            o[i++] = c.getCarModel();
            o[i++] = c.getCarManufacturerYear();
            o[i++] = c.getCarCity();
            o[i++] = c.getNoOfSeats();
            
            Date expiredDate = format.parse(c.getCarMaintainenceCertificate());
            Date currentDate = format.parse(currentFormattedDate);
            
            if(expiredDate.after(currentDate)){
                o[i++] = "Not Expired";
            }
            else{
                o[i++] = "Expired";
            }
            if(c.isIsAvailable() == true){
                 o[i++] = "Available";
            }
            else{
            o[i++] = "Unavailable";
            }
            i=0;
            count++;
            model.addRow(o);
        } 
        lblRowCount.setText(String.valueOf(count));
        lblUpdatedTime.setText(listOfCars.getUpdatedTime());
    }

    private void readCSVFile() {
        BufferedReader br = null;
        try {
            //boolean flag = true;
            String line = "";
            String splitBy = ",";
            br = new BufferedReader(new FileReader("C:\\Users\\choud\\Documents\\AEDConfigurationData.csv"));
            while ((line = br.readLine()) != null) //returns a Boolean value
            {
                String[] car = line.split(splitBy); // use comma as separator

                String serialNo = car[0];
                String modelName = car[2];
                String manufacturer = car[1];
                String manfacturingYear = car[3];
                String city = car[4];
                String seats = car[5];
                String certificate = car[6];
                String status = car[7];
               
                Car c = listOfCars.addNewCar();//new Car();
               
                c.setCarLicenceNo(serialNo);
                c.setCarManufacturer(manufacturer);
                c.setCarModel(modelName);
                c.setCarManufacturerYear(Integer.parseInt(manfacturingYear));
                c.setCarCity(city);
                c.setNoOfSeats(Integer.parseInt(seats));
                c.setCarMaintainenceCertificate(certificate);
                c.setIsAvailable(status.equals("available")? true : false);
                
            }   } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(ViewJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
