import java.util.ArrayList;
import java.util.Scanner;

public class percobaan {

   static ArrayList<Integer> posisiPemain = new ArrayList<Integer>();

   public static void main(String[] args) {
    char[][] kotak = {{'1','|','2','|','3'},
    {'-','+','-','+','-'},
    {'4','|','5','|','6'},
    {'-','+','-','+','-'},
    {'7','|','8','|','9'},};

    kotakgame(kotak);

    Scanner input = new Scanner(System.in);
    System.out.println("PILIH POSISI ANDA (1 - 9) : ");
    String pemain = "PEMAIN";
    int posisiPemain = input.nextInt();
    System.out.println("kamu memilih kotak " + posisiPemain);
    tebak(kotak, posisiPemain, pemain);
    
    kotakgame(kotak);
   }

   public static void kotakgame(char[][] kotak){
      for(char[] x : kotak) {
      for(char y : x){
         System.out.print(y);
      }
      System.out.println(" ");
    }
   }

   public static void tebak(char[][] kotak, int posisi, String pemain){
      char simbol  = ' ';
      if(pemain.equalsIgnoreCase("pemain")){
         simbol = 'X';
         posisiPemain.add(posisi);
      }else {

      }

      switch (posisi) {
         case 1:
            kotak[0][0] = simbol;
            break;
         case 2:
            kotak[0][2] = simbol;
            break;
         case 3:
            kotak[0][4] = simbol;
            break;
         case 4:
            kotak[2][0] = simbol;
            break;
         case 5:
            kotak[2][2] = simbol;
            break;
         case 6:
            kotak[2][4] = simbol;
            break;
         case 7:
            kotak[6][0] = simbol;
            break;
         case 8:
            kotak[6][2] = simbol;
            break;
         case 9:
            kotak[6][4] = simbol;
            break;
            
         default:
            break;
      }
   }
}
