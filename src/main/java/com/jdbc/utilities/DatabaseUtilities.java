package com.jdbc.utilities;


import java.sql.*;
import java.util.Scanner;

public class DatabaseUtilities {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3307/jdbctest";
    private static final Scanner scanner = new Scanner(System.in);

    public static void executeOperation(Connection connection, int choice){
        switch (choice){
            case 1: addEmployee(connection); break;
            case 2: deleteEmployee(connection); break;
            case 3: updateEmployee(connection); break;
            case 4: viewDatabase(connection); break;
        }
    }

    public static void updateEmployee(Connection connection){
        String query = "update employee set employeeName = ?, role = ?, salary = ? where employeeId = ?;";

        String[] data = getEmpData();
        try(PreparedStatement preparedStatement = connection.prepareStatement(query);) {
            preparedStatement.setString(1, data[0]);
            preparedStatement.setString(2,data[1]);
            preparedStatement.setDouble(3, getSalary());
            preparedStatement.setInt(4, getEmployeeId());

            rowsAffected(preparedStatement);
        }catch (SQLException e){
            System.out.println("Failed to add Employee.");
        }
    }

    public static void addEmployee(Connection connection){
        String query = "insert into employee(employeeName, role, salary) values(?, ?, ?);";
        String[] data = getEmpData();
        try(PreparedStatement preparedStatement = connection.prepareStatement(query);) {
            preparedStatement.setString(1, data[0]);
            preparedStatement.setString(2,data[1]);
            preparedStatement.setDouble(3, getSalary());

            rowsAffected(preparedStatement);
        }catch (SQLException e){
            System.out.println("Failed to add Employee.");
        }
    }

    public static void deleteEmployee(Connection connection){
        String query = "delete from employee where employeeId = ?;";
        try(PreparedStatement preparedStatement = connection.prepareStatement(query);) {

            preparedStatement.setInt(1, getEmployeeId());

            rowsAffected(preparedStatement);

        } catch (SQLException e){
            System.out.println("Failed to delete.");
        }
    }

    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error occurred while connecting to DB");
        }
        return null;
    }

    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException e){
            System.out.println("Failed to close the connection!!");
        }
    }

    public static void viewDatabase(Connection connection){
        try(Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from employee;");) {

            while (resultSet.next()){
                System.out.println(
                        display(
                                resultSet.getInt(1),
                                resultSet.getString(2),
                                resultSet.getString(3),
                                resultSet.getDouble(4)
                        )
                );
            }
        } catch (SQLException e){
            System.out.println("Failed to get data.");
        }
    }



    private static String display(int id, String name, String role, double salary){
        return "Employee {" +
                "employeeId = " + id +
                ", employeeName = '" + name + '\'' +
                ", role = '" + role + '\'' +
                ", salary = " + salary +
                '}';
    }

    private static String[] getEmpData(){
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter role: ");
        String role = scanner.next();
        return new String[]{name, role};
    }

    private static double getSalary(){
        System.out.print("Enter salary: ");
        return scanner.nextDouble();
    }

    private static int getEmployeeId(){
        System.out.print("Enter EmployeeId: ");
        return scanner.nextInt();
    }

    private static void rowsAffected(PreparedStatement preparedStatement) throws SQLException{
        if(preparedStatement.executeUpdate() >= 1) System.out.println("Operation successful.");
        else throw new SQLException();
    }
}
