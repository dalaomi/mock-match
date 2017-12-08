package com.creditease.match;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by haoxiaoliang on 17/11/20.
 */
public class MatchCoreService {
    public static final List<InvestEntity> investList = new ArrayList<InvestEntity>();


    public void initInvestList(){

    }

    public void addToList(InvestEntity matchEntity){
        investList.add(matchEntity);
    }


    public MatchResultEntity doMatch(LoanEntity loanEntity){
        System.out.println("债权信息如下："+loanEntity);
        BigDecimal totalMatchAmt = BigDecimal.ZERO;
        MatchResultEntity matchResultEntity = new MatchResultEntity();
        matchResultEntity.setLoanEntity(loanEntity);
        List<InvestEntity> investEntityList = new ArrayList<InvestEntity>();
        BigDecimal loanAmount = loanEntity.getAmount();
        int ignoreNum = 0;
        int matchedNum = 0;
        for (InvestEntity investEntity : investList) {
            if(loanAmount.compareTo(BigDecimal.ZERO)<=0){
                break;
            }
            matchedNum++;
            BigDecimal investAmount = investEntity.getAmount();
            if(investAmount.compareTo(new BigDecimal(50))<0){
                ignoreNum++;
                continue;
            }
            if(loanAmount.compareTo(investAmount)>=0){
                loanAmount = loanAmount.subtract(investAmount);
                investEntity.setMatchAmount(investAmount);
                investEntityList.add(investEntity);

            }else {
                investEntity.setMatchAmount(loanAmount);
                loanAmount = BigDecimal.ZERO;
                investEntityList.add(investEntity);
            }
            totalMatchAmt = totalMatchAmt.add(investEntity.getMatchAmount());

            System.out.println("匹配信息如下："+investEntity);

        }
        matchResultEntity.setInvestEntityList(investEntityList);
        System.out.println("匹配总金额如下："+totalMatchAmt+",债权总金额如下："+loanEntity.getAmount()+",投资总数:"+investList.size()+",参与匹配的投资总数："+matchedNum+",被忽略的投资总数:"+ignoreNum+",匹配上的投资总数:"+investEntityList.size());
        return matchResultEntity;
    }



}
