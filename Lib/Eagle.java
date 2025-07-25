package Lib;

public class Eagle extends Bird implements Flyable{

    public Eagle(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String fly() {
        return " The eagle soars through the sky. " ;
    }

    @Override
    public String makeSound() {
        return  "Screech!" ;
    }
    
}
