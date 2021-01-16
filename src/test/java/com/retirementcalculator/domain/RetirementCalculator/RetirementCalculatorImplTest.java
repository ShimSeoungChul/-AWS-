package com.retirementcalculator.domain.RetirementCalculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RetirementCalculatorImplTest {

    @Test
    void MonthlySaving이_리턴된다(){
        RetirementCalculator calculator = new RetirementCalculatorImpl();
        double money = calculator.MonthlySaving(100000,300,10,28,38);

        System.out.println((int)money);
    }

    @Test
    void howLong이_리턴된다(){
        RetirementCalculator calculator = new RetirementCalculatorImpl();
        double money = calculator.howLong(100000,300,10,100);
        assertThat(money).isEqualTo(23);
    }


}