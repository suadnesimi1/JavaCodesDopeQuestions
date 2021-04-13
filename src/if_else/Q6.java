package if_else;

import java.util.Scanner;

/*Question6
take input of age of 3 peaople by user and determine oldest and youngest
among them

 */
public class Q6 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Enter age of 1st person ");
        System.out.println("Enter age of 2nd person ");
        System.out.println("Enter age of 3d person ");
        int x = s1.nextInt();
        int y = s2.nextInt();
        int z = s3.nextInt();

        if (x > y && x > z) {
            System.out.println("X is the oldest");
            if (y < x && y < z) {
                System.out.println("Y is the yongest");

            }else if(z < x && z < y) {
                    System.out.println("Z is the youngest");
                }

            }

        }
    }
