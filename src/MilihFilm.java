
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;



/**
 *
 * @author SETIAWAN AK
 */
public final class MilihFilm extends javax.swing.JFrame {

    /**
     * @return the judulFilm
     */
    static String judulFilm;
    public String getJudulFilm() {
        return judulFilm;
    }

    /**
     * @param judulFilm the judulFilm to set
     */
    public void setJudulFilm(String judulFilm) {
        this.judulFilm = judulFilm;
    }

    /**
     * Creates new form MilihFilm
     */
    
    
    public MilihFilm() {
        initComponents();
        this.setLocationRelativeTo(null);
        tanggal_jam_sekarang();
        
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanelMin1 = new javax.swing.JPanel();
        jLabelLogin1 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabelClose1 = new javax.swing.JLabel();
        jlabel_filmLN1 = new javax.swing.JLabel();
        jlabel_filmLN2 = new javax.swing.JLabel();
        jlabel_filmLN3 = new javax.swing.JLabel();
        jlabel_filmLN4 = new javax.swing.JLabel();
        Judul = new javax.swing.JLabel();
        Variasi1 = new javax.swing.JLabel();
        Today = new javax.swing.JLabel();
        hari = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jam = new javax.swing.JLabel();
        waktu = new javax.swing.JLabel();
        Variasi2 = new javax.swing.JLabel();
        jLabel_filmDN1 = new javax.swing.JLabel();
        jLabel_filmDN2 = new javax.swing.JLabel();
        jLabel_filmDN3 = new javax.swing.JLabel();
        jLabel_filmDN4 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMin1.setBackground(new java.awt.Color(255, 153, 0));
        jPanelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelLogin1.setFont(new java.awt.Font("OCR A Extended", 1, 20)); // NOI18N
        jLabelLogin1.setText("SILAHKAN PILIH FILM YANG AKAN ANDA TONTON :");

        jLabelMin1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelMin1.setText("-");
        jLabelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMin1MouseClicked(evt);
            }
        });

        jLabelClose1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelClose1.setText("x");
        jLabelClose1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelClose1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelMin1Layout = new javax.swing.GroupLayout(jPanelMin1);
        jPanelMin1.setLayout(jPanelMin1Layout);
        jPanelMin1Layout.setHorizontalGroup(
            jPanelMin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMin1Layout.createSequentialGroup()
                .addComponent(jLabelLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                .addComponent(jLabelMin1)
                .addGap(28, 28, 28)
                .addComponent(jLabelClose1)
                .addContainerGap())
        );
        jPanelMin1Layout.setVerticalGroup(
            jPanelMin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMin1Layout.createSequentialGroup()
                .addGroup(jPanelMin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMin1)
                    .addComponent(jLabelClose1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabelLogin1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jlabel_filmLN1.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_filmLN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.jpg"))); // NOI18N
        jlabel_filmLN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_filmLN1MouseClicked(evt);
            }
        });
        getContentPane().add(jlabel_filmLN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 90, -1, 220));

        jlabel_filmLN2.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_filmLN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/transformers_universe__bumblebee_movie_poster_by_arkhamnatic-dbhwcng.png"))); // NOI18N
        jlabel_filmLN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_filmLN2MouseClicked(evt);
            }
        });
        getContentPane().add(jlabel_filmLN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(789, 100, -1, 220));

        jlabel_filmLN3.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_filmLN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/incarnate-movie-poster.jpg"))); // NOI18N
        jlabel_filmLN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_filmLN3MouseClicked(evt);
            }
        });
        getContentPane().add(jlabel_filmLN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, 280));

        jlabel_filmLN4.setForeground(new java.awt.Color(255, 255, 255));
        jlabel_filmLN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/84ad725505ef89c2fea3fc66fac1ebec.jpg"))); // NOI18N
        jlabel_filmLN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabel_filmLN4MouseClicked(evt);
            }
        });
        getContentPane().add(jlabel_filmLN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 330, 190, 260));

        Judul.setFont(new java.awt.Font("OCR A Extended", 3, 20)); // NOI18N
        Judul.setForeground(new java.awt.Color(240, 240, 240));
        Judul.setText("CGV BLITZMEGAPLEX");
        getContentPane().add(Judul, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 240, 20));

        Variasi1.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        Variasi1.setForeground(new java.awt.Color(240, 240, 240));
        Variasi1.setText("~~~~~~~~~~~~~~~~");
        getContentPane().add(Variasi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 210, -1));

        Today.setFont(new java.awt.Font("Tahoma", 2, 20)); // NOI18N
        Today.setForeground(new java.awt.Color(240, 240, 240));
        Today.setText("TODAY");
        getContentPane().add(Today, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 80, -1));

        hari.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        hari.setForeground(new java.awt.Color(240, 240, 240));
        hari.setText("TANGGAL :");
        getContentPane().add(hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 130, -1));

        tgl.setFont(new java.awt.Font("DialogInput", 1, 20)); // NOI18N
        tgl.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(tgl, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 160, 40));

        jam.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jam.setForeground(new java.awt.Color(240, 240, 240));
        jam.setText("JAM :");
        getContentPane().add(jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 650, 70, 40));

        waktu.setFont(new java.awt.Font("Dialog", 3, 20)); // NOI18N
        waktu.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 160, 40));

        Variasi2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Variasi2.setForeground(new java.awt.Color(240, 240, 240));
        Variasi2.setText("~~~~~~~~~~~~~~~~");
        getContentPane().add(Variasi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 220, -1));

        jLabel_filmDN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DreadOut-e1543802218685_1.jpg"))); // NOI18N
        jLabel_filmDN1.setText("jLabel1");
        jLabel_filmDN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_filmDN1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel_filmDN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, -1));

        jLabel_filmDN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled.png"))); // NOI18N
        jLabel_filmDN2.setText("jLabel1");
        jLabel_filmDN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_filmDN2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel_filmDN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 190, 270));

        jLabel_filmDN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MV5BYjgzZmQ2NWItZjkxZC00ODA3LTljZGUtNDk5ZWRmYzY3NWRjXkEyXkFqcGdeQXVyMzYzOTYxNzM@._V1_.jpg"))); // NOI18N
        jLabel_filmDN3.setText("jLabel1");
        jLabel_filmDN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_filmDN3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel_filmDN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, 240));

        jLabel_filmDN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/154338545978878_300x430.jpg"))); // NOI18N
        jLabel_filmDN4.setText("jLabel1");
        jLabel_filmDN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_filmDN4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel_filmDN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 180, 260));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photo-1489599849927-2ee91cede3ba.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 990, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jlabel_filmLN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_filmLN1MouseClicked
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        setJudulFilm("AQUAMAN");
    }//GEN-LAST:event_jlabel_filmLN1MouseClicked

    private void jlabel_filmLN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_filmLN2MouseClicked
        setJudulFilm("BUMBLEBEE");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jlabel_filmLN2MouseClicked

    private void jlabel_filmLN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_filmLN3MouseClicked
        setJudulFilm("INCARNATE");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jlabel_filmLN3MouseClicked

    private void jlabel_filmLN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabel_filmLN4MouseClicked
        setJudulFilm("RALPH BREAKS THE INTERNET");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jlabel_filmLN4MouseClicked

    private void jLabel_filmDN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filmDN1MouseClicked
        setJudulFilm("DREAD OUT");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_filmDN1MouseClicked

    private void jLabel_filmDN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filmDN3MouseClicked
        setJudulFilm("MILLY & MAMET");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_filmDN3MouseClicked

    private void jLabel_filmDN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filmDN2MouseClicked
        setJudulFilm("ASAL KAU BAHAGIA");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_filmDN2MouseClicked

    private void jLabel_filmDN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_filmDN4MouseClicked
        setJudulFilm("KELUARGA CEMARA");
        TipeFilm Tf = new TipeFilm();
        Tf.setVisible(true);
        Tf.pack();
        Tf.setLocationRelativeTo(null);
        Tf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jLabel_filmDN4MouseClicked

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MilihFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MilihFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MilihFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MilihFilm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MilihFilm().setVisible(true);
            }
        });
    }
    
    public void tanggal_jam_sekarang(){
    Thread p=new Thread(){
    public void run(){
    for(;;){
    
        
        Calendar cal = new GregorianCalendar();
        int hari = cal.get(Calendar.DAY_OF_MONTH);
        int bulan = cal.get(Calendar.MONTH);
        int tahun = cal.get(Calendar.YEAR);
        tgl.setText(hari+"-"+(bulan+1)+"-"+tahun);
        
        int jam = cal.get(Calendar.HOUR);
        int menit = cal.get(Calendar.MINUTE);
        int detik = cal.get(Calendar.SECOND);
        int AM_PM = cal.get(Calendar.AM_PM);
        
        String day_night = "";
        if (AM_PM == 1)
        {
            day_night = "PM";
        }
        else
        {
            day_night = "AM";
        }
        String waktu1 = jam+":"+menit+":"+detik+""+day_night;
        waktu.setText(waktu1);
        
        try{
        sleep(1000);
        }catch(InterruptedException ex){
            Logger.getLogger(MilihFilm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    }
    };
    p.start();
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Judul;
    private javax.swing.JLabel Today;
    private javax.swing.JLabel Variasi1;
    private javax.swing.JLabel Variasi2;
    private javax.swing.JLabel hari;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelLogin1;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JLabel jLabel_filmDN1;
    private javax.swing.JLabel jLabel_filmDN2;
    private javax.swing.JLabel jLabel_filmDN3;
    private javax.swing.JLabel jLabel_filmDN4;
    private javax.swing.JPanel jPanelMin1;
    private javax.swing.JLabel jam;
    private javax.swing.JLabel jlabel_filmLN1;
    private javax.swing.JLabel jlabel_filmLN2;
    private javax.swing.JLabel jlabel_filmLN3;
    private javax.swing.JLabel jlabel_filmLN4;
    private javax.swing.JLabel tgl;
    private javax.swing.JLabel waktu;
    // End of variables declaration//GEN-END:variables
}
