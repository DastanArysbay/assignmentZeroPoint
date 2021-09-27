package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IslamChurch islamChurch = new IslamChurch();
        islamChurch.addObserver(new Parishioner("Alʹ-Haid", islamChurch));
        islamChurch.setNewsChurch("Ot praha černogo i do nebesnyh tel ja tajny razgadal mudrejših slov i del.");

        IslamChurch islamicfeminism = new IslamChurch();
        islamicfeminism.addObserver(new Parishioner("Marija Ivanovna", islamicfeminism));
        islamicfeminism.setNewsChurch("A combination of Islam and feminism has been advocated as \"a feminist discourse and practice articulated within an Islamic paradigm\" by Margot Badran in 2002. ");



    }
}
