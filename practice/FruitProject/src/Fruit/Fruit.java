package Fruit;

public class Fruit {
    private String name;
    private String Color;
    private int Price;

    public Fruit(String name, String color, int price) {
        this.name = name;
        Color = color;
        Price = price;
    }
    public void myNameIs(){

    }
    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
