package model;

public class Cat extends Pet {

    private Cat(String name) {
        super(name);
        this.edibleFoods.add("Cat Food");
    }

    public void meow() {
        System.out.println("Meow!");
    }

}
