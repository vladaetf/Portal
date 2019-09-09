/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vlada
 */
@Entity
@Table(name = "projekat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projekat.findAll", query = "SELECT p FROM Projekat p"),
    @NamedQuery(name = "Projekat.findByIdprojekat", query = "SELECT p FROM Projekat p WHERE p.idprojekat = :idprojekat"),
    @NamedQuery(name = "Projekat.findByApstrakt", query = "SELECT p FROM Projekat p WHERE p.apstrakt = :apstrakt"),
    @NamedQuery(name = "Projekat.findByBudzetprojekta", query = "SELECT p FROM Projekat p WHERE p.budzetprojekta = :budzetprojekta"),
    @NamedQuery(name = "Projekat.findByPoslednjeazuriranje", query = "SELECT p FROM Projekat p WHERE p.poslednjeazuriranje = :poslednjeazuriranje")})
public class Projekat implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprojekat")
    private Integer idprojekat;
    @Size(max = 2000)
    @Column(name = "apstrakt")
    private String apstrakt;
    @Column(name = "budzetprojekta")
    private Integer budzetprojekta;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poslednjeazuriranje")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poslednjeazuriranje;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "projekat")
    private Projekatfajlovi projekatfajlovi;
    @JoinColumn(name = "clantima1", referencedColumnName = "idkorisnik")
    @ManyToOne
    private Korisnik clantima1;
    @JoinColumn(name = "clantima2", referencedColumnName = "idkorisnik")
    @ManyToOne
    private Korisnik clantima2;
    @JoinColumn(name = "clantima3", referencedColumnName = "idkorisnik")
    @ManyToOne
    private Korisnik clantima3;
    @JoinColumn(name = "clantima4", referencedColumnName = "idkorisnik")
    @ManyToOne
    private Korisnik clantima4;
    @JoinColumn(name = "clantima5", referencedColumnName = "idkorisnik")
    @ManyToOne
    private Korisnik clantima5;
    @JoinColumn(name = "oblastprojekta", referencedColumnName = "idoblastIstrazivanja")
    @ManyToOne
    private Oblastistrazivanja oblastprojekta;
    @JoinColumn(name = "rukovodilac", referencedColumnName = "idkorisnik")
    @ManyToOne
    private Korisnik rukovodilac;

    public Projekat() {
    }

    public Projekat(Integer idprojekat) {
        this.idprojekat = idprojekat;
    }

    public Projekat(Integer idprojekat, Date poslednjeazuriranje) {
        this.idprojekat = idprojekat;
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Integer getIdprojekat() {
        return idprojekat;
    }

    public void setIdprojekat(Integer idprojekat) {
        this.idprojekat = idprojekat;
    }

    public String getApstrakt() {
        return apstrakt;
    }

    public void setApstrakt(String apstrakt) {
        this.apstrakt = apstrakt;
    }

    public Integer getBudzetprojekta() {
        return budzetprojekta;
    }

    public void setBudzetprojekta(Integer budzetprojekta) {
        this.budzetprojekta = budzetprojekta;
    }

    public Date getPoslednjeazuriranje() {
        return poslednjeazuriranje;
    }

    public void setPoslednjeazuriranje(Date poslednjeazuriranje) {
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Projekatfajlovi getProjekatfajlovi() {
        return projekatfajlovi;
    }

    public void setProjekatfajlovi(Projekatfajlovi projekatfajlovi) {
        this.projekatfajlovi = projekatfajlovi;
    }

    public Korisnik getClantima1() {
        return clantima1;
    }

    public void setClantima1(Korisnik clantima1) {
        this.clantima1 = clantima1;
    }

    public Korisnik getClantima2() {
        return clantima2;
    }

    public void setClantima2(Korisnik clantima2) {
        this.clantima2 = clantima2;
    }

    public Korisnik getClantima3() {
        return clantima3;
    }

    public void setClantima3(Korisnik clantima3) {
        this.clantima3 = clantima3;
    }

    public Korisnik getClantima4() {
        return clantima4;
    }

    public void setClantima4(Korisnik clantima4) {
        this.clantima4 = clantima4;
    }

    public Korisnik getClantima5() {
        return clantima5;
    }

    public void setClantima5(Korisnik clantima5) {
        this.clantima5 = clantima5;
    }

    public Oblastistrazivanja getOblastprojekta() {
        return oblastprojekta;
    }

    public void setOblastprojekta(Oblastistrazivanja oblastprojekta) {
        this.oblastprojekta = oblastprojekta;
    }

    public Korisnik getRukovodilac() {
        return rukovodilac;
    }

    public void setRukovodilac(Korisnik rukovodilac) {
        this.rukovodilac = rukovodilac;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprojekat != null ? idprojekat.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projekat)) {
            return false;
        }
        Projekat other = (Projekat) object;
        if ((this.idprojekat == null && other.idprojekat != null) || (this.idprojekat != null && !this.idprojekat.equals(other.idprojekat))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Projekat[ idprojekat=" + idprojekat + " ]";
    }
    
}
