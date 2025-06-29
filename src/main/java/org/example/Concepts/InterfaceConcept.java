package org.example.Concepts;


// blueprint of a class

// provides structures for the implementation

// enables extention


// remote control example here interface lists common functionality which remove should have
public interface InterfaceConcept {

void powerOn();

void powerOff();

void settings();
}

class TV implements InterfaceConcept{

    @Override
    public void powerOn() {
        System.out.println("Turning on TV");
    }

    @Override
    public void powerOff() {

    }

    @Override
    public void settings() {

    }

class AC implements InterfaceConcept{

    @Override
    public void powerOn() {
        System.out.println("Turning on AC");
    }

    @Override
    public void powerOff() {

    }

    @Override
    public void settings() {

    }
}
}
