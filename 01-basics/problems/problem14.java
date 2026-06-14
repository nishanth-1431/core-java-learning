// Write a Java program to calculate GST amount for a product.
public class problem14 {
    public static void main(String[] args) {
        double productPrice = 1200.0;
        double gstRate = 18.0; // 18% GST
        double gstAmount = (productPrice * gstRate) / 100.0;
        double totalAmount = productPrice + gstAmount;
        System.out.println("Product Price: " + productPrice);
        System.out.println("GST Rate: " + gstRate + "%");
        System.out.println("GST Amount: " + gstAmount);
        System.out.println("Total Price including GST: " + totalAmount);
    }
}
