package SumOfNumbersFromString;

public class Main {
    public static void main(String[] args) {
        String numereString = "101,-34,43,4323";
        String separator = ",";
        String[] numbers = numereString.split(separator);
        int sum = 0;
        for (String number:numbers
             ) {
            sum += Integer.parseInt(number);
        }
        System.out.println(sum);
    }
}
