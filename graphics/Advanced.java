package graphics;

public class Advanced extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	
    public Advanced(String oxidation_states, String heat_capacity, String shear_modulus, String young_modulus, String bulk_modulus) {
        initComponents(oxidation_states, heat_capacity, shear_modulus, young_modulus, bulk_modulus);
    }

    private void initComponents(String oxidation_states, String heat_capacity, String shear_modulus, String young_modulus, String bulk_modulus) {

        oxidation_states1 = new javax.swing.JLabel();
        oxidation_states2 = new javax.swing.JLabel();
        heat_capacity1 = new javax.swing.JLabel();
        heat_capacity2 = new javax.swing.JLabel();
        shear_modulus1 = new javax.swing.JLabel();
        shear_modulus2 = new javax.swing.JLabel();
        young_modulus1 = new javax.swing.JLabel();
        young_modulus2 = new javax.swing.JLabel();
        bulk_modulus1 = new javax.swing.JLabel();
        bulk_modulus2 = new javax.swing.JLabel();

        oxidation_states1.setText("Common Oxidation States               :");

        oxidation_states2.setText(oxidation_states);

        heat_capacity1.setText("Molar Heat Capacity                          :");

        heat_capacity2.setText(heat_capacity);

        shear_modulus1.setText("Shear Modulus                                   :");

        shear_modulus2.setText(shear_modulus);

        young_modulus1.setText("Young Modulus                                  :");

        young_modulus2.setText(young_modulus);

        bulk_modulus1.setText("Bulk Modulus                                     :");

        bulk_modulus2.setText(bulk_modulus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bulk_modulus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(young_modulus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shear_modulus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heat_capacity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(heat_capacity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(shear_modulus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(young_modulus2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(bulk_modulus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(oxidation_states1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(oxidation_states2, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oxidation_states1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oxidation_states2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heat_capacity1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heat_capacity2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shear_modulus1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shear_modulus2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(young_modulus1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(young_modulus2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bulk_modulus1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bulk_modulus2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(254, Short.MAX_VALUE))
        );
    }
    private javax.swing.JLabel bulk_modulus1;
    private javax.swing.JLabel bulk_modulus2;
    private javax.swing.JLabel heat_capacity1;
    private javax.swing.JLabel heat_capacity2;
    private javax.swing.JLabel oxidation_states1;
    private javax.swing.JLabel oxidation_states2;
    private javax.swing.JLabel shear_modulus1;
    private javax.swing.JLabel shear_modulus2;
    private javax.swing.JLabel young_modulus1;
    private javax.swing.JLabel young_modulus2;
    // End of variables declaration//GEN-END:variables
}
