import java.io.Console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String url = "jdbc:mysql://localhost:3306/world";
        String user = "root";
        String password;
        Console console = System.console();
        Scanner myObj = new Scanner(System.in); 
        if(console == null)
        {
            System.out.println("Enter password");
            password = myObj.nextLine();
        }
        else
            password = new String(console.readPassword("Enter password: "));
        
        try(Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Country;");
            while(resultSet.next())
            {
                System.out.println("Index method: " + resultSet.getString(2));
                System.out.println("Label method: " + resultSet.getString("Name"));
            }
            resultSet.close();
            myObj.close();
        }
        catch(SQLException ex)
        {
            System.err.println("Exception: " + ex.getMessage());
        }
    }
}
