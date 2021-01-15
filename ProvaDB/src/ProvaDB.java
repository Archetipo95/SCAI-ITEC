import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProvaDB {

    public static void main(String[] args) {
    	
    	System.out.println("MySQL JDBC Connection Testing ~");
    	
    	ArrayList<Person> users = new ArrayList<>();
    	ArrayList<House> houses = new ArrayList<>();
    	
    	/*
    	 * INSERT INTO `mydbsmarthome`.`person` (Name) VALUES ('Martin');
    	 * 
    	 * 
    	*/
    	
        String SQL_SELECT_PERSON = "Select * from PERSON";
        String SQL_SELECT_HOUSE = "Select * from HOUSE";
    	
        // auto close connection
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/mydbsmarthome?serverTimezone=Europe/Rome", "root", "root");
        	
        	PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT_PERSON)) {

                ResultSet resultSet = preparedStatement.executeQuery();

                while (resultSet.next()) {

                	int idPerson = resultSet.getInt("IDPERSON");
                    String name = resultSet.getString("NAME");

                    Person prs = new Person(idPerson, name);

                    users.add(prs);

                }
                users.forEach(x -> System.out.println(x));

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}