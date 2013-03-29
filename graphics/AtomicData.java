
package graphics;

public class AtomicData extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
	public AtomicData(String atomic_radius, String electron_affinity, String ionisation_energy, String covalent_radius, String electronegativity) {
        initComponents(atomic_radius, electron_affinity, ionisation_energy, covalent_radius, electronegativity);
    }

    private void initComponents(String atomic_radius, String electron_affinity, String ionisation_energy, String covalent_radius, String electronegativity) {

        atomic_radius1 = new javax.swing.JLabel();
        atomic_radius2 = new javax.swing.JLabel();
        electron_affinity1 = new javax.swing.JLabel();
        electron_affinity2 = new javax.swing.JLabel();
        ionisation_energy1 = new javax.swing.JLabel();
        ionisation_energy2 = new javax.swing.JLabel();
        covalent_radius1 = new javax.swing.JLabel();
        covalent_radius2 = new javax.swing.JLabel();
        electronegativity1 = new javax.swing.JLabel();
        electronegativity2 = new javax.swing.JLabel();

        atomic_radius1.setText("Atomic Radius                                   :");

        atomic_radius2.setText(atomic_radius);

        electron_affinity1.setText("Electron Affinity                                :");

        electron_affinity2.setText(electron_affinity);

        ionisation_energy1.setText("Ionistion Energy                                :");

        ionisation_energy2.setText(ionisation_energy);

        covalent_radius1.setText("Covalent Radius                                :");

        covalent_radius2.setText(covalent_radius);

        electronegativity1.setText("Electronegativity                               :");

        electronegativity2.setText(electronegativity);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(electronegativity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(covalent_radius1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ionisation_energy1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(electron_affinity1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atomic_radius1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atomic_radius2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(electron_affinity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ionisation_energy2, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(covalent_radius2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(electronegativity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(atomic_radius2, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(atomic_radius1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(electron_affinity1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(electron_affinity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ionisation_energy1, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(ionisation_energy2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(covalent_radius1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(covalent_radius2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(electronegativity1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(electronegativity2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel atomic_radius1;
    private javax.swing.JLabel atomic_radius2;
    private javax.swing.JLabel covalent_radius1;
    private javax.swing.JLabel covalent_radius2;
    private javax.swing.JLabel electron_affinity1;
    private javax.swing.JLabel electron_affinity2;
    private javax.swing.JLabel electronegativity1;
    private javax.swing.JLabel electronegativity2;
    private javax.swing.JLabel ionisation_energy1;
    private javax.swing.JLabel ionisation_energy2;
    // End of variables declaration//GEN-END:variables
}
