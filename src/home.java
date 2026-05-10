import javax.swing.JOptionPane;

public class home extends javax.swing.JFrame {

    public home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Home",
            javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
            javax.swing.border.TitledBorder.DEFAULT_POSITION,
            new java.awt.Font("Segoe UI", 0, 24), new java.awt.Color(0, 0, 102)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/New book.png")));
        jButton1.addActionListener(evt -> new newBook().setVisible(true));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/member-add-on-300x300.png")));
        jButton2.addActionListener(evt -> new newStudent().setVisible(true));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/issue.png")));
        jButton3.addActionListener(evt -> new issueBook().setVisible(true));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/return-book-1-560407.png")));
        jButton4.addActionListener(evt -> new returnBook().setVisible(true));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Statics.png")));
        jButton5.addActionListener(evt -> new statistic().setVisible(true));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/issue.png")));
        jButton6.addActionListener(evt -> new retrieveBook().setVisible(true));

        jButton7.setFont(new java.awt.Font("Segoe UI", 3, 12));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search.png")));
        jButton7.setText("Search");
        jButton7.addActionListener(evt -> new search().setVisible(true));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 10));
        jLabel2.setText("New Book");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 10));
        jLabel3.setText("New Student");
        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 10));
        jLabel4.setText("Issue Books");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 10));
        jLabel5.setText("Return Books");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 10));
        jLabel6.setText("Statistics");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 10));
        jLabel7.setText("Retrieve");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6).addComponent(jLabel2)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3).addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4).addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jButton6).addGap(30, 30, 30))
                    .addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6).addComponent(jButton5))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(210, 210, 210).addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2).addComponent(jButton1).addComponent(jButton4)
                    .addComponent(jButton5).addComponent(jButton3).addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3).addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5).addComponent(jLabel7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Welcome to Library Management System");

        jMenu1.setText("About");
        jMenuItem1.setText("About Us");
        jMenuItem1.addActionListener(evt ->
            JOptionPane.showMessageDialog(null, "Library Management System\nBuilt with Java Swing + MySQL"));
        jMenu1.add(jMenuItem1);
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Exit");
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(evt -> { dispose(); new login().setVisible(true); });
        jMenu2.add(jMenuItem2);
        jMenuItem3.setText("Exit");
        jMenuItem3.addActionListener(evt -> System.exit(0));
        jMenu2.add(jMenuItem3);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1).addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6, jButton7;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7;
    private javax.swing.JMenu jMenu1, jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1, jMenuItem2, jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
