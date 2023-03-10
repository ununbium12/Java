package chapter02;

public class DoubleArrayExample {
    public static void main(String[] args) {
        int[][] scores = {
                {95,86},
                {83,92,96},
                {78,83,93,87,88}
        };

        int sum = 0;
        int count = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
                count++;
            }
        }
        System.out.println("총합 : " + sum);

        double avg = (double) sum / count;
        System.out.println("평균 : "+avg);
    }
}
