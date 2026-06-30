public class Forecast{

    public static double predict(double amt,double rate,int yr){

        if(yr==0){
            return amt;
        }

        return predict(amt,rate,yr-1)*(1+rate);

    }

}