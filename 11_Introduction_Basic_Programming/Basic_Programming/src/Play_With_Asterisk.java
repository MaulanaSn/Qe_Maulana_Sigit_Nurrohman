import java.util.Scanner;
public class Play_With_Asterisk {
        public static void main(String args[]){

            Scanner input = new Scanner(System.in);
            int tinggi_segitiga,i,j,k;

            System.out.print("Input : ");
            tinggi_segitiga = input.nextInt();

            System.out.println();

            for(i=1; i<=tinggi_segitiga; i++) {

                for(j=1; j<=tinggi_segitiga-i; j++) {
                    System.out.print(" ");
                }

                for(k=1; k<=i; k++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

        }
    }


