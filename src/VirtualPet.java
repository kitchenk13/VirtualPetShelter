package com.wcci;
public class VirtualPet {
    public String name;
    public int hunger;
    public int thirst;
    public int boredom;
    public int tiredness;
    public VirtualPet(String startName, int startHunger, int startThirst, int startBoredom, int startTiredness)
    {
        name = startName;
        hunger = startHunger;
        thirst = startThirst;
        boredom = startBoredom;
        tiredness = startTiredness;
    }
    public String getName() {
        return name;
    }
    public int getHunger() {
        return hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getTiredness() {
        return tiredness;
    }
    public void increaseHunger() {
        hunger += 1;
    }
    public void increaseHunger(int amount) {
        hunger = hunger + amount;
    }
}
}

