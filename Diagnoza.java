
package wizstom;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="DIAGNOZA")
public class Diagnoza {
    private static final long serialVersionUID = -300025L;
    
    @Column(name="kod_diagnozy")
    @Id
    private String DiagnozaKod;
    
    @Column(name="opis")
    private String DiagnozaOpis;
    
    
    public Diagnoza(String Dopis, String DKod){
         this.DiagnozaKod = DKod;
         this.DiagnozaOpis = Dopis;
         
    }
    
    public Diagnoza(){}
    
    public boolean sprawdzDane()
    {
        if( DiagnozaKod == null || DiagnozaKod.isEmpty()) {
           JOptionPane.showConfirmDialog(null, "Wprowadz Kod diagnozy", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        else if( DiagnozaOpis == null || DiagnozaOpis.isEmpty()) {
           JOptionPane.showConfirmDialog(null, "Wprowadz Opis", "Wskazówka", JOptionPane.DEFAULT_OPTION);
           return false;
        }
        return true;
    } 
    
    
    public void setKodDiagnozy(String kd)
    {
        this.DiagnozaKod = kd;
        
    }
    
    public void setOpisDiagnozy(String opisD)
    {
        this.DiagnozaOpis = opisD;
    }
    
    public String getKodDiagnozy()
    {
        return this.DiagnozaKod;
        
    }
    
    public String getOpisDiagnozy()
    {
        return this.DiagnozaOpis;
    } 
    
}
