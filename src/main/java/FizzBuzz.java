public class FizzBuzz {


    public static String fizzBuzz(int number){

        boolean isDividableBy3 = number % 3 == 0;
        boolean isDividableBy5 = number % 5 == 0;

        if(isDividableBy3 && isDividableBy5){
            return "fizzbuzz";

        } else if (isDividableBy3) {
            return "Currwurst";

        } else if (isDividableBy5) {
            return "buzz";

        } else {
            return String.valueOf(number);
        }


    }

}
