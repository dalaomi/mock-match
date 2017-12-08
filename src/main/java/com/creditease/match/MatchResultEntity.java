package com.creditease.match;

import java.util.List;

/**
 * Created by haoxiaoliang on 17/12/8.
 */
public class MatchResultEntity {
    private LoanEntity loanEntity;
    private List<InvestEntity> investEntityList;

    public LoanEntity getLoanEntity() {
        return loanEntity;
    }

    public void setLoanEntity(LoanEntity loanEntity) {
        this.loanEntity = loanEntity;
    }

    public List<InvestEntity> getInvestEntityList() {
        return investEntityList;
    }

    public void setInvestEntityList(List<InvestEntity> investEntityList) {
        this.investEntityList = investEntityList;
    }
}
