/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hill.myna;
import java.util.Scanner;

public class Actions {
    Scanner Keyboard = new Scanner(System.in);
    String repeat;
    int foodWeight;
    private int order;
    int Age;
    int Weight;
    int totalWeightInbody = 0;
    
    void Information(){
        System.out.print("\nName : ");
        String name = Keyboard.nextLine();
        System.out.print("Age(year): ");
        Age = Keyboard.nextInt();
        System.out.print("Weight(gram): ");
        Weight = Keyboard.nextInt();
        System.out.print("Food Weight(gram) : ");     
        foodWeight = Keyboard.nextInt();
    }
    void ChooseAction(){
        
        System.out.print("Choose Order : ");
        int order = Keyboard.nextInt();
        Scanner Keyboard = new Scanner(System.in);
        if(order==1){
            System.out.print("Talk with me :");
            repeat = Keyboard.nextLine();
            while(repeat!="")

                {   System.out.println("Bird Talk : "+repeat);
                    System.out.print("Talk with me :");
                    repeat = Keyboard.nextLine();
                } 
                System.out.println("Bird Talk : Age = "+Age);
        }
        else if(order==2)
        {   
            totalWeightInbody = totalWeightInbody + foodWeight;
            System.out.println("Total Weight Inbody = " + totalWeightInbody);
            while (totalWeightInbody<=Weight) {
                Weight = Weight + foodWeight;
                System.out.println("Total Weight = " + Weight);
                System.out.println("\nI can eat more!");
                System.out.print("Food Weight(gram) : ");   
                foodWeight = Keyboard.nextInt();
                totalWeightInbody = totalWeightInbody + foodWeight;
                System.out.println("Total Weight Inbody = " + totalWeightInbody);
            }
            if(totalWeightInbody>Weight)
                {
                 System.out.println("\nStatus : Expel waste!!!");
                 Weight = foodWeight-(totalWeightInbody-Weight); 
                System.out.println("Total Weight = "+Weight);
                }
        }
    }  
}

