public class eleven {
    public static void main(String[] args) {
        int n=4;
        //upper part
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++) //1st half stars
            {
                System.out.print("*");
            }

            for(int j=1; j<=2*(n-i); j++) //spaces
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) //2nd half stars
            {
                System.out.print("*");
            }

            System.out.println();
        }

         //lower part
         for(int i=n; i>=1; i--)
         {
             for(int j=1; j<=i; j++) //1st half stars
             {
                 System.out.print("*");
             }
 
             for(int j=1; j<=2*(n-i); j++) //spaces
             {
                 System.out.print(" ");
             }
 
             for(int j=1; j<=i; j++) //2nd half stars
             {
                 System.out.print("*");
             }
 
             System.out.println();
         }
    }
}
