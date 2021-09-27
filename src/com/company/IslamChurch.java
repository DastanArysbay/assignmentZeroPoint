package com.company;

import java.util.ArrayList;
import java.util.List;

public class IslamChurch implements IObservable {
    private List<IObserver> parishioners;
    private String newsChurch;


    public IslamChurch(){
        parishioners = new ArrayList<>();
    }
    @Override
    public void addObserver(IObserver o) {
        parishioners.add(o);
    }

    @Override
    public void removeObserver(IObserver o) {
        parishioners.remove(o);
    }

    @Override
    public void notifyObservers() {
            for (IObserver o: parishioners) {
                o.update(newsChurch);
            }
    }

    public void setNewsChurch(String news) {
        this.newsChurch = news;
        notifyObservers();
    }
}
