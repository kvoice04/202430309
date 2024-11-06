class Spacecraft {
    protected String name;
    protected double fuelLevel;
    protected double speed;

    public Spacecraft(String name, double fuelLevel, double speed) {
        this.name = name;
        this.fuelLevel = fuelLevel;
        this.speed = speed;
    }

    public void launch() {
        if (fuelLevel > 0) {
            System.out.println(name + "가 출발했습니다.");
            fuelLevel -= 10; // 기본 연료 소모
        } else {
            System.out.println(name + "의 연료가 부족합니다.");
        }
    }

    public void land() {
        System.out.println(name + "가 착륙했습니다.");
    }

    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println(name + "가 연료를 " + amount + "만큼 보충했습니다.");
    }
}
