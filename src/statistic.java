import java.sql.*;
import Preojct.ConnectionProvider;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class statistic extends javax.swing.JFrame {

    public statistic() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(440, 200));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) { loadData(); }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Statistics",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 153)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); jLabel1.setText("Issue Book");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); jLabel2.setText("Return Book");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); jLabel3.setText("Retrieve Book");

        jScrollPane1.setViewportView(jTable1);
        jScrollPane2.setViewportView(jTable2);
        jScrollPane3.setViewportView(jTable3);

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png")));
        jButton1.setText("Search");
        jButton1.addActionListener(evt -> { dispose(); new search().setVisible(true); });

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(129,129,129).addComponent(jButton1).addGap(49,49,49).addComponent(jButton2))
                    .addGroup(jPanel1Layout.createSequentialGroup().addGap(188,188,188).addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup().addGap(179,179,179).addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup().addGap(179,179,179).addComponent(jLabel3)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9,9,9).addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9,9,9).addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1).addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGap(20,20,20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));
        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadData() {
        Connection con = ConnectionProvider.getCon();
        if (con == null) {
            JOptionPane.showMessageDialog(this, "Database connection failed.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            Statement st = con.createStatement();
            // Fix: use 'No'/'Yes' to match what issueBook inserts (case-sensitive on some DBs)
            ResultSet rs = st.executeQuery(
                "SELECT i.studentID, s.studentName, i.bookID, b.name, i.issueDate, i.dueDate " +
                "FROM student s JOIN book b JOIN issue i " +
                "WHERE b.bookID = i.bookID AND s.studentID = i.studentID " +
                "AND i.returnBook = 'No' AND i.retrieve = 'No'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            ResultSet rs1 = st.executeQuery(
                "SELECT i.studentID, s.studentName, i.bookID, b.name, i.issueDate, i.dueDate " +
                "FROM student s JOIN book b JOIN issue i " +
                "WHERE b.bookID = i.bookID AND s.studentID = i.studentID " +
                "AND i.returnBook = 'Yes' AND i.retrieve = 'No'");
            jTable2.setModel(DbUtils.resultSetToTableModel(rs1));

            ResultSet rs2 = st.executeQuery(
                "SELECT i.studentID, s.studentName, i.bookID, b.name, i.issueDate, i.dueDate " +
                "FROM student s JOIN book b JOIN issue i " +
                "WHERE b.bookID = i.bookID AND s.studentID = i.studentID " +
                "AND i.returnBook = 'No' AND i.retrieve = 'Yes'");
            jTable3.setModel(DbUtils.resultSetToTableModel(rs2));
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new statistic().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1, jButton2;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1, jScrollPane2, jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1, jTable2, jTable3;
    // End of variables declaration//GEN-END:variables
}
