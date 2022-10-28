package dog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DogManager dogManager = new DogManager();
        System.out.println("Nhập thông tin con chó 1: ");
        dogManager.add(scanner);
        System.out.println("Nhập thông tin con chó 2: ");
        dogManager.add(scanner);

        dogManager.display();

        dogManager.update(scanner);

        dogManager.display();

        dogManager.delete(scanner);

        dogManager.display();

        dogManager.displayById(scanner);
        dogManager.displayByWeight();
        //hiển thị danh sách Dog

    }
}
