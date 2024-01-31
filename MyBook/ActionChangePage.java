/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.book;
import java.util.Scanner;

public class ActionChange {
    int page = 10 ;
    int positionPage=0;
    int positionPageSelect;
    int positionBookMark=0;
    int selectAction = 10;
    Scanner keyboard = new Scanner(System.in);
    
    void actionToBook() {
        System.out.print("Select Action : ");
        selectAction = keyboard.nextInt();

        switch (selectAction) {
            case 1:
                positionPage = 1;
                System.out.println("Page : " + positionPage + "\n");
                break;

            case 2:
                positionPage = page;
                System.out.println("Page : " + positionPage + "\n");
                break;

            case 3:
                System.out.print("Select the page : ");
                positionPage = keyboard.nextInt();
                System.out.print("\n");
                    while (positionPage > page || positionPage <= 0) { 
                        if (positionPage >= page+2) 
                            System.out.print("This book has just " + page + " pages -> Select action again <-\n"+"Select the page : ");
                        else if (positionPage == page + 1) 
                            System.out.print("Here's the back cover !! -> Select action again <- \n"+"Select the page : ");
                        else if (positionPage == 0) 
                            System.out.print("Here's the front cover !! -> Select action again <- \n"+"Select the page : ");
                    positionPage = keyboard.nextInt();
                    System.out.print("\n");
                    } break;

            case 4:
                if (positionBookMark == 0)
                    System.out.println("Now there are no pages with bookmarks \n-> Please select again. <- \n");
                else {
                    System.out.println("Current bookmark page : " + positionBookMark + "\n");
                    positionPage = positionBookMark;
                } break;
                
            case 5:
                if (positionPage >= 0 && positionPage <= page) {
                    positionPage++;
                    System.out.println("Next page!\n");
                }
                if (positionPage > page){
                    System.out.println("There are no more pages to open ,Here's the back cover !!!!\n-> Select action again <-");
                    positionPage = 11;
                } break;

            case 6:
                if (positionPage >= 0 && positionPage <= page + 1) {
                    positionPage--;
                    System.out.println("Previous page!\n");
                }
                if (positionPage <= 0){
                    System.out.println("There are no more pages to open ,Here's the front cover !! \n-> Select action again <-");
                    positionPage=0;
                } break;

            case 7:
                System.out.print("Select page for bookmark : ");
                positionPage = keyboard.nextInt();
                
                if (positionPage > 0 && positionPage<= page) {
                    positionBookMark = positionPage;
                    System.out.println("BOOKMARK!\n"+"=====================\n");
                    positionPage = positionBookMark;
                } else {
                    while (positionPage > page || positionPage == 0) {
                        System.out.println("There are no pages to bookmark. \n -> Please select page to bookmark again <- \n"+ "Select page to bookmark : ");
                        positionBookMark = keyboard.nextInt();
                        positionPage = positionBookMark;
                    }
                } break;
               
            case 8:
                System.out.println("Total pages in book: " + page + "\n");
                break;

            case 9:
                if (positionPage == 0)
                    System.out.println("\nHere's the front cover !! \npages : " + positionPage + "\n");
                else if (positionPage < 0) {
                    positionPage = 0;
                    System.out.println("Current Page : " + positionPage + "\n");
                } else if (positionPage == page + 1)
                    System.out.println("\nHere's the back cover !! \npages : " + positionPage + "\n");
                else
                    System.out.println("-> Current Page : " + positionPage + "\n");
                break;

            case 10:
                System.out.println("Page with bookmarks : " + positionBookMark + "\n");
                break;

            default:
                System.out.println("The selected action is not listed \n -> Please select again <- \n");
                break;
        }
    }
}

