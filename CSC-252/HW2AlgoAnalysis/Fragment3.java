/**
 * @author FVCproductions
 * @see HW2 - Algorithm Analysis - Problem 4 Part B
 * @version 1.0
 * @since 1-3-15
 *
 * Fragment 3
 */


class Timing {

    public static final int NUM_TIMINGS = 5;

    public static void main(String[] args) {

        // it is best to do the timing a few times because when Java can appear
        // "slower when it starts", so if you see slower results for the first
        // couple of timing runs, it is reasonable to discard them

        int n = 0;

        // fragment 3

        System.out.println("FRAGMENT 3");

        System.out.println("\nn = 64");
        n = 64;
        fragment3(n);
        System.out.println("\nn = 128");
        n = 128;
        fragment3(n);
        System.out.println("\nn = 256");
        n = 256;
        fragment3(n);
        System.out.println("\nn = 512");
        n = 512;
        fragment3(n);

    }

    private static void fragment3(int n) {

        long total = 0;

        for (int timing = 0; timing < NUM_TIMINGS; ++timing) {
            long startTime = System.nanoTime();

            // ... The code being timed ...
            // Replace this code with your own code:
            // begin code to replace:
            int sum = 0;
            for (int i = 0; i < n; i++)
                for (int j = 0; j < i; j++)
                    sum++;
            // end code to replace

            long endTime = System.nanoTime();
            long elapsedTime = endTime - startTime;
            // 1 second = 1000000000 (10^9) nanoseconds.

            total = total + elapsedTime; //ADDED

            System.out.println(elapsedTime + " nanoseconds or " + elapsedTime / (1000000000.0) + " seconds elapsed");
        }

        System.out.println("Average Time (nanoseconds): " + total / 5);

    }

}