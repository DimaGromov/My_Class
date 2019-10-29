public class Machin_gun extends Weapon {
    int bullet_in_queue;

    Machin_gun(){
        bullet_in_queue = 3;
    }

    void queue_shoot(){
        for (int i = 0; i< bullet_in_queue; i++){
            this.shot();
        }

    }
}
