class ClockSync {
    public static void main(String[] args) {

        int master = 100;                 // master clock
        int[] slaves = {95, 110, 105};    // slave clocks

        int total = master;
        for (int t : slaves) {
            total += t;
        }

        int avg = total / (slaves.length + 1);   // average time

        System.out.println("Synchronized Time = " + avg);
    }
}



  output
Synchronized Time = 102
