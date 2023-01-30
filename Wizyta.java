
package wizstom;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="WIZYTA")
public class Wizyta {

     private static final long serialVersionUID = -300025L;
    
    @Column(name="ID_wizyty")
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "wizyta_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )  
    private int WizytaID;

    @Column(name="ID_stomatologa")
    private int StomatologID;
    
    @Column(name="ID_pacjenta")
    private int PacjentID;
    
    @Column(name="Data_wizyty")
    private Date DataWizyty;
    
    @Column(name="Czas_wizyty")
    private Date CzasWizyty;
    
    @Column(name="Zab")
    private String Zab;
    
    @Column(name="Kod_uslugi")
    private String KodUslugi;
    
    @Column(name="Kod_diagnozy")
    private String KodDiagnozy;
    
    @Column(name="Zalecenia")
    private String Zalecenia;
    
    @Column (name="Zrealizowano")
    private boolean Zrealizowano;
    
    private String Pacjent;
    private String Stomatolog;
    
    public Wizyta() {
        
    }
    
    public boolean sprawdzDane(boolean nowa)
    {
        
        if( PacjentID == 0) {
           JOptionPane.showConfirmDialog(null, "Wybierz pacjenta", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        else if( StomatologID == 0) {
           JOptionPane.showConfirmDialog(null, "Wybierz stomatologa", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        else if(!nowa && (KodDiagnozy == null || KodDiagnozy.isEmpty())) {
           JOptionPane.showConfirmDialog(null, "Wybierz diagnozę", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        else if( !nowa && (KodUslugi == null || KodUslugi.isEmpty())) {
           JOptionPane.showConfirmDialog(null, "Wybierz usługę", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        return true;
    }        
   
    public int getIDWizyty() {
        return WizytaID;
    }
    
    public void setIDWizyty( int id ) {
       WizytaID = id;
    }
    
    public boolean getZrealizowano(){
       try{
           return Zrealizowano;
       }catch(Exception e)
       {
           return false;
       }
       
    }
    
    public void setZrealizowano(boolean zr){
        Zrealizowano = zr;
    }
    
    public int getIDStomatologa() {
        return StomatologID;
    }
    
    public void setIDStomatologa( int id ) {
       StomatologID = id;
    }
    
    public int getIDPacjenta() {
        return PacjentID;
    }
    
    public void setIDPacjenta( int id ) {
       PacjentID = id;
    }
    
    public Date getDataWizyty() {
        return DataWizyty;
    }
    
    public void setDataWizyty( Date dt ) {
       DataWizyty = dt;
    }
    
    public Date getCzasWizyty() {
        return CzasWizyty;
    }
    
    public void setCzasWizyty( Date cs ) {
       CzasWizyty = cs;
    }   
    public String getZab() {
        return Zab;
    }
    
    public void setZab( String z ) {
       Zab = z;
    }
    
    public String getKodUslugi() {
        return KodUslugi;
    }
    
    public void setKodUslugi( String u ) {
       KodUslugi = u;
    }
    
    public String getKodDiagnozy() {
        return KodDiagnozy;
    }
    
    public void setKodDiagnozy( String d ) {
       KodDiagnozy = d;
    }
    
    public String getZalecenia() {
        return Zalecenia;
    }
    
    public void setZalecenia( String z ) {
       Zalecenia = z;
    }
    
    public String getPacjent() {
        return Pacjent;
    }
    
    public void setPacjent( String p ) {
       Pacjent = p;
    }
    
    public String getStomatolog() {
        return Stomatolog;
    }
    
    public void setStomatolog( String s ) {
       Stomatolog = s;
    }
}
