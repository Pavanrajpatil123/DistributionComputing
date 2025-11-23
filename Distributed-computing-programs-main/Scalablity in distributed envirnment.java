public class ScalabilitySimple {
 public static void main(String[] args) {
int servers = 2;   // start with 2 servers
        int requests = 10; // incoming requests
     System.out.println("Starting with " + servers + " servers.\n");
for (int req = 1; req <= requests; req++) {

            // Print request
            System.out.println("Processing Request " + req);

            // When load increases, add a server (scale-out)
            if (req == 5) {
                servers++;
                System.out.println("\nLoad increased! Added new server.");
                System.out.println("Total Servers Now: " + servers + "\n");
            }
        }
 System.out.println("\nAll requests handled using " + servers + " servers.");
    }
}


Output

Starting with 2 servers.

Processing Request 1
Processing Request 2
Processing Request 3
Processing Request 4
Processing Request 5

Load increased! Added new server.
Total Servers Now: 3

Processing Request 6
Processing Request 7
Processing Request 8
Processing Request 9
Processing Request 10

All requests handled using 3 servers.
