package com.creditease.match;

import java.math.BigDecimal;

/**
 * Created by haoxiaoliang on 17/12/8.
 */
public class LoanEntity {
    private Long requestId;
    private BigDecimal amount;
    private BigDecimal irr;

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


    @Override
    public String toString() {
        return "LoanEntity{" +
                "requestId=" + requestId +
                ", amount=" + amount +
                ", irr=" + irr +
                '}';
    }
}
