
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
@Table(name="STOMATOLOG")
public class Stomatolog implements Serializable{
    private static final long serialVersionUID = -300025L;
    
    @Column(name="ID_stomatologa")
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
    private int StomatologId;
    
    @Column(name="Imie")
    private String Imie;
    
    @Column(name="Nazwisko")
    private String Nazwisko;
    
    @Column(name="Telefon")
    private int Telefon;
    
    @Column(name="Aktywny")
    private boolean Aktywny;
    
    public Stomatolog(String SImie, String SNazwisko, int SID, int STelefon, boolean SAktywny){
         this.Imie = SImie;
         this.Nazwisko = SNazwisko;
         this.StomatologId = SID;
         this.Telefon = STelefon;
         this.Aktywny = SAktywny;
         
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
    public Stomatolog(){}
    
    
    public void setImieStomatologa(String imieSt)
    {
        this.Imie = imieSt;
        
    }
    
    public void setNazwiskoStomatologa(String nazwiskoSt)
    {
        this.Nazwisko = nazwiskoSt;
    }
    
    public void setTelefonStomatologa(int telefonSt)
    {
        this.Telefon = telefonSt;
    }
    
     public void setIDStomatologa(int idSt)
    {
        this.StomatologId = idSt;
    }
     
    public void setAktywny(boolean akt)
    {
        this.Aktywny = akt;
    }
    
    public String getImieStomatologa()
    {
        return this.Imie;   
    }
    
    public String getNazwiskoStomatologa()
    {
        return this.Nazwisko;
    }
    
     public int getIdStomatologa()
    {
        return this.StomatologId;
    }
    
    public Boolean getAktywny()
    {
        try{
           return Aktywny;
       }catch(Exception e)
       {
           return true;
       }
    }
    
    public int getTelefonStomatologa()
    {
        return this.Telefon;
    }
    
    
    
    
    
    
}
