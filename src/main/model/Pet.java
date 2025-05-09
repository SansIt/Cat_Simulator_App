package model;

import java.util.HashSet;
import java.util.Set;

// An abatract class representing a pet with an age, name, ability to be hungry, fed, clean, sick, etc..
public abstract class Pet {
    private String name;
    private int age;
    private boolean isHungry;
    private boolean isFed;
    private boolean needsBath;
    private boolean isSick;
    protected Set<String> edibleFoods;

    // EFFECTS: constructor for pet
    public Pet(String name) {
        this.name = name;
        this.age = 0;
        this.isHungry = false;
        this.isFed = true;
        this.needsBath = false;
        this.isSick = false;
        this.edibleFoods = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    // MODIFIES: this
    // EFFECTS: grows up by age of 1
    public void growUp() {
        this.age++;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public boolean isFed() {
        return isFed;
    }

    // MODIFIES: this
    // EFFECTS: feeds pet; sets isFed to true and isHungry to false
    public void feed() {
        this.isFed = true;
        this.isHungry = false;
    }

    // MODIFIES: this
    // EFFECTS: feeds pet; sets isFed to false and isHungry to true
    public void getsHungry() {
        this.isFed = false;
        this.isHungry = true;
    }

    public boolean needsBath() {
        return needsBath;
    }

    // MODIFIES: this
    // EFFECTS: pet gets dirty and wants bath
    public void becomesDirty() {
        this.needsBath = false;
    }

    public boolean isSick() {
        return isSick;
    }

    // MODIFIES: this
    // EFFECTS: pet gets sick
    public void becomesSick() {
        this.isSick = true;
    }

    public Set<String> getEdibleFoods() {
        return edibleFoods;
    }

}
