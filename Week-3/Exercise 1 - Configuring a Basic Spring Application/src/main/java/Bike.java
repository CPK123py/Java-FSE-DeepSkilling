class Bike{
    PetrolEngine peng;

    Bike(PetrolEngine peng){     
        this.peng = peng;
    }

    void drive(){
        peng.start();
        System.out.println("Car is driving");
    }
}