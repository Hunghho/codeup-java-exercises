package oop;

public class Dish {
   private double costInCents;
   private String nameOfDish;
   private boolean wouldRecommend;

   // constructor
    public Dish(double costInCents, String nameOfDish, boolean wouldRecommend) {
        this.costInCents = costInCents;
        this.nameOfDish = nameOfDish;
        this.wouldRecommend = wouldRecommend;
    }

    public void printSummary(){
        System.out.printf("""
                Cost: $%.2f
                Name: %s
                Recommended: %s
                """, costInCents, nameOfDish, wouldRecommend);
    }

    public double getCostInCents() {
        return costInCents;
    }

    public void setCostInCents(double costInCents) {
        this.costInCents = costInCents;
    }

    public String getNameOfDish() {
        return nameOfDish;
    }

    public void setNameOfDish(String nameOfDish) {
        this.nameOfDish = nameOfDish;
    }

    public boolean isWouldRecommend() {
        return wouldRecommend;
    }

    public void setWouldRecommend(boolean wouldRecommend) {
        this.wouldRecommend = wouldRecommend;
    }

}
