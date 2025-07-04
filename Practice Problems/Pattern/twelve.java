public class twelve {
    public static void main(String[] args) {
        int n=5;

        for(int i=n; i>=1; i--)
        {
            //spaces:
            for(int j=i-1 ; j>0; j--)
            {
                System.out.print(" ");
            }
            //stars:
            for(int j=1; j<=n; j++)
            {
                System.out.print("*");
            }
            //spaces:
            // if(i>1){
            //     for(int j=0; j<=n-i; j++)
            // {
            //     System.out.print(" ");
            // }
            // }
            System.out.println();
        }
    }
}
