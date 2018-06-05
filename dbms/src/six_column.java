
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class six_column extends javax.swing.JFrame {
String url1,name1,pass1,db_name1;
    /**
     * Creates new form six_column
     */
    public six_column() {
        initComponents();
        setLocationRelativeTo(null);
    }
    public six_column( String url,String name,String pass,String dbname) {
     url1=url;
     name1=name;
     pass1=pass;
     db_name1=dbname;
        initComponents();
        setLocationRelativeTo(null);
    }

    
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        op1 = new javax.swing.JOptionPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        t4 = new javax.swing.JTextField();
        t5 = new javax.swing.JTextField();
        t6 = new javax.swing.JTextField();
        t7 = new javax.swing.JTextField();
        t8 = new javax.swing.JTextField();
        t9 = new javax.swing.JTextField();
        t10 = new javax.swing.JTextField();
        t11 = new javax.swing.JTextField();
        t12 = new javax.swing.JTextField();
        t13 = new javax.swing.JTextField();
        t14 = new javax.swing.JTextField();
        t15 = new javax.swing.JTextField();
        t16 = new javax.swing.JTextField();
        t17 = new javax.swing.JTextField();
        t18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        t25 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t20 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        t21 = new javax.swing.JTextField();
        t22 = new javax.swing.JTextField();
        t23 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r7 = new javax.swing.JRadioButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Table");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Column Name");

        jLabel2.setText("Datatype");

        jLabel3.setText("Size");

        jLabel4.setText("Primary key");

        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });

        t6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t6ActionPerformed(evt);
            }
        });

        t7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t7ActionPerformed(evt);
            }
        });

        t11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t11ActionPerformed(evt);
            }
        });

        t12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t12ActionPerformed(evt);
            }
        });

        t13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t13ActionPerformed(evt);
            }
        });

        t14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t14ActionPerformed(evt);
            }
        });

        t15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t15ActionPerformed(evt);
            }
        });

        t16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t16ActionPerformed(evt);
            }
        });

        t17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t17ActionPerformed(evt);
            }
        });

        t18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t18ActionPerformed(evt);
            }
        });

        jButton1.setText("Create Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter Table Name");

        t25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t25ActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter No. Of Columns Between 2 to 7");

        t20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t20ActionPerformed(evt);
            }
        });

        jButton2.setText("Create Fields");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        t21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t21ActionPerformed(evt);
            }
        });

        t22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t22ActionPerformed(evt);
            }
        });

        t23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t23ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squre/sqredback32.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r1);
        r1.setText("Enable");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r2);
        r2.setText("Enable");

        buttonGroup1.add(r3);
        r3.setText("Enable");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(r4);
        r4.setText("Enable");

        buttonGroup1.add(r5);
        r5.setText("Enable");

        buttonGroup1.add(r6);
        r6.setText("Enable");

        buttonGroup1.add(r7);
        r7.setText("Enable");
        r7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(r2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(r7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(r1)
                .addGap(27, 27, 27)
                .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(r3)
                .addGap(27, 27, 27)
                .addComponent(r4)
                .addGap(27, 27, 27)
                .addComponent(r5)
                .addGap(27, 27, 27)
                .addComponent(r6)
                .addGap(27, 27, 27)
                .addComponent(r7)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/squre/sqredinfo32.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                                .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(200, 200, 200)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(t9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                                .addComponent(t10, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(t11, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(t12, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(t22))
                                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(t23)
                                            .addComponent(t18, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t17, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t16, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t15, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t14, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(t13, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                            .addComponent(t1)
                                            .addComponent(t2)
                                            .addComponent(t3)
                                            .addComponent(t4)
                                            .addComponent(t5)
                                            .addComponent(t6)
                                            .addComponent(t21))))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t7ActionPerformed

    private void t6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t6ActionPerformed

    private void t12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t12ActionPerformed

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void t11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t11ActionPerformed

    private void t13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t13ActionPerformed

    private void t14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t14ActionPerformed

    private void t15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t15ActionPerformed

    private void t16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t16ActionPerformed

    private void t17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t17ActionPerformed

    private void t18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int num;
        String cname,cname1,cname2,cname3,cname4,cname5,cname6,dn,dn1,dn2,dn3,dn4,dn5,dn6,s,s1,s2,s3,s4,s5,s6,primary;
String name=t25.getText();
cname=t1.getText();
cname1=t2.getText();
cname2=t3.getText();
cname3=t4.getText();
cname4=t5.getText();
cname5=t6.getText();
cname6=t21.getText();
dn=t7.getText();
dn1=t8.getText();
dn2=t9.getText();
dn3=t10.getText();
dn4=t11.getText();
dn5=t12.getText();
dn6=t22.getText();
s=t13.getText();
s1=t14.getText();
s2=t15.getText();
s3=t16.getText();
s4=t17.getText();
s5=t18.getText();
s6=t23.getText();


 num=Integer.parseInt(t20.getText()) ;     
        final String db_url="jdbc:mysql://"+url1+"/"+db_name1;
      final String uid=name1;
      final String pass=pass1;
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection con=DriverManager.getConnection(db_url,uid,pass);
          Statement stmt=con.createStatement();
          if(r1.isSelected()){
    switch (num) {
        case 2:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+" primary key,"+cname1+" "+dn1+"("+s1+")"+")"+""
            );
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+" primary key,"+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+" primary key,"+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+" primary key,"+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+" primary key,"+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+")"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+" primary key,"+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+","+cname6+" "+dn6+"("+s6+")"+")"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }
          }
          else if(r2.isSelected()){
          switch (num) {
              case 2:
             stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+" primary key)"+""
            ); 
             op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+" primary key,"+cname2+" "+dn2+"("+s2+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+" primary key,"+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+" primary key,"+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+" primary key,"+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+")"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+" primary key,"+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+","+cname6+" "+dn6+"("+s6+")"+")"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }    
          }
          else if(r3.isSelected()){
          switch (num) {
              case 2:
             stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+")"+""
            ); 
             op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+" primary key)"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+" primary key,"+cname3+" "+dn3+"("+s3+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+" primary key,"+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+" primary key,"+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+")"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+" primary key,"+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+","+cname6+" "+dn6+"("+s6+")"+")"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }    
          }
          else if(r4.isSelected()){
          switch (num) {
              case 2:
             stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+")"+""
            );
             op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+" primary key)"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+" primary key,"+cname4+" "+dn4+"("+s4+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+" primary key,"+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+")"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+" primary key,"+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+","+cname6+" "+dn6+"("+s6+")"+")"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }    
          }
          else if(r5.isSelected()){
          switch (num) {
              case 2:
             stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+")"+""
            );
             op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+" primary key)"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+" primary key,"+cname5+" "+dn5+"("+s5+")"+")"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+" primary key,"+cname5+" "+dn5+"("+s5+")"+","+cname6+" "+dn6+"("+s6+")"+")"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }    
          }
          else if(r6.isSelected()){
          switch (num) {
              case 2:
             stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+")"+""
            );
             op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+" primary key)"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+" primary key,"+cname6+" "+dn6+"("+s6+")"+")"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }    
          }
          else if(r7.isSelected()){
          switch (num) {
              case 2:
             stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+")"+""
            );
        case 3:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 4:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 5:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+")"+""
            ); 
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 6:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+")"+""
            );  
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        case 7:
            stmt.executeUpdate("CREATE TABLE IF NOT EXISTS "+name+"("+cname+" "+dn+"("+s+")"+","+cname1+" "+dn1+"("+s1+")"+","+cname2+" "+dn2+"("+s2+")"+","+cname3+" "+dn3+"("+s3+")"+","+cname4+" "+dn4+"("+s4+")"+","+cname5+" "+dn5+"("+s5+")"+","+cname6+" "+dn6+"("+s6+")"+" primary key)"+""
            );   
            op1.showMessageDialog(null,"Table Created successfully");
            break;
        default:
            break;
    }    
          }
          
   this.setVisible(false);
   new Table_operations(url1,name1,pass1,db_name1).setVisible(true);
       }
     catch(Exception e)
{
op1.showMessageDialog(null,e.getMessage());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t25ActionPerformed

    private void t20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t20ActionPerformed

    private void t21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t21ActionPerformed

    private void t22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t22ActionPerformed

    private void t23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t23ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
t1.setVisible(false);
t2.setVisible(false);
t3.setVisible(false);
t4.setVisible(false);
t5.setVisible(false);
t6.setVisible(false);
t7.setVisible(false);
t8.setVisible(false);
t9.setVisible(false);
t10.setVisible(false);
t11.setVisible(false);
t12.setVisible(false);
t13.setVisible(false);
t14.setVisible(false);
t15.setVisible(false);
t16.setVisible(false);
t17.setVisible(false);
t18.setVisible(false);
t21.setVisible(false);
t22.setVisible(false);
t23.setVisible(false);
t25.setVisible(false);
jButton1.setVisible(false);
jLabel1.setVisible(false);
jLabel2.setVisible(false);
jLabel3.setVisible(false);
jLabel4.setVisible(false);
jLabel5.setVisible(false);
r1.setVisible(false);
r2.setVisible(false);
r3.setVisible(false);
r4.setVisible(false);
r5.setVisible(false);
r6.setVisible(false);
r7.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int num;
String name=t20.getText();

if(name.equals("")){
    op1.showMessageDialog(null,"Enter no of columns");
}
 

 else{
num=Integer.parseInt(t20.getText());
 if(num>=2&&num<=7){

switch (num) {
        case 7:
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t9.setVisible(true);
            t10.setVisible(true);
            t11.setVisible(true);
            t12.setVisible(true);
            t13.setVisible(true);
            t14.setVisible(true);
            t15.setVisible(true);
            t16.setVisible(true);
            t17.setVisible(true);
            t18.setVisible(true);
            t21.setVisible(true);
            t22.setVisible(true);
            t23.setVisible(true);
            t25.setVisible(true);
            jButton1.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);
            r6.setVisible(true);
            r7.setVisible(true);
            break;
        case 6:
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            t5.setVisible(true);
            t6.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t9.setVisible(true);
            t10.setVisible(true);
            t11.setVisible(true);
            t12.setVisible(true);
            t13.setVisible(true);
            t14.setVisible(true);
            t15.setVisible(true);
            t16.setVisible(true);
            t17.setVisible(true);
            t18.setVisible(true);
            t25.setVisible(true);
            jButton1.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            t21.setVisible(false);
            t22.setVisible(false);
            t23.setVisible(false);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);
            r6.setVisible(true);
            r7.setVisible(false);
            break;
        case 5:
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            t5.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t9.setVisible(true);
            t10.setVisible(true);
            t11.setVisible(true);
            t13.setVisible(true);
            t14.setVisible(true);
            t15.setVisible(true);
            t16.setVisible(true);
            t17.setVisible(true);
            t25.setVisible(true);
            jButton1.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            t21.setVisible(false);
            t22.setVisible(false);
            t23.setVisible(false);
            t6.setVisible(false);
            t12.setVisible(false);
            t18.setVisible(false);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(true);
            r6.setVisible(false);
            r7.setVisible(false);
            break;
        case 4:
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t4.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t9.setVisible(true);
            t10.setVisible(true);
            t13.setVisible(true);
            t14.setVisible(true);
            t15.setVisible(true);
            t16.setVisible(true);
            t25.setVisible(true);
            jButton1.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            t21.setVisible(false);
            t22.setVisible(false);
            t23.setVisible(false);
            t6.setVisible(false);
            t12.setVisible(false);
            t18.setVisible(false);
            t5.setVisible(false);
            t11.setVisible(false);
            t17.setVisible(false);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(true);
            r5.setVisible(false);
            r6.setVisible(false);
            r7.setVisible(false);
            break;
        case 3:
         t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t9.setVisible(true);
            t13.setVisible(true);
            t14.setVisible(true);
            t15.setVisible(true);
            t25.setVisible(true);
            jButton1.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            t21.setVisible(false);
            t22.setVisible(false);
            t23.setVisible(false);
            t6.setVisible(false);
            t12.setVisible(false);
            t18.setVisible(false);
            t5.setVisible(false);
            t11.setVisible(false);
            t17.setVisible(false); 
            t4.setVisible(false);
            t10.setVisible(false);
            t16.setVisible(false);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(true);
            r4.setVisible(false);
            r5.setVisible(false);
            r6.setVisible(false);
            r7.setVisible(false);
            break;
        default:
          t1.setVisible(true);
            t2.setVisible(true);
            t7.setVisible(true);
            t8.setVisible(true);
            t13.setVisible(true);
            t14.setVisible(true);
            t25.setVisible(true);
            jButton1.setVisible(true);
            jLabel1.setVisible(true);
            jLabel2.setVisible(true);
            jLabel3.setVisible(true);
            jLabel4.setVisible(true);
            jLabel5.setVisible(true);
            t21.setVisible(false);
            t22.setVisible(false);
            t23.setVisible(false);
            t6.setVisible(false);
            t12.setVisible(false);
            t18.setVisible(false);
            t5.setVisible(false);
            t11.setVisible(false);
            t17.setVisible(false); 
            t4.setVisible(false);
            t10.setVisible(false);
            t16.setVisible(false);
            r1.setVisible(true);
            r2.setVisible(true);
            r3.setVisible(false);
            r4.setVisible(false);
            r5.setVisible(false);
            r6.setVisible(false);
            r7.setVisible(false);
            t3.setVisible(false);
            t9.setVisible(false);
            t15.setVisible(false);
            break;  
    }
}

else{
   op1.showMessageDialog(null,"Please enter value between 2 and 7")  ;
    t20.setText(""); 
}
 }
  
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
new Table_operations(url1,name1,pass1,db_name1).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r7ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         op1.showMessageDialog(null,"This is table creating form \nRules: Table from 1 to 7 columns can only be created \nPrimary key must be used.") ;
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(six_column.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(six_column.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(six_column.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(six_column.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new six_column().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JOptionPane op1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t10;
    private javax.swing.JTextField t11;
    private javax.swing.JTextField t12;
    private javax.swing.JTextField t13;
    private javax.swing.JTextField t14;
    private javax.swing.JTextField t15;
    private javax.swing.JTextField t16;
    private javax.swing.JTextField t17;
    private javax.swing.JTextField t18;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t20;
    private javax.swing.JTextField t21;
    private javax.swing.JTextField t22;
    private javax.swing.JTextField t23;
    private javax.swing.JTextField t25;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    private javax.swing.JTextField t7;
    private javax.swing.JTextField t8;
    private javax.swing.JTextField t9;
    // End of variables declaration//GEN-END:variables
}
