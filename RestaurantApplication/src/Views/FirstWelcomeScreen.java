package Views;

public class FirstWelcomeScreen extends javax.swing.JFrame {

    public FirstWelcomeScreen() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Loadingbar = new javax.swing.JProgressBar();
        WelcomeTitle = new javax.swing.JLabel();
        DevelopersNames = new javax.swing.JLabel();
        LoadingPercentage = new javax.swing.JLabel();
        LoadingPan = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Loadingbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 210, 20));

        WelcomeTitle.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        WelcomeTitle.setText("Welcome to our Restaurant Management System");
        getContentPane().add(WelcomeTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 470, 70));

        DevelopersNames.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        DevelopersNames.setText("Developed by : Seif Reda, Sayed Hamdy , Shaimaa Mohamed , Sayed Anwar, Ali Ramadan and Abdelrahman Ashraf");
        getContentPane().add(DevelopersNames, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 530, -1));

        LoadingPercentage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LoadingPercentage.setText("jLabel1");
        getContentPane().add(LoadingPercentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, 20));

        LoadingPan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loading.gif"))); // NOI18N
        LoadingPan.setText("jLabel2");
        getContentPane().add(LoadingPan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DevelopersNames;
    public javax.swing.JLabel LoadingPan;
    public javax.swing.JLabel LoadingPercentage;
    public javax.swing.JProgressBar Loadingbar;
    private javax.swing.JLabel WelcomeTitle;
    // End of variables declaration//GEN-END:variables
}
