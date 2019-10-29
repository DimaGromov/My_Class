public class Weapon {
    public  int magazine;
    public  int shoot_bullets = 0;
    public  int range;
    public  int weight;

    Weapon(){
        System.out.println("Создан стандартный образец Оружия.");
        magazine = 8;
        range = 2289;
        weight = 940;
    }

    void shot(){
        if(magazine !=0) {
            System.out.println("Bah!");
            magazine--;
            shoot_bullets++;
        }else {
            System.out.println("Магазин пуст! Требуется перезарядка!");
        }
    }

    void check_magazine(){
        System.out.println("В магазине " + magazine + " патронов.");
    }

    void reload_magazine(){
        System.out.println("Перезарядка");
        magazine += shoot_bullets;
        shoot_bullets = 0;
    }

}
