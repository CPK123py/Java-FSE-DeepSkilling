public class Main{

    public static void main(String[] args){

        DocumentFactory obj;

        obj = new WordFactory();
        Document d1 = obj.createDocument();
        d1.open();

        obj = new PdfFactory();
        Document d2 = obj.createDocument();
        d2.open();

        obj = new ExcelFactory();
        Document d3 = obj.createDocument();
        d3.open();

    }

}