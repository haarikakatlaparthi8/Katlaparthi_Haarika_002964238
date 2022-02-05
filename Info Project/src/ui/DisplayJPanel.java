/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Product;
import model.ServiceRecordHistory;
import model.ServiceRecords;

/**
 *
 * @author haarikakatlaparthi
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
    
    Product product;
    ServiceRecordHistory history1;
    
    public DisplayJPanel(Product product,ServiceRecordHistory history1) {
        initComponents();
        this.product=product;
        displayProduct();
        this.history1=history1;
      
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

        jPanel1 = new javax.swing.JPanel();
        lblHeading1 = new javax.swing.JLabel();
        lblHeading2 = new javax.swing.JLabel();
        lblBrand = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblColor = new javax.swing.JLabel();
        lblEngineNo = new javax.swing.JLabel();
        lblSeatNo = new javax.swing.JLabel();
        lblLicenseNo = new javax.swing.JLabel();
        lblHeading3 = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        lblOwnerEmail = new javax.swing.JLabel();
        lblOwnerSSN = new javax.swing.JLabel();
        lblOwnerPhone = new javax.swing.JLabel();
        lblOwnerLicenseNo = new javax.swing.JLabel();
        lblOwnerAddress = new javax.swing.JLabel();
        lblWarrantyYear = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtLicensePlateNumber = new javax.swing.JTextField();
        txtEngineNumber = new javax.swing.JTextField();
        txtNumberSeats = new javax.swing.JTextField();
        txtOwnerName = new javax.swing.JTextField();
        txtOwnerEmail = new javax.swing.JTextField();
        txtOwnerSSN = new javax.swing.JTextField();
        txtOwnerPhone = new javax.swing.JTextField();
        txtOwnerLicenseNo = new javax.swing.JTextField();
        txtOwnerAddress = new javax.swing.JTextField();
        txtWarrantyYear = new javax.swing.JTextField();
        lblHeading4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lRecordsTable = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblHeading5 = new javax.swing.JLabel();
        lblServiceRecords1 = new javax.swing.JLabel();
        txtServiceDate = new javax.swing.JTextField();
        lblServiceRecords2 = new javax.swing.JLabel();
        txtCarMileage = new javax.swing.JTextField();
        lblServiceRecords3 = new javax.swing.JLabel();
        txtChangeOil = new javax.swing.JTextField();
        lblServiceRecords4 = new javax.swing.JLabel();
        txtChangeTires = new javax.swing.JTextField();
        lblServiceRecords5 = new javax.swing.JLabel();
        txtChangeOilFilter = new javax.swing.JTextField();
        lblServiceRecords6 = new javax.swing.JLabel();
        txtRotateTires = new javax.swing.JTextField();
        txtOtherService = new javax.swing.JTextField();
        lblServiceRecords7 = new javax.swing.JLabel();
        lblServiceRecords8 = new javax.swing.JLabel();
        lblServiceRecords9 = new javax.swing.JLabel();
        txtTotalServiceCost = new javax.swing.JTextField();
        txtChangeAirFilter = new javax.swing.JTextField();
        jLabelImage = new javax.swing.JLabel();

        jPanel1.setPreferredSize(new java.awt.Dimension(753, 837));

        lblHeading1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblHeading1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading1.setText("Display car profile");

        lblHeading2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeading2.setText("Car Details:");

        lblBrand.setText("Brand:");

        lblModel.setText("Model:");

        lblYear.setText("Year:");

        lblColor.setText("Color:");

        lblEngineNo.setText("Engine Number:");

        lblSeatNo.setText("Number of Seats:");

        lblLicenseNo.setText("License Plate number:");

        lblHeading3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeading3.setText("Owner Details:");

        lblOwnerName.setText("Name:");

        lblOwnerEmail.setText("Email:");

        lblOwnerSSN.setText("SSN Number:");

        lblOwnerPhone.setText("Phone:");

        lblOwnerLicenseNo.setText("License Number:");

        lblOwnerAddress.setText("Address:");

        lblWarrantyYear.setText("Warranty Year:");

        lblHeading4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeading4.setText("Service Records:");

        lRecordsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Mileage", "Change Oil", "Change Tires", "Change Oil filter", "Rotate Tires", "Change Air Filters", "Other Services", "Total Cost"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(lRecordsTable);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblHeading5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeading5.setText("Service Records:");

        lblServiceRecords1.setText("Service Date:");

        lblServiceRecords2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblServiceRecords2.setText("Car Mileage");
        lblServiceRecords2.setToolTipText("Car Mileage on the date of service:");
        lblServiceRecords2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblServiceRecords3.setText("Change Oil: Y/N");

        lblServiceRecords4.setText("Change Tires: Y/N");

        lblServiceRecords5.setText("Change Oil Filter: Y/N");

        lblServiceRecords6.setText("Rotate Tires: Y/N");

        lblServiceRecords7.setText("Any other Service:");

        lblServiceRecords8.setText("Change Air Filter: Y/N");

        lblServiceRecords9.setText("Total Service Cost:");

        jLabelImage.setText("Car Image");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblLicenseNo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtLicensePlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblColor)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblBrand)
                                                    .addComponent(lblHeading2))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblEngineNo)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblOwnerName)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblOwnerSSN)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblOwnerEmail)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtOwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblWarrantyYear)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblModel)
                                                    .addComponent(lblOwnerLicenseNo)
                                                    .addComponent(lblYear)
                                                    .addComponent(lblOwnerPhone)
                                                    .addComponent(lblSeatNo)
                                                    .addComponent(lblOwnerAddress))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtOwnerLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(txtNumberSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(227, 227, 227)
                                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblHeading3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHeading4, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(10, 10, 10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblServiceRecords9)
                                        .addGap(105, 105, 105)
                                        .addComponent(txtTotalServiceCost, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblServiceRecords5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(219, 219, 219)
                                            .addComponent(txtChangeOilFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblServiceRecords3)
                                            .addGap(117, 117, 117)
                                            .addComponent(txtChangeOil, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblServiceRecords1)
                                            .addGap(138, 138, 138)
                                            .addComponent(txtServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblHeading5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblServiceRecords8)
                                        .addGap(84, 84, 84)
                                        .addComponent(txtChangeAirFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblServiceRecords2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblServiceRecords4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCarMileage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtChangeTires, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblServiceRecords6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtRotateTires, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblServiceRecords7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtOtherService, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelImage)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeading1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnView});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeading1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumberSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSeatNo))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHeading2)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrand)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblColor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEngineNo)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicenseNo)
                            .addComponent(txtLicensePlateNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblHeading3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerName)
                    .addComponent(lblOwnerPhone)
                    .addComponent(txtOwnerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerEmail)
                    .addComponent(txtOwnerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerLicenseNo)
                    .addComponent(txtOwnerLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOwnerSSN)
                    .addComponent(txtOwnerSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOwnerAddress)
                    .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWarrantyYear)
                    .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(lblHeading4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete))
                .addGap(9, 9, 9)
                .addComponent(lblHeading5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServiceDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords1)
                    .addComponent(txtCarMileage, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChangeOil, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords3)
                    .addComponent(txtChangeTires, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChangeOilFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords5)
                    .addComponent(lblServiceRecords6)
                    .addComponent(txtRotateTires, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceRecords8)
                    .addComponent(txtChangeAirFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords7)
                    .addComponent(txtOtherService, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotalServiceCost, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceRecords9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelImage)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDelete, btnView});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 757, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = lRecordsTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;

        }
        DefaultTableModel model= (DefaultTableModel) lRecordsTable.getModel();
        ServiceRecords selectedRecord = (ServiceRecords) model.getValueAt(selectedRowIndex, 0);

        history1.deleteRecords(selectedRecord);

        JOptionPane.showMessageDialog(this, "Service record deleted");

        populateTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = lRecordsTable.getSelectedRow();

        if (selectedRowIndex<0) {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;

        }
        DefaultTableModel model= (DefaultTableModel) lRecordsTable.getModel();
        ServiceRecords selectedRecord = (ServiceRecords) model.getValueAt(selectedRowIndex, 0);
        
  txtServiceDate.setText(selectedRecord.getServiceDate());
  txtCarMileage.setText(String.valueOf(selectedRecord.getCarMileage()));
  txtChangeOil.setText(selectedRecord.getCarChangeOil());
  txtChangeTires.setText(selectedRecord.getCarChangeTires());
  txtChangeOilFilter.setText(selectedRecord.getCarChangeOilFilter());
  txtRotateTires.setText(selectedRecord.getCarRotateTires());
  txtChangeAirFilter.setText(selectedRecord.getCarAirFilter());
  txtOtherService.setText(selectedRecord.getOtherService());
  txtTotalServiceCost.setText(String.valueOf(selectedRecord.getTotalServiceCost()));
  
  
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable lRecordsTable;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEngineNo;
    private javax.swing.JLabel lblHeading1;
    private javax.swing.JLabel lblHeading2;
    private javax.swing.JLabel lblHeading3;
    private javax.swing.JLabel lblHeading4;
    private javax.swing.JLabel lblHeading5;
    private javax.swing.JLabel lblLicenseNo;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerEmail;
    private javax.swing.JLabel lblOwnerLicenseNo;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerPhone;
    private javax.swing.JLabel lblOwnerSSN;
    private javax.swing.JLabel lblSeatNo;
    private javax.swing.JLabel lblServiceRecords1;
    private javax.swing.JLabel lblServiceRecords2;
    private javax.swing.JLabel lblServiceRecords3;
    private javax.swing.JLabel lblServiceRecords4;
    private javax.swing.JLabel lblServiceRecords5;
    private javax.swing.JLabel lblServiceRecords6;
    private javax.swing.JLabel lblServiceRecords7;
    private javax.swing.JLabel lblServiceRecords8;
    private javax.swing.JLabel lblServiceRecords9;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCarMileage;
    private javax.swing.JTextField txtChangeAirFilter;
    private javax.swing.JTextField txtChangeOil;
    private javax.swing.JTextField txtChangeOilFilter;
    private javax.swing.JTextField txtChangeTires;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNumber;
    private javax.swing.JTextField txtLicensePlateNumber;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNumberSeats;
    private javax.swing.JTextField txtOtherService;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerEmail;
    private javax.swing.JTextField txtOwnerLicenseNo;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerPhone;
    private javax.swing.JTextField txtOwnerSSN;
    private javax.swing.JTextField txtRotateTires;
    private javax.swing.JTextField txtServiceDate;
    private javax.swing.JTextField txtTotalServiceCost;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    private void displayProduct() {
        
        txtBrand.setText(product.getBrand());
        txtModel.setText(product.getModel());
        txtColor.setText(product.getColor());
        txtYear.setText(product.getYear());
        txtEngineNumber.setText(product.getEngine_No());
        txtNumberSeats.setText(product.getSeats_number());
        txtLicensePlateNumber.setText(product.getLicense_plates());
        txtOwnerName.setText(product.getOwner_Name());
        txtOwnerPhone.setText(product.getOwner_Telephone_numbers());
        txtOwnerEmail.setText(product.getOwner_Email_addresses());
        txtOwnerLicenseNo.setText(product.getOwner_Driver_License());
        txtOwnerSSN.setText(product.getOwner_SSN());
        txtOwnerAddress.setText(product.getOwner_address());
        txtWarrantyYear.setText(product.getWarranty_Year());
        //txtUploadPhoto.setText(product.getPhoto());
        jLabelImage.setIcon(product.getPhoto());
        
    }

    private void populateTable() {
        
        DefaultTableModel model= (DefaultTableModel) lRecordsTable.getModel();
        model.setRowCount(0);
        
        for(ServiceRecords sr: history1.getHistory()){
            
            Object[] row= new Object[10];
            row[0]= sr;
            row[1]= sr.getCarMileage();
            row[2]= sr.getCarChangeOil();
            row[3]= sr.getCarChangeTires();
            row[4]= sr.getCarChangeOilFilter();
            row[5]= sr.getCarRotateTires();
            row[6]= sr.getCarAirFilter();
            row[7]= sr.getOtherService();
            row[8]= sr.getTotalServiceCost();
          
          model.addRow(row);
        }
        
    }
}
