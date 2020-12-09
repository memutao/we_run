import java.util.HashSet;

public class lc_575 {
    public static int distributeCandies(int[] candyType) {
        if (candyType.length == 2) return 1;
        HashSet<Integer> ans = new HashSet<>();
        for (int i : candyType) {
            ans.add(i);
        }
        return Math.min(ans.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        var temp = new int[]{1,1,2,3};
        System.out.println(distributeCandies(temp));
    }
}
