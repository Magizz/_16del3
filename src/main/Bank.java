package main;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

public class Bank {

    private int money;

    public Bank () { int bal = 0; }

    //Accessor
    public int getMoney() { return money; }

    //Mutator
    public void setMoney(int m) { money = m; }

    public String toString() {
        String output = "Money: " + Integer.toString(money);
        return output;
    }
}
