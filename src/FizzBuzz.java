

class FizzBuzz{

    public static String fizzBuzz(int number) {
        int i = 1;
        while (i <= number) {
            i++;
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println("fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            }
            else System.out.println(String.valueOf(i));
        }
        return "complete";
    }
    public static void main(String args[]){
        int a = 30;
        fizzBuzz(a);
    }
}