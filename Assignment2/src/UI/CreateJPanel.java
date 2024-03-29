/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Fleet;
import model.FleetDirectory;

/**
 *
 * @author anvithalakshmisha
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    FleetDirectory fleetDirec;
    Fleet fleet;
    String[] configArray = new String[9];

    public CreateJPanel(FleetDirectory fleetDirec) {
        initComponents();

        this.fleetDirec = fleetDirec;
        fleet = new Fleet();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateCar = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblCarManufacturer = new javax.swing.JLabel();
        lblMaufactureYear = new javax.swing.JLabel();
        lblSeatCount = new javax.swing.JLabel();
        lblModelNumber = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        lblAvaiablilty = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        txtCarManufacturer = new javax.swing.JTextField();
        txtManufactureYear = new javax.swing.JTextField();
        txtSeatCount = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        chkboxAvailability = new javax.swing.JCheckBox();
        btnSave = new javax.swing.JButton();
        lblMaintenanceExpired = new javax.swing.JLabel();
        chkboxExpired = new javax.swing.JCheckBox();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblOr = new javax.swing.JLabel();
        lblFileLocation = new javax.swing.JLabel();
        btnBrowse = new javax.swing.JButton();
        txtFileUploadLocation = new javax.swing.JTextField();

        lblCreateCar.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        lblCreateCar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateCar.setText("Create car directory");

        lblModel.setText("Enter the car model :");

        lblCarManufacturer.setText("Enter the car manufactrer: ");

        lblMaufactureYear.setText("Enter the car manufacture year :");

        lblSeatCount.setText("Enter the seat count :");

        lblModelNumber.setText("Enter the model number :");

        lblSerialNumber.setText("Enter the serial number :");

        lblAvaiablilty.setText("Is the car available ?");

        txtManufactureYear.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtManufactureYearFocusLost(evt);
            }
        });

        txtSeatCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSeatCountFocusLost(evt);
            }
        });

        chkboxAvailability.setText("set as available");

        btnSave.setText("Save car info");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lblMaintenanceExpired.setText("Is the car maintenance expired ?");

        chkboxExpired.setText("set as expired");

        lblCity.setText("Enter the city :");

        lblOr.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblOr.setText("OR");

        lblFileLocation.setText("Browse the file location: ");

        btnBrowse.setText("Browse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCreateCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblOr)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaufactureYear)
                            .addComponent(lblCarManufacturer)
                            .addComponent(lblModel)
                            .addComponent(lblSeatCount)
                            .addComponent(lblModelNumber)
                            .addComponent(lblSerialNumber)
                            .addComponent(lblAvaiablilty)
                            .addComponent(lblMaintenanceExpired)
                            .addComponent(lblCity)
                            .addComponent(lblFileLocation))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkboxExpired)
                                    .addComponent(chkboxAvailability)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSeatCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBrowse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtFileUploadLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(336, 336, 336))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtCarManufacturer, txtCity, txtFileUploadLocation, txtManufactureYear, txtModel, txtModelNumber, txtSeatCount, txtSerialNumber});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblAvaiablilty, lblCarManufacturer, lblCity, lblFileLocation, lblMaintenanceExpired, lblMaufactureYear, lblModel, lblModelNumber, lblSeatCount, lblSerialNumber});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblCreateCar)
                .addGap(126, 126, 126)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblModel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarManufacturer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtManufactureYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaufactureYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSeatCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeatCount))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModelNumber)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerialNumber)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAvaiablilty)
                        .addGap(18, 18, 18)
                        .addComponent(lblMaintenanceExpired))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chkboxAvailability)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkboxExpired)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(58, 58, 58)
                .addComponent(lblOr)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFileUploadLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBrowse)
                    .addComponent(lblFileLocation))
                .addGap(113, 113, 113))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        StringBuilder Error = new StringBuilder();
        if (txtFileUploadLocation.getText().isEmpty()) {
            Fleet newfleet = fleetDirec.addFleet();
//        model
            if (!txtModel.getText().isBlank()) {
                newfleet.setModel(txtModel.getText());
            } else {
                Error.append("Enter Model \n");
            }
//        manufacturer
            if (!txtCarManufacturer.getText().isBlank()) {
                newfleet.setCarManufacturer(txtCarManufacturer.getText());
            } else {
                Error.append("Enter Car Manufacturer \n");
            }
//        manufacture year
            if (!txtManufactureYear.getText().isBlank()) {
                newfleet.setCarManufactureYear(Integer.parseInt(txtManufactureYear.getText()));
            } else {
                Error.append("Enter Manufacture year \n");
            }
//        seat count
            if (!txtSeatCount.getText().isBlank()) {
                newfleet.setSeatCount(Integer.parseInt(txtSeatCount.getText()));
            } else {
                Error.append("Enter seat count \n");
            }
//        model number
            if (!txtModelNumber.getText().isBlank()) {
                newfleet.setModelNumber(txtModelNumber.getText());
            } else {
                Error.append("Enter Model Number \n");
            }
//        serial number
            if (!txtSerialNumber.getText().isBlank()) {
                for (Fleet f : fleetDirec.getFleet()) {
                    if (f.getSerialNumber() != null && f.getSerialNumber().equalsIgnoreCase(txtSerialNumber.getText())) {
                        Error.append("Serial Number already exists\n");
                    }
                }
                newfleet.setSerialNumber(txtSerialNumber.getText());
            } else {
                Error.append("Enter Serial Number \n");
            }
//        city
            if (!txtCity.getText().isBlank()) {
                newfleet.setCity(txtCity.getText());
            } else {
                Error.append("Enter City \n");
            }
//        availability
            if (chkboxAvailability.isSelected()) {
                newfleet.setAvailable("Yes");
            } else {
                newfleet.setAvailable("No");
            }
//        maintenance expiration
            if (chkboxExpired.isSelected()) {
                newfleet.setIsMaintenanceExpired("Yes");
            } else {
                newfleet.setIsMaintenanceExpired("No");
            }
//        set the last update info
            newfleet.setLastUpdatedFleetCatalog();
            if (Error.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Fleet information saved !");
            } else {
                JOptionPane.showMessageDialog(this, Error);
                fleetDirec.removeFleet(newfleet);
            }
        }
//        else {
//            if (Error.isEmpty()) {
//                JOptionPane.showMessageDialog(this, "User information saved");
//            } else {
//                JOptionPane.showMessageDialog(this, Error);
//            }
//        }
        txtModel.setText("");
        txtCarManufacturer.setText("");
        txtManufactureYear.setText("");
        txtSeatCount.setText("");
        txtModelNumber.setText("");
        txtSerialNumber.setText("");
        txtCity.setText("");
        chkboxAvailability.setSelected(false);
        chkboxExpired.setSelected(false);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtManufactureYearFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManufactureYearFocusLost
        // TODO add your handling code here:
        boolean isChar = false;
        if (!evt.isTemporary()) {
            String key = txtManufactureYear.getText();
            for (int i = 0; i < key.length(); i++) {
                if (!(key.charAt(i) >= '0'
                        && key.charAt(i) <= '9')) {
                    isChar = true;
                }
            }
            if (isChar) {
                JOptionPane.showMessageDialog(this, "enter only number");
            } else {
                if (key.length() != 4) {
                    JOptionPane.showMessageDialog(this, "enter valid year");
                }
            }
        }
    }//GEN-LAST:event_txtManufactureYearFocusLost

    private void txtSeatCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSeatCountFocusLost
        // TODO add your handling code here:
        boolean isChar = false;
        if (!evt.isTemporary()) {
            String key = txtSeatCount.getText();
            for (int i = 0; i < key.length(); i++) {
                if (!(key.charAt(i) >= '0'
                        && key.charAt(i) <= '9')) {
                    isChar = true;
                }
            }
            if (isChar) {
                JOptionPane.showMessageDialog(this, "enter only number");
            }
        }
    }//GEN-LAST:event_txtSeatCountFocusLost

    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        fleet.setFileLocation(filename);
        FileReader reader = null;
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader breader = new BufferedReader(reader);

        String line = null;
        try {
            line = breader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        int i = 0;
        while (line != null) {
            configArray[i] = line;
            try {
                // read next line
                line = breader.readLine();
            } catch (IOException ex) {
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (i == 8) {
                Fleet newfleet = fleetDirec.addFleet();
//                set model
                newfleet.setModel(configArray[0]);
                txtModel.setText(configArray[0]);
//                set manufacturer
                newfleet.setCarManufacturer(configArray[1]);
                txtCarManufacturer.setText(configArray[1]);
//                set manufacturer year
                newfleet.setCarManufactureYear(Integer.parseInt(configArray[2]));
                txtManufactureYear.setText(configArray[2]);
//                set seat count
                newfleet.setSeatCount(Integer.parseInt(configArray[3]));
                txtSeatCount.setText(configArray[3]);
//                set model number
                newfleet.setModelNumber(configArray[4]);
                txtModelNumber.setText(configArray[4]);
//                set serial number 
                newfleet.setSerialNumber(configArray[5]);
                txtSerialNumber.setText(configArray[5]);
//                set city 
                newfleet.setCity(configArray[6]);
                txtCity.setText(configArray[6]);
//                set availability
                newfleet.setAvailable(configArray[7]);
                if ("Yes".equals(configArray[7])) {
                    chkboxAvailability.setSelected(true);
                } else {
                    chkboxAvailability.setSelected(false);
                }
//                set expired certificate
                newfleet.setIsMaintenanceExpired(configArray[8]);
                if ("Yes".equals(configArray[8])) {
                    chkboxExpired.setSelected(true);
                } else {
                    chkboxExpired.setSelected(false);
                }
                newfleet.setLastUpdatedFleetCatalog();
                i = -1;
            }
            i++;
        }
        txtFileUploadLocation.setText(filename);
        JOptionPane.showMessageDialog(this, "Fleet information saved !");
        txtModel.setText("");
        txtCarManufacturer.setText("");
        txtManufactureYear.setText("");
        txtSeatCount.setText("");
        txtModelNumber.setText("");
        txtSerialNumber.setText("");
        txtCity.setText("");
        chkboxAvailability.setSelected(false);
        chkboxExpired.setSelected(false);
        txtFileUploadLocation.setText("");
    }//GEN-LAST:event_btnBrowseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox chkboxAvailability;
    private javax.swing.JCheckBox chkboxExpired;
    private javax.swing.JLabel lblAvaiablilty;
    private javax.swing.JLabel lblCarManufacturer;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreateCar;
    private javax.swing.JLabel lblFileLocation;
    private javax.swing.JLabel lblMaintenanceExpired;
    private javax.swing.JLabel lblMaufactureYear;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblModelNumber;
    private javax.swing.JLabel lblOr;
    private javax.swing.JLabel lblSeatCount;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTextField txtCarManufacturer;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFileUploadLocation;
    private javax.swing.JTextField txtManufactureYear;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSeatCount;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}
