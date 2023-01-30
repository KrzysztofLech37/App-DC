/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizstom;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Krzysztof
 */



public class ListaDiagnoz extends javax.swing.JFrame {

   
    /**
     * Creates new form diagn
     */
    public ListaDiagnoz() {
        initComponents();
        setIconImage(WizStomApp.getAppIcon());
       
    }
    
    int PozycjaDoUstawienia=-1;
    
    public void UstawPozycje( int Pos)
    {
        PozycjaDoUstawienia = Pos;
    }
    
    public void UkryjWybierz()
    {
        jWybierzButton.setVisible(false);
    }
    
    OkienkoWizyty OkienkoWiz;
    
    public void setOkienkoWizyty( OkienkoWizyty o) {
        OkienkoWiz = o;
    }
    public int wczytaj()
    {
        AppSession appses = new AppSession();
        Session session= appses.OpenSession();
        
        String SqlStr;
        String Kod = jKodField.getText();
        String Opis = jOpisField.getText();
        

        SqlStr = "select * from diagnoza where UPPER(kod_diagnozy) like UPPER('"+Kod+"%') and UPPER(opis) like UPPER('%"+Opis+"%')order by kod_diagnozy";
     
        ArrayList<Diagnoza> rows = (ArrayList<Diagnoza>) session.createSQLQuery(SqlStr).addEntity(Diagnoza.class).list();
        
      
        DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();  
        int rowCount = tblModel.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        

        String data[] = new String[2];
        for(Diagnoza diag: rows){
            data[0]=diag.getKodDiagnozy();
            data[1]=diag.getOpisDiagnozy();
            tblModel.addRow(data);
        }
        
        if ( PozycjaDoUstawienia >= 0 )
        {
            jTable1.setRowSelectionInterval(PozycjaDoUstawienia, PozycjaDoUstawienia);
            PozycjaDoUstawienia = -1;
        }
        appses.CloseSession();
        return 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jWybierzButton = new javax.swing.JButton();
        jKodField = new javax.swing.JTextField();
        jSzukajButton = new javax.swing.JButton();
        jDodajButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jEdytujButton = new javax.swing.JButton();
        jUsunButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jOpisField = new javax.swing.JTextField();

        setTitle("Diagnozy");
        setLocation(new java.awt.Point(200, 200));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(jLabel1);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jWybierzButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jWybierzButton.setText("Wybierz");
        jWybierzButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWybierzButtonActionPerformed(evt);
            }
        });

        jKodField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jSzukajButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSzukajButton.setText("Szukaj");
        jSzukajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSzukajButtonActionPerformed(evt);
            }
        });

        jDodajButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDodajButton.setText("Dodaj Diagnozę");
        jDodajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDodajButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Opis");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kod", "Opis"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(25);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable1);

        jEdytujButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jEdytujButton.setText("Edytuj");
        jEdytujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEdytujButtonActionPerformed(evt);
            }
        });

        jUsunButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jUsunButton.setText("Usuń");
        jUsunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jUsunButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Kod Diagnozy");

        jOpisField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jEdytujButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jUsunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jWybierzButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jKodField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jOpisField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDodajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSzukajButton)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE))
                        .addGap(8, 8, 8)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSzukajButton)
                    .addComponent(jKodField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jDodajButton)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jOpisField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jEdytujButton)
                    .addComponent(jUsunButton)
                    .addComponent(jWybierzButton))
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jDodajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDodajButtonActionPerformed
        // TODO add your handling code here:
        OkienkoDiagnozy dd = new OkienkoDiagnozy();
        dd.UstawListe(this);
        dd.setVisible(true);
    }//GEN-LAST:event_jDodajButtonActionPerformed

    private void jEdytujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEdytujButtonActionPerformed

         int Selected = jTable1.getSelectedRow();
        if(Selected >= 0 )
        {   PozycjaDoUstawienia = Selected;
            String IDSelected = jTable1.getModel().getValueAt(Selected, 0).toString();
            AppSession appses = new AppSession();
            Session session= appses.OpenSession();
            
            Diagnoza Diag;

            Diag = (Diagnoza) session.createSQLQuery("select * from Diagnoza where kod_diagnozy='"+IDSelected+"'")
                    .addEntity(Diagnoza.class).uniqueResult();
            
            OkienkoDiagnozy ds = new OkienkoDiagnozy();
            ds.UstawDiagnoze(Diag);
            ds.UstawListe(this);
            
            appses.CloseSession();
            ds.setVisible(true);
                   

        }
        else
            JOptionPane.showConfirmDialog(null, "Wybierz diagnozę", "Wskazówka", JOptionPane.DEFAULT_OPTION);

    }//GEN-LAST:event_jEdytujButtonActionPerformed

    private void jUsunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jUsunButtonActionPerformed
        int Selected = jTable1.getSelectedRow();

        if(Selected >= 0 )
        {   
            int dialogButton= JOptionPane.showConfirmDialog (null, "Czy napewno chcesz usunąć?","Warning",JOptionPane.YES_NO_OPTION);

            if (dialogButton == JOptionPane.YES_OPTION) {
                String IDSelected = jTable1.getModel().getValueAt(Selected, 0).toString();
                AppSession appses = new AppSession();
                Session session= appses.OpenSession();
                Transaction transaction2 = session.beginTransaction();

                Diagnoza Diag = new Diagnoza();
                Diag.setKodDiagnozy(IDSelected);

                session.delete(Diag);

                transaction2.commit();
                appses.CloseSession();

                DefaultTableModel tblModel  = (DefaultTableModel)jTable1.getModel();
                tblModel.removeRow(Selected);
            }

        }
        else
            JOptionPane.showConfirmDialog(null, "Wybierz diagnozę", "Wskazówka", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jUsunButtonActionPerformed

    private void jSzukajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSzukajButtonActionPerformed
        wczytaj();
    }//GEN-LAST:event_jSzukajButtonActionPerformed

    private void jWybierzButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWybierzButtonActionPerformed
        int Selected = jTable1.getSelectedRow();

        if(Selected >= 0 )
        {   String ID = jTable1.getModel().getValueAt(Selected, 0).toString();
   
            OkienkoWiz.WybierzDiagnoze( ID);
            setVisible(false);
        
        }
        else
            JOptionPane.showConfirmDialog(null, "Wybierz diagnozę", "Wskazówka", JOptionPane.DEFAULT_OPTION);
    }//GEN-LAST:event_jWybierzButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ListaDiagnoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaDiagnoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaDiagnoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaDiagnoz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaDiagnoz().setVisible(true);
            }
        });
    }
    
    private javax.swing.JTable jTable;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jDodajButton;
    private javax.swing.JButton jEdytujButton;
    private javax.swing.JTextField jKodField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jOpisField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSzukajButton;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jUsunButton;
    private javax.swing.JButton jWybierzButton;
    // End of variables declaration//GEN-END:variables
}