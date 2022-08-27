public class Main {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
            System.out.println();

            double[] newNums = {1.57, 7.654, 9.986};
            System.out.print(newNums[0] + ", ");
            System.out.print(newNums[1] + ", ");
            System.out.print(newNums[2] + " ");

            System.out.println();

            boolean[] myBoolean = new boolean[2];
            myBoolean[0] = true;
            myBoolean[1] = false;
            for (int j = 0; j < myBoolean.length; j++) {
                System.out.print(myBoolean[j]);
                if (j < myBoolean.length - 1) {
                    System.out.print(", ");
                }
            }
        System.out.println();
        for (int k = nums.length-1; k > 0; k--) {
            System.out.print(nums[k] + ", ");
        }
            System.out.print(nums[0]);
            System.out.println();


        for (int v = newNums.length - 1; v > 0 ; v--) {
            System.out.print(newNums[v] + ", ");
        }
            System.out.print(newNums[0]);

        System.out.println();

        for (int m = myBoolean.length - 1; m > 0; m--) {
            System.out.print(myBoolean[m] + ", ");
        }
        System.out.println(myBoolean[0]);


        for (int t = 0; t < nums.length; t++) {
            if (nums[t]%2 != 0) {
                nums[t]++;
            }
            System.out.print(nums[t] + " ");
        }

        }

    }

