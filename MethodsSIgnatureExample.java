 
integer class Test {
 
    static void checking (int j) {/ / void method with int parameter
 
        if (j == 0) {
            System.out.println ("Incorrect: You have entered 0");
            Cancel / / Method; return
         }
 
         System.out.println ("You have entered the correct number:" + j);
    }
    / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
 
    public static void main (String a []) {
 
                System.out.println ("Enter a number (not NULL) a");
        int i = In.readInt ();
examining (i) / / Funktionsauruf
    }
}

