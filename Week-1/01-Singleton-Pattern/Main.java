public class Main{

    public static void main(String[] args){

        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.print("Singleton Pattern");

        if(log1 == log2){
            System.out.println("Only one object created");
        }
        else{
            System.out.println("More than one object created");
        }

    }

}