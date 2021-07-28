public class startPrint {
    public static void main(String[] args) {

  //      for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        System.out.println("****************************** Printing right angle  ************************* ");
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//int n=5;
//  for (int i=1; i<=n; i++){
//      for (int j=1; j<=i; j++){
//          System.out.print("*");
//      }
//      System.out.println();
//  }
////        System.out.println("hello");
//
//  for (int i=1; i<n; i++){
//      for (int j=i; j<n; j++){
//          System.out.print("*");
//      }
//      System.out.println();
//  }
  int n=5;
  for (int i = 1; i <=n; i++){
      for (int j = i; j <= n; j++) {
          System.out.print("");
      }

          for (int j=1; j<=i; j++)
          {
          System.out.print("*");

      }
      System.out.println();
 }


    }

}
