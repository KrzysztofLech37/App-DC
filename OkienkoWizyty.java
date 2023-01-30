/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizstom;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Krzysztof
 */
public class OkienkoWizyty extends javax.swing.JFrame {

    /**
     * Creates new form OkienkoWizyty
     */
    public OkienkoWizyty() {
        initComponents();
        setIconImage(WizStomApp.getAppIcon());
        jIDField.setVisible(false);
        jIDPacjentaField.setVisible( false);
        jIDStomatologaField.setVisible( false);
    }
    
    boolean nowa = false;
    ListaWizyt ListaWiz;
    
    public void UstawListe( ListaWizyt l)
    { 
        ListaWiz = l;
    }
      
    public void WybierzPacjenta( String Id, String Imie, String Nazwisko)
    {
        jIDPacjentaField.setText( Id );
        String Pacjent = Imie + " " + Nazwisko;
        jPacjentField.setText( Pacjent);
    }
    
    public void WybierzStomatologa( String Id, String Imie, String Nazwisko)
    {
        jIDStomatologaField.setText( Id );
        String Stomatolog = Imie + " " + Nazwisko;
        jStomatologField.setText( Stomatolog);
    }
 
    
    public void WybierzDiagnoze( String Id)
    {
        jKodDiagnozyField.setText( Id );
     
    }
    
    public void WybierzUsluge( String Id)
    {
        jKodUslugiField.setText( Id );
     
    }
    
    public void UkryjPolaDlaNowejWizyty()
    {
        nowa = true;
        jZabField.setVisible(false);
        jLabel10.setVisible(false);
        jKodDiagnozyField.setVisible(false);
        jKodUslugiField.setVisible(false);
        jZrealizowano.setVisible(false);
        jZaleceniaField.setVisible(false);
        jLabel2.setVisible(false);
        jLabel1.setVisible(false);
        jLabel8.setVisible(false);
        jWybierzDiagButton.setVisible(false);
        jWybierzUslButton.setVisible(false);
    }
    
