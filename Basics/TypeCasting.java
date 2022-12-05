class TypeCasting  {
    public static void main(String args[]) {

        int a = 10;
        float b = (int)a;
        System.out.println("int to float conversion: "+b);
        int c = (int)b;
        System.out.println("float to int conversion: "+c);
        int d = 129;
        byte e = (byte)d;
        System.out.println(e);
    }
}