/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package api;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vlada
 */
@Entity
@Table(name = "rad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rad.findAll", query = "SELECT r FROM Rad r"),
    @NamedQuery(name = "Rad.findByIdrad", query = "SELECT r FROM Rad r WHERE r.idrad = :idrad"),
    @NamedQuery(name = "Rad.findByKategorijarada", query = "SELECT r FROM Rad r WHERE r.kategorijarada = :kategorijarada"),
    @NamedQuery(name = "Rad.findByNazivrada", query = "SELECT r FROM Rad r WHERE r.nazivrada = :nazivrada"),
    @NamedQuery(name = "Rad.findByPotpisnicirada", query = "SELECT r FROM Rad r WHERE r.potpisnicirada = :potpisnicirada"),
    @NamedQuery(name = "Rad.findByIdentifikatorrada", query = "SELECT r FROM Rad r WHERE r.identifikatorrada = :identifikatorrada"),
    @NamedQuery(name = "Rad.findByRadobjavljenu", query = "SELECT r FROM Rad r WHERE r.radobjavljenu = :radobjavljenu"),
    @NamedQuery(name = "Rad.findByPoslednjeazuriranje", query = "SELECT r FROM Rad r WHERE r.poslednjeazuriranje = :poslednjeazuriranje")})
public class Rad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idrad")
    private Integer idrad;
    @Size(max = 100)
    @Column(name = "kategorijarada")
    private String kategorijarada;
    @Size(max = 500)
    @Column(name = "nazivrada")
    private String nazivrada;
    @Size(max = 500)
    @Column(name = "potpisnicirada")
    private String potpisnicirada;
    @Size(max = 100)
    @Column(name = "identifikatorrada")
    private String identifikatorrada;
    @Size(max = 200)
    @Column(name = "radobjavljenu")
    private String radobjavljenu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "poslednjeazuriranje")
    private String poslednjeazuriranje;
    @OneToMany(mappedBy = "referenca1")
    private Collection<Korisnik> korisnikCollection;
    @OneToMany(mappedBy = "referenca2")
    private Collection<Korisnik> korisnikCollection1;
    @OneToMany(mappedBy = "referenca4")
    private Collection<Korisnik> korisnikCollection2;
    @OneToMany(mappedBy = "referenca5")
    private Collection<Korisnik> korisnikCollection3;
    @OneToMany(mappedBy = "referenca3")
    private Collection<Korisnik> korisnikCollection4;

    public Rad() {
    }

    public Rad(Integer idrad) {
        this.idrad = idrad;
    }

    public Rad(Integer idrad, String poslednjeazuriranje) {
        this.idrad = idrad;
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Integer getIdrad() {
        return idrad;
    }

    public void setIdrad(Integer idrad) {
        this.idrad = idrad;
    }

    public String getKategorijarada() {
        return kategorijarada;
    }

    public void setKategorijarada(String kategorijarada) {
        this.kategorijarada = kategorijarada;
    }

    public String getNazivrada() {
        return nazivrada;
    }

    public void setNazivrada(String nazivrada) {
        this.nazivrada = nazivrada;
    }

    public String getPotpisnicirada() {
        return potpisnicirada;
    }

    public void setPotpisnicirada(String potpisnicirada) {
        this.potpisnicirada = potpisnicirada;
    }

    public String getIdentifikatorrada() {
        return identifikatorrada;
    }

    public void setIdentifikatorrada(String identifikatorrada) {
        this.identifikatorrada = identifikatorrada;
    }

    public String getRadobjavljenu() {
        return radobjavljenu;
    }

    public void setRadobjavljenu(String radobjavljenu) {
        this.radobjavljenu = radobjavljenu;
    }

    public String getPoslednjeazuriranje() {
        return poslednjeazuriranje;
    }

    public void setPoslednjeazuriranje(String poslednjeazuriranje) {
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrad != null ? idrad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rad)) {
            return false;
        }
        Rad other = (Rad) object;
        if ((this.idrad == null && other.idrad != null) || (this.idrad != null && !this.idrad.equals(other.idrad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Rad[ idrad=" + idrad + " ]";
    }
    
}
