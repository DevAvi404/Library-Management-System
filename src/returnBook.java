import java.sql.*;
import Preojct.ConnectionProvider;
import javax.swing.JOptionPane;

public class returnBook extends javax.swing.JFrame {

    public returnBook() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(490, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Return Book",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 0, 36), new java.awt.Color(0, 51, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel1.setText("Book ID");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel2.setText("Student ID");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel3.setText("Issue Date");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel4.setText("Due Date");

        jTextField3.setEditable(false);
        jTextField4.setEditable(false);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png")));
        jButton3.addActionListener(evt -> jButton3ActionPerformed(evt));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return book png.png")));
        jButton1.setText("Return");
        jButton1.addActionListener(evt -> jButton1ActionPerformed(evt));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/red-x-mark-transparent-background-3.png")));
        jButton2.setText("Close");
        jButton2.addActionListener(evt -> { dispose(); new home().setVisible(true); });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42,42,42).addComponent(jButton1).addGap(43,43,43).addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4))
                        .addGap(33,33,33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1).addComponent(jTextField2)
                            .addComponent(jTextField3).addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
                        .addGap(18,18,18).addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18,18,18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18,18,18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3).addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18,18,18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4).addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2).addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(40,40,40)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(28,28,28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        String bookID    = jTextField1.getText().trim();
        String studentID = jTextField2.getText().trim();
        if (bookID.isEmpty() || studentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Book ID and Student ID first.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Connection con = ConnectionProvider.getCon();
        if (con == null) { JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE); return; }
        try {
            PreparedStatement ps = con.prepareStatement(
                "SELECT * FROM issue WHERE bookID = ? AND studentID = ? AND returnBook = 'No'");
            ps.setString(1, bookID);
            ps.setString(2, studentID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                jTextField3.setText(rs.getString(3)); // issueDate
                jTextField4.setText(rs.getString(4)); // dueDate
                jTextField1.setEditable(false);
                jTextField2.setEditable(false);
            } else {
                JOptionPane.showMessageDialog(this, "No active issue found for this book and student.", "Not Found", JOptionPane.WARNING_MESSAGE);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String bookID    = jTextField1.getText().trim();
        String studentID = jTextField2.getText().trim();
        if (bookID.isEmpty() || studentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please search for the book issue record first.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Connection con = ConnectionProvider.getCon();
        if (con == null) { JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE); return; }
        try {
            PreparedStatement ps = con.prepareStatement(
                "UPDATE issue SET returnBook = 'Yes' WHERE studentID = ? AND bookID = ? AND returnBook = 'No'");
            ps.setString(1, studentID);
            ps.setString(2, bookID);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(this, "Book returned successfully!");
                dispose();
                new returnBook().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "No matching issue record found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new returnBook().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1, jButton2, jButton3;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1, jTextField2, jTextField3, jTextField4;
    // End of variables declaration//GEN-END:variables
}
