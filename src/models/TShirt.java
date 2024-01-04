package models;
import java.util.Arrays;

public class TShirt {
    public String name;
    public int product_code;
    public double price;
    public String brand;
    public String description;
    public String[] size;


    //constructors
    public TShirt(String name, int productCode, double price, String brand, String description, String[] size) {
        this.name = name;
        this.product_code = productCode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.size = size;
    }


    //getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductCode() {
        return product_code;
    }

    public void setProductCode(int productCode) {
        this.product_code = product_code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getsize() {
        return size;
    }

    public void setsize(String[] size) {
        this.size = size;
    }

    // function for description for the shirts
    public void description() {
        System.out.println("Item name :  " + name);
        System.out.println("Brief Description : " + description);
        System.out.println("Product code : " + product_code);
        System.out.println("Brand : " + brand);
        System.out.println("Price : " + price);
        System.out.println("Available sizes : " + Arrays.toString(size));
    }
}
//arraytostring makes it possible for array to be printed











