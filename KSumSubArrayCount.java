import java.util.HashMap;

public class KSumSubArrayCount {
    public static void main(String[] args) {
        subarraySum(new int[]{3, 9, -2, 4, 1, -7, 2, 6, -5, 8, -3, -7, 6, 2, 1}, 5);
    }

    public static void subarraySum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for(int i : arr) {
            sum += i;
            if(map.containsKey(sum - target))  {
                ans += map.get(sum - target);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println("asn " + ans);
    }
}
