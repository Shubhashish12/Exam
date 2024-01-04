import models.TShirt;
import models.Order;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // objects for shirt
        TShirt tShirt1 = new TShirt("Gorkhali Batman", 1323, 1050, "plusEightOne",
                "Batman Cruising Above the Himalayas", new String[]{"Xl", "L", "M"});
        TShirt tShirt2 = new TShirt("White Peacock", 1689, 1500, "HimayalaNepal",
                "A White Peacock Print in the background of the Mountains", new String[]{"S", "XL", "M"});
        TShirt tShirt3 = new TShirt("Monkey Runners", 1000, 2900, "NepalStyles",
                "A Monkey Sitting atop the roof of the Bhaktapur Durbar Square", new String[]{"Xl", "L", "M"});

        // calling the function for shirt description
        tShirt1.description();
        tShirt2.description();
        tShirt3.description();

        //take orders
        Scanner sc = new Scanner(System.in);

        System.out.println("Write Order Name and Details");
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Your Phone No");
        String phone_no = sc.nextLine();
        System.out.println("Enter the order no of the shirt you want");
        String product = sc.nextLine();




        int abcd = 1050;
        int bcde = 2900;
        int efgh = 1500;
        if(Objects.equals(product, "1323")){
            Order order1 = new Order(name, phone_no,new int[]{1323}, new double[]{1050});
            // Function to print the bill
            order1.TotalBill();
        }
        else if(Objects.equals(product, "1689")){
            Order order1 = new Order(name, phone_no,new int[]{1323}, new double[]{2900});
            // Function to print the bill
            order1.TotalBill();
        }
        else if(Objects.equals(product, "1000")){
            Order order1 = new Order(name, phone_no,new int[]{1000}, new double[]{1500});
            // Function to print the bill
            order1.TotalBill();
        }
        else {
            System.out.println("not available, enter a valid code");
        }








    }
}