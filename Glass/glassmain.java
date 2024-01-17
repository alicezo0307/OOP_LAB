/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package glass;
import java.util.Scanner;

public class Glass {

    
    
    public static void main(String[] args) {
        Action ac = new Action();
        Action ac1 = new Action();
     Scanner keyboard = new Scanner(System.in);
     int capacityGlass;   
     int capacityGlass2;
     int water;
     int waterPour;
     int selectAction=2;
     int selectOptionPour1=2;
     int selectOptionPour2=2;
     int selectOptionRefill=2;
        System.out.print("Enter capacity glass (ml.) : ");
        capacityGlass = keyboard.nextInt();

    while (true) {
        System.out.println("\nMenu Action \n 1. Refill Water \n 2. Pour Water\n");
        System.out.print("Choose Action : ");
        selectAction = keyboard.nextInt();
        
        switch (selectAction) {
            case 1:
                if(ac.currentVolumeWaterGlass==capacityGlass){
                    System.out.println("The glass full of water!!");
                    break;
                }
                System.out.print("\nWhat kind of water do you want to refill ? \n 1.Refill full water \n 2.Set volume of water to pour.\n >> Choose : ");
                selectOptionRefill = keyboard.nextInt();
                if (selectOptionRefill==1)
                    ac.refillFull(capacityGlass);
                
                else if(selectOptionRefill==2){
                    System.out.println("\nEnter volume of water to refill.");
                    System.out.print("volume of water (ml.) : "); 
                    water = keyboard.nextInt();  
                    ac.refillWater(water,capacityGlass);                 
                }
                else
                    System.out.println("There is no such option. Please choose again.");
                    break;
                
            case 2:
                
                if(ac.currentVolumeWaterGlass<=0){
                    System.out.println("There is no water in the glass. Please refill water before pouring. !!");
                    break;
                }    
                else{
                    
                    System.out.print("\nWhat kind of water do you want to pour ? \n 1.Pour water on the floor \n 2.Pour water into another glass.\n >> Choose : ");
                    selectOptionPour1 = keyboard.nextInt();
                    
                    if(selectOptionPour1==1){ //pour floor
                       System.out.print("\nHow much do you want to pour ? \n 1. Pour all away.\n 2. Set volume of water to pour.\n >> Choose : ");
                       selectOptionPour2 = keyboard.nextInt();
                       
                       if(selectOptionPour2==1)
                            ac.pourAllAway();
                       
                       else if(selectOptionPour2==2){
                            System.out.print("\nEnter volume of water to to pour (ml.) : ");
                            water = keyboard.nextInt();
                            ac.pourWater(water,capacityGlass);
                       }
                       else
                            System.out.println("There is no such option. Please choose again.");
                            break;
                    }
                    
                    //another Glass
                          //   System.out.print("\nEnter capacity glass 2 (ml.) : ");
                           //  capacityGlass = keyboard.nextInt();
                             
                       System.out.print("\nHow much do you want to pour ? \n 1. Pour all away.\n 2. Set volume of water to pour.\n >> Choose : ");
                       selectOptionPour2 = keyboard.nextInt();
                       
                       if(selectOptionPour2==1){
                            ac.pourAllAway();
                            ac1.refillFull(capacityGlass);
                       }
                       else if(selectOptionPour2==2){
                            System.out.print("\nEnter volume of water to to pour (ml.) : ");
                            water = keyboard.nextInt();
                            ac.pourWater(water,capacityGlass);
                            ac1.refillWater(water, capacityGlass);
                       }
                       else
                            System.out.println("There is no such option. Please choose again.");
                        break;
                        
                        
                    
                    
                }
                
            default:
                System.out.println("There is no such Menu Action. Please choose again.");
                break;
                
        }   
        }

    }
    
}

