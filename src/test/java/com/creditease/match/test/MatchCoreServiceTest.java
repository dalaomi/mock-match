package com.creditease.match.test;

import com.creditease.match.InvestEntity;
import com.creditease.match.LoanEntity;
import com.creditease.match.MatchCoreService;
import com.creditease.match.MatchResultEntity;
import junit.framework.TestCase;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.Random;

/**
 * Created by haoxiaoliang on 17/12/8.
 */

public class MatchCoreServiceTest extends TestCase{
    private MatchCoreService matchCoreService = new MatchCoreService();

    @Override
    protected void setUp() throws Exception {
        int size = 2000000;
        for (int i = 0; i < size; i++) {
            BigDecimal amount = new BigDecimal(new Random().nextInt(10000));
            amount = amount.multiply(new BigDecimal("0.01"));
            amount.setScale(2, BigDecimal.ROUND_HALF_UP);

            InvestEntity investEntity = new InvestEntity();
            investEntity.setAmount(amount);
            investEntity.setRequestId(Long.valueOf(i));
            investEntity.setBusinessType("1");
            BigDecimal irr = new BigDecimal(Math.random());
            irr.setScale(2, BigDecimal.ROUND_HALF_UP);
            investEntity.setIrr(irr);
            matchCoreService.addToList(investEntity);
        }
    }

    @Test
    public void testDoMatch(){
        long startTime = System.currentTimeMillis();
        System.out.println(MatchCoreService.investList.size());

        LoanEntity loanEntity = initLoanEntity();
        MatchResultEntity matchResultEntity = matchCoreService.doMatch(loanEntity);
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)+"ms");
    }


    public LoanEntity initLoanEntity(){
        LoanEntity loanEntity = new LoanEntity();
        loanEntity.setAmount(new BigDecimal(3000000));
        loanEntity.setRequestId(1L);
        loanEntity.setIrr(new BigDecimal("10.00"));
        return loanEntity;
    }

}
