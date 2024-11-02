package com.jdbc.mainlogic;

import com.jdbc.utilities.DatabaseUtilities;
import com.jdbc.utilities.Utilities;
import java.sql.Connection;


public class MainLogic {
    public static void run(){
        //make a connection with database and if null just return
        Connection connection = DatabaseUtilities.getConnection();
        if(connection == null) return;

        //print the greet message and menu
        Utilities.welcomeMessage();
        Utilities.menu();

        //execute the database operation
        DatabaseUtilities.executeOperation(connection, Utilities.getChoice());

        //close the connection
        DatabaseUtilities.closeConnection(connection);
    }
}
