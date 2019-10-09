package week1.one_fifteen;

import java.text.DecimalFormat;

public class ElectricBill {

    public void calculateBill(int units){

        double bill = 0;
        double standardCostPerUnit = 26.7;
        double excessCostPerUnit   = 15.6;

        if (units <= 100){
            bill = units * standardCostPerUnit;
        }else {
            bill = (100 * standardCostPerUnit) + ((units - 100) * excessCostPerUnit);
        }

        DecimalFormat format = new DecimalFormat("##.00");

        bill = bill/100;

        System.out.println("Final bill is £" + format.format(bill));
    }
}
