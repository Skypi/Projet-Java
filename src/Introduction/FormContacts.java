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
        jLabel13 = new javax.swing.JLabel();
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
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MyFriends - Gestionnaire de contacts");
        setResizable(false);
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
        txtRechercher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtRechercherMouseClicked(evt);
            }
        });

        btnRechercher.setText("Rechercher");
        btnRechercher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechercherActionPerformed(evt);
            }
        });

        btnAfficher.setText("Réinitialiser");
        btnAfficher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfficherActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nico\\Documents\\NetBeansProjects\\Projet-Java\\images\\Magnifier.png")); // NOI18N
        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRechercher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAfficher, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRechercher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRechercher)
                    .addComponent(btnAfficher)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Liste de contacts");

        txtAdresse.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel1.setText("Nom :");

        jLabel2.setText("Prénom :");

        jLabel3.setText("Email :");

        jLabel4.setText("Adresse :");

        jLabel5.setText("Ville : ");

        jLabel6.setText("Code postal :");

        btnModifier.setForeground(new java.awt.Color(0, 0, 204));
        btnModifier.setLabel("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnAjouter.setForeground(new java.awt.Color(0, 102, 0));
        btnAjouter.setText("Ajouter");
        btnAjouter.setMaximumSize(new java.awt.Dimension(81, 23));
        btnAjouter.setMinimumSize(new java.awt.Dimension(81, 23));
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setForeground(new java.awt.Color(255, 0, 0));
        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        txtLoisirs.setToolTipText("");

        jLabel7.setText("Entreprise :");
        jLabel7.setToolTipText("");

        jLabel8.setText("Loisirs :");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Fiche d'informations");

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nico\\Documents\\NetBeansProjects\\Projet-Java\\images\\Users.png")); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("*");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("*");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("*");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("*");
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 0));
        jLabel19.setText("*");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("*");

        jLabel21.setText("Champs obligatoires.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCdp, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVille, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                            .addComponent(txtNom, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .addGap(176, 176, 176))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(371, 371, 371)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addComponent(btnModifier, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSupprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(txtEntreprise, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                                            .addComponent(txtLoisirs, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE))
                                        .addGap(11, 11, 11)))
                                .addGap(270, 270, 270))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addGap(536, 536, 536))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEntreprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAdresse, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel4))
                                    .addComponent(txtLoisirs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel21))))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnAjouter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModifier)
                            .addComponent(btnSupprimer)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(121, 121, 121))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nico\\Documents\\NetBeansProjects\\Projet-Java\\images\\Address Book.png")); // NOI18N
        jLabel10.setText("jLabel10");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 625, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1249, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            dt.addColumn("Nom");
            dt.addColumn("Prénom");
            dt.addColumn("Email");
            dt.addColumn("Adresse");
            dt.addColumn("Ville");
            dt.addColumn("Code Postale");
            dt.addColumn("Entreprise");
            dt.addColumn("Loisirs");
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
          ResultSet resultSet = St.executeQuery(sel);
          
		  if ("".equals(txtNom.getText()) || "".equals(txtPrenom.getText()) || "".equals(txtAdresse.getText()) || "".equals(txtCdp.getText()) || "".equals(txtEmail.getText()) || "".equals(txtVille.getText()))
			  JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs obligatoires.", "Suppression",JOptionPane.CLOSED_OPTION);
		  else
		  {
			  if (resultSet.next() != false )
			  {
				  reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment créer le contact : " + txtNom.getText() + " " + txtPrenom.getText() + " alors qu'il existe déjà ?", "Confirmation" , JOptionPane.YES_NO_OPTION);
				  if( reponse == JOptionPane.YES_OPTION){
					  St.executeUpdate(rqt);
					  AfficherContact();
					  JOptionPane.showMessageDialog(null, "Vous avez créé le contact : " + txtNom.getText() + " " + txtPrenom.getText() + ".");
				  }
			  }
			  else
			  {
				  reponse = JOptionPane.showConfirmDialog(null, "Voulez-vous vraiment créer le contact : " + txtNom.getText() + " " + txtPrenom.getText() + " ?", "Confirmation" , JOptionPane.YES_NO_OPTION);
				  if( reponse == JOptionPane.YES_OPTION){
					  St.executeUpdate(rqt);
					  AfficherContact();
					  JOptionPane.showMessageDialog(null, "Vous avez créé le contact :\n" + txtNom.getText() + txtPrenom.getText() + ".");
				  }
			  }
				  
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
		sel = "SELECT nom FROM contacts WHERE nom = ('"+txtNom.getText()+"')"; 
      
        try {
			// Verification de doublons dans la base de données
			St.executeQuery(sel);
			ResultSet resultSet = St.executeQuery(sel);

			if (resultSet.next() == false)
				JOptionPane.showMessageDialog(null, "Veuillez choisir un contact à modifier.", "Modification",JOptionPane.CLOSED_OPTION);
			else
				if ("".equals(txtNom.getText()) || "".equals(txtPrenom.getText()) || "".equals(txtAdresse.getText()) || "".equals(txtCdp.getText()) || "".equals(txtEmail.getText()) || "".equals(txtVille.getText()))
					JOptionPane.showMessageDialog(null, "Veuillez remplir tous les champs obligatoires pour modifier le contact.", "Modification",JOptionPane.CLOSED_OPTION);
				else
					if(JOptionPane.showConfirmDialog(null, "Confirmer la modification ?","Modification",JOptionPane.YES_NO_OPTION)== JOptionPane.OK_OPTION){
						St.executeUpdate(rqtModif);
						AfficherContact(); // Mise à jour de la liste de contacts
						JOptionPane.showMessageDialog(null, "Vous avez modifié le contact :\n" + txtNom.getText() + " " + txtPrenom.getText() + ".");
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
			if ("".equals(txtNom.getText()) && "".equals(txtPrenom.getText()) && "".equals(txtAdresse.getText()) && "".equals(txtCdp.getText()) && "".equals(txtLoisirs.getText()) && "".equals(txtEntreprise.getText()) && "".equals(txtEmail.getText()) && "".equals(txtVille.getText()))
				JOptionPane.showMessageDialog(null, "Veuillez choisir un contact à supprimer.", "Suppression",JOptionPane.CLOSED_OPTION);
			else
				if(JOptionPane.showConfirmDialog(null, "Confirmer la suppression ?", "Suppression",JOptionPane.YES_NO_OPTION) == JOptionPane.OK_OPTION){
					rqtDel = "DELETE FROM contacts WHERE nom = ('"+txtNom.getText()+"') AND prenom = ('"+txtPrenom.getText()+"')";
					St.executeUpdate(rqtDel);
					AfficherContact();
					JOptionPane.showMessageDialog(null, "Le contact a été supprimé.");
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
			txtNom.setText("");
            txtPrenom.setText("");
            txtEmail.setText("");
            txtAdresse.setText("");
            txtVille.setText("");
            txtCdp.setText("");
            txtEntreprise.setText("");
            txtLoisirs.setText(""); 
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erreur d'affichage \n" + e.getMessage());
        }
		txtRechercher.setText("Rechercher");
    }//GEN-LAST:event_btnAfficherActionPerformed

// FIN GESTION BOUTON AFFICHER RECHERCHE
// ---------------------------------------------------------------------------------------------
//GESTION BOUTON RECHERCHER   
    
    private void btnRechercherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechercherActionPerformed
        stringRqt = txtRechercher.getText();
        rqtRecherche = "SELECT nom, prenom, email, adresse, ville, cdp, entreprise, loisirs FROM contacts WHERE nom LIKE '%"+stringRqt+"%' OR prenom LIKE '%"+stringRqt+"%' OR email LIKE '%"+stringRqt+"%' OR adresse LIKE '%"+stringRqt+"%' OR ville LIKE '%"+stringRqt+"%' OR cdp LIKE '%"+stringRqt+"%' OR entreprise LIKE '%"+stringRqt+"%' OR loisirs LIKE '%"+stringRqt+"%'";
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

	private void txtRechercherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRechercherMouseClicked
		if ("Rechercher".equals(txtRechercher.getText()))
			txtRechercher.setText("");
	}//GEN-LAST:event_txtRechercherMouseClicked
    
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
