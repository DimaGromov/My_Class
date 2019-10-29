/*
        Создать класс.
        В нём должны быть минимум три поля и три метода.
        Унаследуйте от него другой класс и добавьте еще по полю и методу.
        В программе должна быть демонстрация работы Вашего класса.
 */

import java.util.Scanner;

public class My_Class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вначале создается экземпляр оружия.
        Machin_gun weapon = new Machin_gun();   // !!! Почему если создается ссылка типа Weapon не вызывается метод класса Machin_gun

        int i; // Переменная для интерфейса.

        // Меню.
        System.out.print("Посмотреть характеристики: 1\nВыстрелить: 2\nПерезарядить: 3\nПроверить магазин: 4\nВыстрелить очередь: 5\nВыход: 0\n\n");

        while (true) {
            i = scanner.nextInt();
            if (i == 0) {
                break;
            }

            // Интерфейс взаимодействия с оружием.
            switch (i) {
                case 1:
                    System.out.println("Емкость магазина: " + weapon.magazine);
                    System.out.println("Дальность: " + weapon.range);
                    System.out.println("Вес: " + weapon.weight);
                    break;
                case 2:
                    weapon.shot();
                    break;
                case 3:
                    weapon.reload_magazine();
                    break;
                case 4:
                    weapon.check_magazine();
                    break;
                case 5:
                    weapon.queue_shoot();

            }


        }
    }
}
