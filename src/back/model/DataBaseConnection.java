package back.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

    private Connection c = null;
    private final String user = "agentep";
    private final String password = "elornitorrinco";

    public DataBaseConnection() {
    }

    public void getConnection() {

        try{

            c = DriverManager.getConnection("jdbc:postgresql://pruebasistemaerp.postgres.database.azure.com:5432/postgres?sslmode=require&currentSchema=capibarav2",user,password);
            System.out.println("Connected");

        }catch (Exception e){
            System.out.printf(e.getMessage());
        }
    }

    public void disconnect(){
        try{
            c.close();
            System.out.println("Disconected");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
