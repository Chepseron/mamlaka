/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amon.db;

import java.io.Serializable;
import java.util.Collection;
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
 * @author Tech
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "User.findAll", query = "SELECT u FROM User u")
    , @NamedQuery(name = "User.findByIdusers", query = "SELECT u FROM User u WHERE u.idusers = :idusers")
    , @NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username")
    , @NamedQuery(name = "User.findByPword", query = "SELECT u FROM User u WHERE u.pword = :pword")
    , @NamedQuery(name = "User.findByCreatedAt", query = "SELECT u FROM User u WHERE u.createdAt = :createdAt")
    , @NamedQuery(name = "User.findByLastLogin", query = "SELECT u FROM User u WHERE u.lastLogin = :lastLogin")
    , @NamedQuery(name = "User.findByDepartment", query = "SELECT u FROM User u WHERE u.department = :department")
    , @NamedQuery(name = "User.findByName", query = "SELECT u FROM User u WHERE u.name = :name")
    , @NamedQuery(name = "User.findByEmail", query = "SELECT u FROM User u WHERE u.email = :email")
    , @NamedQuery(name = "User.findByPhone", query = "SELECT u FROM User u WHERE u.phone = :phone")
    , @NamedQuery(name = "User.findByStaffID", query = "SELECT u FROM User u WHERE u.staffID = :staffID")
    , @NamedQuery(name = "User.findByRegion", query = "SELECT u FROM User u WHERE u.region = :region")
    , @NamedQuery(name = "User.findByGender", query = "SELECT u FROM User u WHERE u.gender = :gender")
    , @NamedQuery(name = "User.findByDisability", query = "SELECT u FROM User u WHERE u.disability = :disability")
    , @NamedQuery(name = "User.findByCropgrown", query = "SELECT u FROM User u WHERE u.cropgrown = :cropgrown")
    , @NamedQuery(name = "User.findByFarmergroup", query = "SELECT u FROM User u WHERE u.farmergroup = :farmergroup")
    , @NamedQuery(name = "User.findByIdNumber", query = "SELECT u FROM User u WHERE u.idNumber = :idNumber")
    , @NamedQuery(name = "User.findByResidenceAddress", query = "SELECT u FROM User u WHERE u.residenceAddress = :residenceAddress")
    , @NamedQuery(name = "User.findByCity", query = "SELECT u FROM User u WHERE u.city = :city")
    , @NamedQuery(name = "User.findByState", query = "SELECT u FROM User u WHERE u.state = :state")
    , @NamedQuery(name = "User.findByDob", query = "SELECT u FROM User u WHERE u.dob = :dob")
    , @NamedQuery(name = "User.findByCompanyName", query = "SELECT u FROM User u WHERE u.companyName = :companyName")
    , @NamedQuery(name = "User.findByCompanyRegistrationNumber", query = "SELECT u FROM User u WHERE u.companyRegistrationNumber = :companyRegistrationNumber")
    , @NamedQuery(name = "User.findByCompanyAddress", query = "SELECT u FROM User u WHERE u.companyAddress = :companyAddress")
    , @NamedQuery(name = "User.findByCompanyCity", query = "SELECT u FROM User u WHERE u.companyCity = :companyCity")
    , @NamedQuery(name = "User.findByCompanyState", query = "SELECT u FROM User u WHERE u.companyState = :companyState")
    , @NamedQuery(name = "User.findByBankAccName", query = "SELECT u FROM User u WHERE u.bankAccName = :bankAccName")
    , @NamedQuery(name = "User.findByBankAccCode", query = "SELECT u FROM User u WHERE u.bankAccCode = :bankAccCode")
    , @NamedQuery(name = "User.findByPhotoUrl", query = "SELECT u FROM User u WHERE u.photoUrl = :photoUrl")})
