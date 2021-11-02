/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.City;
import model.Community;
import model.House;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author choud
 */
public class CreateJJPanel extends javax.swing.JPanel {
    PersonDirectory pd;
    int count = 1000;
    private String gender;
    private boolean phoneNoFlag;
    private boolean errage;
    private boolean seatsFlag;
    /**
     * Creates new form CreateJJPanel
     */
    public CreateJJPanel(PersonDirectory pd) {
        initComponents();
        this.pd = pd;
        
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
        jPanel1 = new javax.swing.JPanel();
        btnFemale = new javax.swing.JRadioButton();
        txthouseno = new javax.swing.JTextField();
        lblStreet = new javax.swing.JLabel();
        txtcity = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        txtAge = new javax.swing.JTextField();
        btnview = new javax.swing.JButton();
        lblzipcode = new javax.swing.JLabel();
        lblgender = new javax.swing.JLabel();
        lblCreateTitle = new javax.swing.JLabel();
        txtStreetname = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnOther = new javax.swing.JRadioButton();
        lblcommunity = new javax.swing.JLabel();
        lblcontact = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        btnMale = new javax.swing.JRadioButton();
        lblhouse = new javax.swing.JLabel();
        dropdownComm = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        txthouseno.setToolTipText("Add digits only between 2-9");
        txthouseno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthousenoKeyReleased(evt);
            }
        });

        lblStreet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStreet.setText("Street Name:");

        txtcity.setEditable(false);
        txtcity.setText("Boston");

        txtContact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContactKeyReleased(evt);
            }
        });

        txtZipcode.setEditable(false);
        txtZipcode.setText("15515");

        lblCity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCity.setText("City:");

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        btnview.setText("View Profile");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        lblzipcode.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblzipcode.setText("Zip Code:");

        lblgender.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblgender.setText("Gender:");

        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTitle.setText("Create Person Profile");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblName.setText("Name:");

        btnOther.setText("Other");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        lblcommunity.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcommunity.setText("Community:");

        lblcontact.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblcontact.setText("Contact Number:");

        lblAge.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblAge.setText("Age:");

        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        lblhouse.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhouse.setText("House Number:");

        dropdownComm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "South Boston", "Downtown" }));

        jLabel1.setForeground(new java.awt.Color(204, 0, 51));

        jLabel2.setForeground(new java.awt.Color(204, 0, 51));

        jLabel3.setForeground(new java.awt.Color(204, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCity)
                    .addComponent(lblcontact)
                    .addComponent(lblAge)
                    .addComponent(lblName)
                    .addComponent(lblgender)
                    .addComponent(lblhouse)
                    .addComponent(lblcommunity)
                    .addComponent(lblStreet)
                    .addComponent(lblzipcode))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCreateTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsave)
                        .addGap(61, 61, 61)
                        .addComponent(btnview))
                    .addComponent(txtContact)
                    .addComponent(txtAge)
                    .addComponent(btnMale, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(btnFemale, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(btnOther, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txthouseno, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txtStreetname, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txtcity, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(dropdownComm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblCreateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblgender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOther))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblhouse, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txthouseno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtStreetname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dropdownComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnsave)
                            .addComponent(btnview)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 577, Short.MAX_VALUE)
        );

        jSplitPane1.setLeftComponent(jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
        if(btnFemale.isSelected()){
           btnMale.setSelected(false);
           btnOther.setSelected(false);
           gender = "Female";
       }
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void txthousenoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthousenoKeyReleased
        // TODO add your handling code here:
                String regex = "^[0-9]+";
                Pattern pattern= Pattern.compile(regex);
                Matcher match=pattern.matcher(txthouseno.getText());
        
                if(txthouseno.getText().length()<=0 || txthouseno.getText().length()>10 || !match.matches()){
                        jLabel3.setText("Please enter correct house No");
                        seatsFlag = false;
                    }
                else {
                        jLabel3.setText(null);
                        seatsFlag = true;
                    }
    }//GEN-LAST:event_txthousenoKeyReleased

    private void txtContactKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactKeyReleased
         String regex = "\\d{10}";
        Pattern pattern= Pattern.compile(regex);
        Matcher match=pattern.matcher(txtContact.getText());
       
        if(txtContact.getText().length()<=0 || txtContact.getText().length()>10 || !match.matches()){
        jLabel2.setText("Phone number is incorrect");
        phoneNoFlag = false;
        }
        else {
        jLabel2.setText(null);
        phoneNoFlag = true;
        }
    }//GEN-LAST:event_txtContactKeyReleased

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat format1 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        boolean duplicateEntry= false;
      
        
        if(txtAge.getText().length() > 0 && txtContact.getText().length() > 0 &&
                txtName.getText().length() > 0 && txtStreetname.getText().length()>0 &&
                txtZipcode.getText().length() > 0 && txtcity.getText().length() > 0 &&
                txthouseno.getText().length()>0 && seatsFlag && errage && phoneNoFlag){
       String name = txtName.getText();
       int age = Integer.valueOf(txtAge.getText());
       long contactNo = Long.valueOf(txtContact.getText());
       String community = dropdownComm.getSelectedItem().toString();
       long zipcode = Long.valueOf(txtZipcode.getText());
       String city = txtcity.getText();
       String street = txtStreetname.getText();
       int houseno = Integer.valueOf(txthouseno.getText());
       
           
//        for(Person c : pd.getPeople()){
//            if(c.getId().equalsIgnoreCase(txtSerialNo.getText())){
//                            JOptionPane.showMessageDialog(this, "Duplicate entry!");
//                            duplicateEntry = true;
//                            break;
//                            
//                            
//            }
//            
//        }
 //       if(!duplicateEntry){
            
        Person car = pd.addNewCar(count++);
        car.setName(name);
        car.setAge(age);
        car.setContactNo(contactNo);
        car.setGender(gender);
        
       House house = new House();
       house.setHouseNo(houseno);
       house.setStreetName(street);
       house.setZipcode(zipcode);
       house.setPeople(pd.getPeople());
       car.setHouse(house);
       
       Community communityName = new Community();
       communityName.setCommunityName(community);
       car.setCommunity(communityName);
       
       City cityName = new City();
       cityName.setCityName(city);
       car.setCity(cityName);
       JOptionPane.showMessageDialog(this, "Person Added!");
       
       txtAge.setText("");
       txtContact.setText("");
       txtName.setText("");
       txtStreetname.setText("");
       txtZipcode.setText("");
       txtcity.setText("");
       txthouseno.setText("");
       btnFemale.setSelected(false);
       btnMale.setSelected(false);
       btnOther.setSelected(false);

//        Date updatedTime = new Date();
//        listOfCars.setUpdatedTime(format1.format(updatedTime));
//        JOptionPane.showMessageDialog(this, "Car Added!");
//        
//        }
//        txtManufacture.setText("");
//        txtModelName.setText("");
//        txtSerialNo.setText("");
//        yearManufacture.setValue(2021);
//        txtSeats.setText("");
//        txtCity.setText("");
//        btnAvailable.setSelected(false);
//        btnNA.setSelected(false);
//        
//           // lblUpdatedTime.setText(updatedTime);
//       // expirationCalendar.setCalendar(null);
        }
        else {
            JOptionPane.showMessageDialog(this, "Please add correct person details");
        }
        
