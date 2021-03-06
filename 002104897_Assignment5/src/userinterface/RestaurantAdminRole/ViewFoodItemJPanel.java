/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.Menu.FoodItem;
import Business.Menu.MenuDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author garima
 */
public class ViewFoodItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFoodItemJPanel
     */
    JFileChooser chooser;
    File file;
    BufferedImage img;
    private JPanel container;
    private FoodItem foodItem;
    private MenuDirectory menuDirectory;
    //private ;
    
    public ViewFoodItemJPanel(JPanel container,FoodItem foodItem, MenuDirectory menuDirectory) {
        initComponents();
        this.container = container;
        this.foodItem = foodItem;
        this.menuDirectory = menuDirectory;
        itemNameTextField.setText(foodItem.getFoodItemName());
        itemDescriptionTextField.setText(foodItem.getFoodDescription());
        itemPriceTextField.setText(String.valueOf(foodItem.getFoodPrice()));
        itemIdTextField.setText(foodItem.getFoodItemId());
        itemPhoto.setIcon(new ImageIcon(foodItem.getFoodPhoto()));
        itemNameTextField.setEditable(false);
        itemDescriptionTextField.setEditable(false);
        itemPriceTextField.setEditable(false);
        itemIdTextField.setEditable(false);
        changeImgBtn.setVisible(false);
        img = foodItem.getFoodPhoto();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        itemPhoto = new javax.swing.JLabel();
        itemIdTextField = new javax.swing.JTextField();
        itemNameTextField = new javax.swing.JTextField();
        itemDescriptionTextField = new javax.swing.JTextField();
        itemPriceTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        changeImgBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setText("View/ Edit Food Item");

        itemPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemPhoto.setMaximumSize(new java.awt.Dimension(120, 120));
        itemPhoto.setMinimumSize(new java.awt.Dimension(120, 120));
        itemPhoto.setPreferredSize(new java.awt.Dimension(120, 120));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        saveBtn.setText("Save Changes");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        changeImgBtn.setText("Choose");
        changeImgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeImgBtnActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jButton1)
                        .addGap(80, 80, 80)
                        .addComponent(saveBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(272, 272, 272))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(itemPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(changeImgBtn))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemIdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                    .addComponent(itemNameTextField)
                                    .addComponent(itemDescriptionTextField)
                                    .addComponent(itemPriceTextField))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(itemIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDescriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemPriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changeImgBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(saveBtn))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = itemIdTextField.getText();
        String name = itemNameTextField.getText();
        String description = itemDescriptionTextField.getText();
        Double price = 0.0;
        try{
            price  = Double.parseDouble(itemPriceTextField.getText());
        } catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null, "Enter valid price!");
        }
       
        if(id.isEmpty() || name.isEmpty() || description.isEmpty() || price == 0.0 || img == null){
            JOptionPane.showMessageDialog(null, "Enter all fields!");
        }
        else{
            menuDirectory.updateFoodItem(foodItem.getFoodItemId(),name,description,price,img);
            itemNameTextField.setEditable(false);
            itemDescriptionTextField.setEditable(false);
            itemPriceTextField.setEditable(false);
            itemIdTextField.setEditable(false);
            changeImgBtn.setVisible(false);
            JOptionPane.showMessageDialog(null, "Food Item updated succesfully!");
            itemPhoto.setIcon(new ImageIcon(foodItem.getFoodPhoto()));
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        itemNameTextField.setEditable(true);
        itemDescriptionTextField.setEditable(true);
        itemPriceTextField.setEditable(true);
        changeImgBtn.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void changeImgBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeImgBtnActionPerformed
        // TODO add your handling code here:
        chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        file = chooser.getSelectedFile();
        try{
            img = ImageIO.read(file);
        } catch (IOException e){
            img = foodItem.getFoodPhoto();
        }
    }//GEN-LAST:event_changeImgBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageMenuJPanel manageMenuJPanel = (ManageMenuJPanel) component;
        manageMenuJPanel.populate();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton2ActionPerformed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changeImgBtn;
    private javax.swing.JTextField itemDescriptionTextField;
    private javax.swing.JTextField itemIdTextField;
    private javax.swing.JTextField itemNameTextField;
    private javax.swing.JLabel itemPhoto;
    private javax.swing.JTextField itemPriceTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
