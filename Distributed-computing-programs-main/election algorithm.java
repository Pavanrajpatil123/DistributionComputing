import java.util.*;

class Bully {
    public static void main(String[] args) {
        int processes[] = {1, 2, 3, 4, 5}; // process IDs
        int failed = 5;                    // highest process failed
        int starter = 2;                   // process 2 starts election

        System.out.println("Process " + failed + " failed.");
        System.out.println("Process " + starter + " starts election.");

        int coordinator = -1;

        for (int p : processes) {
            if (p > starter && p != failed) {
                System.out.println("Process " + starter + " sends ELECTION to " + p);
                coordinator = p;
            }
        }

        System.out.println("\nNew Coordinator = " + coordinator);
    }
}


output
Process 5 failed.
Process 2 starts election.
Process 2 sends ELECTION to 3
Process 2 sends ELECTION to 4

New Coordinator = 4
