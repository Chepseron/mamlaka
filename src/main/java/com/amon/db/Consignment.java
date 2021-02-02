/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amon.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Amon.kiptoo
 */
@Entity
@Table(name = "consignment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consignment.findAll", query = "SELECT c FROM Consignment c")
    , @NamedQuery(name = "Consignment.findByIdconsignment", query = "SELECT c FROM Consignment c WHERE c.idconsignment = :idconsignment")
    , @NamedQuery(name = "Consignment.findByProductName", query = "SELECT c FROM Consignment c WHERE c.productName = :productName")
    , @NamedQuery(name = "Consignment.findByQty", query = "SELECT c FROM Consignment c WHERE c.qty = :qty")
    , @NamedQuery(name = "Consignment.findByDescription", query = "SELECT c FROM Consignment c WHERE c.description = :description")
    , @NamedQuery(name = "Consignment.findByUnitPrice", query = "SELECT c FROM Consignment c WHERE c.unitPrice = :unitPrice")
    , @NamedQuery(name = "Consignment.findByDiscount", query = "SELECT c FROM Consignment c WHERE c.discount = :discount")
    , @NamedQuery(name = "Consignment.findByLogisticsFee", query = "SELECT c FROM Consignment c WHERE c.logisticsFee = :logisticsFee")
    , @NamedQuery(name = "Consignment.findByTotalPrice", query = "SELECT c FROM Consignment c WHERE c.totalPrice = :totalPrice")
    , @NamedQuery(name = "Consignment.findBySerialBarCode", query = "SELECT c FROM Consignment c WHERE c.serialBarCode = :serialBarCode")
    , @NamedQuery(name = "Consignment.findByConsigneeContact", query = "SELECT c FROM Consignment c WHERE c.consigneeContact = :consigneeContact")
    , @NamedQuery(name = "Consignment.findByConsigneeAddress", query = "SELECT c FROM Consignment c WHERE c.consigneeAddress = :consigneeAddress")
    , @NamedQuery(name = "Consignment.findByConsigneeName", query = "SELECT c FROM Consignment c WHERE c.consigneeName = :consigneeName")
    , @NamedQuery(name = "Consignment.findByConsigneePhone", query = "SELECT c FROM Consignment c WHERE c.consigneePhone = :consigneePhone")
    , @NamedQuery(name = "Consignment.findByConsigneeEmail", query = "SELECT c FROM Consignment c WHERE c.consigneeEmail = :consigneeEmail")
    , @NamedQuery(name = "Consignment.findByUnitOfMeasure", query = "SELECT c FROM Consignment c WHERE c.unitOfMeasure = :unitOfMeasure")
    , @NamedQuery(name = "Consignment.findByCreatedby", query = "SELECT c FROM Consignment c WHERE c.createdby = :createdby")
    , @NamedQuery(name = "Consignment.findByCreatedOn", query = "SELECT c FROM Consignment c WHERE c.createdOn = :createdOn")})
public class Consignment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idconsignment")
    private Integer idconsignment;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "productName")
    private String productName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 400)
    @Column(name = "description")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "unitPrice")
    private int unitPrice;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount")
    private int discount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "logisticsFee")
    private int logisticsFee;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalPrice")
    private int totalPrice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "serialBarCode")
    private String serialBarCode;
    @Basic(optional = false)
    @NotNull
    @Column(name = "consigneeContact")
    private int consigneeContact;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "consigneeAddress")
    private String consigneeAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "consigneeName")
    private String consigneeName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "consigneePhone")
    private String consigneePhone;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "consigneeEmail")
    private String consigneeEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "unitOfMeasure")
    private String unitOfMeasure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdby")
    private int createdby;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;

    public Consignment() {
    }

    public Consignment(Integer idconsignment) {
        this.idconsignment = idconsignment;
    }

    public Consignment(Integer idconsignment, String productName, int qty, String description, int unitPrice, int discount, int logisticsFee, int totalPrice, String serialBarCode, int consigneeContact, String consigneeAddress, String consigneeName, String consigneePhone, String consigneeEmail, String unitOfMeasure, int createdby, Date createdOn) {
        this.idconsignment = idconsignment;
        this.productName = productName;
        this.qty = qty;
        this.description = description;
        this.unitPrice = unitPrice;
        this.discount = discount;
        this.logisticsFee = logisticsFee;
        this.totalPrice = totalPrice;
        this.serialBarCode = serialBarCode;
        this.consigneeContact = consigneeContact;
        this.consigneeAddress = consigneeAddress;
        this.consigneeName = consigneeName;
        this.consigneePhone = consigneePhone;
        this.consigneeEmail = consigneeEmail;
        this.unitOfMeasure = unitOfMeasure;
        this.createdby = createdby;
        this.createdOn = createdOn;
    }

    public Integer getIdconsignment() {
        return idconsignment;
    }

    public void setIdconsignment(Integer idconsignment) {
        this.idconsignment = idconsignment;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getLogisticsFee() {
        return logisticsFee;
    }

    public void setLogisticsFee(int logisticsFee) {
        this.logisticsFee = logisticsFee;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getSerialBarCode() {
        return serialBarCode;
    }

    public void setSerialBarCode(String serialBarCode) {
        this.serialBarCode = serialBarCode;
    }

    public int getConsigneeContact() {
        return consigneeContact;
    }

    public void setConsigneeContact(int consigneeContact) {
        this.consigneeContact = consigneeContact;
    }

    public String getConsigneeAddress() {
        return consigneeAddress;
    }

    public void setConsigneeAddress(String consigneeAddress) {
        this.consigneeAddress = consigneeAddress;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getConsigneePhone() {
        return consigneePhone;
    }

    public void setConsigneePhone(String consigneePhone) {
        this.consigneePhone = consigneePhone;
    }

    public String getConsigneeEmail() {
        return consigneeEmail;
    }

    public void setConsigneeEmail(String consigneeEmail) {
        this.consigneeEmail = consigneeEmail;
    }

    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public int getCreatedby() {
        return createdby;
    }

    public void setCreatedby(int createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idconsignment != null ? idconsignment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consignment)) {
            return false;
        }
        Consignment other = (Consignment) object;
        if ((this.idconsignment == null && other.idconsignment != null) || (this.idconsignment != null && !this.idconsignment.equals(other.idconsignment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amon.db.Consignment[ idconsignment=" + idconsignment + " ]";
    }
    
}
