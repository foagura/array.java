/*　javaの配列についての学習　*/
public class Main {
    public static void main(String[] args) {
        int[] scores;
        scores = new int[3];

        scores[0] = 1;
        scores[1] = 5;
        scores[2] = 10;

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        /*　配列の複数の記述方法　*/
        int[] scores2 = new int[3];

        var scores3 = new int[3];

        int[] scores4 = {1, 2, 3};
    }
}