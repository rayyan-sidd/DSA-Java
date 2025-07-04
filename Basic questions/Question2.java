class Question2
{
    public static void main(int n) {
        int r,s=0;
        while (n>0)
        {
            r = n % 10;
            s = s + r;
            n = n/10;
        }
        System.out.println(s);
    }
}
