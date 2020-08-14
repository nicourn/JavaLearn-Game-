package com.company;

public enum Bots implements Obj {
    POLICE(10, 10, 10), SIMPLE_MAN(0,0,0), BANDIT(-10, -10, -10);
    int heals;
    int money;
    int stamina;

    Bots(int heals, int money, int stamina) {
        this.heals = heals;
        this.money = money;
        this.stamina = stamina;
    }

    public int[] interation(){
        return new int[]{heals, money, stamina};
    }
}
