
import java.util.HashMap;

public class Q17 {
    public static int mostPopular(int[] sales) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : sales) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (freq > maxFreq) {
                maxFreq = freq;
                result = num;
            } else if (freq == maxFreq && num < result) {
                result = num;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] sales = {101, 103, 101, 102, 103, 105, 101, 103};

        System.out.println(mostPopular(sales));
    }
}
