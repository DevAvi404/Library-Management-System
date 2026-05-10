import java.sql.*;
import Preojct.ConnectionProvider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class retrieveBook extends javax.swing.JFrame {

    public retrieveBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(490, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Retrieve Book",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 0, 36), new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel1.setText("Book ID");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel2.setText("Student ID");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel3.setText("Issue Date");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save-icon--1.png")));
        jButton1.setText("Save");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/red-x-mark-transparent-background-3.png")));
        jButton2.setText("Back");
        jButton2.addActionListener(evt -> { dispose(); new home().setVisible(true); });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1).addGap(44,44,44).addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3))
                        .addGap(33,33,33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18,18,18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18,18,18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3).addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18,18,18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1).addComponent(jButton2))
                .addGap(20,20,20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(62,62,62)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(28,28,28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String bookID    = jTextField1.getText().trim();
        String studentID = jTextField2.getText().trim();
        if (bookID.isEmpty() || studentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Book ID and Student ID are required.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Please select the Issue Date.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        String issueDate = dFormat.format(jDateChooser1.getDate());

        Connection con = ConnectionProvider.getCon();
        if (con == null) { JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE); return; }
        try {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE issue SET retrieve = 'Yes' WHERE studentID = ? AND bookID = ? AND issueDate = ?");
            ps.setString(1, studentID);
            ps.setString(2, bookID);
            ps.setString(3, issueDate);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Book retrieved successfully!");
                jTextField1.setText(""); jTextField2.setText("");
                jDateChooser1.setDate(null);
            } else {
                JOptionPane.showMessageDialog(this, "No matching record found.", "Not Found", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new retrieveBook().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1, jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1, jTextField2;
    // End of variables declaration//GEN-END:variables
}
