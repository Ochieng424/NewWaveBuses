/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newwavebuses;

import java.util.Scanner;

/**
 *
 * @author Ochieng_Derrick
 */
public class NewWaveBuses extends busBooking {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        System.out.println("New Wave Prepaid Ticket Dispensing Machine");
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Full Names: ");
        String name = input.nextLine();
        
        System.out.print("Enter Your Age: ");
        int age = input.nextInt();
        
        System.out.print("Enter Origin Zone: ");
        int origin_Zone = input.nextInt();
        
        System.out.print("Enter the Destination Zone: ");
        int dest_Zone = input.nextInt();
        
        System.out.print("Ticket for how many days: ");
        int no_of_days = input.nextInt();
        
        busBooking customerDetails = new busBooking(name,age,origin_Zone,dest_Zone,no_of_days);
        customerDetails.generateTicket();
        
        
        
    }
    
    
    
}
