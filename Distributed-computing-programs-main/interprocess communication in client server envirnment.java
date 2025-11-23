import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        int sum = Integer.parseInt(br.readLine()) + Integer.parseInt(br.readLine());
        pw.println(sum);
        s.close(); ss.close();
    }
}


import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 5000);
        PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        pw.println(5);
        pw.println(7);
        System.out.println("Sum = " + br.readLine());
        s.close();
    }
}


run server 
run client
