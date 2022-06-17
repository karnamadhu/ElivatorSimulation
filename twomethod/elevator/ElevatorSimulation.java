package com.twomethod.elevator;

import java.util.Scanner;

public class ElevatorSimulation {

    public static int firstInput(int destinationFloorNum, int initialFloorNum) {

        int i = 0;
        do {
            

            if (destinationFloorNum > initialFloorNum && destinationFloorNum <= 5) {
            	 System.out.println("Door is closing...");
                for (i = initialFloorNum; i <= destinationFloorNum; i++) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                    }
                    System.out.println("Going up..." +i);

                }
                i--;
            } else if (destinationFloorNum > 5) {
                System.out.println("Enter valid Floor");
                System.out.println("Door is closing...");
                return initialFloorNum;
            } else if(destinationFloorNum==initialFloorNum) {
            	System.out.println("you are on the same floor");
            	return initialFloorNum;
            }
              else {
            	  System.out.println("Door is closing...");
                for (i = initialFloorNum; i >= destinationFloorNum; i--) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {

                    }
                    System.out.println("Going down..."+i );

                }
                i++;
            }

            System.out.println("Hello, opening the door, we are on "+i );
            if (destinationFloorNum <= 5) {
            	initialFloorNum = destinationFloorNum;
            }
            
            return i;
        } while (true);

    }

    public static int newReq(int presentfloor, int clickedfloor) {

        int i = presentfloor;

        Scanner sc1 = new Scanner(System.in);
        int n2 = clickedfloor;
        int n1 = presentfloor;

        do {
        	
        	if (n2 > n1 && n2 <= 5) {
            	System.out.println("Door is closing...");
                for (i = n1; i <= n2; i++) {
                    System.out.println("Going up..." );
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {

                    }
                }
                i--;
            } else if (n2 > 5) {
                System.out.println("Enter valid Floor");
                return n1;
            } else if(n2==n1) {
            	System.out.println("you are on the same floor");
            }
            else {
            	System.out.println("Door is closing...");
                for (i = n1; i >= n2; i--) {
                    System.out.println("Going down..." );
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {

                    }
                }
                i++;
            }
            System.out.println("Hello, opening the door, we are on "+i);
            if (n2 <= 5) {
                n1 = n2;
            }
            n1=n2;

            return i;

        } while (true);
    }

    public static void main(String... args) {
    	int presentfloor=0;
    	int i=0;
    	
    	
        do {
			
        System.out.println("Enter destination floor");
        Scanner sc = new Scanner(System.in);
        int n2=0;
        i=presentfloor;
        try {
        	
         n2 = sc.nextInt();
         presentfloor = firstInput(n2, i);
         
        }catch(java.util.InputMismatchException e) {
        	System.out.println("ENTER THE VALID INPUT");
        }
     
         
        System.out.println("enter the destination");
        Scanner sc1 = new Scanner(System.in);
        int newreq=0;
        
        try {
       
         newreq = sc1.nextInt();
          int requested = newReq(presentfloor, newreq);
          presentfloor=requested;
        }catch(java.util.InputMismatchException e) {
        	System.out.println("ENTER THE VALID INPUT");
        }
        
       
        }while(true);

    }}