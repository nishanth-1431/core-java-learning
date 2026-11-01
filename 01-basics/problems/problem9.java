// 	Write a Java program to calculate electricity bill amount.

public class problem9 {
    public static void main(String[] args){
        int units = 150; 
        double rate = 0.75;
        double billAmount = units * rate;
        System.out.println("Electricity Bill Amount: $" + billAmount);
    }
}
