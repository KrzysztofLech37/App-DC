
package wizstom;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;
import org.hibernate.cfg.Configuration;

public class WizStomApp {
    
   
    static Configuration configuration;
  
    
     
    public static Configuration GetConfiguration()
    {
        return configuration;
    }
    
    public static Image getAppIcon()
    {
                
        return Toolkit.getDefaultToolkit().getImage("src/wizstom/zab.png");
    }
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
   
            configuration = new Configuration().
                setProperty("connection.driver_class", "org.postgresql.Driver").
                setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/WIZYTY_STOMATOLOGICZNE").
                setProperty("hibernate.connection.username", "postgres").
                setProperty("hibernate.connection.password", "1234").
                setProperty("hibernate.hbm2ddl.auto", "update").
                addAnnotatedClass(Stomatolog.class).
                addAnnotatedClass(Pacjent.class).
                addAnnotatedClass(Wizyta.class).
                addAnnotatedClass(Diagnoza.class).
                addAnnotatedClass(Uzytkownik.class).
                addAnnotatedClass(Usluga.class);
            
            ListaWizyt WS = new ListaWizyt();
            WS.wczytaj();
            WS.setVisible(true);
   
        }
    }
    

