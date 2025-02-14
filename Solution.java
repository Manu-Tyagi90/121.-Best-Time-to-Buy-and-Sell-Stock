// Kadane's Approach
public class Solution {
public static void main(String[] manu){
int[] arr = new int[] {7,1,5,3,6,4};
System.out.println(maxProfit(arr));
}

public static int maxProfit(int[] arr) {
if(arr == null ) return 0;
int minPrice = Integer.MAX_VALUE;
int max = 0;
for(int x : arr) {
minPrice = Math.min(minPrice, x);
max = Math.max(max, x - minPrice );
}
return max;
}
}
