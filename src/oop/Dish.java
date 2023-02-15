package oop;

public class Dish {
    double costInCents;
    String nameOfDish;
    boolean wouldRecommend;

    public void printSummary(){
        System.out.printf("""
                Cost: $%.2f
                Name: %s
                Recommended: %s
                """, costInCents, nameOfDish, wouldRecommend);
    }

}
