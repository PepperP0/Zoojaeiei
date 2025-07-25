package Lib;

public abstract class Animal {
    private final String name; 

    public Animal(String name ){
        this.name = name ;
    }
    public String getName(){
        return this.name ; 
    }
    public abstract String makeSound() ;
    public String swim() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'swim'");
    }
}
