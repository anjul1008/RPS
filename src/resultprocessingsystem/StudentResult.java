/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resultprocessingsystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Anujsaini
 */
public class StudentResult extends javax.swing.JFrame {

    Connection conn=DBConnection.getconn();
    ResultSet rs=null;
    PreparedStatement pst=null;
    JLabel l[];
    JTextField t[];
    int sub = 0;
    String SCId[];
    String Cno[] ;
    float credit[];
    int tot[];
    float gp[];
    float cp[];
    float cgpa;
    float ogpa;
    String Scheme;
    int Sem;
    int midm[], thm[] ,pracm[], mid[],th[],prac[];
    String pf[];
    /**
     * Creates new form StudentResult
     */
    public StudentResult() {
        initComponents();
        
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Welcome");
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setText("Upload");
        jButton1.setVisible(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Enrollment No:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton3.setText("Get Subject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S.No.", "Course Code", "Course Title", "MIdTerm", "Theory", "Practical"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTable1);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Sem:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 97, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Exam Code:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton4.setText("Ok");
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
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(155, 155, 155)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(18, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(325, 325, 325)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jButton2)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(439, 439, 439))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int p=JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?","Upload", JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            try
                
            {   Result();
                for(int i=0;i<sub;i++)
                {
                    String sql="Insert Into Exam"
                            + "(ExamCode,EnrollNo,SchemeCrsId,CrsNo,MidMarks,ThMarks,PractMarks,Sem,Result) values (?,?,?,?,?,?,?,?,?)";
                    pst=conn.prepareStatement(sql);
               
                    pst.setString(1, jTextField2.getText());
                    pst.setString(2, jTextField1.getText());
                    pst.setString(3, SCId[i]);
                    pst.setString(4, Cno[i]);
                    pst.setInt(5,Integer.parseInt(jTable1.getValueAt(i,3).toString()));
                    pst.setInt(6,Integer.parseInt(jTable1.getValueAt(i,4).toString()));
                    pst.setInt(7,Integer.parseInt(jTable1.getValueAt(i,5).toString()));
                    pst.setInt(8, Integer.parseInt(jTextField3.getText()));
                    pst.setString(9,pf[i]);
                    pst.execute();
                }
                JOptionPane.showMessageDialog(null, "Data saved successfully 1");
            }
            catch(Exception e)
            {
               e.printStackTrace();
            }
            gradecalc();
            try
            {
                String sql="Insert Into grades"
                        + "(EnrollNo,CGPA,OGPA,Sem) values (?,?,?,?)";
                pst=conn.prepareStatement(sql);
               
                pst.setString(1, jTextField1.getText());
                pst.setFloat(2, cgpa);
                pst.setFloat(3, ogpa);
                pst.setInt(4,Integer.parseInt(jTextField3.getText()));
                pst.execute();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new AdminWindow().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        myinit();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int p = JOptionPane.showConfirmDialog(rootPane, "Do you want to change Data!!!");
        if(p==1)
            jButton1.setVisible(true);
            
    }//GEN-LAST:event_jButton4ActionPerformed
    
    void myinit()
    {
        ResultSet r;
        try{
            String sql = "Select * From student Where EnrollNo='"+jTextField1.getText()+"'";
            pst = conn.prepareStatement(sql);
            r=pst.executeQuery();
            r.next();
            Scheme=r.getString(5);
            //Sem = r.getInt(12);
            Sem = Integer.parseInt(jTextField3.getText().toString()); 
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        try{
            String sql = "Select * From schemecrs Where SchemeId='"+Scheme+"' And Semester='"+Sem+"'";
            pst = conn.prepareStatement(sql);
            r = pst.executeQuery();
            r.next();
            int ctr =0;
            while(!r.isAfterLast())
            {
                sub++;
                r.next();
            }   
    
            r.first();
            SCId= new String[sub];
            Cno = new String[sub];
            credit = new float[sub];
            tot= new int [sub];

            thm= new int [sub];
            pracm= new int[sub];
            mid= new int [sub];
            th= new int [sub];
            prac= new int [sub];
            pf= new String[sub];
            ctr=0;
            
            while(!r.isAfterLast())
            {
                
                SCId[ctr] = r.getString(1);
                Cno[ctr] = r.getString(2);
                credit[ctr] = r.getFloat(4);
                tot[ctr]= r.getInt(5)+r.getInt(6)+r.getInt(7);
                thm[ctr]= r.getInt(6);
                pracm[ctr]= r.getInt(7);
                ctr++;
                r.next();
            }
            for(int i =0;i<sub;i++)System.out.println(SCId[i]+"   "+Cno[i]+"     "+credit[i]+"     "+tot[i]);
            
            r.first();
            for(int i =0; i<sub;i++)
            {
                for(int j =0;j<3;j++)
                   {
                       if(j==0)
                           jTable1.setValueAt(i+1, i, j);
                       else if(j==1)
                           jTable1.setValueAt(r.getString(2), i, j);
                       else if(j==2)
                           jTable1.setValueAt(r.getString(3), i, j);
                      
                    }   
                r.next();
            }

        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public boolean isCellEditable(int row, int column) {
        if(column > 2)
            return true;
        else 
            return false;
    }
    
    void Result()
    {
        for(int i=0; i<sub;i++)
        {
            mid[i]=Integer.parseInt(jTable1.getValueAt(i,3).toString());
            th[i]=Integer.parseInt(jTable1.getValueAt(i,4).toString());
            prac[i]=Integer.parseInt(jTable1.getValueAt(i,5).toString());
        
       
            if(thm[i]!=0)
                if(pracm[i]!=0)
                {   if(prac[i]<12)
                        pf[i]="F/P";
            
                    else if((mid[i]+th[i])<28)
                    {
                        pf[i]="F/T";
                    }
                    else  pf[i]="Pass";
                }
                else 
                {
                    if(th[i]+mid[i]<40)
                        pf[i]="F/T";
                    else pf[i]="Pass";
                }
            else
            {
                if(prac[i]+mid[i]<40)
                    pf[i]= "F/P";
                else pf[i]= "Pass";
            }
                 
        }
    }
    
    void gradecalc()
    {
        gp = new float[sub];
        cp = new float[sub];
        
        for(int i=0;i<sub;i++)
        {
            gp[i] = (float)((Float.parseFloat(jTable1.getValueAt(i,3).toString())
                    +Float.parseFloat(jTable1.getValueAt(i,4).toString())
                    +Float.parseFloat(jTable1.getValueAt(i,5).toString()))
                    /tot[i])*10;
            cp[i] = (gp[i]*credit[i]);
            
            System.out.println(gp[i]+"   "+cp[i]+"  "+pf[i]);
                        
        }
        
              
        float totgpa=(float)0.0;
        float totcredits=(float)0.0;
        
        for(int i=0;i<sub;i++)
        {
            totgpa += cp[i];
            totcredits+=credit[i];
        }
        cgpa = (float)(totgpa/totcredits); 
        System.out.println(cgpa+"   "+ totgpa+"   "+totcredits);
        ResultSet r;
        
        try{
            float cgpatot=(float)0.0;
            int totsem=0;
            if (Sem != 1)
            {  
                String sql = "Select * From grades Where EnrollNo='"+jTextField1.getText()+"'";
                pst = conn.prepareStatement(sql);
                r = pst.executeQuery();
                r.next();
                
          
                while(!r.isAfterLast())
                    {
                    totsem++;
                    cgpatot+=r.getFloat(2);
                    r.next();
                    } 
                System.out.println(totsem+"   "+cgpatot);
            
                ogpa = (cgpatot+cgpa)/(totsem+1);
                System.out.println(ogpa+"ogpa ");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
    }
    
    /**
     * @param args the command line arguments*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}