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
@Table(name = "lpo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lpo.findAll", query = "SELECT l FROM Lpo l")
    , @NamedQuery(name = "Lpo.findByDateCreated", query = "SELECT l FROM Lpo l WHERE l.dateCreated = :dateCreated")
    , @NamedQuery(name = "Lpo.findByDeliveryDate", query = "SELECT l FROM Lpo l WHERE l.deliveryDate = :deliveryDate")
    , @NamedQuery(name = "Lpo.findBySupplier", query = "SELECT l FROM Lpo l WHERE l.supplier = :supplier")
    , @NamedQuery(name = "Lpo.findByExpiryDate", query = "SELECT l FROM Lpo l WHERE l.expiryDate = :expiryDate")
    , @NamedQuery(name = "Lpo.findByItemCode", query = "SELECT l FROM Lpo l WHERE l.itemCode = :itemCode")
    , @NamedQuery(name = "Lpo.findByBarCode", query = "SELECT l FROM Lpo l WHERE l.barCode = :barCode")
    , @NamedQuery(name = "Lpo.findByItemDescription", query = "SELECT l FROM Lpo l WHERE l.itemDescription = :itemDescription")
    , @NamedQuery(name = "Lpo.findByUnit", query = "SELECT l FROM Lpo l WHERE l.unit = :unit")
    , @NamedQuery(name = "Lpo.findByQty", query = "SELECT l FROM Lpo l WHERE l.qty = :qty")
    , @NamedQuery(name = "Lpo.findByCreatedBy", query = "SELECT l FROM Lpo l WHERE l.createdBy = :createdBy")})
public class Lpo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dateCreated")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Basic(optional = false)
    @NotNull
    @Column(name = "deliveryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deliveryDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supplier")
    private int supplier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "expiryDate")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expiryDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "itemCode")
    private String itemCode;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "barCode")
    private String barCode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 500)
    @Column(name = "itemDescription")
    private String itemDescription;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "unit")
    private String unit;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qty")
    private int qty;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdBy")
    private int createdBy;

    public Lpo() {
    }

    public Lpo(String barCode) {
        this.barCode = barCode;
    }

    public Lpo(String barCode, Date dateCreated, Date deliveryDate, int supplier, Date expiryDate, String itemCode, String itemDescription, String unit, int qty, int createdBy) {
        this.barCode = barCode;
        this.dateCreated = dateCreated;
        this.deliveryDate = deliveryDate;
        this.supplier = supplier;
        this.expiryDate = expiryDate;
        this.itemCode = itemCode;
        this.itemDescription = itemDescription;
        this.unit = unit;
        this.qty = qty;
        this.createdBy = createdBy;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (barCode != null ? barCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lpo)) {
            return false;
        }
        Lpo other = (Lpo) object;
        if ((this.barCode == null && other.barCode != null) || (this.barCode != null && !this.barCode.equals(other.barCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amon.db.Lpo[ barCode=" + barCode + " ]";
    }
    
}
