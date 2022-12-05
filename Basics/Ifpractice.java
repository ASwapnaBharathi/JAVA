class Ifpractice{
    public static void main(String args[]) {
        String address = "Brahmanapalle,Tadipatri";

        if(address.endsWith("Tadipatri")){
            if(address.contains("Yadiki")){
                System.out.println("Your mandal is yadiki");
            }else if(address.contains("Brahmanapalle")){
            System.out.println("Your village is Brahmanapalle");
        }else{
            System.out.println(address.split(",")[0]);
        }
        }else{
            System.out.println("Your mandal is not specified");
        }
    }
}