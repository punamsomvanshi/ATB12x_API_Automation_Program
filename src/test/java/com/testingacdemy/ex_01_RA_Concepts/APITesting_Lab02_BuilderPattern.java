package com.testingacdemy.ex_01_RA_Concepts;

public class APITesting_Lab02_BuilderPattern {

    public APITesting_Lab02_BuilderPattern step1()
    {
        System.out.println("Step 1");
        return this;
    }

    public APITesting_Lab02_BuilderPattern step2()
    {
        System.out.println("Step 2");
        return this;
    }

    public APITesting_Lab02_BuilderPattern step3(String param1)
    {
        System.out.println("Step 3");
        return this;
    }

    public static void main(String[] args) {
        APITesting_Lab02_BuilderPattern bp = new APITesting_Lab02_BuilderPattern();
        bp.step1().step2().step3("Punam");
    }
}
