package org.fasttrackit;

public class Baby extends Child {

    private int ageInDays;
    private int howCleanIs;
    Diapers diaper;
    private String nameBaby;

    public Baby(String nameBaby) {
        super();
    }


    // public Baby(Food food) {
   //     super(food);

   // }


    //  public Baby(Play play) {
    //    super(play);
  //  }

    @Override
    public void mood() {
        System.out.println("The baby laughs, he is happy.");
    }

    public int getAgeInDays() {
        return ageInDays;
    }

    public void setAgeInDays(int ageInDays) {
        this.ageInDays = ageInDays;
    }

    public int getHowCleanIs() {
        return howCleanIs;
    }

    public void setHowCleanIs(int howCleanIs) {
        this.howCleanIs = howCleanIs;
    }

    public String getNameBaby() {
        return nameBaby;
    }

    public void setNameBaby(String nameBaby) {
        this.nameBaby = nameBaby;
    }
}
