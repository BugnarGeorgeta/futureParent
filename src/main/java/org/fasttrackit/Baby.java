package org.fasttrackit;

public class Baby extends Child {

    int ageInDays;
    int howCleanIs;
    Diapers diaper;



    public Baby(Food food) {
        super(food);

    }

    public Baby(Play play) {
        super(play);
    }
}
