package com.earlyretirement.domain.RetirementCalculator;

public class RetirementCalculatorImpl implements RetirementCalculator {
    @Override
    public double totalNeedMoney() {
        return 0;
    }

    @Override
    public double MonthlySaving(int retirementMoney, int currentMoney, int yield, int currentAge, int retirementAge) {
        //A(result): 매월 투자액
        //R == yield
        int period = retirementAge - currentAge;
        double R = (double) yield/100;
        double n = period;

         //double A = 5_000;
         //double result = A * (Math.pow(1 + R/12 ,12*n) - 1) /  (R/12);
        double A = (retirementMoney - currentMoney) / ((Math.pow(1 + R/12 ,12*n) - 1) /  (R/12));
        return A;
    }


    @Override
    public double howLong(int retirementMoney, int currentMoney, int yield, int monthlySaving){
        int period = 100; //몇 년 걸리는지 저장. 100년 이상이면 100으로 표현
        double R = (double) yield/100;
        double targetMoney = retirementMoney - currentMoney;
        double value = targetMoney * (R / 12) / monthlySaving + 1;

        for (int i =1 ; i <= 100; i++){
            double tmp = Math.pow(1 + R/12 ,12*i);
            if(value <= tmp){
                period = i;
                break;
            }
        }

        return period;
    }
}
