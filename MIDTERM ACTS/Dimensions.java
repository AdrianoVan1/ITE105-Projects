import java.util.*;


public class Dimensions {
    public static void main(String[] args) {
     int N = 0;
     int A = 0;
     int threeD[][][] = {
                        {{10,20},
                         {30,40}},
                                  {{50,60}, 
                                   {70,80}}
                        };
    
     
     Scanner scanner = new Scanner(System.in);
  char a;
   do {
    
      
    System.out.println("Enter Layer 1...");
    
        for(int ctr1=0;ctr1<threeD[0].length;++ctr1){
        for(int ctr2=0;ctr2<threeD[0][ctr1].length;++ctr2){
        threeD[0][ctr1][ctr2] = scanner.nextInt();
        N++;
        A += threeD[0][ctr1][ctr2];
     }
    }
   

    System.out.println("Enter Layer 2...");
       for(int ctr1=0;ctr1<threeD[1].length;++ctr1){
        for(int ctr2=0;ctr2<threeD[1][ctr1].length;++ctr2){
        threeD[1][ctr1][ctr2] = scanner.nextInt();
        N++;
        A += threeD[1][ctr1][ctr2];
     }
    }
   
   

         


    for(int lay=0;lay<threeD.length;lay++){
        System.out.println("Layer[" + (lay) + "]:" + (lay+1) );
        for(int row=0;row<threeD[lay].length;row++)
        {
            for(int col=0;col<threeD[lay][row].length;col++){
                System.out.println("ELEMENT["+row+"]["+col+"]:"+ threeD[lay][row][col]);
            }
            
        }
     if (lay>0);
     {
        System.out.println("");
     }
     
    }

    




    System.out.println("Array has " + N + " numbers of elements the total is...." + A);

System.out.println("Do you want to try again?[Y/N]");
a = scanner.next().charAt(0);

       } while ( a == 'Y' || a == 'y'); 
       
    }
}
