public class Main{

    public static void main(String[] args){

        Product arr[]={

            new Product(101,"Laptop","Electronics"),
            new Product(102,"Phone","Electronics"),
            new Product(103,"Shoes","Fashion"),
            new Product(104,"Watch","Accessories"),
            new Product(105,"Tablet","Electronics")

        };

        Product p1=Search.linearSearch(arr,"Phone");

        if(p1!=null){
            System.out.println("Linear Search");
            System.out.println(p1.id+" "+p1.name+" "+p1.category);
        }

        Product p2=Search.binarySearch(arr,"Phone");

        if(p2!=null){
            System.out.println("Binary Search");
            System.out.println(p2.id+" "+p2.name+" "+p2.category);
        }

    }

}