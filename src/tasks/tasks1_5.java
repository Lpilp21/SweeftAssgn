package tasks;

public class tasks1_5 {
    public static int singleNumber(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int counter = -1;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    counter++;
                }
            }
            if(counter==0){
                return nums[i];
            }
        }
        return 0;
    }
    public static int minSplit(int amount){
        int[] coins = {50, 20, 10, 5, 1};
        int[] counts = new int[5];
        int sum = 0;
        while(amount >0){
            for (int i = 0; i < coins.length; i++) {
                int count = amount/coins[i];
                amount-= count*coins[i];
                counts[i] = count;
            }
        }
        for (int i = 0; i < coins.length; i++) {
            sum+= counts[i];
        }
        return sum;
    }
    public static int notContains(int[] array){
        int n = 1;
        while(true){
            boolean status = false;
            for (int i = 0; i < array.length; i++) {
                if(array[i] == n){
                    status = true;
                }

            }
            if(status == false){
                return n;
            }
            n++;


        }
    }
    public static String binnarySum(String a, String b) {
        int maxLength;
        if(a.length()>b.length()){
            maxLength = a.length();
        }else {
            maxLength = b.length();
        }
        a = "0".repeat(maxLength - a.length()) + a;
        b = "0".repeat(maxLength - b.length()) + b;

        char[] res = new char[maxLength];
        int damaxsovrebuli = 0;
        for (int i = maxLength - 1; i >= 0; i--) {
            int a0 = a.charAt(i) - '0';
            int b0 = b.charAt(i) - '0';

            int sum = a0 ^ b0 ^ damaxsovrebuli;
            damaxsovrebuli = (a0 & b0) | (a0 & damaxsovrebuli) | (b0 & damaxsovrebuli);

            res[i] = (char)(sum + '0');
        }

        if (damaxsovrebuli > 0) {
            return "1" + new String(res);
        } else {
            return new String(res);
        }
    }
    public static int countVariants(int stearsCount){
        if (stearsCount == 1) {
            return 1;
        } else if (stearsCount == 2) {
            return 2;
        } else {
            return countVariants(stearsCount - 1) + countVariants(stearsCount - 2);
        }
    }


}