package DesignPatterns.AbstractFactory;

public class Diode implements Component {
    @Override
    public void place (){
        System.out.println("In Diode::place() method.");
    }
}
