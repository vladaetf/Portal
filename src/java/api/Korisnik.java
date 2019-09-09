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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "korisnik")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Korisnik.findAll", query = "SELECT k FROM Korisnik k"),
    @NamedQuery(name = "Korisnik.findByIdkorisnik", query = "SELECT k FROM Korisnik k WHERE k.idkorisnik = :idkorisnik"),
    @NamedQuery(name = "Korisnik.findByTipkorisnika", query = "SELECT k FROM Korisnik k WHERE k.tipkorisnika = :tipkorisnika"),
    @NamedQuery(name = "Korisnik.findByIme", query = "SELECT k FROM Korisnik k WHERE k.ime = :ime"),
    @NamedQuery(name = "Korisnik.findByPrezime", query = "SELECT k FROM Korisnik k WHERE k.prezime = :prezime"),
    @NamedQuery(name = "Korisnik.findByEmail", query = "SELECT k FROM Korisnik k WHERE k.email = :email"),
    @NamedQuery(name = "Korisnik.findByPassword", query = "SELECT k FROM Korisnik k WHERE k.password = :password"),
    @NamedQuery(name = "Korisnik.findByDatumrodjenja", query = "SELECT k FROM Korisnik k WHERE k.datumrodjenja = :datumrodjenja"),
    @NamedQuery(name = "Korisnik.findByDatumzavrsetkaosnstud", query = "SELECT k FROM Korisnik k WHERE k.datumzavrsetkaosnstud = :datumzavrsetkaosnstud"),
    @NamedQuery(name = "Korisnik.findByDatumzavrsetkamaststud", query = "SELECT k FROM Korisnik k WHERE k.datumzavrsetkamaststud = :datumzavrsetkamaststud"),
    @NamedQuery(name = "Korisnik.findByDatumzavrsetkadoktstud", query = "SELECT k FROM Korisnik k WHERE k.datumzavrsetkadoktstud = :datumzavrsetkadoktstud"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja1od", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja1od = :datumzaposlenja1od"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja1do", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja1do = :datumzaposlenja1do"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja2od", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja2od = :datumzaposlenja2od"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja2do", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja2do = :datumzaposlenja2do"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja3od", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja3od = :datumzaposlenja3od"),
    @NamedQuery(name = "Korisnik.findByKorisnikcol", query = "SELECT k FROM Korisnik k WHERE k.korisnikcol = :korisnikcol"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja4od", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja4od = :datumzaposlenja4od"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja4do", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja4do = :datumzaposlenja4do"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja5od", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja5od = :datumzaposlenja5od"),
    @NamedQuery(name = "Korisnik.findByDatumzaposlenja5do", query = "SELECT k FROM Korisnik k WHERE k.datumzaposlenja5do = :datumzaposlenja5do"),
    @NamedQuery(name = "Korisnik.findByPoslednjeazuriranje", query = "SELECT k FROM Korisnik k WHERE k.poslednjeazuriranje = :poslednjeazuriranje")})
