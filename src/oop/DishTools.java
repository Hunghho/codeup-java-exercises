package oop;


public class DishTools {
    public static int AVERAGE_COST_OF_DISH_IN_CENTS = 1300;

    public static void shoutDishName(Dish obj){
        System.out.printf("%s%n", obj.getNameOfDish().toUpperCase());
    }

    public static void analyzeDishCost(Dish obj){
        ;
        if(obj.getCostInCents() > AVERAGE_COST_OF_DISH_IN_CENTS){
            System.out.println("More expensive than average");
        }else{
            System.out.println("Less expensive than average");
        }
    }

    public static void flipRecommendation(Dish obj){
        if(obj.isWouldRecommend()) {
            obj.setWouldRecommend(false);
        }else{
            obj.setWouldRecommend(true);
        }
    }
}
