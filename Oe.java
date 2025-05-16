/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sorting;

/**
 *
 * @author Students Account
 */

import java.util.Scanner;

import java.util.Stack;
public class UndoFeature {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      Stack <String> galahad = new Stack <> ();
      
      galahad.push("Hotdog");
      
      galahad.push("Chocolate");
      
      galahad.push("Steak");
      
      String action;
      
      boolean running = true;
      
      System.out.println(galahad);
        
        System.out.println("Enter a choice either type 'UNDO', 'EXIT', 'STOP', 'SAVE' 'DO' ");
        
        String Choice;
        
        Choice = scanner.nextLine();
        
        while(running == true){
            System.out.println(galahad);
            System.out.println("Enter a choice either type 'UNDO', 'EXIT', 'DO' 'PRINT" );
        if (Choice.equalsIgnoreCase("Exit")){
            
            System.out.println(" no");
            
            running = false;
            } else if(Choice.equalsIgnoreCase("DO")){
                System.out.println("ENTER VALUE TO BE ADDED");
                
                action = scanner.next();
                
                galahad.push(action);
                
                
            } else if(Choice.equalsIgnoreCase("UNDO")){
                
                galahad.pop();
                
                System.out.println(galahad);
            }  else if(Choice.equalsIgnoreCase("PRINT")){
                
                System.out.println(galahad);
            }
                
                
                
            }
                
                
                
                
                
        
        
                
        
        }
        
        }
    

