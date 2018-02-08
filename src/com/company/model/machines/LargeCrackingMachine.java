package com.company.model.machines;

import com.company.model.abstracts.Machine;
import com.company.model.abstracts.Nuts;

public class LargeCrackingMachine extends Machine{
    @Override
    public Nuts checkNuts(Nuts nuts) {
        if(nuts.weight >=2){
            return nuts;
        } else{
            this.crackNuts(nuts);
            return null;
        }
    }


    @Override
    public void crackNuts(Nuts nuts) {
        nuts.crackNuts();
    }
}

