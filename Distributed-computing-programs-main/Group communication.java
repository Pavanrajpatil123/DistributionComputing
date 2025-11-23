class GroupCommunication {
    public static void main(String[] args) {

        int[] group = {1, 2, 3, 4};   // group members

        System.out.println("Sending message to group...");

        for (int member : group) {
            System.out.println("Message sent to Member " + member);
        }
    }
}




Output
Sending message to group...
Message sent to Member 1
Message sent to Member 2
Message sent to Member 3
Message sent to Member 4
