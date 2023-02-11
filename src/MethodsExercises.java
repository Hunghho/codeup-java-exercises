import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
//        System.out.println(addition(1, 2));
//        System.out.println(subtraction(2, 2));
//        System.out.println(multiplication(2, 5));
//        System.out.println(division(5, 5));
//        System.out.println(multiplication(10, 2));
        getInteger(20, 30);
    }

//    public static int addition (int a, int b){
//        return a + b;
//    }
//
//    public static int subtraction (int a, int b){
//        return a - b;
//    }

//    public static int multiplication (int a, int b){
//        int result = a;
//        for(int i = a; i <= b ; i += 1){
//            result *= i;
//        }
//        return result;
//    }

//    public static int division (int a, int b){
//        return a / b;
//    }

    // recursion

//    public static int multiplication (int a, int b) {
//        if (a == 0 || b == 0){
//            return 0;
//        }
//            return a + multiplication(a, b - 1);
//
//    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        int userEnter;
        System.out.printf("Enter a number between %d and %d ", min, max);
        userEnter = sc.nextInt();
        do {
            if (userEnter > min && userEnter < max){
                System.out.printf("%d is in range of %d and %d ", userEnter, min, max);
                break;
            } else {
                System.out.printf("%d is not in range of %d and %d%n ", userEnter, min, max);
            }
            System.out.println("Enter a different number");
            userEnter = sc.nextInt();
        }while(userEnter < min && userEnter > max);
        return userEnter;
    }

}
