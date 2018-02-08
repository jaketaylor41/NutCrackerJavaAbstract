package com.company;


import com.company.model.machines.LargeCrackingMachine;
import com.company.model.machines.SmallCrackingMachine;
import com.company.model.nuts.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LargeCrackingMachine large = new LargeCrackingMachine();
        SmallCrackingMachine small = new SmallCrackingMachine();

        Walnut walnut = new Walnut();
        Almond almond = new Almond();
        Cashew cashew = new Cashew();
        Macadamia macadamia = new Macadamia();
        Peanut peanut = new Peanut();

        large.checkNuts(walnut);
        large.checkNuts(almond);
        large.checkNuts(cashew);
        large.checkNuts(macadamia);
        large.checkNuts(peanut);

        small.checkNuts(walnut);
        small.checkNuts(almond);
        small.checkNuts(cashew);
        small.checkNuts(macadamia);
        small.checkNuts(peanut);






    }
}
