package com.company;

public class Parishioner implements IObserver {
    private String name;

    public Parishioner (String name, IObservable o){
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void update(String news) {
        System.out.println(name+ " found out the news "+ news) ;
    }
}
