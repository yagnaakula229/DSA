class Solution {
    // Helper function to check if it's possible to run 'n' computers for 't' minutes
    private boolean isGood(long t, int n, int[] batteries) {
        long sum = 0L;
        // Calculate the total effective power available for duration 't'
        for(long v : batteries) {
            // A battery can at most contribute 't' minutes to the run time
            // because it can only power one computer at a time.
            sum += Math.min(v, t);
        }

        // If total effective power is enough for n computers, return true
        return sum >= (long)n * t;
    }

    public long maxRunTime(int n, int[] batteries) {
        long sum = 0L;
        for(long v : batteries) sum += v;
    
        long l = 0L;
        // Theoretical max time is average of total sum
        long r = sum / n + 1; 

        // Binary Search
        while(l + 1 < r) {
            long m = l + (r - l) / 2;
            if(isGood(m, n, batteries)) {
                l = m; // m is feasible, try a longer time
            } else {
                r = m; // m is not feasible, try a shorter time
            }
        }    

        return l;
    }
}