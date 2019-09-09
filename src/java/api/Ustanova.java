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
@Table(name = "ustanova")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ustanova.findAll", query = "SELECT u FROM Ustanova u"),
    @NamedQuery(name = "Ustanova.findByIdustanova", query = "SELECT u FROM Ustanova u WHERE u.idustanova = :idustanova"),
    @NamedQuery(name = "Ustanova.findByNazivustanove", query = "SELECT u FROM Ustanova u WHERE u.nazivustanove = :nazivustanove"),
    @NamedQuery(name = "Ustanova.findByAdresaustanove", query = "SELECT u FROM Ustanova u WHERE u.adresaustanove = :adresaustanove"),
    @NamedQuery(name = "Ustanova.findByMestoustanove", query = "SELECT u FROM Ustanova u WHERE u.mestoustanove = :mestoustanove"),
    @NamedQuery(name = "Ustanova.findByTipustanove", query = "SELECT u FROM Ustanova u WHERE u.tipustanove = :tipustanove"),
    @NamedQuery(name = "Ustanova.findByPoslednjeazuriranje", query = "SELECT u FROM Ustanova u WHERE u.poslednjeazuriranje = :poslednjeazuriranje")})
public class Ustanova implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idustanova")
    private Integer idustanova;
    @Size(max = 200)
    @Column(name = "nazivustanove")
    private String nazivustanove;
    @Size(max = 500)
    @Column(name = "adresaustanove")
    private String adresaustanove;
    @Size(max = 45)
    @Column(name = "mestoustanove")
    private String mestoustanove;
    @Column(name = "tipustanove")
    private Integer tipustanove;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poslednjeazuriranje")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poslednjeazuriranje;
    @OneToMany(mappedBy = "doktorskestudije")
    private Collection<Korisnik> korisnikCollection;
    @OneToMany(mappedBy = "masterstudije")
    private Collection<Korisnik> korisnikCollection1;
    @OneToMany(mappedBy = "zaposlenje4")
    private Collection<Korisnik> korisnikCollection2;
    @OneToMany(mappedBy = "zaposlenje2")
    private Collection<Korisnik> korisnikCollection3;
    @OneToMany(mappedBy = "zaposlenje1")
    private Collection<Korisnik> korisnikCollection4;
    @OneToMany(mappedBy = "zaposlenje5")
    private Collection<Korisnik> korisnikCollection5;
    @OneToMany(mappedBy = "osnovnestudije")
    private Collection<Korisnik> korisnikCollection6;
    @OneToMany(mappedBy = "zaposlenje3")
    private Collection<Korisnik> korisnikCollection7;

    public Ustanova() {
    }

    public Ustanova(Integer idustanova) {
        this.idustanova = idustanova;
    }

    public Ustanova(Integer idustanova, Date poslednjeazuriranje) {
        this.idustanova = idustanova;
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Integer getIdustanova() {
        return idustanova;
    }

    public void setIdustanova(Integer idustanova) {
        this.idustanova = idustanova;
    }

    public String getNazivustanove() {
        return nazivustanove;
    }

    public void setNazivustanove(String nazivustanove) {
        this.nazivustanove = nazivustanove;
    }

    public String getAdresaustanove() {
        return adresaustanove;
    }

    public void setAdresaustanove(String adresaustanove) {
        this.adresaustanove = adresaustanove;
    }

    public String getMestoustanove() {
        return mestoustanove;
    }

    public void setMestoustanove(String mestoustanove) {
        this.mestoustanove = mestoustanove;
    }

    public Integer getTipustanove() {
        return tipustanove;
    }

    public void setTipustanove(Integer tipustanove) {
        this.tipustanove = tipustanove;
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
    public Collection<Korisnik> getKorisnikCollection5() {
        return korisnikCollection5;
    }

    public void setKorisnikCollection5(Collection<Korisnik> korisnikCollection5) {
        this.korisnikCollection5 = korisnikCollection5;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection6() {
        return korisnikCollection6;
    }

    public void setKorisnikCollection6(Collection<Korisnik> korisnikCollection6) {
        this.korisnikCollection6 = korisnikCollection6;
    }

    @XmlTransient
    public Collection<Korisnik> getKorisnikCollection7() {
        return korisnikCollection7;
    }

    public void setKorisnikCollection7(Collection<Korisnik> korisnikCollection7) {
        this.korisnikCollection7 = korisnikCollection7;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idustanova != null ? idustanova.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ustanova)) {
            return false;
        }
        Ustanova other = (Ustanova) object;
        if ((this.idustanova == null && other.idustanova != null) || (this.idustanova != null && !this.idustanova.equals(other.idustanova))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Ustanova[ idustanova=" + idustanova + " ]";
    }
    
}
