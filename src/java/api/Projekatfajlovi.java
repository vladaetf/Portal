/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vlada
 */
@Entity
@Table(name = "projekatfajlovi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projekatfajlovi.findAll", query = "SELECT p FROM Projekatfajlovi p"),
    @NamedQuery(name = "Projekatfajlovi.findByIdprojekatfajlovi", query = "SELECT p FROM Projekatfajlovi p WHERE p.idprojekatfajlovi = :idprojekatfajlovi"),
    @NamedQuery(name = "Projekatfajlovi.findByPoslednjeazuriranje", query = "SELECT p FROM Projekatfajlovi p WHERE p.poslednjeazuriranje = :poslednjeazuriranje")})
public class Projekatfajlovi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprojekatfajlovi")
    private Integer idprojekatfajlovi;
    @Lob
    @Column(name = "opisprojekta")
    private byte[] opisprojekta;
    @Lob
    @Column(name = "budzetprojektaxls")
    private byte[] budzetprojektaxls;
    @Lob
    @Column(name = "gantogram")
    private byte[] gantogram;
    @Lob
    @Column(name = "prezentacijaprojekta")
    private byte[] prezentacijaprojekta;
    @Lob
    @Column(name = "izjave")
    private byte[] izjave;
    @Lob
    @Column(name = "bibliografijarukovodioca")
    private byte[] bibliografijarukovodioca;
    @Lob
    @Column(name = "biografijarukovodioca")
    private byte[] biografijarukovodioca;
    @Lob
    @Column(name = "bibliografijeucesnika")
    private byte[] bibliografijeucesnika;
    @Lob
    @Column(name = "biografijeucesnika")
    private byte[] biografijeucesnika;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poslednjeazuriranje")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poslednjeazuriranje;
    @JoinColumn(name = "idprojekatfajlovi", referencedColumnName = "idprojekat", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Projekat projekat;

    public Projekatfajlovi() {
    }

    public Projekatfajlovi(Integer idprojekatfajlovi) {
        this.idprojekatfajlovi = idprojekatfajlovi;
    }

    public Projekatfajlovi(Integer idprojekatfajlovi, Date poslednjeazuriranje) {
        this.idprojekatfajlovi = idprojekatfajlovi;
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Integer getIdprojekatfajlovi() {
        return idprojekatfajlovi;
    }

    public void setIdprojekatfajlovi(Integer idprojekatfajlovi) {
        this.idprojekatfajlovi = idprojekatfajlovi;
    }

    public byte[] getOpisprojekta() {
        return opisprojekta;
    }

    public void setOpisprojekta(byte[] opisprojekta) {
        this.opisprojekta = opisprojekta;
    }

    public byte[] getBudzetprojektaxls() {
        return budzetprojektaxls;
    }

    public void setBudzetprojektaxls(byte[] budzetprojektaxls) {
        this.budzetprojektaxls = budzetprojektaxls;
    }

    public byte[] getGantogram() {
        return gantogram;
    }

    public void setGantogram(byte[] gantogram) {
        this.gantogram = gantogram;
    }

    public byte[] getPrezentacijaprojekta() {
        return prezentacijaprojekta;
    }

    public void setPrezentacijaprojekta(byte[] prezentacijaprojekta) {
        this.prezentacijaprojekta = prezentacijaprojekta;
    }

    public byte[] getIzjave() {
        return izjave;
    }

    public void setIzjave(byte[] izjave) {
        this.izjave = izjave;
    }

    public byte[] getBibliografijarukovodioca() {
        return bibliografijarukovodioca;
    }

    public void setBibliografijarukovodioca(byte[] bibliografijarukovodioca) {
        this.bibliografijarukovodioca = bibliografijarukovodioca;
    }

    public byte[] getBiografijarukovodioca() {
        return biografijarukovodioca;
    }

    public void setBiografijarukovodioca(byte[] biografijarukovodioca) {
        this.biografijarukovodioca = biografijarukovodioca;
    }

    public byte[] getBibliografijeucesnika() {
        return bibliografijeucesnika;
    }

    public void setBibliografijeucesnika(byte[] bibliografijeucesnika) {
        this.bibliografijeucesnika = bibliografijeucesnika;
    }

    public byte[] getBiografijeucesnika() {
        return biografijeucesnika;
    }

    public void setBiografijeucesnika(byte[] biografijeucesnika) {
        this.biografijeucesnika = biografijeucesnika;
    }

    public Date getPoslednjeazuriranje() {
        return poslednjeazuriranje;
    }

    public void setPoslednjeazuriranje(Date poslednjeazuriranje) {
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Projekat getProjekat() {
        return projekat;
    }

    public void setProjekat(Projekat projekat) {
        this.projekat = projekat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprojekatfajlovi != null ? idprojekatfajlovi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projekatfajlovi)) {
            return false;
        }
        Projekatfajlovi other = (Projekatfajlovi) object;
        if ((this.idprojekatfajlovi == null && other.idprojekatfajlovi != null) || (this.idprojekatfajlovi != null && !this.idprojekatfajlovi.equals(other.idprojekatfajlovi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Projekatfajlovi[ idprojekatfajlovi=" + idprojekatfajlovi + " ]";
    }
    
}