    public void UstawWizyte( Wizyta Wiz)
    {
        jIDField.setText(Integer.toString(Wiz.getIDWizyty()));
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yy"); 
        String strDate = "";
        if(Wiz.getDataWizyty() != null)
            strDate = dateFormat.format(Wiz.getDataWizyty()); 
        jDataWizytyField.setText(strDate);
        
        DateFormat czasFormat = new SimpleDateFormat("HH:mm"); 
        String strCzas = "";
        if(Wiz.getCzasWizyty() != null)
            strCzas = czasFormat.format(Wiz.getCzasWizyty()); 
        jCzasWizytyField.setText(strCzas);
        jIDPacjentaField.setText(Integer.toString(Wiz.getIDPacjenta()));
        jPacjentField.setText(Wiz.getPacjent());
        jIDStomatologaField.setText(Integer.toString(Wiz.getIDStomatologa()));
        jStomatologField.setText(Wiz.getStomatolog());
        jZabField.setText(Wiz.getZab());
        jKodDiagnozyField.setText(Wiz.getKodDiagnozy());
        jKodUslugiField.setText(Wiz.getKodUslugi());
        jZaleceniaField.setText(Wiz.getZalecenia());
        jZrealizowano.setSelected(Wiz.getZrealizowano());
 
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
        jAnulujButton = new javax.swing.JButton();
        jKodDiagnozyField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jIDPacjentaField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jDataWizytyField = new javax.swing.JFormattedTextField();
        jPacjentField = new javax.swing.JTextField();
        jWybierzPatButton = new javax.swing.JButton();
        jStomatologField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jWybierzStomButton = new javax.swing.JButton();
        jWybierzDiagButton = new javax.swing.JButton();
        jIDStomatologaField = new javax.swing.JTextField();
        jWybierzUslButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jIDField = new javax.swing.JTextField();
        jZabField = new javax.swing.JTextField();
        jZaleceniaField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jKodUslugiField = new javax.swing.JTextField();
        jZapiszButton = new javax.swing.JButton();
        jZrealizowano = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        znajdzTerminButton = new javax.swing.JButton();
        jCzasWizytyField = new javax.swing.JTextField();

        setTitle("Wizyta");
        setLocation(new java.awt.Point(560, 100));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jAnulujButton.setBackground(new java.awt.Color(255, 255, 204));
        jAnulujButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jAnulujButton.setText("Anuluj");
        jAnulujButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAnulujButtonActionPerformed(evt);
            }
        });

        jKodDiagnozyField.setBackground(new java.awt.Color(204, 255, 255));
        jKodDiagnozyField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jKodDiagnozyField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jKodDiagnozyField.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Zalecenia");

        jIDPacjentaField.setBackground(new java.awt.Color(204, 255, 255));
        jIDPacjentaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jIDPacjentaField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jIDPacjentaField.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Usługa");

        jDataWizytyField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        jDataWizytyField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jPacjentField.setBackground(new java.awt.Color(204, 255, 255));
        jPacjentField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPacjentField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jPacjentField.setEnabled(false);

        jWybierzPatButton.setBackground(new java.awt.Color(51, 255, 255));
        jWybierzPatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jWybierzPatButton.setText("Wybierz");
        jWybierzPatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWybierzPatButtonActionPerformed(evt);
            }
        });

        jStomatologField.setBackground(new java.awt.Color(204, 255, 255));
        jStomatologField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jStomatologField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jStomatologField.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Ząb");

        jWybierzStomButton.setBackground(new java.awt.Color(51, 255, 255));
        jWybierzStomButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jWybierzStomButton.setText("Wybierz");
        jWybierzStomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWybierzStomButtonActionPerformed(evt);
            }
        });

        jWybierzDiagButton.setBackground(new java.awt.Color(51, 255, 255));
        jWybierzDiagButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jWybierzDiagButton.setText("Wybierz");
        jWybierzDiagButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWybierzDiagButtonActionPerformed(evt);
            }
        });

        jIDStomatologaField.setBackground(new java.awt.Color(204, 255, 255));
        jIDStomatologaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jIDStomatologaField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jIDStomatologaField.setEnabled(false);

        jWybierzUslButton.setBackground(new java.awt.Color(51, 255, 255));
        jWybierzUslButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jWybierzUslButton.setText("Wybierz");
        jWybierzUslButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWybierzUslButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Diagnoza");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Pacjent");

        jIDField.setBackground(new java.awt.Color(204, 255, 255));
        jIDField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jIDField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jIDField.setEnabled(false);

        jZabField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jZaleceniaField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Stomatolog");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Data wizyty");

        jKodUslugiField.setBackground(new java.awt.Color(204, 255, 255));
        jKodUslugiField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jKodUslugiField.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jKodUslugiField.setEnabled(false);

        jZapiszButton.setBackground(new java.awt.Color(255, 255, 204));
        jZapiszButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jZapiszButton.setText("Zapisz");
        jZapiszButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jZapiszButtonActionPerformed(evt);
            }
        });

        jZrealizowano.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jZrealizowano.setText("Zrealizowano");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Godz:Min");

        znajdzTerminButton.setText("Znajdź termin");

        jCzasWizytyField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jAnulujButton)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jZapiszButton)
                .addGap(29, 29, 29)
                .addComponent(jIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jIDStomatologaField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jIDPacjentaField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 220, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jStomatologField))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(237, 237, 237))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(jPacjentField, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jZrealizowano, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jCzasWizytyField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(znajdzTerminButton))
                                .addComponent(jDataWizytyField)
                                .addComponent(jZabField)
                                .addComponent(jKodDiagnozyField)
                                .addComponent(jZaleceniaField)
                                .addComponent(jKodUslugiField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(3, 3, 3)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jWybierzPatButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jWybierzStomButton, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jWybierzDiagButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jWybierzUslButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jWybierzPatButton)
                        .addComponent(jPacjentField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jStomatologField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWybierzStomButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jDataWizytyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(jCzasWizytyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(znajdzTerminButton))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jZabField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jKodDiagnozyField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWybierzDiagButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jKodUslugiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jWybierzUslButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jZaleceniaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jZrealizowano, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIDStomatologaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jIDPacjentaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jAnulujButton)
                            .addComponent(jZapiszButton))
                        .addGap(19, 19, 19))))
        );

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jZapiszButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jZapiszButtonActionPerformed
        Wizyta wiz = new Wizyta();

        String IDStr =jIDField.getText();
        int Id = 0;

        if( !IDStr.isEmpty())
        {
            Id = Integer.parseInt(IDStr);
            wiz.setIDWizyty(Id);
        }
        

        String PatStr = jIDPacjentaField.getText();
        if( ! PatStr.isEmpty()) {
            int PatId=Integer.parseInt(PatStr);
            wiz.setIDPacjenta(PatId);
        }
        
        String StomStr = jIDStomatologaField.getText();
        if( !StomStr.isEmpty()) {
            int StomId=Integer.parseInt(StomStr);
            wiz.setIDStomatologa(StomId);
    }
        
        Date DataWizyty;

        try {
            DataWizyty = new SimpleDateFormat("dd.MM.yyyy").parse(jDataWizytyField.getText());
            wiz.setDataWizyty(DataWizyty);
        } catch (ParseException ex) {
            Logger.getLogger(OkienkoWizyty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Date CzasWizyty;
        
        try {
            CzasWizyty = new SimpleDateFormat("HH:mm").parse(jCzasWizytyField.getText());
            wiz.setCzasWizyty(CzasWizyty);
        } catch (ParseException ex) {
            Logger.getLogger(OkienkoWizyty.class.getName()).log(Level.SEVERE, null, ex);
        }
        
  
        wiz.setZab(jZabField.getText());
        wiz.setKodDiagnozy(jKodDiagnozyField.getText());
        wiz.setKodUslugi(jKodUslugiField.getText());
        wiz.setZalecenia(jZaleceniaField.getText());
        wiz.setZrealizowano(jZrealizowano.isSelected());

        if( wiz.sprawdzDane(nowa)) {
            AppSession appses = new AppSession();
            Session session= appses.OpenSession();

            Transaction trans = session.beginTransaction();
            if ( Id==0)
                 session.save(wiz);
            else
                 session.update(wiz);
            trans.commit();

            appses.CloseSession();
        
            setVisible(false);
            ListaWiz.wczytaj();
        }

    }//GEN-LAST:event_jZapiszButtonActionPerformed

    private void jAnulujButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAnulujButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jAnulujButtonActionPerformed

    private void jWybierzPatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWybierzPatButtonActionPerformed
        ListaPacjentow lista = new ListaPacjentow();

        lista.setOkienkoWizyty( this);
        lista.wczytaj();
        lista.setVisible(true);
    }//GEN-LAST:event_jWybierzPatButtonActionPerformed

    private void jWybierzStomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWybierzStomButtonActionPerformed
        ListaStomatologow lista = new ListaStomatologow();

        lista.setOkienkoWizyty( this);
        lista.wczytaj();
        lista.setVisible(true);
    }//GEN-LAST:event_jWybierzStomButtonActionPerformed

    private void jWybierzDiagButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWybierzDiagButtonActionPerformed
        ListaDiagnoz lista = new ListaDiagnoz();

        lista.setOkienkoWizyty( this);
        lista.wczytaj();
        lista.setVisible(true);
    }//GEN-LAST:event_jWybierzDiagButtonActionPerformed

    private void jWybierzUslButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWybierzUslButtonActionPerformed
        ListaUslug lista = new ListaUslug();

        lista.setOkienkoWizyty( this);
        lista.wczytaj();
        lista.setVisible(true);
    }//GEN-LAST:event_jWybierzUslButtonActionPerformed

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
            java.util.logging.Logger.getLogger(OkienkoWizyty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OkienkoWizyty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OkienkoWizyty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OkienkoWizyty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OkienkoWizyty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAnulujButton;
    private javax.swing.JTextField jCzasWizytyField;
    private javax.swing.JFormattedTextField jDataWizytyField;
    private javax.swing.JTextField jIDField;
    private javax.swing.JTextField jIDPacjentaField;
    private javax.swing.JTextField jIDStomatologaField;
    private javax.swing.JTextField jKodDiagnozyField;
    private javax.swing.JTextField jKodUslugiField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jPacjentField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jStomatologField;
    private javax.swing.JButton jWybierzDiagButton;
    private javax.swing.JButton jWybierzPatButton;
    private javax.swing.JButton jWybierzStomButton;
    private javax.swing.JButton jWybierzUslButton;
    private javax.swing.JTextField jZabField;
    private javax.swing.JTextField jZaleceniaField;
    private javax.swing.JButton jZapiszButton;
    private javax.swing.JCheckBox jZrealizowano;
    private javax.swing.JButton znajdzTerminButton;
    // End of variables declaration//GEN-END:variables
}
