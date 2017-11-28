import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTest {
	
	private Connection c;
	//private Statement stmt;
	
	private ResultSet rs;
	private PreparedStatement preparedStatement;
	
  public DbTest() {
	  
	  //Erstellt die Datenbank
	  c = null;
      
      //(Für den Table)
      Statement stmt = null;
      
     try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:test.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
       //Erstellt eine Table
         stmt = c.createStatement();
         String sql = "CREATE TABLE IF NOT EXISTS " + "ERFASSUNG " + 
        		 		"(ID INT PRIMARY KEY		NOT NULL,"+
        		 		"AUTHOR			TEXT	NOT NULL, "+
        		 		"UEBERSCHRIFT	TEXT	NOT NULL," +
        		 		"TEXTFELD		TEXT	NOT NULL)"/* +	
        		 		"IMAGE			TEXT	NOT NULL,)"*/;
         stmt.executeUpdate(sql);
     	rs = stmt.executeQuery("SELECT * FROM ERFASSUNG ORDER BY ID;");
        // stmt.close();
        // c.close();
         
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      
      System.out.println("Table was created, supertoll!");
        
      
      
   }
  
  public void addData(int Id, String author, String ueberschrift, String textFeld/*, String image*/)throws SQLException {
	  preparedStatement = c.prepareStatement("INSERT INTO ERFASSUNG(ID, AUTHOR, UEBERSCHRIFT, TEXTFELD) "+ /*Foto*/
			  									"VALUES(?, ?, ?, ?)");
	  preparedStatement.setInt(1, Id);
	  preparedStatement.setString(2, author);
	  preparedStatement.setString(3, ueberschrift);
	  preparedStatement.setString(4, textFeld);
	//  preparedStatement.setString(5, image);
	  int result = preparedStatement.executeUpdate();		
		
		if (result == 1) {
			c.commit();
			
		}
	}
  
  public int readDB() throws SQLException {
      int i = 0;
      Statement stmt = c.createStatement();
      rs = stmt.executeQuery("SELECT * FROM ERFASSUNG;");
      while(rs.next()) {
          i++;
          int Id = rs.getInt("Id");
          String author_inhalt = rs.getString("AUTHOR");
          String ueberschrift_inhalt = rs.getString("UEBERSCHRIFT");
          String textFeld_inhalt = rs.getString("TEXTFELD");
          
          
         // String tweet_image = rs.getString("tweet_image");

          //Ausgabe zur Überprüfung in der Konsole
          	System.out.println("ID = " + Id);
          	System.out.println("AUTHOR = " + author_inhalt);
          	System.out.println("UEBERSCHRIFT = " + ueberschrift_inhalt);
        	System.out.println("TEXTFELD = " + textFeld_inhalt);
//          System.out.println("TWEET_IMAGE = " + tweet_image);    
      }
      return i;
  }
  
  
  
	  
  }
  
  