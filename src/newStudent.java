import java.sql.*;
import Preojct.ConnectionProvider;
import javax.swing.JOptionPane;

public class newStudent extends javax.swing.JFrame {

    public newStudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(490, 400));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Student",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel1.setText("Student ID");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel2.setText("Student Name");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel3.setText("Department");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel4.setText("Semester");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel5.setText("Section");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); jLabel6.setText("Email");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"CSE","EEE","BBA","LAW","ECO","ENG","MAT","SSG"}));
        jComboBox2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"1st","2nd","3rd","4th","5th","6th","7th","8th"}));
        jComboBox3.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"A","B","C","D","E","F"}));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save-icon--1.png")));
        jButton1.setText("Add");
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1).addComponent(jLabel2).addComponent(jLabel3)
                    .addComponent(jLabel4).addComponent(jLabel5).addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jButton2))
                    .addComponent(jTextField1).addComponent(jTextField2)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1).addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10,10,10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2).addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10,10,10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3).addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10,10,10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4).addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10,10,10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5).addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10,10,10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6).addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17,17,17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1).addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(19,19,19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE)));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String studentID   = jTextField1.getText().trim();
        String studentName = jTextField2.getText().trim();
        String department  = (String) jComboBox1.getSelectedItem();
        String semester    = (String) jComboBox2.getSelectedItem();
        String section     = (String) jComboBox3.getSelectedItem();
        String email       = jTextField3.getText().trim();

        if (studentID.isEmpty() || studentName.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Student ID, Name and Email are required.", "Validation", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Connection con = ConnectionProvider.getCon();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES (?, ?, ?, ?, ?, ?)");
            ps.setString(1, studentID);
            ps.setString(2, studentName);
            ps.setString(3, department);
            ps.setString(4, semester);
            ps.setString(5, section);
            ps.setString(6, email);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Student added successfully!");
            jTextField1.setText(""); jTextField2.setText(""); jTextField3.setText("");
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: Student ID already exists.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new newStudent().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1, jButton2;
    private javax.swing.JComboBox<String> jComboBox1, jComboBox2, jComboBox3;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1, jTextField2, jTextField3;
    // End of variables declaration//GEN-END:variables
}
