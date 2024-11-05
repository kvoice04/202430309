package week10_team;

public class ironman {
    private String name;
    private int suitPower; //(0~100)
    private boolean weaponStatus;
    private int armorLevel; //(0~10)

    public ironman(String name, int suitPower, int armorLevel) {
        this.name = name;
        this.suitPower = suitPower;
        this.weaponStatus = false;
        this.armorLevel = armorLevel;
    }

    public void fly(int distance) {
        int powerCost = distance / 2;
        if (suitPower >= powerCost) {
            suitPower -= powerCost;
            System.out.println(name + "님이 " + distance + "km 비행했습니다. 남은 에너지: " + suitPower);
        } else {
            System.out.println("에너지 부족, 엔진 비활성화.");
        }
    }

    public void ShootRepulsor() {
        int powerCost = 15;
        if (suitPower >= powerCost && weaponStatus) {
            suitPower -= powerCost;
            System.out.println(name + ", 리펄서 발사! 남은 에너지: " + suitPower);
        } else if (!weaponStatus) {
            System.out.println("리펄서가 비활성화 되었습니다.");
        } else {
            System.out.println("에너지 부족. 리펄서 비활성화.");
        }
    }

    public void activateShield() {
        if (suitPower >= 10) {
            System.out.println(name + "방어막 활성화!");
            suitPower -= 10;
        } else {
            System.out.println("방어막이 무력화 되었습니다.");
        }
    }

    public void toggleWeaponStatus() {
        weaponStatus = !weaponStatus;
        System.out.println("무기 상태 : " + (weaponStatus ? "활성화" : "비활성화") + "되었습니다.");
    }

    public String getName() {
        return name;
    }

    public int getSuitPower() {
        return suitPower;
    }

    public int getArmorLevel() {
        return armorLevel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuitPower(int suitPower) {
        this.suitPower = suitPower;
    }

    public void setArmorLevel(int armorLevel) {
        this.armorLevel = armorLevel;
    }
}