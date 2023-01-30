
package wizstom;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="UZYTKOWNIK")
public class Uzytkownik implements Serializable{
    private static final long serialVersionUID = -300025L;
    
    @Column(name="ID_uzytkownika")
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "stom_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )
    private int UzytkownikId;
    
    @Column(name="Imie")
    private String Imie;
    
    @Column(name="Nazwisko")
    private String Nazwisko;
    
    @Column (name="Login")
    private String Login;
    
    @Column (name="Haslo")
    private String Haslo;
    
    @Column (name="Administrator")
    private boolean Administrator;
    
    
    public Uzytkownik(String UImie, String UNazwisko, int UID, String UHaslo, String ULogin, boolean UAdmin ){
         this.Imie = UImie;
         this.Nazwisko = UNazwisko;
         this.UzytkownikId = UID;
         this.Login = ULogin;
         this.Haslo = UHaslo;
         this.Administrator = UAdmin;
         
    }
    
    public boolean sprawdzDane()
    {
        if( Nazwisko == null || Nazwisko.isEmpty()) {
           JOptionPane.showConfirmDialog(null, "Wprowadz Nazwisko", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        else if( Imie == null || Imie.isEmpty()) {
           JOptionPane.showConfirmDialog(null, "Wprowadz Imie", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        return true;
    } 
    public Uzytkownik(){}
    
    
    public void setImieUzytkownika(String imieUz)
    {
        this.Imie = imieUz;
        
    }
    
    public void setNazwiskoUzytkownika(String nazwiskoUz)
    {
        this.Nazwisko = nazwiskoUz;
    }
    
    
     public void setIDUzytkownika(int idUz)
    {
        this.UzytkownikId = idUz;
    }
     
    public void setLoginUzytkownika(String logUz)
    {
        this.Login = logUz;
    }
    
    public void setHasloUzytkownika(String hasUz)
    {
        this.Haslo = hasUz;
    }
    
    public void setAdministrator(boolean admin)
    {
        this.Administrator = admin;
    }
    public String getImieUzytkownika()
    {
        return this.Imie;   
    }
    
    public String getNazwiskoUzytkownika()
    {
        return this.Nazwisko;
    }
    
     public int getIdUzytkownika()
    {
        return this.UzytkownikId;
    }
    
    public String getLoginUzytkownika()
    {
        return this.Login;
    }
    
    public String getHasloUzytkownika()
    {
        return this.Haslo;
    }
    
    public boolean getAdministrator()
    {
        try{
           return Administrator;
       }catch(Exception e)
       {
           return false;
       }
    }
    
    
    
    
    
    
    
}
