/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSigns;

/**
 *
 * @author choud
 */
public class PatientJPanel extends javax.swing.JPanel {
    private PatientDirectory pd ;
    
    private PersonDirectory persondir;
    int selectedRow;
     Patient personFound = new Patient();
     Patient newPatient = new Patient();
      ArrayList<Encounter> list = new ArrayList<>();
      EncounterHistory ehistory = new EncounterHistory();  
    /**
     * Creates new form PatientJPanel
     */
    public PatientJPanel(PersonDirectory persondir,PatientDirectory pd) {
        initComponents();
        txtManufacture.setText("");
        txtModelName.setText("");
        this.pd = pd;
        this.persondir = persondir;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblPatient = new javax.swing.JLabel();
        txtPatientId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCar = new javax.swing.JTable();
        btnUpdate3 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtManufacture = new javax.swing.JTextField();
        txtModelName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        btnUpdate1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblRowCount = new javax.swing.JLabel();
        lblRowCount1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Patient Records");

        lblPatient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPatient.setText("Enter Patient Insurance Number:");

        txtPatientId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIdActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setAutoscrolls(true);

        tableCar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Insurance No.", "Name", "Age", "Contact Number", "Gender", "Community", "City", "ZipCode"
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

        btnUpdate3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate3.setText("View Encounter History");
        btnUpdate3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate3ActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate.setText("Add Encounter");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, "", null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Visit Date", "Systolic pressure", "Diastolic pressure", "BP Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Systolic Pressure:");

        txtManufacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtManufactureActionPerformed(evt);
            }
        });

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAge.setText("Diastolic Pressure:");

        btnUpdate1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnUpdate1.setText("Save Encounter");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Total Visits:");

        lblRowCount.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(109, 109, 109)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge)
                                    .addComponent(lblName))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtModelName, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnUpdate3)
                                    .addComponent(btnUpdate)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(295, 295, 295)
                                .addComponent(lblPatient)
                                .addGap(18, 18, 18)
                                .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(461, 461, 461)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(474, 474, 474)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 287, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(348, 348, 348)
                    .addComponent(lblRowCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(847, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUpdate3)
                        .addGap(3, 3, 3)
                        .addComponent(btnUpdate)
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(534, Short.MAX_VALUE)
                    .addComponent(lblRowCount1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(58, 58, 58)))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(!txtPatientId.getText().isEmpty()){
           
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
         
         model.setRowCount(0);       
         String insuranceNo = txtPatientId.getText();
        int dialogButton = JOptionPane.YES_NO_OPTION;
        boolean flag = false;
       
        
        for(Person p : persondir.getPeople()){
             if(insuranceNo.equalsIgnoreCase(p.getId())){
                  flag = true;
                 // personFound = pd.addNewCar();
                  personFound.setPerson(p);
                 // personFound.setInsuranceNo(p.getId());
                  break;
             }
             
        }// JOptionPane.showMessageDialog(this, "Patient not found, Do you want to add?");
               if(!flag){
                int result =  JOptionPane.showConfirmDialog(null, "Patient not found, Do you want to add?","Confirmation",
                        dialogButton,JOptionPane.ERROR_MESSAGE);
                  if(result == JOptionPane.NO_OPTION){
                      remove(result);  
                  }
                   if(result == JOptionPane.YES_OPTION){
                       CreateJJPanel person = new CreateJJPanel(persondir);
                       jSplitPane1.setRightComponent(person);
                   }
             }
             else{
                // Patient patient = new Patient();
                   populateTable(personFound);
//                 ViewPatient viewPatientPanel = new ViewPatient(persondir, pd, patient);
//                 jSplitPane1.setRightComponent(viewPatientPanel);
             }
        lblRowCount.setText("");
        }
        else{
             JOptionPane.showMessageDialog(this, "Please enter Patient ID");
        
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUpdate3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate3ActionPerformed
        // TODO add your handling code here:
         selectedRow = tableCar.getSelectedRow();
         if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to view Encounter details");
            return;
        }   
        String id = tableCar.getModel().getValueAt(selectedRow, 0).toString();
        System.out.println(id);
        for(Patient pat : pd.getPatients()){
            System.out.println("--------------");
            if(id.equalsIgnoreCase(pat.getInsuranceNo())){
                populateHistoryTable(pat);
            }
        }
    }//GEN-LAST:event_btnUpdate3ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       // DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
        txtManufacture.setEditable(true);
        txtModelName.setEditable(true);
        selectedRow = tableCar.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row to add encounter ");
            return;
        }
        String tableId = tableCar.getModel().getValueAt(selectedRow, 0).toString();
        personFound.setInsuranceNo(tableId);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtManufactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtManufactureActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtManufactureActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        int index = 0;
        if(!txtManufacture.getText().isEmpty() || !txtModelName.getText().isEmpty()){
        if(txtManufacture.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Please enter correct Systolic BP");
                    }
                   if(txtModelName.getText().isEmpty()){
                        JOptionPane.showMessageDialog(this, "Please enter correct Diastolic BP");

                    } 
    }
        float sys = (Float.valueOf(txtManufacture.getText()));
        float dia = (Float.valueOf(txtModelName.getText()));
                    
        int age = personFound.getPerson().getAge();
        String normalBP = isNormal(sys,dia,age);
            String id = personFound.getInsuranceNo();
            boolean flag = false;
            Date date = new Date();
      SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yy");
       String str = formatter.format(date);
            if(pd.getPatients() != null && !pd.getPatients().isEmpty()){
                for( int i = 0; i<pd.getPatients().size() ; i++){
                    if(pd.getPatients().get(i).getInsuranceNo().equals(id)){
                        flag = true;
                         index = i;
                        break;
                    }
                }
                if(!flag){
                    newPatient = pd.addNewCar();
                    newPatient.setInsuranceNo(id);
                    newPatient.setPerson(personFound.getPerson());
                    ehistory = new EncounterHistory();
                    ehistory.addNewCar(new VitalSigns(sys,dia,normalBP,str));
                    newPatient.setEncounterHistory(ehistory);
                    //populateHistoryTable(newPatient);
                    //ehistory.addNewCar(new VitalSigns(sys,dia,normalBP));
//                    // list= newPatient.getEncounterHistory().getEncounter();
//                    list = ehistory.getEncounter();
//            ehistory.setEncounter(list);
//                    newPatient.setEncounterHistory(ehistory);
//                    
    
                    populateHistoryTable(newPatient);
                    
                    
                }
                else{
                    for( int i = 0; i<pd.getPatients().size() ; i++){
                        if(i == index){
                            ehistory = pd.getPatients().get(i).getEncounterHistory();
                            ehistory.addNewCar(new VitalSigns(sys,dia,normalBP,str));
            list = ehistory.getEncounter();
            ehistory.setEncounter(list);
            newPatient.setEncounterHistory(ehistory);
            personFound.setEncounterHistory(ehistory);
            populateHistoryTable(personFound);
                        }
                    }
                }
                
//            for(Patient patient : pd.getPatients()){
//                System.out.print("testinggg"+patient.getInsuranceNo());
//                if(!id.equals(patient.getInsuranceNo())){
//                    newPatient = pd.addNewCar();
//                    newPatient.setInsuranceNo(id);
//                    newPatient.setPerson(personFound.getPerson());
//                    if(newPatient.getEncounterHistory() == null){
//                        ehistory = new EncounterHistory();
//               
//            }
//                    ehistory.addNewCar(new VitalSigns(sys,dia,normalBP));
//                    // list= newPatient.getEncounterHistory().getEncounter();
//                    list = ehistory.getEncounter();
//            ehistory.setEncounter(list);
//                    newPatient.setEncounterHistory(ehistory);
//                    
//                    populateHistoryTable(newPatient);
//                    break;
//                  //  continue;
//                }
//                if(id.equals(patient.getInsuranceNo())){
////                    if(personFound.getEncounterHistory() != null){
////                list= personFound.getEncounterHistory().getEncounter();
////            }
//                    ehistory.addNewCar(new VitalSigns(sys,dia,normalBP));
//            list = ehistory.getEncounter();
//            ehistory.setEncounter(list);
//            newPatient.setEncounterHistory(ehistory);
//            personFound.setEncounterHistory(ehistory);
//            populateHistoryTable(personFound);
//                }
//                else{
//                    newPatient = pd.addNewCar();
//                    newPatient.setInsuranceNo(id);
//                    newPatient.setPerson(personFound.getPerson());
//                    ehistory = new EncounterHistory();
//                    ehistory.addNewCar(new VitalSigns(sys,dia,normalBP));
//                    newPatient.setEncounterHistory(ehistory);
//                    populateHistoryTable(newPatient);
//                    break;
//                }
//            }
            }
            else{
                    newPatient = pd.addNewCar();
                    newPatient.setInsuranceNo(id);
                    newPatient.setPerson(personFound.getPerson());
                    ehistory.addNewCar(new VitalSigns(sys,dia,normalBP,str));
                    newPatient.setEncounterHistory(ehistory);
                     populateHistoryTable(newPatient);
                    
                    }
