import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AttributeCaptureGUI extends JFrame {
    private JTextField attribute1TextField;
    private JTextField attribute2TextField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public AttributeCaptureGUI() {
        setTitle("Database Operation with Java Swing and MySQL");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel attribute1Label = new JLabel("Enter number 1:");
        attribute1TextField = new JTextField();
        JLabel attribute2Label = new JLabel("Enter number 2:");
        attribute2TextField = new JTextField();
        calculateButton = new JButton("Calculate sum");
        resultLabel = new JLabel();

        panel.add(attribute1Label);
        panel.add(attribute1TextField);
        panel.add(attribute2Label);
        panel.add(attribute2TextField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performOperation();
            }
        });

        add(panel);
        setVisible(true);
    }

    private void performOperation() {
        try {
            double attribute1 = Double.parseDouble(attribute1TextField.getText());
            double attribute2 = Double.parseDouble(attribute2TextField.getText());

            double result = attribute1 + attribute2;

            resultLabel.setText("Result: " + result);

            saveResultToDatabase(attribute1, attribute2, result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter valid numbers.");
        }
    }

    private void saveResultToDatabase(double attribute1, double attribute2, double result) {
        String databaseURL = "jdbc:mysql://localhost:3306/JAVA";
        String username = "root";
        String password = "Amar@1234";

        try (Connection connection = DriverManager.getConnection(databaseURL, username, password)) {
             String useDatabaseQuery = "USE JAVA";
            try (Statement useDatabaseStatement = connection.createStatement()) {
                useDatabaseStatement.executeUpdate(useDatabaseQuery);
            }

            String createTableQuery = "CREATE TABLE IF NOT EXISTS results (id INT PRIMARY KEY AUTO_INCREMENT, attribute1 DOUBLE, attribute2 DOUBLE, result DOUBLE)";
            try (Statement statement = connection.createStatement()) {
                statement.executeUpdate(createTableQuery);
            }

            String insertQuery = "INSERT INTO results (attribute1, attribute2, result) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setDouble(1, attribute1);
                preparedStatement.setDouble(2, attribute2);
                preparedStatement.setDouble(3, result);
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AttributeCaptureGUI());
    }
}


    

