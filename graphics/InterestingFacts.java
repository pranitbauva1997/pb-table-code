package graphics;

public class InterestingFacts extends javax.swing.JPanel {

	private static final long serialVersionUID = 1L;
    
	public InterestingFacts(String appearences, String uses, String biological_role, String natural_abundance) {
        initComponents(appearences, uses, biological_role, natural_abundance);
    }
    private void initComponents(String appearences, String uses, String biological_role, String natural_abundance) {

        appearences1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appearences2 = new javax.swing.JTextArea();
        uses1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uses2 = new javax.swing.JTextArea();
        biological_role1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        biological_role2 = new javax.swing.JTextArea();
        natural_abundance1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        natural_abundance2 = new javax.swing.JTextArea();

        appearences1.setText("Appearences                           :");

        appearences2.setEditable(false);
        appearences2.setColumns(20);
        appearences2.setLineWrap(true);
        appearences2.setRows(5);
        appearences2.setToolTipText("Appearences");
        appearences2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(appearences2);
        appearences2.setText(appearences);

        uses1.setText("Uses                                         :");

        uses2.setEditable(false);
        uses2.setColumns(20);
        uses2.setLineWrap(true);
        uses2.setRows(5);
        uses2.setToolTipText("Uses");
        jScrollPane2.setViewportView(uses2);
        uses2.setText(uses);

        biological_role1.setText("Biological Role                         :");

        biological_role2.setColumns(20);
        biological_role2.setLineWrap(true);
        biological_role2.setRows(5);
        biological_role2.setToolTipText("Biological Role");
        jScrollPane3.setViewportView(biological_role2);
        biological_role2.setText(biological_role);

        natural_abundance1.setText("Natural Abundance                   :");

        natural_abundance2.setEditable(false);
        natural_abundance2.setColumns(20);
        natural_abundance2.setLineWrap(true);
        natural_abundance2.setRows(5);
        natural_abundance2.setToolTipText("Natural Abundance");
        jScrollPane4.setViewportView(natural_abundance2);
        natural_abundance2.setText(natural_abundance);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(natural_abundance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(biological_role1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uses1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(appearences1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(appearences1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uses1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(biological_role1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(natural_abundance1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appearences1;
    private javax.swing.JTextArea appearences2;
    private javax.swing.JLabel biological_role1;
    private javax.swing.JTextArea biological_role2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel natural_abundance1;
    private javax.swing.JTextArea natural_abundance2;
    private javax.swing.JLabel uses1;
    private javax.swing.JTextArea uses2;
    // End of variables declaration//GEN-END:variables
}