public class User implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private Collection<Regions> regionsCollection;
    @OneToMany(mappedBy = "createdby")
    private Collection<Agrodealerproducts> agrodealerproductsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private Collection<Agrodealers> agrodealersCollection;
    @OneToMany(mappedBy = "ownerid")
    private Collection<Agrodealers> agrodealersCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private Collection<Agrodealerproductunits> agrodealerproductunitsCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdby")
    private Collection<Agrodealerproducttypes> agrodealerproducttypesCollection;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "buyer")
    private Collection<Invoices> invoicesCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusers")
    private Integer idusers;
    @Size(max = 45)
    @Column(name = "username")
    private String username;
    @Size(max = 45)
    @Column(name = "pword")
    private String pword;
    @Column(name = "createdAt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "lastLogin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;
    @Column(name = "department")
    private Integer department;
    @Size(max = 100)
    @Column(name = "name")
    private String name;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "email")
    private String email;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 45)
    @Column(name = "phone")
    private String phone;
    @Column(name = "staffID")
    private Integer staffID;
    @Column(name = "region")
    private Integer region;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "gender")
    private String gender;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "disability")
    private String disability;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cropgrown")
    private String cropgrown;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "farmergroup")
    private String farmergroup;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "idNumber")
    private String idNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "residenceAddress")
    private String residenceAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "city")
    private String city;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "state")
    private String state;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyName")
    private String companyName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyRegistrationNumber")
    private String companyRegistrationNumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyAddress")
    private String companyAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyCity")
    private String companyCity;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "companyState")
    private String companyState;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "bankAccName")
    private String bankAccName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "bankAccCode")
    private String bankAccCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "photoUrl")
    private String photoUrl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID")
    private Collection<Loans> loansCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "createdBy")
    private Collection<Loans> loansCollection1;
    @OneToMany(mappedBy = "createdBy")
    private Collection<User> userCollection;
    @JoinColumn(name = "createdBy", referencedColumnName = "idusers")
    @ManyToOne
    private User createdBy;
    @JoinColumn(name = "statusID", referencedColumnName = "idstatus")
    @ManyToOne
    private Status statusID;
    @JoinColumn(name = "groupID", referencedColumnName = "idgroups")
    @ManyToOne
    private Usergroup groupID;

    public User() {
    }

    public User(Integer idusers) {
        this.idusers = idusers;
    }

    public User(Integer idusers, String gender, String disability, String cropgrown, String farmergroup, String idNumber, String residenceAddress, String city, String state, Date dob, String companyName, String companyRegistrationNumber, String companyAddress, String companyCity, String companyState, String bankAccName, String bankAccCode, String photoUrl) {
        this.idusers = idusers;
        this.gender = gender;
        this.disability = disability;
        this.cropgrown = cropgrown;
        this.farmergroup = farmergroup;
        this.idNumber = idNumber;
        this.residenceAddress = residenceAddress;
        this.city = city;
        this.state = state;
        this.dob = dob;
        this.companyName = companyName;
        this.companyRegistrationNumber = companyRegistrationNumber;
        this.companyAddress = companyAddress;
        this.companyCity = companyCity;
        this.companyState = companyState;
        this.bankAccName = bankAccName;
        this.bankAccCode = bankAccCode;
        this.photoUrl = photoUrl;
    }

    public Integer getIdusers() {
        return idusers;
    }

    public void setIdusers(Integer idusers) {
        this.idusers = idusers;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPword() {
        return pword;
    }

    public void setPword(String pword) {
        this.pword = pword;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Integer getDepartment() {
        return department;
    }

    public void setDepartment(Integer department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStaffID() {
        return staffID;
    }

    public void setStaffID(Integer staffID) {
        this.staffID = staffID;
    }

    public Integer getRegion() {
        return region;
    }

    public void setRegion(Integer region) {
        this.region = region;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability;
    }

    public String getCropgrown() {
        return cropgrown;
    }

    public void setCropgrown(String cropgrown) {
        this.cropgrown = cropgrown;
    }

    public String getFarmergroup() {
        return farmergroup;
    }

    public void setFarmergroup(String farmergroup) {
        this.farmergroup = farmergroup;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyRegistrationNumber() {
        return companyRegistrationNumber;
    }

    public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
        this.companyRegistrationNumber = companyRegistrationNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }

    public String getCompanyState() {
        return companyState;
    }

    public void setCompanyState(String companyState) {
        this.companyState = companyState;
    }

    public String getBankAccName() {
        return bankAccName;
    }

    public void setBankAccName(String bankAccName) {
        this.bankAccName = bankAccName;
    }

    public String getBankAccCode() {
        return bankAccCode;
    }

    public void setBankAccCode(String bankAccCode) {
        this.bankAccCode = bankAccCode;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @XmlTransient
    public Collection<Loans> getLoansCollection() {
        return loansCollection;
    }

    public void setLoansCollection(Collection<Loans> loansCollection) {
        this.loansCollection = loansCollection;
    }

    @XmlTransient
    public Collection<Loans> getLoansCollection1() {
        return loansCollection1;
    }

    public void setLoansCollection1(Collection<Loans> loansCollection1) {
        this.loansCollection1 = loansCollection1;
    }

    @XmlTransient
    public Collection<User> getUserCollection() {
        return userCollection;
    }

    public void setUserCollection(Collection<User> userCollection) {
        this.userCollection = userCollection;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public Status getStatusID() {
        return statusID;
    }

    public void setStatusID(Status statusID) {
        this.statusID = statusID;
    }

    public Usergroup getGroupID() {
        return groupID;
    }

    public void setGroupID(Usergroup groupID) {
        this.groupID = groupID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusers != null ? idusers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof User)) {
            return false;
        }
        User other = (User) object;
        if ((this.idusers == null && other.idusers != null) || (this.idusers != null && !this.idusers.equals(other.idusers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amon.db.User[ idusers=" + idusers + " ]";
    }

    @XmlTransient
    public Collection<Invoices> getInvoicesCollection() {
        return invoicesCollection;
    }

    public void setInvoicesCollection(Collection<Invoices> invoicesCollection) {
        this.invoicesCollection = invoicesCollection;
    }

    @XmlTransient
    public Collection<Regions> getRegionsCollection() {
        return regionsCollection;
    }

    public void setRegionsCollection(Collection<Regions> regionsCollection) {
        this.regionsCollection = regionsCollection;
    }

    @XmlTransient
    public Collection<Agrodealerproducts> getAgrodealerproductsCollection() {
        return agrodealerproductsCollection;
    }

    public void setAgrodealerproductsCollection(Collection<Agrodealerproducts> agrodealerproductsCollection) {
        this.agrodealerproductsCollection = agrodealerproductsCollection;
    }

    @XmlTransient
    public Collection<Agrodealers> getAgrodealersCollection() {
        return agrodealersCollection;
    }

    public void setAgrodealersCollection(Collection<Agrodealers> agrodealersCollection) {
        this.agrodealersCollection = agrodealersCollection;
    }

    @XmlTransient
    public Collection<Agrodealers> getAgrodealersCollection1() {
        return agrodealersCollection1;
    }

    public void setAgrodealersCollection1(Collection<Agrodealers> agrodealersCollection1) {
        this.agrodealersCollection1 = agrodealersCollection1;
    }

    @XmlTransient
    public Collection<Agrodealerproductunits> getAgrodealerproductunitsCollection() {
        return agrodealerproductunitsCollection;
    }

    public void setAgrodealerproductunitsCollection(Collection<Agrodealerproductunits> agrodealerproductunitsCollection) {
        this.agrodealerproductunitsCollection = agrodealerproductunitsCollection;
    }

    @XmlTransient
    public Collection<Agrodealerproducttypes> getAgrodealerproducttypesCollection() {
        return agrodealerproducttypesCollection;
    }

    public void setAgrodealerproducttypesCollection(Collection<Agrodealerproducttypes> agrodealerproducttypesCollection) {
        this.agrodealerproducttypesCollection = agrodealerproducttypesCollection;
    }
    
}
