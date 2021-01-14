package com.earlyretirement.domain.RetirementCalculator;

public interface RetirementCalculator {
    double totalNeedMoney(); //은퇴하는데 필요한 자금은 얼마일까
    double MonthlySaving(int retirementMoney, int currentMoney, int yield, int currentAge, int retirementAge); // 매 월 얼마씩 모아야 할까
    double howLong(int retirementMoney, int currentMoney, int yield, int monthlySaving); //얼마나 오랜기간 모야하 할까
}
