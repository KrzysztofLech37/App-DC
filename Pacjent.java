
package wizstom;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="PACJENT")
public class Pacjent implements Serializable{
    
    private static final long serialVersionUID = -300025L;
    
    @Column(name="ID_pacjenta")
    @Id
    @GeneratedValue(generator = "sequence-generator")
    @GenericGenerator(
      name = "sequence-generator",
      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
      parameters = {
        @Parameter(name = "sequence_name", value = "pat_sequence"),
        @Parameter(name = "initial_value", value = "1"),
        @Parameter(name = "increment_size", value = "1")
        }
    )
    
    private int PacjentId;
    
    @Column(name="Imie")
    private String Imie;
    
    @Column(name="Nazwisko")
    private String Nazwisko;
    
    @Column(name="Data_urodzenia")
    private Date DataUr;
    
    @Column(name="PESEL")
    private String Pesel;
    
    @Column(name="Telefon")
    private int Telefon;

    @Column(name="Adres")
    private String Adres;
    
    @Column(name="Kod_pocztowy")
    private String KodPocztowy;
    
    @Column(name="Miejscowosc")
    private String Miejscowosc;
        
    public Pacjent(String im, String naz, int id, int tel){
         this.Imie = im;
         this.Nazwisko = naz;
         this.PacjentId = id;
         this.Telefon = tel;
         
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
    
    public Pacjent(){}
    
    public String getImie()
    {
        return this.Imie;   
    }
    
    public void setImie(String im)
    {
        this.Imie = im;
        
    }
    
    public String getNazwisko()
    {
        return this.Nazwisko;
    }
    
    public void setNazwisko(String naz)
    {
        this.Nazwisko = naz;
    }
         
    public int getTelefon()
    {
        return this.Telefon;
    }
    
    public void setTelefon(int tel)
    {
        this.Telefon = tel;
    }
    
    public int getIdPacjenta()
    {
        return this.PacjentId;
    }
    
     public void setIDPacjenta(int id)
    {
        this.PacjentId = id;
    }
     
    public Date getDataUr()
    {
        return this.DataUr;
    }
    
    public void setDataUr(Date dt)
    {
        DataUr = dt;
    }
    
    public String getPesel()
    {
        return this.Pesel;
    }
    
    public void setPesel(String pes)
    {
        Pesel = pes;
    }
    public String getAdres()
    {
        return this.Adres;
    }
    
    public void setAdres(String adr)
    {
        Adres = adr;
    }
    
    public String getKodPocztowy()
    {
        return this.KodPocztowy;
    }
    
    public void setKodPocztowy(String kod)
    {
        KodPocztowy = kod;
    }
 
    public String getMiejscowosc()
    {
        return this.Miejscowosc;
    }
    
    public void setMiejscowosc(String mie)
    {
        Miejscowosc = mie;
    }
}
