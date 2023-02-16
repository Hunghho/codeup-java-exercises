public class JavaWarmUp {

    public static void main(String[] args) {

      Double[] numbers = new Double[5];
      numbers[0] = 1.0;
      numbers[1] = 2.0;
      numbers[2] = 3.0;
      numbers[3] = 4.0;
      numbers[4] = 5.0;

      double sum = 0.0;
      for(Double number : numbers){
          sum += number;
      }
        System.out.println(sum);

    }

}
