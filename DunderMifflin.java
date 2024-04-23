import linked_lists.dsa_stackLL.StackLinkedList;

import java.util.Scanner;

public class DunderMifflin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackLinkedList stack = new StackLinkedList();   
        // prompt user
        System.out.println("Choose an option:\n1) Load\n2) Quit");
        // user input with integer
        int input = s.nextInt();
        // check user input
        if (input == 1) {   // if option 1, load was inputed 
            // load the stack
            load(stack);
            // moudular method 
            inputPrompt(stack, s, args);
        } else if (input == 2) {    // if option 2, quit was inputed
            System.out.println("Qutting program...");
        } else {    // if neither option 1 or 2 were inputed
            System.out.println("Invalid input, try again.");
            // recurse through main()
            main(args);
        }
    }

    // modular method
    public static void inputPrompt(StackLinkedList stack, Scanner s, String[] args) {
        // promt user after loading
        System.out.println("Choose an option:\n1) Unload\n2) Quit");
        // user inputer with integer
        int input = s.nextInt();
        // check user input
        if (input == 1) {    // if option 1, unload was inputed 
            System.out.println("Unloading the stack:");   
            // unload the stack             
            unload(stack);
            System.out.println("Successfully unloaded!");
            main(args);
        } else if (input == 2) {    // if option 2, quit was inputed 
            System.out.println("Qutting program...");
        } else {    // if neither option 1 or 2 were inputed           
            System.out.println("Invalid input, try again.");
            // recurse through inputPrompt()
            inputPrompt(stack, s, args);
        }
    }

    // loading the stack with values 1-100
    public static void load(StackLinkedList stack){
        // 2D array to represent storage space
        int[][] storage = new int[10][10];
        // initialize the values in the storage
        fill(storage);
        // 2D array to track used slots
        boolean[][] slotUsed = new boolean[10][10]; 
        // loop through box numbers and assign them to storage spaces
        for (int i = 1; i <= 100; i++) {
            // finds the furthest space from the door 
            int spaceNumber = findFurthestVal(i, storage, slotUsed);
            System.out.println("Box number " + i + " has been assigned to space " + spaceNumber + ".");
            stack.push(spaceNumber);
        }
    }

    // unload the stack
    public static void unload(StackLinkedList stack) {
        // loop until the stack is empty
        while (!stack.empty()) {
            // pop values in the stack
            int spaceNumber = stack.pop();
            System.out.println("Unloading Box from space " + spaceNumber);
        }
    }
    
    // to find the furthest available storage space 
    public static int findFurthestVal(int boxNumber, int [][] storage, boolean[][] slotUsed) {
        double maxDistance = 0.0;
        int row = 0;
        int col = 0;
        // nested loop, iterationg through the storage space
        for(int i = 0; i < 10; i++) {   // rows
            for (int j = 0; j < 10; j++){   // cols
                if (!slotUsed[i][j]){
                    // calculate the distance 
                    double temp = calculateDistance(i, j);
                    // if current highest distance is greater than previous
                    if (maxDistance < temp)
                    {
                        // set new highest distance
                        maxDistance = temp;
                        // set row to i
                        row = i;
                        // set col to j
                        col = j;
                    }
                }
            }
        }
        // mark the space at [row][col] as used
        slotUsed[row][col] = true;
        // return the space number
        return storage[row][col];
    }

    // calculate distance from the front door using the distance formula
    public static double calculateDistance(int row, int col) {
        return Math.sqrt(Math.pow(col, 2) + Math.pow(row, 2));
    }
    
    // modular method to fill the storage values from 1-100
    public static void fill(int[][] storage){  
        int value = 100;
        // iterate through the 2D array
        for (int i = 9; i >= 0; i--) {
            for (int j = 9; j >= 0; j--) {
                storage[i][j] = value--;
            }
        }
    }
}
