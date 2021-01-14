package model;


import java.util.HashMap;
import java.util.LinkedList;


public class CarDatabase extends Vehicle
{



  protected HashMap<String, Vehicle> db = new HashMap<String, Vehicle>();

    public CarDatabase()
    {
        MagicGenerator mg = new MagicGenerator();
        for(int i = 0; i<1000; i++)
        {
            Vehicle v = new Vehicle();
            v.setLicensePlate(mg.getRandomLicencePlate());
            v.setColor(mg.getRandomColor());
            v.setManufacturer(mg.getRandomManufacturer());
            v.setOwner(mg.getRandomName());
            db.put(v.getLicensePlate(), v);

            System.out.println("Created Vehicle " + v.getLicensePlate());
        }


    }

    public LinkedList<Vehicle> search(String licensePlate, boolean exact)
    {
        LinkedList<Vehicle> linkedList = new LinkedList<Vehicle>();
        if(!exact) {
            long startTime = System.nanoTime();

                for (Vehicle v : db.values())
                {
                    if(v.getLicensePlate().contains(licensePlate))
                    {
                        linkedList.add(v);
                    }
                }

            long endTime = System.nanoTime();
            System.out.println("it took " + (endTime-startTime)/1000000 +"ms to search");
            return linkedList;
        }
        else
        {
            long startTime = System.nanoTime();

            linkedList.add(db.get(licensePlate));
            if (linkedList.getFirst() == null)
            {
                long endTime = System.nanoTime();
                System.out.println("it took " + (endTime-startTime)/1000000 +"ms to search");
                return null;
            }
            long endTime = System.nanoTime();
            System.out.println("it took " + (endTime-startTime)/1000000 +"ms to search");
            return linkedList;
        }

    }
}