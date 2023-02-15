package oop;

public class DishTest {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.costInCents = 9.99;
        dish1.nameOfDish = "Lobster and Steak";
        dish1.wouldRecommend = true;
        dish1.printSummary();

      DishTools.shoutDishName(dish1);
      DishTools.analyzeDishCost(dish1);
        System.out.println(DishTools.flipRecommendation(dish1));
    }
}
