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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
 * @author Tech
 */
@Entity
@Table(name = "loans")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Loans.findAll", query = "SELECT l FROM Loans l")
    , @NamedQuery(name = "Loans.findByIdloans", query = "SELECT l FROM Loans l WHERE l.idloans = :idloans")
    , @NamedQuery(name = "Loans.findByAggregatorLoanRef", query = "SELECT l FROM Loans l WHERE l.aggregatorLoanRef = :aggregatorLoanRef")
    , @NamedQuery(name = "Loans.findByProductId", query = "SELECT l FROM Loans l WHERE l.productId = :productId")
    , @NamedQuery(name = "Loans.findBySectorId", query = "SELECT l FROM Loans l WHERE l.sectorId = :sectorId")
    , @NamedQuery(name = "Loans.findByLoanTenure", query = "SELECT l FROM Loans l WHERE l.loanTenure = :loanTenure")
    , @NamedQuery(name = "Loans.findByLoanAmount", query = "SELECT l FROM Loans l WHERE l.loanAmount = :loanAmount")
    , @NamedQuery(name = "Loans.findByAnnualInterestRate", query = "SELECT l FROM Loans l WHERE l.annualInterestRate = :annualInterestRate")
    , @NamedQuery(name = "Loans.findByRepaymentStartDate", query = "SELECT l FROM Loans l WHERE l.repaymentStartDate = :repaymentStartDate")
    , @NamedQuery(name = "Loans.findByLoanPurpose", query = "SELECT l FROM Loans l WHERE l.loanPurpose = :loanPurpose")
    , @NamedQuery(name = "Loans.findByCreatedOn", query = "SELECT l FROM Loans l WHERE l.createdOn = :createdOn")
    , @NamedQuery(name = "Loans.findByStatus", query = "SELECT l FROM Loans l WHERE l.status = :status")})
public class Loans implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idloans")
    private Integer idloans;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "aggregator_loan_ref")
    private String aggregatorLoanRef;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "product_id")
    private String productId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "sector_id")
    private String sectorId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "loan_tenure")
    private int loanTenure;
    @Basic(optional = false)
    @NotNull
    @Column(name = "loan_amount")
    private int loanAmount;
    @Basic(optional = false)
    @NotNull
    @Column(name = "annual_interest_rate")
    private int annualInterestRate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "repayment_start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date repaymentStartDate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "loan_purpose")
    private String loanPurpose;
    @Basic(optional = false)
    @NotNull
    @Column(name = "createdOn")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdOn;
    @Basic(optional = false)
    @NotNull
    @Column(name = "status")
    private int status;
    @JoinColumn(name = "userID", referencedColumnName = "idusers")
    @ManyToOne(optional = false)
    private User userID;
    @JoinColumn(name = "createdBy", referencedColumnName = "idusers")
    @ManyToOne(optional = false)
    private User createdBy;

    public Loans() {
    }

    public Loans(Integer idloans) {
        this.idloans = idloans;
    }

    public Loans(Integer idloans, String aggregatorLoanRef, String productId, String sectorId, int loanTenure, int loanAmount, int annualInterestRate, Date repaymentStartDate, String loanPurpose, Date createdOn, int status) {
        this.idloans = idloans;
        this.aggregatorLoanRef = aggregatorLoanRef;
        this.productId = productId;
        this.sectorId = sectorId;
        this.loanTenure = loanTenure;
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.repaymentStartDate = repaymentStartDate;
        this.loanPurpose = loanPurpose;
        this.createdOn = createdOn;
        this.status = status;
    }

    public Integer getIdloans() {
        return idloans;
    }

    public void setIdloans(Integer idloans) {
        this.idloans = idloans;
    }

    public String getAggregatorLoanRef() {
        return aggregatorLoanRef;
    }

    public void setAggregatorLoanRef(String aggregatorLoanRef) {
        this.aggregatorLoanRef = aggregatorLoanRef;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSectorId() {
        return sectorId;
    }

    public void setSectorId(String sectorId) {
        this.sectorId = sectorId;
    }

    public int getLoanTenure() {
        return loanTenure;
    }

    public void setLoanTenure(int loanTenure) {
        this.loanTenure = loanTenure;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(int annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getRepaymentStartDate() {
        return repaymentStartDate;
    }

    public void setRepaymentStartDate(Date repaymentStartDate) {
        this.repaymentStartDate = repaymentStartDate;
    }

    public String getLoanPurpose() {
        return loanPurpose;
    }

    public void setLoanPurpose(String loanPurpose) {
        this.loanPurpose = loanPurpose;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idloans != null ? idloans.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loans)) {
            return false;
        }
        Loans other = (Loans) object;
        if ((this.idloans == null && other.idloans != null) || (this.idloans != null && !this.idloans.equals(other.idloans))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.amon.db.Loans[ idloans=" + idloans + " ]";
    }
    
}
