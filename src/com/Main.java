package com;

public class Main {
    public static void main(String[] args){
        AbstractFactory abstractFactory = new AbstractFactory();
        BaseFactory blackFactory = abstractFactory.getFactory("black");
        BaseFactory whiteFactory = abstractFactory.getFactory("white");
    }
}
