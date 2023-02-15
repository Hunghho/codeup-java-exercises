package oop;


public class DishTools {
    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish obj){
        System.out.printf("%s%n", obj.nameOfDish.toUpperCase());
    }

    public static void analyzeDishCost(Dish obj){
        ;
        if(obj.costInCents > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        }else{
            System.out.println("Less expensive than average");
        }
    }

    public static boolean flipRecommendation(Dish obj){
        if(obj.wouldRecommend) {
            return false;
        }else{
            return true;
        }
    }
}
