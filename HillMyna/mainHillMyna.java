/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hill.myna;
import java.util.Scanner;

public class HillMyna {

    public static void main(String[] args) {
        Actions action = new Actions();
        System.out.println("Please enter information in order\n 1.Name\n 2.Age\n 3.Weight\n 4.Food Weight");
        action.Information();
        System.out.println("\nChoose Actions\n 1.Talk Repeat\n 2.Eat Food\n");
        action.ChooseAction();
    }
}

