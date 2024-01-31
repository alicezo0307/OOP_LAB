/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package my.book;

public class MyBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====== Select Action ======\n 1.Open to first pages\n 2.Open to last pages\n 3.Select pages to open\n 4.Open to page with bookmark\n 5.Open next pages\n "
        +"6.Open previous pages\n 7.Select pages for insert bookmark\n 8.Show total pages in book\n 9.Show current number of pages\n 10.Show number of pages with bookmark\n");
        ActionChange AC = new ActionChange();
        while(true){
            AC.actionToBook();
            AC.actionToBook();
            
        }
    }    
}
