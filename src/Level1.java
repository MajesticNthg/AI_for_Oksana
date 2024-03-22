public class Level1 {
    public static int SumOfThe(int N, int[] data) {


        int final_number = 0;
        for (int x = 0; x < N; x++) {
            int sum = 0;
            for (int y = 0; y < N; y++) {
                if (y == x) continue;
                else
                    sum += data[y];
            }
            if (sum == data[x])
                final_number = data[x];
        }
        return final_number;


    }
}