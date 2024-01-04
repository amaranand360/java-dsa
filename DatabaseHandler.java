import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseHandler {
    private static final String URL = "jdbc:mysql://localhost:3306/JAVA";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    public static void createTable() {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Attributes (" +
                                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                                    "attribute1 VARCHAR(255)," +
                                    "attribute2 VARCHAR(255)" +
                                    ")";
            statement.executeUpdate(createTableSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to insert data into the database
    public static void insertData(String attribute1, String attribute2) {
        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            String insertSQL = "INSERT INTO Attributes (attribute1, attribute2) VALUES ('" +
                               attribute1 + "', '" + attribute2 + "')";
            statement.executeUpdate(insertSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Other database operations can be added similarly
}


// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;

// public class AttributeCaptureGUI extends JFrame {
//     private JTextField attribute1Field;
//     private JTextField attribute2Field;

//     public AttributeCaptureGUI() {
//         setTitle("Attribute Capture");
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setLayout(new GridLayout(3, 2));

//         JLabel attribute1Label = new JLabel("Attribute 1:");
//         attribute1Field = new JTextField();
//         JLabel attribute2Label = new JLabel("Attribute 2:");
//         attribute2Field = new JTextField();

//         JButton submitButton = new JButton("Submit");
//         submitButton.addActionListener(new ActionListener() {
//             @Override
//             public void actionPerformed(ActionEvent e) {
//                 String attribute1 = attribute1Field.getText();
//                 String attribute2 = attribute2Field.getText();
//                 // Process and store these attributes into the database
//                 // Implement database insertion here
//             }
//         });

//         add(attribute1Label);
//         add(attribute1Field);
//         add(attribute2Label);
//         add(attribute2Field);
//         add(new JLabel()); // Placeholder for formatting
//         add(submitButton);

//         pack();
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(() -> new AttributeCaptureGUI());
//     }
// }
