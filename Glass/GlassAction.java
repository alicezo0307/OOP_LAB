/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package glass;

/**
 *
 * @author uSeR
 */
public class Action {
   // int volumeWaterInGlass=0;
    int currentVolumeWaterGlass=0;//water in glass
    int capacityOfGlass;  

    void capacaity_Glass(int capacityGlass){
        capacityOfGlass = capacityGlass;
    }
    
    void pourWater(int water,int capacityOfGlass){
        if (currentVolumeWaterGlass==0)
            System.out.println(">> There is no water in the glass. Please refill water before pouring. <<");
        
        else if(currentVolumeWaterGlass<water)
            System.out.println("There is not enough water to pour out. !! ");
        else if(currentVolumeWaterGlass>=water)
        { 
            currentVolumeWaterGlass= currentVolumeWaterGlass-water;
            System.out.println("Now,There is water in glass = "+ currentVolumeWaterGlass+" ml.");
        }
    }
    
    void pourAllAway(){
        if (currentVolumeWaterGlass==0)
            System.out.println(">> There is no water in the glass !!<<");
        else
        {   currentVolumeWaterGlass = 0;
            System.out.println("\nPour out all the water. Currently there is water in the glass = "+ currentVolumeWaterGlass+" ml.");
        }
    }
    
    void refillWater(int water,int capacityOfGlass){
        if (water<=capacityOfGlass){
            currentVolumeWaterGlass=currentVolumeWaterGlass+water; 
            if(currentVolumeWaterGlass<=capacityOfGlass)
            System.out.println("\nCurrently water in the glass = "+ currentVolumeWaterGlass+" ml.");
            else{
                currentVolumeWaterGlass = capacityOfGlass;
                System.out.println("\nCurrently water in the glass = "+ currentVolumeWaterGlass+" ml.");
            }
        }
        if(water>capacityOfGlass){
            currentVolumeWaterGlass = capacityOfGlass;
            System.out.println("\nCurrently water in the glass = "+ currentVolumeWaterGlass+" ml.");
        }  
    }
    void refillFull(int capacityOfGlass){
        if(currentVolumeWaterGlass==capacityOfGlass){
            System.out.println("The glass full of water!!");
            System.out.println("\nCurrently water in the glass = "+ currentVolumeWaterGlass+" ml.");
        }
        else{
            currentVolumeWaterGlass=capacityOfGlass;
            System.out.println("\nCurrently water in the glass = "+ currentVolumeWaterGlass+" ml.");
        }
        
    }
}