////            if(id.equalsIgnoreCase(patient.getInsuranceNo()))
////            if(personFound.getEncounterHistory() != null){
////                list= personFound.getEncounterHistory().getEncounter();
////            }
////            ehistory.addNewCar(new VitalSigns(sys,dia));
////            list = ehistory.getEncounter();
////            ehistory.setEncounter(list);
////            personFound.setEncounterHistory(ehistory);
////            populateHistoryTable(personFound);
////        }
//////            }else{
//////                 populateHistoryTable(personFound);
//////             personFound = pd.addNewCar();
//////            }
//////            if(id.equalsIgnoreCase(patient.getInsuranceNo()))
//////            if(personFound.getEncounterHistory() != null){
//////                list= personFound.getEncounterHistory().getEncounter();
//////            }
//////            ehistory.addNewCar(new VitalSigns(sys,dia));
//////            list = ehistory.getEncounter();
//////            ehistory.setEncounter(list);
//////            personFound.setEncounterHistory(ehistory);
//////            populateHistoryTable(personFound);
//////        }
////        //  populateHistoryTable(p);
        txtManufacture.setText("");
        txtModelName.setText("");
//        if(pd.getPatients() != null && !pd.getPatients().isEmpty()){
//        for(Patient newP : pd.getPatients()){
//            if(!newP.getInsuranceNo().equalsIgnoreCase(personFound.getInsuranceNo())){
//                 personFound = pd.addNewCar();
//            }
//            else{
//                newP.setEncounterHistory(personFound.getEncounterHistory());
//            }
//          }
//        }
//        else{
//             personFound = pd.addNewCar();
//        }
//    //  System.out.println(" " + pd.getPatients().get(0).getEncounterHistory().toString());
//       
    }//GEN-LAST:event_btnUpdate1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JButton btnUpdate3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPatient;
    private javax.swing.JLabel lblRowCount;
    private javax.swing.JLabel lblRowCount1;
    private javax.swing.JTable tableCar;
    private javax.swing.JTextField txtManufacture;
    private javax.swing.JTextField txtModelName;
    private javax.swing.JTextField txtPatientId;
    // End of variables declaration//GEN-END:variables
 private void populateTable(Patient c) {
         DefaultTableModel model = (DefaultTableModel) tableCar.getModel();
         model.setRowCount(0);
         
        int i = 0, total = 0;
       // for(int i = 0; i<){
            Object[] o = new Object[10];
            //for(Patient c: patientdir.getPatients()){
                model.setRowCount(0);
            o[i++] = c.getPerson().getId();
            o[i++] = c.getPerson().getName();
            o[i++] = c.getPerson().getAge();
            o[i++] = c.getPerson().getContactNo();
            o[i++] = c.getPerson().getGender();
            o[i++] = c.getPerson().getCommunity().getCommunityName();
            o[i++] = c.getPerson().getCity().getCityName();
            o[i++] = c.getPerson().getHouse().getZipcode();
            
            i=0;
            model.addRow(o);
        }
private void populateHistoryTable(Patient patient) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        
        int i = 0, total = 0;
        Object[] o = new Object[4];
          for(Encounter enc:patient.getEncounterHistory().getEncounter()){
               o[i++] = enc.getVitalSigns().getLastVisit();
            o[i++] = enc.getVitalSigns().getSystolic();
            o[i++] = enc.getVitalSigns().getDiastolic();
            o[i++] = enc.getVitalSigns().getNormalBP();
            i=0;
            model.addRow(o);
            total++;
        }
                  lblRowCount.setText(String.valueOf(total));

    }
 public String isNormal(float sys, float dia, int age){
   //ArrayList<Encounter> encounterCheck =  patient.getEncounterHistory().getEncounter();
  String flag = "Normal";
  if(age < 25){
       if((sys < 108 || sys>132) || (dia < 75 || dia > 83)){
          flag = "Abnormal";
          return flag;
      }
       }
       else if(age >=25 && age<50){
           if((sys < 116 || sys>142) || (dia < 77 || dia > 85)){
               flag = "Abnormal";
          return flag;
       }
       }
           else{
                if((sys < 118 || sys>144) || (dia < 79 || dia > 90)){
               flag = "Abnormal";
          return flag;
                }
           }
   
   return flag;
 }
}
