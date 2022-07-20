package rekurencja;

public class Sumowanie {
    static int[] numbers = {4, 3, 7, 8, 9, 10, 14};

    public static void main(String[] args) {

        int sum = sumNumbers(0, 0);
        System.out.println(sum);


    }public static int sumNumbers(int sum, int counter) {

        if (counter >= numbers.length ) {
            return sum;
        } else {

            sumNumbers(sum + numbers[counter], counter + 1);
        }
        return sum;
    }


}

