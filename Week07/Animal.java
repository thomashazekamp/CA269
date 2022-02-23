public abstract class Animal {

    /* This program is used to show polymorphism in other tasks */

    public Animal(String n) {
        name = n;
    }

    abstract String hello();
    
    public String greeting() {
        return hello() + ", my name is " + name;
    }
    // private
    private String name;
}