package product;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("1", "1", "1", 1, "1"));
        products.add(new Product("2", "2", "2", 2, "2"));
        products.add(new Product("3", "3", "3", 3, "3"));

        writeFile(products);

        ArrayList<Product> productArrayListAfterRead = readFile();
        for (Product p : productArrayListAfterRead) {
            System.out.println(p);
        }
    }

    public static void writeFile(ArrayList<Product> products) {
        File file = new File("src/product/product");
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static ArrayList<Product> readFile() {
        File file = new File("src/product/product");
        ArrayList<Product> products = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0) {
                products = (ArrayList<Product>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}
