package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Марка автомобиля: ");
        String brand = in.nextLine();
        System.out.print("Модель автомобиля: ");
        String model = in.nextLine();
        System.out.print("Вин номер автомобиля: ");
        String vin = in.nextLine();
        System.out.print("Год выпуска автомобиля: ");
        int release = Integer.parseInt(in.nextLine());
        System.out.printf("Brand: %s  Model: %s Vin %s  Release: %s \n", brand, model, vin, release);
        in.close();
    }
}


