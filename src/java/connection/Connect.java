package connection;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Connect {

    public Connection connect() {
        Connection c = null;
        String url = "jdbc:postgresql://localhost:5432/Insurance";
        String username = "postgres";
        String password = "root";
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        return c;
    }

}
