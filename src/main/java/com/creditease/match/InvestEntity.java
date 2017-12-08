package com.creditease.match;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by haoxiaoliang on 17/11/20.
 */
public class InvestEntity {
    private Long requestId;
    private BigDecimal amount;
    private BigDecimal irr;
    private String reinvest;
    private String businessType;
    private Date receiveDate;//yyyy-MM-dd
    private BigDecimal matchAmount;

    public InvestEntity() {
    }

    public InvestEntity(Long requestId, BigDecimal amount, BigDecimal irr, String reinvest, String businessType, Date receiveDate, BigDecimal matchAmount) {
        this.requestId = requestId;
        this.amount = amount;
        this.irr = irr;
        this.reinvest = reinvest;
        this.businessType = businessType;
        this.receiveDate = receiveDate;
        this.matchAmount = matchAmount;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getIrr() {
        return irr;
    }

    public void setIrr(BigDecimal irr) {
        this.irr = irr;
    }

    public String getReinvest() {
        return reinvest;
    }

    public void setReinvest(String reinvest) {
        this.reinvest = reinvest;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public BigDecimal getMatchAmount() {
        return matchAmount;
    }

    public void setMatchAmount(BigDecimal matchAmount) {
        this.matchAmount = matchAmount;
    }

    @Override
    public String toString() {
        return "InvestEntity{" +
                "requestId=" + requestId +
                ", amount=" + amount +
                ", irr=" + irr +
                ", reinvest='" + reinvest + '\'' +
                ", businessType='" + businessType + '\'' +
                ", receiveDate=" + receiveDate +
                ", matchAmount=" + matchAmount +
                '}';
    }
}
