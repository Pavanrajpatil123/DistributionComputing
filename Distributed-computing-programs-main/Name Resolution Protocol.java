class NameResolution {
    public static void main(String[] args) {

        int[] names  = {1, 2, 3};      // names as numbers
        int[] addrs  = {100, 200, 300}; // IP addresses as numbers

        int query = 2;   // the name we want to resolve

        int result = -1;

        for (int i = 0; i < names.length; i++) {
            if (names[i] == query) {
                result = addrs[i];
            }
        }

        System.out.println("Name: " + query);
        System.out.println("Address: " + result);
    }
}


Output
Name: 2
Address: 200
