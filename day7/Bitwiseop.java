class Bitwiseop
{
    public static void main(String args[])
    {
        //<<<,>>>, << ,&,~,|,^,>>
        int a=5;
        int b=6;
        int c=a&b;
        int d=a|b;
        int e=4;


        System.out.println(c);
        System.out.println(d);
        System.out.println(~e);
        System.out.println(e >> 1);
        System.out.println(e << 1);
        System.out.println(e << 3);
    }
}