package com.onemethod.elevator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ElevatorSimulation {

   
    public int request(int destinationFloorNum, int initialFloorNum){
          int maxFloor=5;
    	  int i=initialFloorNum;
        do {
            if (destinationFloorNum > initialFloorNum && destinationFloorNum<=maxFloor) {
                for (i = initialFloorNum; i <= destinationFloorNum; i++) {
                    System.out.println("Going up..." + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        
                    }
                }
                i--;
            } else if(destinationFloorNum>maxFloor) {
               System.out.println("Enter valid Floor");
               return initialFloorNum;
            }else if(initialFloorNum==destinationFloorNum) {
            	System.out.println("you are on the same floor");
            	return destinationFloorNum;
            }
            else {
                for (i = initialFloorNum; i >= destinationFloorNum; i--) {
                    System.out.println("Going down..." + i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                        
                    }
            }
                i++;
            }
            System.out.println("Hello, opening the door, we are on " + i);
            if(destinationFloorNum<=5){
            	initialFloorNum = destinationFloorNum;
            }
            return destinationFloorNum; 
        } while (true);
    }
 
    public static void main (String...args) throws NumberFormatException, IOException{
    	int initialFloorNum=0;
    	int destinationFloorNum=0;
        int presentFloor=0;
        
        ElevatorSimulation ec=new ElevatorSimulation();
        do {
        	initialFloorNum=presentFloor;
        System.out.println("Enter destination floor");
        BufferedReader input =new BufferedReader(new InputStreamReader(System.in));
        try {
        	
        	destinationFloorNum=  Integer.parseInt(input.readLine());
        	presentFloor=ec.request(destinationFloorNum,initialFloorNum);
         
        }catch(java.lang.NumberFormatException e) {
        	System.out.println("ENTER THE VALID INPUT");
        }
        }while(true);
    }
}
