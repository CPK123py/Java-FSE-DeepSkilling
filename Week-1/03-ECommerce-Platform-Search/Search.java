import java.util.Arrays;
import java.util.Comparator;

public class Search{

    public static Product linearSearch(Product arr[],String name){

        for(int i=0;i<arr.length;i++){

            if(arr[i].name.equalsIgnoreCase(name)){
                return arr[i];
            }

        }

        return null;

    }

    public static Product binarySearch(Product arr[],String name){

        Arrays.sort(arr,new Comparator<Product>(){

            public int compare(Product a,Product b){
                return a.name.compareToIgnoreCase(b.name);
            }

        });

        int l=0;
        int r=arr.length-1;

        while(l<=r){

            int mid=(l+r)/2;

            int c=arr[mid].name.compareToIgnoreCase(name);

            if(c==0){
                return arr[mid];
            }

            if(c<0){
                l=mid+1;
            }
            else{
                r=mid-1;
            }

        }

        return null;

    }

}