/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vlada
 */
@Entity
@Table(name = "oblastistrazivanja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Oblastistrazivanja.findAll", query = "SELECT o FROM Oblastistrazivanja o"),
    @NamedQuery(name = "Oblastistrazivanja.findByIdoblastIstrazivanja", query = "SELECT o FROM Oblastistrazivanja o WHERE o.idoblastIstrazivanja = :idoblastIstrazivanja"),
    @NamedQuery(name = "Oblastistrazivanja.findByNazivOblastiIstrazivanja", query = "SELECT o FROM Oblastistrazivanja o WHERE o.nazivOblastiIstrazivanja = :nazivOblastiIstrazivanja"),
    @NamedQuery(name = "Oblastistrazivanja.findByPoslednjeazuriranje", query = "SELECT o FROM Oblastistrazivanja o WHERE o.poslednjeazuriranje = :poslednjeazuriranje")})
public class Oblastistrazivanja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idoblastIstrazivanja")
    private Integer idoblastIstrazivanja;
    @Size(max = 200)
    @Column(name = "nazivOblastiIstrazivanja")
    private String nazivOblastiIstrazivanja;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poslednjeazuriranje")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poslednjeazuriranje;
    @OneToMany(mappedBy = "oblastistrazivanja4")
    private Collection<Korisnik> korisnikCollection;
    @OneToMany(mappedBy = "oblastistrazivanja1")
    private Collection<Korisnik> korisnikCollection1;
    @OneToMany(mappedBy = "oblastistrazivanja2")
    private Collection<Korisnik> korisnikCollection2;
    @OneToMany(mappedBy = "oblastistrazivanja3")
    private Collection<Korisnik> korisnikCollection3;
    @OneToMany(mappedBy = "oblastistrazivanja5")
    private Collection<Korisnik> korisnikCollection4;
    @OneToMany(mappedBy = "oblastprojekta")
    private Collection<Projekat> projekatCollection;

    public Oblastistrazivanja() {
    }

    public Oblastistrazivanja(Integer idoblastIstrazivanja) {
        this.idoblastIstrazivanja = idoblastIstrazivanja;
    }

    public Oblastistrazivanja(Integer idoblastIstrazivanja, Date poslednjeazuriranje) {
        this.idoblastIstrazivanja = idoblastIstrazivanja;
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Integer getIdoblastIstrazivanja() {
        return idoblastIstrazivanja;
    }

    public void setIdoblastIstrazivanja(Integer idoblastIstrazivanja) {
        this.idoblastIstrazivanja = idoblastIstrazivanja;
    }

    public String getNazivOblastiIstrazivanja() {
        return nazivOblastiIstrazivanja;
    }

    public void setNazivOblastiIstrazivanja(String nazivOblastiIstrazivanja) {
        this.nazivOblastiIstrazivanja = nazivOblastiIstrazivanja;
    }

    public Date getPoslednjeazuriranje() {
        return poslednjeazuriranje;
    }

    public void setPoslednjeazuriranje(Date poslednjeazuriranje) {
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection() {
        return korisnikCollection;
    }

    public void setKorisnikCollection(Collection<Korisnik> korisnikCollection) {
        this.korisnikCollection = korisnikCollection;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection1() {
        return korisnikCollection1;
    }

    public void setKorisnikCollection1(Collection<Korisnik> korisnikCollection1) {
        this.korisnikCollection1 = korisnikCollection1;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection2() {
        return korisnikCollection2;
    }

    public void setKorisnikCollection2(Collection<Korisnik> korisnikCollection2) {
        this.korisnikCollection2 = korisnikCollection2;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection3() {
        return korisnikCollection3;
    }

    public void setKorisnikCollection3(Collection<Korisnik> korisnikCollection3) {
        this.korisnikCollection3 = korisnikCollection3;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection4() {
        return korisnikCollection4;
    }

    public void setKorisnikCollection4(Collection<Korisnik> korisnikCollection4) {
        this.korisnikCollection4 = korisnikCollection4;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection() {
        return projekatCollection;
    }

    public void setProjekatCollection(Collection<Projekat> projekatCollection) {
        this.projekatCollection = projekatCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idoblastIstrazivanja != null ? idoblastIstrazivanja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Oblastistrazivanja)) {
            return false;
        }
        Oblastistrazivanja other = (Oblastistrazivanja) object;
        if ((this.idoblastIstrazivanja == null && other.idoblastIstrazivanja != null) || (this.idoblastIstrazivanja != null && !this.idoblastIstrazivanja.equals(other.idoblastIstrazivanja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Oblastistrazivanja[ idoblastIstrazivanja=" + idoblastIstrazivanja + " ]";
    }
    
}
