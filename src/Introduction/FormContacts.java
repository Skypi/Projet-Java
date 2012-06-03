package Introduction;

/**
 *
 * @author Acho
 */

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormContacts extends javax.swing.JFrame {

    /**
     * Creates new form FormContacts
     */
    public FormContacts() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableContacts = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtRechercher = new javax.swing.JTextField();
        btnRechercher = new javax.swing.JButton();
        btnAfficher = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtNom = new javax.swing.JTextField();
        txtPrenom = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAdresse = new javax.swing.JTextField();
        txtVille = new javax.swing.JTextField();
        txtCdp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnModifier = new javax.swing.JButton();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        txtEntreprise = new javax.swing.JTextField();
        txtLoisirs = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        TableContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TableContacts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableContactsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TableContacts);

        txtRechercher.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        txtRechercher.setText("Rechercher");

        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        btnAfficher.setText("Reset");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Rechercher");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel10))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRechercher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfficher, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRechercher)
                    .addComponent(btnAfficher))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Liste de contact");

        jLabel1.setText("Nom :");

        jLabel2.setText("Prénom :");

        jLabel3.setText("Email :");

        jLabel4.setText("Adresse :");

        jLabel5.setText("Ville :");

        jLabel6.setText("Code postal :");

        btnModifier.setLabel("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnAjouter.setText("Ajouter");
        btnAjouter.setMaximumSize(new java.awt.Dimension(81, 23));
        btnAjouter.setMinimumSize(new java.awt.Dimension(81, 23));
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        txtLoisirs.setToolTipText("");

        jLabel7.setText("Entreprise");
        jLabel7.setToolTipText("");

        jLabel8.setText("Loisirs");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fiche d'informations");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtNom, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnModifier, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoisirs, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCdp, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtNom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(txtCdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLoisirs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModifier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSupprimer)))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel11)))
                .addGap(111, 111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Load FormContacts
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {

// ---------------------------------------------------------------------------------------------            
// CONNEXION AVEC BDD
            
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfriendsjava", "root", "");
            St = cnx.createStatement();
            
// FIN CONNEXION AVEC BDD
// ---------------------------------------------------------------------------------------------       
// AFFICHAGE DES INFORMATIONS DANS LE TABLEAU 
            
            dt = new DefaultTableModel();
            dt.addColumn("nom");
            dt.addColumn("prenom");
            dt.addColumn("email");
            dt.addColumn("adresse");
            dt.addColumn("ville");
            dt.addColumn("cdp");
            dt.addColumn("entreprise");
            dt.addColumn("loisirs");
            TableContacts.setModel(dt);
            // Afficher la liste des Contacts
            AfficherContact();
            // Remplir les champs

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de connexion\n" + e.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

// FIN AFFICHAGE DES INFORMATIONS DANS LE TABLEAU 
// ---------------------------------------------------------------------------------------------
// EVENEMENT ELEMENT DU TABLEAU
    
    private void TableContactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableContactsMouseClicked
        try {
            i = TableContacts.getSelectedRow();
            DeplacerContact(i);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur selection\n" + e.getMessage());
        }
    }//GEN-LAST:event_TableContactsMouseClicked
    
// FIN EVENEMNT ELEMENT DU TABLEAU
// ---------------------------------------------------------------------------------------------
// GESTION BOUTON AJOUTER CONTACT
    
    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed

      rqt = "INSERT INTO contacts (nom, prenom, email, adresse, ville, cdp, entreprise, loisirs) VALUES('"+txtNom.getText()+"', '"+txtPrenom.getText()+"', '"+txtEmail.getText()+"', '"+txtAdresse.getText()+"', '"+txtVille.getText()+"', '"+txtCdp.getText()+"', '"+txtEntreprise.getText()+"', '"+txtLoisirs.getText()+"');";
      sel = "SELECT nom FROM contacts WHERE nom = ('"+txtNom.getText()+"')"; 
      
      try {
          // Verification de doublons dans la base de données
          St.executeQuery(sel);
          ResultSet result_set = St.executeQuery(sel);
          
          if (result_set.next() != false ){
              reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous créer le contact\n" + txtNom.getText() + "\n car il existe déjà", "Confirmation" , JOptionPane.YES_NO_OPTION);
          }         
    
          if( reponse == JOptionPane.YES_OPTION){
              St.executeUpdate(rqt);
              AfficherContact();
              JOptionPane.showMessageDialog(null, "Vous avez créer le contact \n" + txtNom.getText());
          } 
          
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Erreur d'ajout de contact \n" + e.getMessage());
      }
   
    }//GEN-LAST:event_btnAjouterActionPerformed

// FIN GESTION BOUTON AJOUTER CONTACT
// ---------------------------------------------------------------------------------------------
// GESTION BOUTON MODIFIER CONTACT
    
    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
        rqtModif = "UPDATE contacts SET prenom='"+txtPrenom.getText()+"', email='"+txtEmail.getText()+"', adresse='"+txtAdresse.getText()+"', ville='"+txtVille.getText()+"', cdp='"+txtCdp.getText()+"', entreprise='"+txtEntreprise.getText()+"', loisirs='"+txtLoisirs.getText()+"' WHERE nom = ('"+txtNom.getText()+"')";
        
        try {
            if(JOptionPane.showConfirmDialog(null, "Confirmer la modification","Modification",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION){
            St.executeUpdate(rqtModif);
            AfficherContact(); // Mise à jour de la liste de contacts
            JOptionPane.showMessageDialog(null, "Vous avez créer le contact \n" + txtNom.getText());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de modification de contact \n" + e.getMessage());
        }
    }//GEN-LAST:event_btnModifierActionPerformed

// FIN GESTION BOUTON MODIFIER CONTACT
// ---------------------------------------------------------------------------------------------  
// GESTION BOUTON SUPPRESSION CONTACT 
    
    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
        try {
            if(JOptionPane.showConfirmDialog(null, "Confirmer la suppression", "Suppression",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
                rqtDel = "DELETE FROM contacts WHERE nom = ('"+txtNom.getText()+"')";
                St.executeUpdate(rqtDel);
                AfficherContact();
                JOptionPane.showMessageDialog(null, "Le contact a été supprimé\n");
            }   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de suppression de contact \n" + e.getMessage());
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

// FIN GESTION BOUTON SUPPRESSION CONTACT
// --------------------------------------------------------------------------------------------- 
// GESTION BOUTON AFFICHER RECHERCHE
    
    private void btnAfficherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfficherActionPerformed
        try{
            AfficherContact ();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'affichage \n" + e.getMessage());
        }
    }//GEN-LAST:event_btnAfficherActionPerformed

// FIN GESTION BOUTON AFFICHER RECHERCHE
// ---------------------------------------------------------------------------------------------
//GESTION BOUTON RECHERCHER   
    
    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        stringRqt = txtRechercher.getText();
        rqtRecherche = "SELECT nom, prenom, adresse, cdp, ville, email, entreprise, loisirs FROM contacts WHERE nom LIKE '%"+stringRqt+"%' OR prenom LIKE '%"+stringRqt+"%' OR adresse LIKE '%"+stringRqt+"%' OR cdp LIKE '%"+stringRqt+"%' OR  ville LIKE '%"+stringRqt+"%' OR email LIKE '%"+stringRqt+"%' OR entreprise LIKE '%"+stringRqt+"%' OR loisirs LIKE '%"+stringRqt+"%'";
        try{
            dt.setRowCount(0); // On vide la liste
            Rs = St.executeQuery(rqtRecherche);

            while(Rs.next()){
                nom = Rs.getString(1);
                prenom = Rs.getString(2);
                email = Rs.getString(3);
                adresse = Rs.getString(4);
                ville = Rs.getString(5);
                cdp = Rs.getString(6);
                entreprise = Rs.getString(7);
                loisirs = Rs.getString(8);
                Object[] contacts = {nom, prenom, email, adresse, ville, cdp, entreprise, loisirs};
                dt.addRow(contacts);
            }
            if (dt.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "Aucun contact");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de recherche \n" + e.getMessage());
        }
    }//GEN-LAST:event_btnRechercherActionPerformed
    
// FIN GESTION BOUTON RECHERCHER
// ---------------------------------------------------------------------------------------------   
// PROCEDURE DE REMPLISSAGE DES CHAMPS
    
    private void DeplacerContact(int i) {
        try {
            
            /** Introduction des données dans les champs 
             * i représente n° ligne, et 0, 1, 2 ... les colonnes
             **/
            txtNom.setText(dt.getValueAt(i, 0).toString());
            txtPrenom.setText(dt.getValueAt(i, 1).toString());
            txtEmail.setText(dt.getValueAt(i, 2).toString());
            txtAdresse.setText(dt.getValueAt(i, 3).toString());
            txtVille.setText(dt.getValueAt(i, 4).toString());
            txtCdp.setText(dt.getValueAt(i, 5).toString());
            txtEntreprise.setText(dt.getValueAt(i, 6).toString());
            txtLoisirs.setText(dt.getValueAt(i, 7).toString());      
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur de déplacement de contact\n" + e.getMessage());
        }
    }
    
// FIN PROCEDURE DE REMPLISSAGE DES CHAMPS
// ---------------------------------------------------------------------------------------------
// PROCEDURE AFFICHAGE LISTE CONTACTS

private void AfficherContact() {
        try {
            dt.setRowCount(0); // vider la liste des contacts
            Rs = St.executeQuery("Select * From contacts");

            while (Rs.next()) {
                nom = Rs.getString("nom");
                prenom = Rs.getString("prenom");
                email = Rs.getString("email");
                adresse = Rs.getString("adresse");
                ville = Rs.getString("ville");
                cdp = Rs.getString("cdp");
                entreprise = Rs.getString("entreprise");
                loisirs = Rs.getString("loisirs");
                Object[] contacts = {nom, prenom, email, adresse, ville, cdp, entreprise, loisirs};
                dt.addRow(contacts);
            }
            TableContacts.setModel(dt);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'affichage de la liste des contacts \n" + e.getMessage());
        }
}

// FIN PROCEDURE AFFICHAGE LISTE CONTACTS
// ---------------------------------------------------------------------------------------------
// MAIN FONCTION

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormContacts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FormContacts().setVisible(true);
            }
        });
    }

// FIN MAIN FONCTION
// ---------------------------------------------------------------------------------------------
// DECLARATION DE VARIABLES 
    
    private Connection cnx;
    private Statement St;
    private ResultSet Rs, result_set;
    private DefaultTableModel dt;
    private String stringRqt, rqtRecherche, rqtDel, rqtModif, sel, rqt, nom, prenom, email, adresse, cdp, ville, entreprise, loisirs;
    private int i, reponse; // Indice de déplacement
    
// FIN DECLARATION DE VARIABLES
// ---------------------------------------------------------------------------------------------
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableContacts;
    private javax.swing.JButton btnAfficher;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnRechercher;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtAdresse;
    private javax.swing.JTextField txtCdp;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEntreprise;
    private javax.swing.JTextField txtLoisirs;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtPrenom;
    private javax.swing.JTextField txtRechercher;
    private javax.swing.JTextField txtVille;
    // End of variables declaration//GEN-END:variables
}
