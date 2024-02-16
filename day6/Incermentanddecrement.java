class  Increment
{
    public static void main(String args[])
    {
        //int a=10;
        //int b=++a;
        //a++ >> post increment
        //++a >> preincrement

       // System.out.println(a++);
        //System.out.println(a);
        //System.out.println(b);

        //int a=10;
        //int b=a--;
        //int c=++b;
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        //int a=5;
        //int b=a--;
        //int c=++a;
        //int d=--c;
        //System.out.println(a);
        //System.out.println(b);
        //System.out.println(c);
        //System.out.println(d);
        int a=8; 
        int b=a++ + ++a; 
        int c=a + b++;
        int d=a++ + --c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

    }
}