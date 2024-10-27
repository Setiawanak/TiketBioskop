
import java.awt.Color;
import javafx.scene.control.RadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;




/**
 *
 * @author Prakasz
 */
public class JamTayang extends javax.swing.JFrame {

    /**
     * @return the harga
     */
    public static int getHarga() {
        return harga;
    }

    /**
     * @param aHarga the harga to set
     */
    public static void setHarga(int aHarga) {
        harga = aHarga;
    }

    /**
     * @return the hari
     */
    static TipeFilm tip = new TipeFilm();
    
    public static String getHari() {
        return hari;
    }

    /**
     * @param aHari the hari to set
     */
    public static void setHari(String aHari) {
        hari = aHari;
    }

    /**
     * @return the jam
     */
    public static String getJam() {
        return jam;
    }

    /**
     * @param aJam the jam to set
     */
    public static void setJam(String aJam) {
        jam = aJam;
    }
    /**
     * Creates new form NewJFrame
     */
    static String hari;
    /**
     * Creates new form NewJFrame
     */
    static String jam;
    
    static int harga;
    static String bangku;
    
    public JamTayang() {
        initComponents();
        ButtonGroup grouphari = new ButtonGroup();
        ButtonGroup groupjam = new ButtonGroup();
        ButtonGroup groupbangku = new ButtonGroup();
        
        groupbangku.add(A1);
        groupbangku.add(A2);
        groupbangku.add(A3);
        groupbangku.add(A4);
        groupbangku.add(A5);
        groupbangku.add(A6);
        groupbangku.add(A7);
        groupbangku.add(A8);
        groupbangku.add(A9);
        groupbangku.add(A10);
        
        grouphari.add(Senin);
        grouphari.add(Selasa);
        grouphari.add(Rabu);
        grouphari.add(Kamis);
        grouphari.add(Jumat);
        grouphari.add(Sabtu);
        grouphari.add(Minggu);
        groupjam.add(jRadioButton_Jamke1);
        groupjam.add(jRadioButton_Jamke2);
        groupjam.add(jRadioButton_Jamke3);
        groupjam.add(jRadioButton_Jamke4);
        
        this.setLocationRelativeTo(null);
        GroupBox3.setVisible(false);
        jPanel_JT.setVisible(false);
        //GroupBox3.Visible = ComboBox_Row.Visible = ComboBox_Seat.Visible = false ;
        //jRadioButton_Senin.Checked = jRadioButton_Selasa.checked = jRadioButton_Rabu.checked =jRadioButton_kamis.checked = jRadioButton_jumat.checked = jRadioButton_sabtu.checked = jRadioButton_minggu.checked = false ;
        //jRadioButton_Jamke1.Checked = jRadioButton_Jamke2.checked = jRadioButton_Jamke3.checked = jRadioButton_Jamke4.checked = false;
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_hari = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Senin = new javax.swing.JRadioButton();
        Selasa = new javax.swing.JRadioButton();
        Rabu = new javax.swing.JRadioButton();
        Kamis = new javax.swing.JRadioButton();
        Jumat = new javax.swing.JRadioButton();
        Sabtu = new javax.swing.JRadioButton();
        Minggu = new javax.swing.JRadioButton();
        jPanelMin1 = new javax.swing.JPanel();
        jLabelLogin2 = new javax.swing.JLabel();
        jLabelMin1 = new javax.swing.JLabel();
        jLabelClose1 = new javax.swing.JLabel();
        jPanel_JT = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton_Jamke1 = new javax.swing.JRadioButton();
        jRadioButton_Jamke2 = new javax.swing.JRadioButton();
        jRadioButton_Jamke3 = new javax.swing.JRadioButton();
        jRadioButton_Jamke4 = new javax.swing.JRadioButton();
        jButton_Pk = new javax.swing.JButton();
        jButton_Print = new javax.swing.JButton();
        jLabel_tulisan = new javax.swing.JLabel();
        GroupBox3 = new javax.swing.JPanel();
        I1 = new javax.swing.JButton();
        A1 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        C1 = new javax.swing.JButton();
        D1 = new javax.swing.JButton();
        E1 = new javax.swing.JButton();
        F1 = new javax.swing.JButton();
        G1 = new javax.swing.JButton();
        H1 = new javax.swing.JButton();
        I10 = new javax.swing.JButton();
        J1 = new javax.swing.JButton();
        A10 = new javax.swing.JButton();
        A2 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        C2 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        E10 = new javax.swing.JButton();
        F10 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        E2 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        F2 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        A3 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        F3 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        F4 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        A4 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        A5 = new javax.swing.JButton();
        F5 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        A6 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        F6 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        D7 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        F7 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        D4 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        A7 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        E3 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        A8 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        F8 = new javax.swing.JButton();
        E8 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        A9 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        E9 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        F9 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_hari.setBackground(new java.awt.Color(0, 255, 255));
        jPanel_hari.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel_hari.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_hari.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jPanel_hari.setFont(new java.awt.Font("Vladimir Script", 0, 11)); // NOI18N
        jPanel_hari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel_hariMouseClicked(evt);
            }
        });

        jLabel4.setText("Hari");

        Senin.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Senin.setText("Senin");
        Senin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SeninMouseClicked(evt);
            }
        });
        Senin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeninActionPerformed(evt);
            }
        });

        Selasa.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Selasa.setText("Selasa");
        Selasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelasaActionPerformed(evt);
            }
        });

        Rabu.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Rabu.setText("Rabu");
        Rabu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RabuActionPerformed(evt);
            }
        });

        Kamis.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Kamis.setText("Kamis");
        Kamis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KamisActionPerformed(evt);
            }
        });

        Jumat.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Jumat.setText("Jum'at");
        Jumat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumatActionPerformed(evt);
            }
        });

        Sabtu.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Sabtu.setText("Sabtu");
        Sabtu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SabtuActionPerformed(evt);
            }
        });

        Minggu.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        Minggu.setText("Minggu");
        Minggu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MingguActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_hariLayout = new javax.swing.GroupLayout(jPanel_hari);
        jPanel_hari.setLayout(jPanel_hariLayout);
        jPanel_hariLayout.setHorizontalGroup(
            jPanel_hariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_hariLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_hariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_hariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Kamis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rabu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Selasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Senin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(Jumat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Sabtu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Minggu))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel_hariLayout.setVerticalGroup(
            jPanel_hariLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_hariLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Senin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Selasa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Rabu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Kamis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Jumat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Sabtu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Minggu))
        );

        getContentPane().add(jPanel_hari, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 290));

        jPanelMin1.setBackground(new java.awt.Color(255, 153, 0));
        jPanelMin1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabelLogin2.setFont(new java.awt.Font("OCR A Extended", 1, 20)); // NOI18N
        jLabelLogin2.setText("HARGA TIKET  ");

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
                .addComponent(jLabelLogin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 860, Short.MAX_VALUE)
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
                    .addComponent(jLabelClose1)
                    .addComponent(jLabelLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelMin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jPanel_JT.setBackground(new java.awt.Color(0, 255, 255));
        jPanel_JT.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel_JT.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel_JT.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        jPanel_JT.setFont(new java.awt.Font("Vladimir Script", 0, 11)); // NOI18N

        jLabel3.setText("Jam Tayang :    ");

        jRadioButton_Jamke1.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        jRadioButton_Jamke1.setText("14.30");
        jRadioButton_Jamke1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Jamke1ActionPerformed(evt);
            }
        });

        jRadioButton_Jamke2.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        jRadioButton_Jamke2.setText("16.30");
        jRadioButton_Jamke2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Jamke2ActionPerformed(evt);
            }
        });

        jRadioButton_Jamke3.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        jRadioButton_Jamke3.setText("19.30");
        jRadioButton_Jamke3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Jamke3ActionPerformed(evt);
            }
        });

        jRadioButton_Jamke4.setFont(new java.awt.Font("Sitka Text", 0, 11)); // NOI18N
        jRadioButton_Jamke4.setText("21.30");
        jRadioButton_Jamke4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_Jamke4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_JTLayout = new javax.swing.GroupLayout(jPanel_JT);
        jPanel_JT.setLayout(jPanel_JTLayout);
        jPanel_JTLayout.setHorizontalGroup(
            jPanel_JTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_JTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_JTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton_Jamke4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Jamke3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Jamke2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton_Jamke1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_JTLayout.setVerticalGroup(
            jPanel_JTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_JTLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_Jamke1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_Jamke2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton_Jamke3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jRadioButton_Jamke4)
                .addContainerGap())
        );

        getContentPane().add(jPanel_JT, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 150, 190));

        jButton_Pk.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Pk.setText("Pilih Kursi");
        jButton_Pk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_PkMouseClicked(evt);
            }
        });
        jButton_Pk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PkActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Pk, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 150, -1));

        jButton_Print.setBackground(new java.awt.Color(255, 0, 0));
        jButton_Print.setText("Print");
        jButton_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_PrintActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Print, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, -1));
        getContentPane().add(jLabel_tulisan, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 250, 30));

        GroupBox3.setBackground(new java.awt.Color(0, 0, 0));
        GroupBox3.setForeground(new java.awt.Color(240, 240, 240));
        GroupBox3.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                GroupBox3ComponentHidden(evt);
            }
        });

        I1.setBackground(new java.awt.Color(51, 204, 0));
        I1.setText(" ");
        I1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                I1ActionPerformed(evt);
            }
        });

        A1.setBackground(new java.awt.Color(51, 204, 0));
        A1.setText(" ");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        B1.setBackground(new java.awt.Color(51, 204, 0));
        B1.setText(" ");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        C1.setBackground(new java.awt.Color(51, 204, 0));
        C1.setText(" ");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        D1.setBackground(new java.awt.Color(51, 204, 0));
        D1.setText(" ");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        E1.setBackground(new java.awt.Color(51, 204, 0));
        E1.setText(" ");
        E1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E1ActionPerformed(evt);
            }
        });

        F1.setBackground(new java.awt.Color(51, 204, 0));
        F1.setText(" ");
        F1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F1ActionPerformed(evt);
            }
        });

        G1.setBackground(new java.awt.Color(51, 204, 0));
        G1.setText(" ");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        H1.setBackground(new java.awt.Color(51, 204, 0));
        H1.setText(" ");
        H1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                H1ActionPerformed(evt);
            }
        });

        I10.setBackground(new java.awt.Color(51, 204, 0));
        I10.setText(" ");

        J1.setBackground(new java.awt.Color(51, 204, 0));
        J1.setText(" ");
        J1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                J1ActionPerformed(evt);
            }
        });

        A10.setBackground(new java.awt.Color(51, 204, 0));
        A10.setText(" ");
        A10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                A10MouseClicked(evt);
            }
        });

        A2.setBackground(new java.awt.Color(51, 204, 0));
        A2.setText(" ");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        B2.setBackground(new java.awt.Color(51, 204, 0));
        B2.setText(" ");

        C2.setBackground(new java.awt.Color(51, 204, 0));
        C2.setText(" ");

        jButton14.setBackground(new java.awt.Color(51, 204, 0));
        jButton14.setText(" ");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(51, 204, 0));
        jButton15.setText(" ");

        jButton16.setBackground(new java.awt.Color(51, 204, 0));
        jButton16.setText(" ");

        E10.setBackground(new java.awt.Color(51, 204, 0));
        E10.setText(" ");
        E10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E10ActionPerformed(evt);
            }
        });

        F10.setBackground(new java.awt.Color(51, 204, 0));
        F10.setText(" ");
        F10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F10ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(51, 204, 0));
        jButton19.setText(" ");

        jButton20.setBackground(new java.awt.Color(51, 204, 0));
        jButton20.setText(" ");

        E2.setBackground(new java.awt.Color(51, 204, 0));
        E2.setText(" ");
        E2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E2ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(51, 204, 0));
        jButton21.setText(" ");

        jButton26.setBackground(new java.awt.Color(51, 204, 0));
        jButton26.setText(" ");

        jButton27.setBackground(new java.awt.Color(51, 204, 0));
        jButton27.setText(" ");

        jButton28.setBackground(new java.awt.Color(51, 204, 0));
        jButton28.setText(" ");

        F2.setBackground(new java.awt.Color(51, 204, 0));
        F2.setText(" ");
        F2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F2ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(51, 204, 0));
        jButton30.setText(" ");

        A3.setBackground(new java.awt.Color(51, 204, 0));
        A3.setText(" ");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(51, 204, 0));
        jButton32.setText(" ");

        F3.setBackground(new java.awt.Color(51, 204, 0));
        F3.setText(" ");
        F3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F3ActionPerformed(evt);
            }
        });

        jButton34.setBackground(new java.awt.Color(51, 204, 0));
        jButton34.setText(" ");

        jButton36.setBackground(new java.awt.Color(51, 204, 0));
        jButton36.setText(" ");

        jButton37.setBackground(new java.awt.Color(51, 204, 0));
        jButton37.setText(" ");

        F4.setBackground(new java.awt.Color(51, 204, 0));
        F4.setText(" ");
        F4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F4ActionPerformed(evt);
            }
        });

        jButton39.setBackground(new java.awt.Color(51, 204, 0));
        jButton39.setText(" ");

        jButton40.setBackground(new java.awt.Color(51, 204, 0));
        jButton40.setText(" ");

        jButton41.setBackground(new java.awt.Color(51, 204, 0));
        jButton41.setText(" ");

        A4.setBackground(new java.awt.Color(51, 204, 0));
        A4.setText(" ");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        jButton44.setBackground(new java.awt.Color(51, 204, 0));
        jButton44.setText(" ");

        jButton45.setBackground(new java.awt.Color(51, 204, 0));
        jButton45.setText(" ");

        jButton47.setBackground(new java.awt.Color(51, 204, 0));
        jButton47.setText(" ");

        jButton48.setBackground(new java.awt.Color(51, 204, 0));
        jButton48.setText(" ");

        jButton50.setBackground(new java.awt.Color(51, 204, 0));
        jButton50.setText(" ");

        A5.setBackground(new java.awt.Color(51, 204, 0));
        A5.setText(" ");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        F5.setBackground(new java.awt.Color(51, 204, 0));
        F5.setText(" ");
        F5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                F5MouseClicked(evt);
            }
        });
        F5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F5ActionPerformed(evt);
            }
        });

        jButton53.setBackground(new java.awt.Color(51, 204, 0));
        jButton53.setText(" ");

        jButton54.setBackground(new java.awt.Color(51, 204, 0));
        jButton54.setText(" ");

        jButton55.setBackground(new java.awt.Color(51, 204, 0));
        jButton55.setText(" ");

        A6.setBackground(new java.awt.Color(51, 204, 0));
        A6.setText(" ");
        A6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A6ActionPerformed(evt);
            }
        });

        jButton57.setBackground(new java.awt.Color(51, 204, 0));
        jButton57.setText(" ");

        jButton58.setBackground(new java.awt.Color(51, 204, 0));
        jButton58.setText(" ");

        F6.setBackground(new java.awt.Color(51, 204, 0));
        F6.setText(" ");
        F6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F6ActionPerformed(evt);
            }
        });

        jButton61.setBackground(new java.awt.Color(51, 204, 0));
        jButton61.setText(" ");

        jButton62.setBackground(new java.awt.Color(51, 204, 0));
        jButton62.setText(" ");

        D7.setBackground(new java.awt.Color(51, 204, 0));
        D7.setText(" ");
        D7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D7ActionPerformed(evt);
            }
        });

        jButton64.setBackground(new java.awt.Color(51, 204, 0));
        jButton64.setText(" ");

        jButton65.setBackground(new java.awt.Color(51, 204, 0));
        jButton65.setText(" ");

        F7.setBackground(new java.awt.Color(51, 204, 0));
        F7.setText(" ");
        F7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F7ActionPerformed(evt);
            }
        });

        jButton67.setBackground(new java.awt.Color(51, 204, 0));
        jButton67.setText(" ");

        D4.setBackground(new java.awt.Color(51, 204, 0));
        D4.setText(" ");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        jButton69.setBackground(new java.awt.Color(51, 204, 0));
        jButton69.setText(" ");

        A7.setBackground(new java.awt.Color(51, 204, 0));
        A7.setText(" ");
        A7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A7ActionPerformed(evt);
            }
        });

        jButton71.setBackground(new java.awt.Color(51, 204, 0));
        jButton71.setText(" ");

        E3.setBackground(new java.awt.Color(51, 204, 0));
        E3.setText(" ");
        E3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E3ActionPerformed(evt);
            }
        });

        jButton73.setBackground(new java.awt.Color(51, 204, 0));
        jButton73.setText(" ");

        jButton74.setBackground(new java.awt.Color(51, 204, 0));
        jButton74.setText(" ");

        jButton75.setBackground(new java.awt.Color(51, 204, 0));
        jButton75.setText(" ");

        jButton76.setBackground(new java.awt.Color(51, 204, 0));
        jButton76.setText(" ");

        jButton77.setBackground(new java.awt.Color(51, 204, 0));
        jButton77.setText(" ");

        A8.setBackground(new java.awt.Color(51, 204, 0));
        A8.setText(" ");
        A8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A8ActionPerformed(evt);
            }
        });

        jButton79.setBackground(new java.awt.Color(51, 204, 0));
        jButton79.setText(" ");

        jButton80.setBackground(new java.awt.Color(51, 204, 0));
        jButton80.setText(" ");

        F8.setBackground(new java.awt.Color(51, 204, 0));
        F8.setText(" ");
        F8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F8ActionPerformed(evt);
            }
        });

        E8.setBackground(new java.awt.Color(51, 204, 0));
        E8.setText(" ");
        E8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E8ActionPerformed(evt);
            }
        });

        jButton83.setBackground(new java.awt.Color(51, 204, 0));
        jButton83.setText(" ");

        jButton84.setBackground(new java.awt.Color(51, 204, 0));
        jButton84.setText(" ");

        jButton85.setBackground(new java.awt.Color(51, 204, 0));
        jButton85.setText(" ");

        A9.setBackground(new java.awt.Color(51, 204, 0));
        A9.setText(" ");
        A9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A9ActionPerformed(evt);
            }
        });

        jButton87.setBackground(new java.awt.Color(51, 204, 0));
        jButton87.setText(" ");

        jButton88.setBackground(new java.awt.Color(51, 204, 0));
        jButton88.setText(" ");

        E9.setBackground(new java.awt.Color(51, 204, 0));
        E9.setText(" ");
        E9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                E9ActionPerformed(evt);
            }
        });

        jButton90.setBackground(new java.awt.Color(51, 204, 0));
        jButton90.setText(" ");

        F9.setBackground(new java.awt.Color(51, 204, 0));
        F9.setText(" ");
        F9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                F9ActionPerformed(evt);
            }
        });

        jButton93.setBackground(new java.awt.Color(51, 204, 0));
        jButton93.setText(" ");

        jButton94.setBackground(new java.awt.Color(51, 204, 0));
        jButton94.setText(" ");

        jButton95.setBackground(new java.awt.Color(51, 204, 0));
        jButton95.setText(" ");

        jButton96.setBackground(new java.awt.Color(51, 204, 0));
        jButton96.setText(" ");

        jButton97.setBackground(new java.awt.Color(51, 204, 0));
        jButton97.setText(" ");

        jButton98.setBackground(new java.awt.Color(51, 204, 0));
        jButton98.setText(" ");

        jButton99.setBackground(new java.awt.Color(51, 204, 0));
        jButton99.setText(" ");

        jButton100.setBackground(new java.awt.Color(51, 204, 0));
        jButton100.setText(" ");

        jButton101.setBackground(new java.awt.Color(51, 204, 0));
        jButton101.setText(" ");

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("J");

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("A");

        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("B");

        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("C");

        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("D");

        jLabel8.setForeground(new java.awt.Color(240, 240, 240));
        jLabel8.setText("E");

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("F");

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("G");

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("H");

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("I");

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("10");

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("1");

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("2");

        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("3");

        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("4");

        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("5");

        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("6");

        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("7");

        jLabel21.setForeground(new java.awt.Color(240, 240, 240));
        jLabel21.setText("8");

        jLabel22.setForeground(new java.awt.Color(240, 240, 240));
        jLabel22.setText("9");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("PINTU MASUK");

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("----Kursi Yang Tersedia-----");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel24.setText("LAYAR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel24)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel24)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout GroupBox3Layout = new javax.swing.GroupLayout(GroupBox3);
        GroupBox3.setLayout(GroupBox3Layout);
        GroupBox3Layout.setHorizontalGroup(
            GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroupBox3Layout.createSequentialGroup()
                .addGap(0, 50, Short.MAX_VALUE)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(C1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(C2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton77, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton85, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(E1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(E2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(E3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(260, 260, 260)
                        .addComponent(E8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(E9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(E10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(F1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(F10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(G1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton90, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(I1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton88, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(I10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(D1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(D4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel23)
                        .addGap(13, 13, 13)
                        .addComponent(D7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton79, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(A1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(A10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(GroupBox3Layout.createSequentialGroup()
                                .addComponent(J1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton95, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton98, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton100, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jButton93, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(GroupBox3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GroupBox3Layout.setVerticalGroup(
            GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GroupBox3Layout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(25, 25, 25)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel13))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addComponent(A1)
                    .addComponent(A2)
                    .addComponent(A3)
                    .addComponent(A4)
                    .addComponent(A5)
                    .addComponent(A6)
                    .addComponent(A7)
                    .addComponent(A8)
                    .addComponent(A9)
                    .addComponent(A10))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(B1)
                    .addComponent(B2)
                    .addComponent(jButton32)
                    .addComponent(jButton45)
                    .addComponent(jButton48)
                    .addComponent(jButton61)
                    .addComponent(jButton67)
                    .addComponent(jButton76)
                    .addComponent(jButton87)
                    .addComponent(jButton14))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6))
                    .addComponent(C1)
                    .addComponent(C2)
                    .addComponent(jButton30)
                    .addComponent(jButton39)
                    .addComponent(jButton53)
                    .addComponent(jButton64)
                    .addComponent(jButton73)
                    .addComponent(jButton77)
                    .addComponent(jButton85)
                    .addComponent(jButton15))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(D1)
                    .addComponent(jButton26)
                    .addComponent(jButton47)
                    .addComponent(D4)
                    .addComponent(jLabel23)
                    .addComponent(D7)
                    .addComponent(jButton79)
                    .addComponent(jButton84)
                    .addComponent(jButton16))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addComponent(E1)
                    .addComponent(E2)
                    .addComponent(E3)
                    .addComponent(E8)
                    .addComponent(E9)
                    .addComponent(E10))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addComponent(F1)
                    .addComponent(F2)
                    .addComponent(F3)
                    .addComponent(F4)
                    .addComponent(F5)
                    .addComponent(F6)
                    .addComponent(F7)
                    .addComponent(F8)
                    .addComponent(F9)
                    .addComponent(F10))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(G1)
                    .addComponent(jButton27)
                    .addComponent(jButton36)
                    .addComponent(jButton40)
                    .addComponent(jButton50)
                    .addComponent(jButton62)
                    .addComponent(jButton69)
                    .addComponent(jButton75)
                    .addComponent(jButton83)
                    .addComponent(jButton19))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11))
                    .addComponent(H1)
                    .addComponent(jButton28)
                    .addComponent(jButton37)
                    .addComponent(jButton44)
                    .addComponent(jButton55)
                    .addComponent(jButton58)
                    .addComponent(jButton65)
                    .addComponent(jButton74)
                    .addComponent(jButton90)
                    .addComponent(jButton20))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12))
                    .addComponent(I1)
                    .addComponent(jButton21)
                    .addComponent(jButton34)
                    .addComponent(jButton41)
                    .addComponent(jButton54)
                    .addComponent(jButton57)
                    .addComponent(jButton71)
                    .addComponent(jButton80)
                    .addComponent(jButton88)
                    .addComponent(I10))
                .addGap(10, 10, 10)
                .addGroup(GroupBox3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(GroupBox3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(J1)
                    .addComponent(jButton94)
                    .addComponent(jButton95)
                    .addComponent(jButton96)
                    .addComponent(jButton97)
                    .addComponent(jButton98)
                    .addComponent(jButton99)
                    .addComponent(jButton100)
                    .addComponent(jButton101)
                    .addComponent(jButton93))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(GroupBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 720, 570));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/thumb-1920-390465.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1110, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMin1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMin1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMin1MouseClicked

    private void jLabelClose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelClose1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelClose1MouseClicked

    private void jRadioButton_Jamke1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Jamke1ActionPerformed
        // TODO add your handling code here:
        setJam("14.30");
    }//GEN-LAST:event_jRadioButton_Jamke1ActionPerformed

    private void jRadioButton_Jamke3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Jamke3ActionPerformed
        // TODO add your handling code here:
        setJam("19.30");
    }//GEN-LAST:event_jRadioButton_Jamke3ActionPerformed

    private void jRadioButton_Jamke4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Jamke4ActionPerformed
        // TODO add your handling code here:
        setJam("21.30");
    }//GEN-LAST:event_jRadioButton_Jamke4ActionPerformed

    private void jButton_PkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PkActionPerformed
        //GroupBox3.setVisible() = ComboBox_Row.setVisible() = ComboBox_Seat.setVisible() = true ;
    }//GEN-LAST:event_jButton_PkActionPerformed

    private void SeninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeninActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Senin");
        if(tip.tipeF.equals("2D")) {
            harga = 35000;
        } else
            harga = 75000;
    }//GEN-LAST:event_SeninActionPerformed

    private void RabuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RabuActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Rabu");
        if(tip.tipeF.equals("2D")) {
            harga = 35000;
        } else
            harga = 75000;
    }//GEN-LAST:event_RabuActionPerformed

    private void KamisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KamisActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Kamis");
        if(tip.tipeF.equals("2D")) {
            harga = 35000;
        } else
            harga = 75000;
    }//GEN-LAST:event_KamisActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_PrintActionPerformed
        Print print = new Print();
        print.setVisible(true);
        print.pack();
        print.setLocationRelativeTo(null);
        print.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();               
    }//GEN-LAST:event_jButton_PrintActionPerformed

    private void SelasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelasaActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Selasa");
        if(tip.tipeF.equals("2D")) {
            harga = 35000;
        } else
            harga = 75000;
    }//GEN-LAST:event_SelasaActionPerformed

    private void JumatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumatActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Jumat");
        if(tip.tipeF.equals("2D")) {
            harga = 35000;
        } else
            harga = 75000;
    }//GEN-LAST:event_JumatActionPerformed

    private void SabtuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SabtuActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Sabtu");
        if(tip.tipeF.equals("2D")) {
            harga = 50000;
        } else
            harga = 100000;
    }//GEN-LAST:event_SabtuActionPerformed

    private void MingguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MingguActionPerformed
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
        setHari("Minggu");
        if(tip.tipeF.equals("2D")) {
            harga = 50000;
        } else
            harga = 100000;
    }//GEN-LAST:event_MingguActionPerformed

    private void GroupBox3ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_GroupBox3ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_GroupBox3ComponentHidden

    private void jButton_PkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_PkMouseClicked
        // TODO add your handling code here:
        GroupBox3.setVisible(true);
    }//GEN-LAST:event_jButton_PkMouseClicked

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        A1.setBackground(Color.yellow);
        bangku = "A1";
    }//GEN-LAST:event_A1ActionPerformed

    private void jPanel_hariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel_hariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel_hariMouseClicked

    private void SeninMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SeninMouseClicked
        // TODO add your handling code here:
        jPanel_JT.setVisible(true);
    }//GEN-LAST:event_SeninMouseClicked

    private void jRadioButton_Jamke2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_Jamke2ActionPerformed
        // TODO add your handling code here:
        setJam("16.30");
    }//GEN-LAST:event_jRadioButton_Jamke2ActionPerformed

    private void F5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_F5MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_F5MouseClicked

    private void A10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_A10MouseClicked
        // TODO add your handling code here:
        A10.setBackground(Color.yellow);
        bangku = "A10";
    }//GEN-LAST:event_A10MouseClicked

    private void A9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A9ActionPerformed
        // TODO add your handling code here:
        A9.setBackground(Color.yellow);
        bangku = "A9";
    }//GEN-LAST:event_A9ActionPerformed

    private void A8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A8ActionPerformed
        // TODO add your handling code here:
        A8.setBackground(Color.yellow);
        bangku = "A8";
    }//GEN-LAST:event_A8ActionPerformed

    private void A7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A7ActionPerformed
        // TODO add your handling code here:
        A7.setBackground(Color.yellow);
        bangku = "A7";
    }//GEN-LAST:event_A7ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
        A5.setBackground(Color.yellow);
        bangku = "A5";
    }//GEN-LAST:event_A5ActionPerformed

    private void A6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A6ActionPerformed
        // TODO add your handling code here:
        A6.setBackground(Color.yellow);
        bangku = "A6";
    }//GEN-LAST:event_A6ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
        A4.setBackground(Color.yellow);
        bangku = "A4";
    }//GEN-LAST:event_A4ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        A3.setBackground(Color.yellow);
        bangku = "A3";
    }//GEN-LAST:event_A3ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        A2.setBackground(Color.yellow);
        bangku = "A2";
    }//GEN-LAST:event_A2ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        B1.setBackground(Color.yellow);
        bangku = "B1";
    }//GEN-LAST:event_B1ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        C1.setBackground(Color.yellow);
        bangku = "C1";
    }//GEN-LAST:event_C1ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        D1.setBackground(Color.yellow);
        bangku = "D1";
    }//GEN-LAST:event_D1ActionPerformed

    private void E1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E1ActionPerformed
        E1.setBackground(Color.yellow);
        bangku = "E1";
    }//GEN-LAST:event_E1ActionPerformed

    private void F1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F1ActionPerformed
        F1.setBackground(Color.yellow);
        bangku = "F1";
    }//GEN-LAST:event_F1ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        G1.setBackground(Color.yellow);
        bangku = "G1";
    }//GEN-LAST:event_G1ActionPerformed

    private void H1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_H1ActionPerformed
        H1.setBackground(Color.yellow);
        bangku = "H1";
    }//GEN-LAST:event_H1ActionPerformed

    private void I1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_I1ActionPerformed
       I1.setBackground(Color.yellow);
        bangku = "I1";
    }//GEN-LAST:event_I1ActionPerformed

    private void J1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_J1ActionPerformed
        J1.setBackground(Color.yellow);
        bangku = "J1";
    }//GEN-LAST:event_J1ActionPerformed

    private void F4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F4ActionPerformed
        // TODO add your handling code here:
        F4.setBackground(Color.yellow);
        bangku = "F4";
    }//GEN-LAST:event_F4ActionPerformed

    private void F5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F5ActionPerformed
        // TODO add your handling code here:
        F5.setBackground(Color.yellow);
        bangku = "F5";
    }//GEN-LAST:event_F5ActionPerformed

    private void F6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F6ActionPerformed
        // TODO add your handling code here:
        F6.setBackground(Color.yellow);
        bangku = "F6";
    }//GEN-LAST:event_F6ActionPerformed

    private void F7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F7ActionPerformed
        // TODO add your handling code here:
        F7.setBackground(Color.yellow);
        bangku = "F7";
    }//GEN-LAST:event_F7ActionPerformed

    private void F3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F3ActionPerformed
        // TODO add your handling code here:
        F3.setBackground(Color.yellow);
        bangku = "F3";
    }//GEN-LAST:event_F3ActionPerformed

    private void F2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F2ActionPerformed
        // TODO add your handling code here:
        F2.setBackground(Color.yellow);
        bangku = "F2";
    }//GEN-LAST:event_F2ActionPerformed

    private void F8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F8ActionPerformed
        // TODO add your handling code here:
        F8.setBackground(Color.yellow);
        bangku = "F8";
    }//GEN-LAST:event_F8ActionPerformed

    private void F9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F9ActionPerformed
        // TODO add your handling code here:
        F9.setBackground(Color.yellow);
        bangku = "F9";
    }//GEN-LAST:event_F9ActionPerformed

    private void F10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_F10ActionPerformed
        // TODO add your handling code here:
        F10.setBackground(Color.yellow);
        bangku = "F10";
    }//GEN-LAST:event_F10ActionPerformed

    private void E3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E3ActionPerformed
        // TODO add your handling code here:
        E3.setBackground(Color.yellow);
        bangku = "E3";
    }//GEN-LAST:event_E3ActionPerformed

    private void E8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E8ActionPerformed
        // TODO add your handling code here:
        E8.setBackground(Color.yellow);
        bangku = "E8";
    }//GEN-LAST:event_E8ActionPerformed

    private void E2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E2ActionPerformed
        // TODO add your handling code here:
        E2.setBackground(Color.yellow);
        bangku = "E2";
    }//GEN-LAST:event_E2ActionPerformed

    private void E9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E9ActionPerformed
        // TODO add your handling code here:
        E9.setBackground(Color.yellow);
        bangku = "E9";
    }//GEN-LAST:event_E9ActionPerformed

    private void E10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_E10ActionPerformed
        // TODO add your handling code here:
        E10.setBackground(Color.yellow);
        bangku = "E10";
    }//GEN-LAST:event_E10ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        D4.setBackground(Color.yellow);
        bangku = "D4";
    }//GEN-LAST:event_D4ActionPerformed

    private void D7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D7ActionPerformed
        D7.setBackground(Color.yellow);
        bangku = "D7";
    }//GEN-LAST:event_D7ActionPerformed

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
            java.util.logging.Logger.getLogger(JamTayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JamTayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JamTayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JamTayang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JamTayang().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton A1;
    private javax.swing.JButton A10;
    private javax.swing.JButton A2;
    private javax.swing.JButton A3;
    private javax.swing.JButton A4;
    private javax.swing.JButton A5;
    private javax.swing.JButton A6;
    private javax.swing.JButton A7;
    private javax.swing.JButton A8;
    private javax.swing.JButton A9;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton C1;
    private javax.swing.JButton C2;
    private javax.swing.JButton D1;
    private javax.swing.JButton D4;
    private javax.swing.JButton D7;
    private javax.swing.JButton E1;
    private javax.swing.JButton E10;
    private javax.swing.JButton E2;
    private javax.swing.JButton E3;
    private javax.swing.JButton E8;
    private javax.swing.JButton E9;
    private javax.swing.JButton F1;
    private javax.swing.JButton F10;
    private javax.swing.JButton F2;
    private javax.swing.JButton F3;
    private javax.swing.JButton F4;
    private javax.swing.JButton F5;
    private javax.swing.JButton F6;
    private javax.swing.JButton F7;
    private javax.swing.JButton F8;
    private javax.swing.JButton F9;
    private javax.swing.JButton G1;
    private javax.swing.JPanel GroupBox3;
    private javax.swing.JButton H1;
    private javax.swing.JButton I1;
    private javax.swing.JButton I10;
    private javax.swing.JButton J1;
    private javax.swing.JRadioButton Jumat;
    private javax.swing.JRadioButton Kamis;
    private javax.swing.JRadioButton Minggu;
    private javax.swing.JRadioButton Rabu;
    private javax.swing.JRadioButton Sabtu;
    private javax.swing.JRadioButton Selasa;
    private javax.swing.JRadioButton Senin;
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
    private javax.swing.JButton jButton_Pk;
    private javax.swing.JButton jButton_Print;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose1;
    private javax.swing.JLabel jLabelLogin2;
    private javax.swing.JLabel jLabelMin1;
    private javax.swing.JLabel jLabel_tulisan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMin1;
    private javax.swing.JPanel jPanel_JT;
    private javax.swing.JPanel jPanel_hari;
    private javax.swing.JRadioButton jRadioButton_Jamke1;
    private javax.swing.JRadioButton jRadioButton_Jamke2;
    private javax.swing.JRadioButton jRadioButton_Jamke3;
    private javax.swing.JRadioButton jRadioButton_Jamke4;
    // End of variables declaration//GEN-END:variables
}
