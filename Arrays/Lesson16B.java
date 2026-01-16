public class Lesson16B {
   
    public static void main(String[] args) {

        System.out.println(average(10, 8, 9));

        double[] scores = {100, 90, 80, 100, 80};
        System.out.println(average(scores));
    }

    public static double average(double... values) {
        double sum = 0;

        for (double v : values) {
            sum += v;
        }

        return sum / values.length;
    }
}