//        
 //       }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        // TODO add your handling code here:
        ViewJPanel viewPanel = new ViewJPanel(pd);
        jSplitPane1.setRightComponent(viewPanel);

    }//GEN-LAST:event_btnviewActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        // TODO add your handling code here:
        if(btnOther.isSelected()){
            btnMale.setSelected(false);
           btnFemale.setSelected(false);
           gender ="Other";
        }
    }//GEN-LAST:event_btnOtherActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        //        // TODO add your handling code here:
        if(btnMale.isSelected()){
           btnFemale.setSelected(false);
           btnOther.setSelected(false);
           gender = "Male";
       }
    }//GEN-LAST:event_btnMaleActionPerformed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
        int age_len;
        age_len = txtAge.getText().length();

        if (age_len>3){
           jLabel1.setText("Please enter correct Age");
           errage = false;
        }
        else{
            jLabel1.setText(null);
            errage = true;
        }
    }//GEN-LAST:event_txtAgeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnview;
    private javax.swing.JComboBox<String> dropdownComm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblcommunity;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblgender;
    private javax.swing.JLabel lblhouse;
    private javax.swing.JLabel lblzipcode;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtStreetname;
    private javax.swing.JTextField txtZipcode;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txthouseno;
    // End of variables declaration//GEN-END:variables
}
