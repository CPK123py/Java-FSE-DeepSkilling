public class Logger{

    private static Logger obj;

    private Logger(){}

    public static Logger getInstance(){
        if(obj == null){
            obj = new Logger();
        }
        return obj;
    }

    public void print(String msg){
        System.out.println(msg);
    }

}