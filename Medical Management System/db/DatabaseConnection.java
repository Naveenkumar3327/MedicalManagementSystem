package com.healthcare.db;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnection {
    // MySQL credentials
    static final String DB_URL = "jdbc:mysql://localhost:3306/HealthcareDB"; // Update with your DB URL
    static final String USER = "root"; // Update with your MySQL username
    static final String PASS = "123456"; // Update with your MySQL password

    // Establish a connection to the database
    public static Connection connect() {
        try {
            // Step 1: Register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Open a connection
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            System.out.println("Connected to the database successfully!");
            return conn;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
            return null;
        }
    }

    // Method to add a new patient with user input
    public static void addPatient() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID: ");
        int patientId = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter Patient Name: ");
        String patientName = sc.nextLine();
        System.out.print("Enter Medical History: ");
        String medicalHistory = sc.nextLine();

        Connection conn = connect();
        if (conn != null) {
            try {
                // SQL statement to insert new patient data
                String sql = "INSERT INTO Patient (patient_id, patient_name, medical_history) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);

                // Set parameters for the SQL query
                stmt.setInt(1, patientId);
                stmt.setString(2, patientName);
                stmt.setString(3, medicalHistory);

                // Execute the insert operation
                stmt.executeUpdate();
                System.out.println("Patient added successfully.");

                // Close resources
                stmt.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // Method to add a new doctor with user input
    public static void addDoctor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Doctor ID: ");
        int doctorId = sc.nextInt();
        sc.nextLine(); // consume the newline character
        System.out.print("Enter Doctor Name: ");
        String doctorName = sc.nextLine();
        System.out.print("Enter Specialty: ");
        String specialty = sc.nextLine();

        Connection conn = connect();
        if (conn != null) {
            try {
                // SQL statement to insert new doctor data
                String sql = "INSERT INTO Doctor (doctor_id, doctor_name, specialty) VALUES (?, ?, ?)";
                PreparedStatement stmt = conn.prepareStatement(sql);

                // Set parameters for the SQL query
                stmt.setInt(1, doctorId);
                stmt.setString(2, doctorName);
                stmt.setString(3, specialty);

                // Execute the insert operation
                stmt.executeUpdate();
                System.out.println("Doctor added successfully.");

                // Close resources
                stmt.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // Method to remove a patient using user input
    public static void removePatient() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Patient ID to remove: ");
        int patientId = sc.nextInt();

        Connection conn = connect();
        if (conn != null) {
            try {
                // SQL statement to remove patient data
                String sql = "DELETE FROM Patient WHERE patient_id = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);

                // Set parameter for the SQL query
                stmt.setInt(1, patientId);

                // Execute the delete operation
                stmt.executeUpdate();
                System.out.println("Patient removed successfully.");

                // Close resources
                stmt.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    // Method to remove a doctor using user input
    public static void removeDoctor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Doctor ID to remove: ");
        int doctorId = sc.nextInt();

        Connection conn = connect();
        if (conn != null) {
            try {
                // SQL statement to remove doctor data
                String sql = "DELETE FROM Doctor WHERE doctor_id = ?";
                PreparedStatement stmt = conn.prepareStatement(sql);

                // Set parameter for the SQL query
                stmt.setInt(1, doctorId);

                // Execute the delete operation
                stmt.executeUpdate();
                System.out.println("Doctor removed successfully.");

                // Close resources
                stmt.close();
                conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nHealthcare System:");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Remove Patient");
            System.out.println("4. Remove Doctor");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    addDoctor();
                    break;
                case 3:
                    removePatient();
                    break;
                case 4:
                    removeDoctor();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
