package if_else;

import java.util.Scanner;

/*Question 5
A school has following rules for grading system:
a. Bellow 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A

ask user to enter marks and print the corresponding grade
 */
public class Q5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter marks ");
        int x=s.nextInt();
        if(x <= 25){
            System.out.println(" F ");

        } else if(x>=26 && x<=45){
            System.out.println(" E ");
        }else if(x>=46 && x<=50){
            System.out.println(" D ");
        }else if(x>=51 && x<=60){
            System.out.println(" C ");
        }else if(x>=61 && x<=80){
            System.out.println(" B ");
        }else if(x>=81){
            System.out.println(" A ");
        }

    }
}
