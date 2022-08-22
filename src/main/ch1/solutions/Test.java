package main.ch1.solutions;

public class Test {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            /* Answers below */
            System.out.print(x + "" + y +" ");
            x = x + 1;
        }
    }
}



/*
 * -------------
 *  Candidates
 * -------------
 * a)
 * y = x - y;
 * 
 * b)
 * y = y + x;
 * 
 * c)
 * y = y + 2;
 * if (y > 4) {
 *  y = y - 1;
 * }
 * 
 * d)
 * x = x + 1;
 * y = y + x;
 * 
 * e)
 * if (y < 5) {
 *  x = x + 1;
 *  if (y < 3) {
 *    x = x - 1;
 *  }
 * }
 * y = y + 2;
 * 
 *
 * -------------
 *  Outputs
 * -------------
 * 
 * 1)
 *  22 46
 * 
 * 2)
 *  11 34 59
 * 
 * 3)
 *  02 14 26 38
 * 
 * 4)
 *  02 14 36 48
 * 
 * 5)
 *  00 11 21 32 42
 * 
 * 6)
 *  11 21 32 42 53
 * 
 * 7)
 *  00 11 23 36 410
 * 
 * 8)
 *  02 14 25 36 47 
 * 
 * 
 * ---------------
 *  Answers
 * ---------------
 * 
 * a -> 5 ✓
 * d -> 2 ✓
 * e -> 4 ✓
 * c -> 8 ✓
 * b -> 7 ✓
 * 
 */