public class Korisnik implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idkorisnik")
    private Integer idkorisnik;
    @Column(name = "tipkorisnika")
    private Integer tipkorisnika;
    @Size(max = 45)
    @Column(name = "ime")
    private String ime;
    @Size(max = 45)
    @Column(name = "prezime")
    private String prezime;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "email")
    private String email;
    @Size(max = 45)
    @Column(name = "password")
    private String password;
    @Size(max = 11)
    @Column(name = "datumrodjenja")
    private String datumrodjenja;
    @Size(max = 11)
    @Column(name = "datumzavrsetkaosnstud")
    private String datumzavrsetkaosnstud;
    @Size(max = 11)
    @Column(name = "datumzavrsetkamaststud")
    private String datumzavrsetkamaststud;
    @Size(max = 11)
    @Column(name = "datumzavrsetkadoktstud")
    private String datumzavrsetkadoktstud;
    @Size(max = 11)
    @Column(name = "datumzaposlenja1od")
    private String datumzaposlenja1od;
    @Size(max = 11)
    @Column(name = "datumzaposlenja1do")
    private String datumzaposlenja1do;
    @Size(max = 11)
    @Column(name = "datumzaposlenja2od")
    private String datumzaposlenja2od;
    @Size(max = 11)
    @Column(name = "datumzaposlenja2do")
    private String datumzaposlenja2do;
    @Size(max = 11)
    @Column(name = "datumzaposlenja3od")
    private String datumzaposlenja3od;
    @Size(max = 11)
    @Column(name = "korisnikcol")
    private String korisnikcol;
    @Size(max = 11)
    @Column(name = "datumzaposlenja4od")
    private String datumzaposlenja4od;
    @Size(max = 11)
    @Column(name = "datumzaposlenja4do")
    private String datumzaposlenja4do;
    @Size(max = 11)
    @Column(name = "datumzaposlenja5od")
    private String datumzaposlenja5od;
    @Size(max = 11)
    @Column(name = "datumzaposlenja5do")
    private String datumzaposlenja5do;
    @Basic(optional = false)
    @NotNull
    @Column(name = "poslednjeazuriranje")
    @Temporal(TemporalType.TIMESTAMP)
    private Date poslednjeazuriranje;
    @JoinColumn(name = "oblastistrazivanja4", referencedColumnName = "idoblastIstrazivanja")
    @ManyToOne
    private Oblastistrazivanja oblastistrazivanja4;
    @JoinColumn(name = "doktorskestudije", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova doktorskestudije;
    @JoinColumn(name = "masterstudije", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova masterstudije;
    @JoinColumn(name = "zaposlenje4", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova zaposlenje4;
    @JoinColumn(name = "zaposlenje2", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova zaposlenje2;
    @JoinColumn(name = "oblastistrazivanja1", referencedColumnName = "idoblastIstrazivanja")
    @ManyToOne
    private Oblastistrazivanja oblastistrazivanja1;
    @JoinColumn(name = "oblastistrazivanja2", referencedColumnName = "idoblastIstrazivanja")
    @ManyToOne
    private Oblastistrazivanja oblastistrazivanja2;
    @JoinColumn(name = "zaposlenje1", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova zaposlenje1;
    @JoinColumn(name = "oblastistrazivanja3", referencedColumnName = "idoblastIstrazivanja")
    @ManyToOne
    private Oblastistrazivanja oblastistrazivanja3;
    @JoinColumn(name = "oblastistrazivanja5", referencedColumnName = "idoblastIstrazivanja")
    @ManyToOne
    private Oblastistrazivanja oblastistrazivanja5;
    @JoinColumn(name = "zaposlenje5", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova zaposlenje5;
    @JoinColumn(name = "osnovnestudije", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova osnovnestudije;
    @JoinColumn(name = "referenca1", referencedColumnName = "idrad")
    @ManyToOne
    private Rad referenca1;
    @JoinColumn(name = "referenca2", referencedColumnName = "idrad")
    @ManyToOne
    private Rad referenca2;
    @JoinColumn(name = "referenca4", referencedColumnName = "idrad")
    @ManyToOne
    private Rad referenca4;
    @JoinColumn(name = "referenca5", referencedColumnName = "idrad")
    @ManyToOne
    private Rad referenca5;
    @JoinColumn(name = "referenca3", referencedColumnName = "idrad")
    @ManyToOne
    private Rad referenca3;
    @JoinColumn(name = "zaposlenje3", referencedColumnName = "idustanova")
    @ManyToOne
    private Ustanova zaposlenje3;
    @OneToMany(mappedBy = "clantima1")
    private Collection<Projekat> projekatCollection;
    @OneToMany(mappedBy = "clantima2")
    private Collection<Projekat> projekatCollection1;
    @OneToMany(mappedBy = "clantima3")
    private Collection<Projekat> projekatCollection2;
    @OneToMany(mappedBy = "clantima4")
    private Collection<Projekat> projekatCollection3;
    @OneToMany(mappedBy = "clantima5")
    private Collection<Projekat> projekatCollection4;
    @OneToMany(mappedBy = "rukovodilac")
    private Collection<Projekat> projekatCollection5;

    public Korisnik() {
    }

    public Korisnik(Integer idkorisnik) {
        this.idkorisnik = idkorisnik;
    }

    public Korisnik(Integer idkorisnik, Date poslednjeazuriranje) {
        this.idkorisnik = idkorisnik;
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Integer getIdkorisnik() {
        return idkorisnik;
    }

    public void setIdkorisnik(Integer idkorisnik) {
        this.idkorisnik = idkorisnik;
    }

    public Integer getTipkorisnika() {
        return tipkorisnika;
    }

    public void setTipkorisnika(Integer tipkorisnika) {
        this.tipkorisnika = tipkorisnika;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatumrodjenja() {
        return datumrodjenja;
    }

    public void setDatumrodjenja(String datumrodjenja) {
        this.datumrodjenja = datumrodjenja;
    }

    public String getDatumzavrsetkaosnstud() {
        return datumzavrsetkaosnstud;
    }

    public void setDatumzavrsetkaosnstud(String datumzavrsetkaosnstud) {
        this.datumzavrsetkaosnstud = datumzavrsetkaosnstud;
    }

    public String getDatumzavrsetkamaststud() {
        return datumzavrsetkamaststud;
    }

    public void setDatumzavrsetkamaststud(String datumzavrsetkamaststud) {
        this.datumzavrsetkamaststud = datumzavrsetkamaststud;
    }

    public String getDatumzavrsetkadoktstud() {
        return datumzavrsetkadoktstud;
    }

    public void setDatumzavrsetkadoktstud(String datumzavrsetkadoktstud) {
        this.datumzavrsetkadoktstud = datumzavrsetkadoktstud;
    }

    public String getDatumzaposlenja1od() {
        return datumzaposlenja1od;
    }

    public void setDatumzaposlenja1od(String datumzaposlenja1od) {
        this.datumzaposlenja1od = datumzaposlenja1od;
    }

    public String getDatumzaposlenja1do() {
        return datumzaposlenja1do;
    }

    public void setDatumzaposlenja1do(String datumzaposlenja1do) {
        this.datumzaposlenja1do = datumzaposlenja1do;
    }

    public String getDatumzaposlenja2od() {
        return datumzaposlenja2od;
    }

    public void setDatumzaposlenja2od(String datumzaposlenja2od) {
        this.datumzaposlenja2od = datumzaposlenja2od;
    }

    public String getDatumzaposlenja2do() {
        return datumzaposlenja2do;
    }

    public void setDatumzaposlenja2do(String datumzaposlenja2do) {
        this.datumzaposlenja2do = datumzaposlenja2do;
    }

    public String getDatumzaposlenja3od() {
        return datumzaposlenja3od;
    }

    public void setDatumzaposlenja3od(String datumzaposlenja3od) {
        this.datumzaposlenja3od = datumzaposlenja3od;
    }

    public String getKorisnikcol() {
        return korisnikcol;
    }

    public void setKorisnikcol(String korisnikcol) {
        this.korisnikcol = korisnikcol;
    }

    public String getDatumzaposlenja4od() {
        return datumzaposlenja4od;
    }

    public void setDatumzaposlenja4od(String datumzaposlenja4od) {
        this.datumzaposlenja4od = datumzaposlenja4od;
    }

    public String getDatumzaposlenja4do() {
        return datumzaposlenja4do;
    }

    public void setDatumzaposlenja4do(String datumzaposlenja4do) {
        this.datumzaposlenja4do = datumzaposlenja4do;
    }

    public String getDatumzaposlenja5od() {
        return datumzaposlenja5od;
    }

    public void setDatumzaposlenja5od(String datumzaposlenja5od) {
        this.datumzaposlenja5od = datumzaposlenja5od;
    }

    public String getDatumzaposlenja5do() {
        return datumzaposlenja5do;
    }

    public void setDatumzaposlenja5do(String datumzaposlenja5do) {
        this.datumzaposlenja5do = datumzaposlenja5do;
    }

    public Date getPoslednjeazuriranje() {
        return poslednjeazuriranje;
    }

    public void setPoslednjeazuriranje(Date poslednjeazuriranje) {
        this.poslednjeazuriranje = poslednjeazuriranje;
    }

    public Oblastistrazivanja getOblastistrazivanja4() {
        return oblastistrazivanja4;
    }

    public void setOblastistrazivanja4(Oblastistrazivanja oblastistrazivanja4) {
        this.oblastistrazivanja4 = oblastistrazivanja4;
    }

    public Ustanova getDoktorskestudije() {
        return doktorskestudije;
    }

    public void setDoktorskestudije(Ustanova doktorskestudije) {
        this.doktorskestudije = doktorskestudije;
    }

    public Ustanova getMasterstudije() {
        return masterstudije;
    }

    public void setMasterstudije(Ustanova masterstudije) {
        this.masterstudije = masterstudije;
    }

    public Ustanova getZaposlenje4() {
        return zaposlenje4;
    }

    public void setZaposlenje4(Ustanova zaposlenje4) {
        this.zaposlenje4 = zaposlenje4;
    }

    public Ustanova getZaposlenje2() {
        return zaposlenje2;
    }

    public void setZaposlenje2(Ustanova zaposlenje2) {
        this.zaposlenje2 = zaposlenje2;
    }

    public Oblastistrazivanja getOblastistrazivanja1() {
        return oblastistrazivanja1;
    }

    public void setOblastistrazivanja1(Oblastistrazivanja oblastistrazivanja1) {
        this.oblastistrazivanja1 = oblastistrazivanja1;
    }

    public Oblastistrazivanja getOblastistrazivanja2() {
        return oblastistrazivanja2;
    }

    public void setOblastistrazivanja2(Oblastistrazivanja oblastistrazivanja2) {
        this.oblastistrazivanja2 = oblastistrazivanja2;
    }

    public Ustanova getZaposlenje1() {
        return zaposlenje1;
    }

    public void setZaposlenje1(Ustanova zaposlenje1) {
        this.zaposlenje1 = zaposlenje1;
    }

    public Oblastistrazivanja getOblastistrazivanja3() {
        return oblastistrazivanja3;
    }

    public void setOblastistrazivanja3(Oblastistrazivanja oblastistrazivanja3) {
        this.oblastistrazivanja3 = oblastistrazivanja3;
    }

    public Oblastistrazivanja getOblastistrazivanja5() {
        return oblastistrazivanja5;
    }

    public void setOblastistrazivanja5(Oblastistrazivanja oblastistrazivanja5) {
        this.oblastistrazivanja5 = oblastistrazivanja5;
    }

    public Ustanova getZaposlenje5() {
        return zaposlenje5;
    }

    public void setZaposlenje5(Ustanova zaposlenje5) {
        this.zaposlenje5 = zaposlenje5;
    }

    public Ustanova getOsnovnestudije() {
        return osnovnestudije;
    }

    public void setOsnovnestudije(Ustanova osnovnestudije) {
        this.osnovnestudije = osnovnestudije;
    }

    public Rad getReferenca1() {
        return referenca1;
    }

    public void setReferenca1(Rad referenca1) {
        this.referenca1 = referenca1;
    }

    public Rad getReferenca2() {
        return referenca2;
    }

    public void setReferenca2(Rad referenca2) {
        this.referenca2 = referenca2;
    }

    public Rad getReferenca4() {
        return referenca4;
    }

    public void setReferenca4(Rad referenca4) {
        this.referenca4 = referenca4;
    }

    public Rad getReferenca5() {
        return referenca5;
    }

    public void setReferenca5(Rad referenca5) {
        this.referenca5 = referenca5;
    }

    public Rad getReferenca3() {
        return referenca3;
    }

    public void setReferenca3(Rad referenca3) {
        this.referenca3 = referenca3;
    }

    public Ustanova getZaposlenje3() {
        return zaposlenje3;
    }

    public void setZaposlenje3(Ustanova zaposlenje3) {
        this.zaposlenje3 = zaposlenje3;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection() {
        return projekatCollection;
    }

    public void setProjekatCollection(Collection<Projekat> projekatCollection) {
        this.projekatCollection = projekatCollection;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection1() {
        return projekatCollection1;
    }

    public void setProjekatCollection1(Collection<Projekat> projekatCollection1) {
        this.projekatCollection1 = projekatCollection1;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection2() {
        return projekatCollection2;
    }

    public void setProjekatCollection2(Collection<Projekat> projekatCollection2) {
        this.projekatCollection2 = projekatCollection2;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection3() {
        return projekatCollection3;
    }

    public void setProjekatCollection3(Collection<Projekat> projekatCollection3) {
        this.projekatCollection3 = projekatCollection3;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection4() {
        return projekatCollection4;
    }

    public void setProjekatCollection4(Collection<Projekat> projekatCollection4) {
        this.projekatCollection4 = projekatCollection4;
    }

    @XmlTransient
    public Collection<Projekat> getProjekatCollection5() {
        return projekatCollection5;
    }

    public void setProjekatCollection5(Collection<Projekat> projekatCollection5) {
        this.projekatCollection5 = projekatCollection5;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idkorisnik != null ? idkorisnik.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Korisnik)) {
            return false;
        }
        Korisnik other = (Korisnik) object;
        if ((this.idkorisnik == null && other.idkorisnik != null) || (this.idkorisnik != null && !this.idkorisnik.equals(other.idkorisnik))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "api.Korisnik[ idkorisnik=" + idkorisnik + " ]";
    }
    
}
