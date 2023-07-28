//SADP task 4
interface Vehicle
{
 void setPrice(double price);

}

interface Moveable 
{
    void start();
    void stop();
}

interface Flyable
{
    void fly();
}

class Car implements Vehicle, Moveable
{
   double price;

   @Override

   public void setPrice(double price)
    {
        this.price = price;
        System.out.println(+price);
    }

     @Override
    public void start(){
     System.out.println("start");
    }

     @Override
    public void stop(){
      System.out.println("stop");  
    }

}

class Aeroplane implements Vehicle, Moveable, Flyable
{
    double price;

   @Override

   public void setPrice(double price)
    {
        this.price = price;
        System.out.println(+price);
    }

     @Override
    public void start(){
        System.out.println("start");

    }

     @Override
    public void stop(){
         System.out.println("stop"); 
        
    }

    @Override
    public void fly(){
         System.out.println("Fly"); 
        
    }
}


class  VehicleBuilder
{
    public static Car buildCar()
    {
        
        {
            Car car = new Car();
            car.setPrice(15.00);
            car.start();
            return car;
        }
    }

   public static Aeroplane buildAeroplane()
    {
        
        {
            Aeroplane Aeroplane = new Aeroplane();
            Aeroplane.setPrice(15.00);
            Aeroplane.start();
            return Aeroplane;
        }
    }


}



public class task4 {
    public static void main(String[] args) {

       

             Car car =  VehicleBuilder.buildCar();
             car.start();
             car.stop();
            
            Aeroplane Aeroplane = VehicleBuilder . buildAeroplane();
             Aeroplane.start();
            Aeroplane.stop();
      
    }
}
