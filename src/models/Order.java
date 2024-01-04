package models;

import java.util.Arrays;

public class Order {
    public String name;
    public String phone_no;

    public double[] price;
    public String size_we_need;

    public String getSize_we_need() {
        return size_we_need;
    }

    public void setSize_we_need(String size_we_need) {
        this.size_we_need = size_we_need;
    }

    public Order(String size_we_need) {
        this.size_we_need = size_we_need;
    }
//set constructors

    public Order(String name, String phone_no, int[] items, double[] price) {
        this.name = name;
        this.phone_no = phone_no;

        this.price = price;
    }
        //set getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getphone_no() {
        return phone_no;
    }

    public void setphone_no(String phone_no) {
        this.phone_no = phone_no;
    }



    public double[] getprice() {
        return price;
    }

    public void setprice(double[] price) {
        this.price = price;
    }





//final printout function
    public void TotalBill() {
        double totalPrice = 0;
        for(double price : price)
        {
            totalPrice += price;
        }

        //vat add
        double vat = totalPrice * 0.13;

        System.out.println("Order details:  ");
        System.out.println('\n');
        System.out.println("Name: " + name);
        System.out.println("Phone number: " + phone_no);
        System.out.println("price: " + Arrays.toString(price));
        System.out.println("\n");
        System.out.println("Total price: " + totalPrice);
        System.out.println("VAT (13%): " + vat);
        System.out.println("\n");
        System.out.println("Total price with VAT: " + (totalPrice + vat));
    }
}

