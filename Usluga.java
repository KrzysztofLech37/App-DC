
package wizstom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;


@Entity
@Table(name="USLUGA")
public class Usluga {
    
    private static final long serialVersionUID = -300025L;
    
    @Column(name="kod_uslugi")
    @Id
    private String KodUslugi;
    
    @Column(name="cena")
    private float Cena;
     
    @Column(name="opis")
    private String Opis;
    
    
    public Usluga( String DKod, String Dopis, float Dcena){
         this.KodUslugi = DKod;
         this.Opis = Dopis;
         this.Cena = Dcena;
         
    }
    
    public boolean sprawdzDane()
    {
        if( KodUslugi == null || KodUslugi.isEmpty()) {
           JOptionPane.showConfirmDialog(null, "Wprowadz Kod usługi", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        else if( Opis == null || Opis.isEmpty()) {
           JOptionPane.showConfirmDialog(null, "Wprowadz Opis", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        return true;
    } 
    
    public Usluga(){}
    
    
    public void setKodUslugi(String kd)
    {
        this.KodUslugi = kd;
        
    }
    
    public void setOpisUslugi(String opisD)
    {
        this.Opis = opisD;
    }
    
    public void setCenaUslugi(float cenaD)
    {
        this.Cena = cenaD;
    }
    
    public String getKodUslugi()
    {
        return this.KodUslugi;
        
    }
    
    public String getOpisUslugi()
    {
        return this.Opis;
    } 

    public float getCenaUslugi()
    {
        return this.Cena;
    } 
    
}
