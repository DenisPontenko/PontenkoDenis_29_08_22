package com.hillel.pontenko.homeworks.homework1;

public class PrimitivesVariables {
    public static void main(String[] args) {

        byte sugar;
        short salt;
        long flour;
        float buckwheat;
        char currency;
        boolean tasteBalance;

        String str1 = new String("'＄'");
        String str2 = "'＄'";

        int integerVariable1 = 1, integerVariable2 = 2, integerVariable3 = 3;
        double fractionalVariable1 = 3.56253, fractionalVariable2 = 4.5482954, fractionalVariable3 = 5.548848488;

        double fractionalResult1 = fractionalVariable1 + fractionalVariable2 - fractionalVariable3 ;
        double fractionalResult2 = (fractionalVariable1 + fractionalVariable2 + fractionalVariable3) / 3;
        double fractionalResult3 = (fractionalVariable1 + fractionalVariable2 + fractionalVariable3) * integerVariable1;
        double fractionalResult4 = fractionalVariable1 % fractionalVariable2 + fractionalVariable3 * integerVariable2;
        double fractionalResult5 = (fractionalVariable1 + fractionalVariable2 + fractionalVariable3) % (integerVariable3 * integerVariable2);
        System.out.println("fractionalResult1: " + fractionalResult1
                + ",fractionalResult2: " + fractionalResult2
                + ",fractionalResult3: " + fractionalResult3
                + ",fractionalResult4: " + fractionalResult4
                + ",fractionalResult5: " + fractionalResult5);

        int integerResult1 = integerVariable1 - integerVariable2 * integerVariable3;
        System.out.println("integerResult1: " + integerResult1);

        int integerResult2 = integerVariable1 * integerVariable3 + integerVariable2 ;
        System.out.println("integerResult2: " + integerResult2);

        int integerResult3 = (int) ((fractionalVariable1 + integerVariable1) / fractionalVariable2);
        System.out.println("integerResult3: " + integerResult3);

        int integerResult4 = (int) ((fractionalVariable1 + integerVariable1) % fractionalVariable2);
        System.out.println("integerResult4: " + integerResult4);

        int integerResult5 = (int) ((fractionalVariable1 + integerVariable1) % fractionalVariable2 + fractionalVariable3);
        System.out.println("integerResult5: " + integerResult5);
        System.out.println();


        double arithmeticOperationsWithAssignmentResult1 = integerVariable1 += integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult1: " + arithmeticOperationsWithAssignmentResult1);

        double arithmeticOperationsWithAssignmentResult2 = integerVariable1 -= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult2: " + arithmeticOperationsWithAssignmentResult2);

        double arithmeticOperationsWithAssignmentResult3 = integerVariable1 *= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult3: " + arithmeticOperationsWithAssignmentResult3);

        double arithmeticOperationsWithAssignmentResult4 = integerVariable1 /= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult4: " + arithmeticOperationsWithAssignmentResult4);

        double arithmeticOperationsWithAssignmentResult5 = integerVariable1 %= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult5: " + arithmeticOperationsWithAssignmentResult5);

        double arithmeticOperationsWithAssignmentResult6 = fractionalVariable1 += integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult6: " + arithmeticOperationsWithAssignmentResult6);

        double arithmeticOperationsWithAssignmentResult7 = fractionalVariable1 -= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult7: " + arithmeticOperationsWithAssignmentResult7);

        double arithmeticOperationsWithAssignmentResult8 = fractionalVariable1 *= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult8: " + arithmeticOperationsWithAssignmentResult8);

        double arithmeticOperationsWithAssignmentResult9 = fractionalVariable1 /= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult9: " + arithmeticOperationsWithAssignmentResult9);

        double arithmeticOperationsWithAssignmentResult10 = fractionalVariable1 %= integerVariable2;
        System.out.println("arithmeticOperationsWithAssignmentResult10: " + arithmeticOperationsWithAssignmentResult10);
        System.out.println();


        boolean logicalOperationsResult1 = fractionalVariable1 > integerVariable1;
        System.out.println("logicalOperationsResult1: " + logicalOperationsResult1);

        boolean logicalOperationsResult2 = fractionalVariable1 >= integerVariable2;
        System.out.println("logicalOperationsResult2: " + logicalOperationsResult2);

        boolean logicalOperationsResult3 = fractionalVariable3 != integerVariable3;
        System.out.println("logicalOperationsResult3: " + logicalOperationsResult3);

        boolean logicalOperationsResult4 = fractionalVariable2 < integerVariable3;
        System.out.println("logicalOperationsResult4: " + logicalOperationsResult4);

        boolean logicalOperationsResult5 = fractionalVariable3 == integerVariable1;
        System.out.println("logicalOperationsResult5: " + logicalOperationsResult5);
        System.out.println();


        int incrementAndDecrement = 1;
        System.out.println(--incrementAndDecrement + ++incrementAndDecrement);
        System.out.println(--incrementAndDecrement);
        System.out.println(++incrementAndDecrement);
        System.out.println(incrementAndDecrement--);
        System.out.println(++incrementAndDecrement);
        System.out.println(++incrementAndDecrement);
        System.out.println(--incrementAndDecrement);
        System.out.println(incrementAndDecrement++);
        System.out.println();


        int[] oneDimensionalArray = {0,1,2,3,4,5,6,7,8,9};
        for (int i=0; i<oneDimensionalArray.length; i++){
            System.out.println(oneDimensionalArray[i]);

        }
    }
}
