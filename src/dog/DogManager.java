package dog;

import java.util.ArrayList;
import java.util.Scanner;

public class DogManager {
    private ArrayList<Dog> dogs;

    public DogManager() {
        dogs = new ArrayList<>();
    }

    public void add(Scanner scanner) {
        System.out.println("Nhập mã nhận dạng: ");
        Long id = Long.parseLong(scanner.nextLine());
        System.out.println("Nhập tên con chó: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi con chó: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập cân nặng con chó: ");
        int weight = Integer.parseInt(scanner.nextLine());
        Dog dog = new Dog(id, name, age, weight);
        dogs.add(dog);
    }

    public void update(Scanner scanner) {
        System.out.println("Nhập vào id của Dog cần sửa:");
        Long idUpdate = Long.parseLong(scanner.nextLine());
        int indexUpdate = -1;
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getId().equals(idUpdate)) {
                indexUpdate = i;
            }
        }
        if (indexUpdate != -1) {
            System.out.println("Nhập tên mới: ");
            String newName = scanner.nextLine();
            dogs.get(indexUpdate).setName(newName);
            System.out.println("Nhập tuổi mới: ");
            int age = Integer.parseInt(scanner.nextLine());
            dogs.get(indexUpdate).setAge(age);
            System.out.println("Nhập cân nặng mới: ");
            int weight = Integer.parseInt(scanner.nextLine());
            dogs.get(indexUpdate).setWeight(weight);
        }
    }

    public void delete(Scanner scanner) {
        System.out.println("Nhập vào id của Dog cần xóa:");
        Long idDelete = Long.parseLong(scanner.nextLine());
        int indexDelete = -1;
        for (int i = 0; i < dogs.size(); i++) {
            if (dogs.get(i).getId().equals(idDelete)) {
                indexDelete = i;
            }
        }
        if (indexDelete != -1) {
            dogs.remove(indexDelete);
        }
    }

    public void displayById(Scanner scanner) {
        System.out.println("Nhập vào id của Dog cần hiển thị:");
        Long idDisplay = Long.parseLong(scanner.nextLine());
        for (Dog dog : dogs) {
            if (dog.getId().equals(idDisplay)) {
                System.out.println(dog);
            }
        }
    }

    public void displayByWeight() {
        System.out.println("Danh sách Dog có weight > 2: ");
        for (Dog d : dogs) {
            if (d.getWeight() > 2) {
                System.out.println(d);
            }
        }
    }

    public void display() {
        System.out.println("Danh sách Dog: ");
        for (Dog d : dogs) {
            System.out.println(d);
        }
    }
}
