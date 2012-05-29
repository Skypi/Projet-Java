/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my.contacteditor;
import java.sql.*;
/**
 *
 * @author Acho
 */
public class connexionBdd {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	recupererContacts();

	}
	
	private static void recupererContacts() {
		// TODO Auto-generated method stub
		
	}
	
	public class recupererContacts {
		
		public recupererContacts() {
			//Info d'accès à la base de données
			String url = "jdbc:mysql://localhost/myfriendsjava";
			String login = "root";
			String passwd = "";
			Connection cn =null;
			Statement st =null;
                        String resultString = "";
			try {
				// Step 1 : downloading of Driver
				Class.forName("com.mysql.jdbc.Driver");
				// Step 2 : connexion backup
				cn = DriverManager.getConnection(url, login, passwd);
				// Step 3 : Statement creation
				st = cn.createStatement();
				String sql = "SELECT `nom`, `prenom` FROM `contacts` ;";
			
				//Step 4 : exécution requête
				ResultSet result = st.executeQuery(sql);
                                
                                //Récupération MetaData
                                ResultSetMetaData resultMeta = result.getMetaData();
                                
                                while(result.next()) {
                                    for(int i = 1; i <= resultMeta.getColumnCount(); i++)
                                    {
                                        if (resultString != "") 
                                            resultString = resultString + result.getObject(i).toString();
                                        else
                                            resultString = result.getObject(i).toString();
                                    }
                                    if(result.next())
                                        resultString = resultString + ", ";
                                }
                                
                                result.close();
                                
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} finally {
				try {
				
					cn.close();
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
						
			}
		}

	}
}
