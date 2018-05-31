/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class User {
   int UserId;
   String Password;
   Scanner in = new Scanner(System.in);
   
   void setUserId(){
       System.out.println("Enter User ID: ");
       UserId = in.nextInt();
   }
   int getUserId(){
        return UserId;}
}
