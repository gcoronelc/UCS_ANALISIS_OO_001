package view;
/**
 * @web http://jc-mouse.blogspot.com/
 * @author Mouse
 */
public final class vista extends javax.swing.JFrame {

    /** Creates new form vista */
    public vista() {
        initComponents();                
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        vtxt3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vtxt1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        vtxt2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cmdsumar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        vtxt3.setFont(new java.awt.Font("Tahoma", 1, 24));
        vtxt3.setText("0");
        vtxt3.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 10);
        getContentPane().add(vtxt3, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel2.setText("=");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        getContentPane().add(jLabel2, gridBagConstraints);

        vtxt1.setFont(new java.awt.Font("Tahoma", 1, 24));
        vtxt1.setText("0");
        vtxt1.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 20, 0);
        getContentPane().add(vtxt1, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel3.setText("+");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        getContentPane().add(jLabel3, gridBagConstraints);

        vtxt2.setFont(new java.awt.Font("Tahoma", 1, 24));
        vtxt2.setText("0");
        vtxt2.setPreferredSize(new java.awt.Dimension(60, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        getContentPane().add(vtxt2, gridBagConstraints);

        jMenu1.setText("File");

        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Herramientas");

        cmdsumar.setText("Sumar");
        cmdsumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsumarActionPerformed(evt);
            }
        });
        jMenu2.add(cmdsumar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdsumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdsumarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenuItem cmdsumar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    public javax.swing.JTextField vtxt1;
    public javax.swing.JTextField vtxt2;
    public javax.swing.JTextField vtxt3;
    // End of variables declaration//GEN-END:variables

}
