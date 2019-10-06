package NumberExercise;

public class TestNumber {

    public static double sumOfNumbersInArray(Number[] numbers){
        double sum = 0.0;

        for (Object number:numbers
             ) {
            sum += Double.parseDouble(number.toString());
        }
        return sum;
    }

}
