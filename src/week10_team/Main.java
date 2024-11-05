package week10_team;

public class Main {
    public static void main(String[] args) {
        ironman ironMan = new ironman("Tony Stark", 100, 5);

        ironMan.toggleWeaponStatus();
        ironMan.ShootRepulsor();
        ironMan.fly(40);
        ironMan.activateShield();
    }
}