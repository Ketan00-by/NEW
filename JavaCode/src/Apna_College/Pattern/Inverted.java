package Apna_College.Pattern;

public class Inverted {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){// n is either 4 or n
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//int n=5;
      //  for(int i=1;i<=n;i++){// n is either 4 or n
       // for(int j=1;j<=n-i;j++){ this logic will also work
        //System.out.print("*");
          //  }
            //        System.out.println();