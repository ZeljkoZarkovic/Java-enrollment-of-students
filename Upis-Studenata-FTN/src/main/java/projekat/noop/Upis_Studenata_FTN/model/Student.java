package projekat.noop.Upis_Studenata_FTN.model;
import jakarta.persistence.*;
import org.apache.hadoop.mapreduce.ID;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="studentiftn")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    private String BR_INDEKSA;
    private String IME;
    private String PREZIME;
    private String DATUM_RODJENJA;
    private String POL;
    private String BRACNI_STATUS;
    private String RADNI_STATUS;
    private String ADRESA;
    private String DRZAVLJANSTVO;

    public Student() {
        super();
    }

    public Student(Integer ID, String BR_INDEKSA, String IME, String PREZIME, String DATUM_RODJENJA, String POL, String BRACNI_STATUS, String RADNI_STATUS, String ADRESA, String DRZAVLJANSTVO) {
        super();
        this.ID = ID;
        this.BR_INDEKSA = BR_INDEKSA;
        this.IME = IME;
        this.PREZIME = PREZIME;
        this.DATUM_RODJENJA = DATUM_RODJENJA;
        this.POL = POL;
        this.BRACNI_STATUS = BRACNI_STATUS;
        this.RADNI_STATUS = RADNI_STATUS;
        this.ADRESA = ADRESA;
        this.DRZAVLJANSTVO = DRZAVLJANSTVO;
    }

    public Integer getID() { return ID; }

    public String getBR_INDEKSA() {
        return BR_INDEKSA;
    }

    public String getIME() {
        return IME;
    }

    public String getPREZIME() {
        return PREZIME;
    }

    public String getDATUM_RODJENJA() {
        return DATUM_RODJENJA;
    }

    public String getPOL() {
        return POL;
    }

    public String getBRACNI_STATUS() {
        return BRACNI_STATUS;
    }

    public String getRADNI_STATUS() {
        return RADNI_STATUS;
    }

    public String getADRESA() {
        return ADRESA;
    }

    public String getDRZAVLJANSTVO() {
        return DRZAVLJANSTVO;
    }

    public void setID(Integer ID) { this.ID = ID; }

    public void setBR_INDEKSA(String BR_INDEKSA) {
        this.BR_INDEKSA = BR_INDEKSA;
    }

    public void setIME(String IME) {
        this.IME = IME;
    }

    public void setDATUM_RODJENJA(String DATUM_RODJENJA) {
        this.DATUM_RODJENJA = DATUM_RODJENJA;
    }

    public void setPREZIME(String PREZIME) {
        this.PREZIME = PREZIME;
    }

    public void setPOL(String POL) {
        this.POL = POL;
    }

    public void setBRACNI_STATUS(String BRACNI_STATUS) {
        this.BRACNI_STATUS = BRACNI_STATUS;
    }

    public void setRADNI_STATUS(String RADNI_STATUS) {
        this.RADNI_STATUS = RADNI_STATUS;
    }

    public void setADRESA(String ADRESA) {
        this.ADRESA = ADRESA;
    }

    public void setDRZAVLJANSTVO(String DRZAVLJANSTVO) {
        this.DRZAVLJANSTVO = DRZAVLJANSTVO;
    }
}
