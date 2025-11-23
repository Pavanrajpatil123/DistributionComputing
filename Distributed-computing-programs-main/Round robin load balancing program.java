public class RoundRobin {

    public static void main(String[] args) {

        int[] servers = {1, 2, 3, 4};   // server numbers
        int index = 0;                  // points to current server

        // simulate 10 incoming requests
        for (int req = 1; req <= 10; req++) {

            // assign request to current server
            int assignedServer = servers[index];
            System.out.println("Request " + req + " → Server " + assignedServer);

            // move to next server (round robin)
            index = (index + 1) % servers.length;
        }
    }
}



Output
Request 1 → Server 1
Request 2 → Server 2
Request 3 → Server 3
Request 4 → Server 4
Request 5 → Server 1
Request 6 → Server 2
Request 7 → Server 3
Request 8 → Server 4
Request 9 → Server 1
Request 10 → Server 2
