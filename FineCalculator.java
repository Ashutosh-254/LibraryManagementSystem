import java.util.Scanner;

public class FineCalculator
{
    public static void main(String args[]) {
      
      //Personal Information Collected
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Division: ");
        String Division = in.nextLine();
        System.out.print("Enter Roll Number: ");
        String rollNumber = in.nextLine();
        
      //Item Borrowed Information Collected
        System.out.print("Days late: ");
        int days = in.nextInt();
        System.out.println("Type R for Referece Book");
        System.out.println("Type J for Journals");
        System.out.println("Type O for others");
        System.out.print("Enter book type: ");
        char type = in.next().charAt(0);
        int fine = 0;
        
      //Item Type and Number of Days Dependant Penalty Amounts
        switch (type) {
            
          //For Ref Books
            case 'R':
            if (days <= 2)
                fine = 2;
            else if (days <= 5)
                fine = 4;
            else if (days <= 8)
                fine = 6;
            else if (days <= 11)
                fine = 8;
            else
                fine = 10;
            break;
            
          //For Journals
            case 'J':
            if (days <= 2)
                fine = 4;
            else if (days <= 5)
                fine = 8;
            else if (days <= 8)
                fine = 12;
            else if (days <= 11)
                fine = 16;
            else
                fine = 18;
            break;
            
          //For Other items
            case 'O':
            if (days <= 4)
                fine = 1;
            else if (days <= 8)
                fine = 2;
            else if (days <= 12)
                fine = 3;
            else if (days <= 16)
                fine = 4;
            else
                fine = 5;
            break;
            
            default:
            System.out.println("Invalid book type");
        }
        
        int penaltyAmount = fine * days;
        
        System.out.println("Division and Roll Number: " + Division + rollNumber);
        
        //System.out.println("rollNumber: " + rollNumber);
        
        System.out.println("Total Fine: " + penaltyAmount);
    }
}
