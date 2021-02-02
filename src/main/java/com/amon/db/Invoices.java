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
@Table(name = "invoices")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Invoices.findAll", query = "SELECT i FROM Invoices i")
    , @NamedQuery(name = "Invoices.findByNumber", query = "SELECT i FROM Invoices i WHERE i.number = :number")
    , @NamedQuery(name = "Invoices.findByBranch", query = "SELECT i FROM Invoices i WHERE i.branch = :branch")
    , @NamedQuery(name = "Invoices.findBySupplier", query = "SELECT i FROM Invoices i WHERE i.supplier = :supplier")
    , @NamedQuery(name = "Invoices.findByCreatedOn", query = "SELECT i FROM Invoices i WHERE i.createdOn = :createdOn")
    , @NamedQuery(name = "Invoices.findByCreatedBy", query = "SELECT i FROM Invoices i WHERE i.createdBy = :createdBy")
    , @NamedQuery(name = "Invoices.findByAmount", query = "SELECT i FROM Invoices i WHERE i.amount = :amount")
    , @NamedQuery(name = "Invoices.findByStatus", query = "SELECT i FROM Invoices i WHERE i.status = :status")
    , @NamedQuery(name = "Invoices.findByInterestRate", query = "SELECT i FROM Invoices i WHERE i.interestRate = :interestRate")
    , @NamedQuery(name = "Invoices.findByPaymentDuration", query = "SELECT i FROM Invoices i WHERE i.paymentDuration = :paymentDuration")
    , @NamedQuery(name = "Invoices.findByDiscount", query = "SELECT i FROM Invoices i WHERE i.discount = :discount")
    , @NamedQuery(name = "Invoices.findByAmountDisbursed", query = "SELECT i FROM Invoices i WHERE i.amountDisbursed = :amountDisbursed")
    , @NamedQuery(name = "Invoices.findByInterest", query = "SELECT i FROM Invoices i WHERE i.interest = :interest")})
public class Invoices implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "number")
    private Integer number;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "branch")
    private String branch;
    @Basic(optional = false)
    @NotNull
    @Column(name = "supplier")
    private int supplier;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdBy")
    private int createdBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amount")
    private int amount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @Basic(optional = false)
    @NotNull
    @Column(name = "interestRate")
    private int interestRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "paymentDuration")
    private int paymentDuration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "discount")
    private int discount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "amountDisbursed")
    private int amountDisbursed;
    @Basic(optional = false)
    @NotNull
    @Column(name = "interest")
    private int interest;

    public Invoices() {
    }

    public Invoices(Integer number) {
        this.number = number;
    }

    public Invoices(Integer number, String branch, int supplier, Date createdOn, int createdBy, int amount, int status, int interestRate, int paymentDuration, int discount, int amountDisbursed, int interest) {
        this.number = number;
        this.branch = branch;
        this.supplier = supplier;
        this.createdOn = createdOn;
        this.createdBy = createdBy;
        this.amount = amount;
        this.status = status;
        this.interestRate = interestRate;
        this.paymentDuration = paymentDuration;
        this.discount = discount;
        this.amountDisbursed = amountDisbursed;
        this.interest = interest;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getSupplier() {
        return supplier;
    }

    public void setSupplier(int supplier) {
        this.supplier = supplier;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getPaymentDuration() {
        return paymentDuration;
    }

    public void setPaymentDuration(int paymentDuration) {
        this.paymentDuration = paymentDuration;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getAmountDisbursed() {
        return amountDisbursed;
    }

    public void setAmountDisbursed(int amountDisbursed) {
        this.amountDisbursed = amountDisbursed;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (number != null ? number.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.number == null && other.number != null) || (this.number != null && !this.number.equals(other.number))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amon.db.Invoices[ number=" + number + " ]";
    }
    
}
