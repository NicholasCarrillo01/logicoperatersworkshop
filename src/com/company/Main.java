package com.company;

public class Main {

    public static void main(String[] args) {

//        Relational operaters
//        <  - less than
//        <= - less than or equal to
//        >  - greater than
//        >= - greater than or equal to
//        == - equals
//        != - not equal

//        logic Operaters
//          && - and
//          | | - or
//           !  - Not

        int a = 2;
        int b = 4;
        int x = 6;
        int y = 1;

        System.out.println("a = 2");
        System.out.println("b = 4");
        System.out.println("x = 6");
        System.out.println("y = 1");

        if (a == x && y + y == a) ;
//        will this method run?
        System.out.println("a == x && y +y == a");

        if (!(a == x) || y + y == a) ;
        System.out.println("a == x || y + y == a");
//         yes, this will run because one of our conditions is true.
//         all you need is a single true condition for an or operater to be true
//


//        less than
        if (a < b) ;
//           will this method run?
        System.out.println("a <b");
//          yes this will run because the value of a is less than the value of b

//             less than or equal too
        if (b <= 4) {
            System.out.println("b <= 4");
        }
        if (b != 6) {
          System.out.println("b != 6");
        }


        if (a >= 8) {
         System.out.println("a >= 8");
        }
        if (x == 6) {
        System.out.println("x == 6");
        }
//       greater than
        if (a > 6) {
        System.out.println("a > 6");
        }


    }
}
