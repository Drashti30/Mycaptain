/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Switchcase {
    public static void main(String[] args){
        int choice;
        System.out.println("Pick one : 1. Hi\t2. Hey\t3. Hello\t");
        Scanner S= new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1 :System.out.println("You said Hi");
            break;
            case 2 :System.out.println("You said Hey");
            break;
            case 3 :System.out.println("You said Hello");
            break;
            default :System.out.println("Invalid choice");
        }
    }
    
}
