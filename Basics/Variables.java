class Variables {
    static int m = 10; //static variable
    void method() {
        int n = 50; //local variable
    }
    public static void main(String args[]) {
        int s = 100;//instance variable
        System.out.println(m+"=static variable. \n"+s+"=instance variable. ");
        //method();
    }
}