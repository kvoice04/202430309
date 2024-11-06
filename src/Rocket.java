class Rocket extends Spacecraft {
    public Rocket(String name, double fuelLevel, double speed) {
        super(name, fuelLevel, speed);
    }

    public void launchToSpace() {
        if (fuelLevel >= 50) {
            System.out.println(name + "가 우주로 출발합니다!");
            fuelLevel -= 50;
        } else {
            System.out.println(name + "의 연료가 우주 비행에 부족합니다.");
        }
    }
}

// 자식 클래스: Satellite : 위성
class Satellite extends Spacecraft {
    public Satellite(String name, double fuelLevel, double speed) {
        super(name, fuelLevel, speed);
    }

    public void orbit() {
        System.out.println(name + "가 궤도에 진입했습니다.");
    }
}

// 자식 클래스: Rover : 방랑자, 우주 탐사 -> 자유탐사로봇
class Rover extends Spacecraft {
    public Rover(String name, double fuelLevel, double speed) {
        super(name, fuelLevel, speed);
    }

    public void explore() {
        System.out.println(name + "가 탐사 임무를 수행 중입니다.");
    }
}

// 포함 관계: Planet 클래스에 탐사 장비 포함
class Planet {
    private String planetName;
    private Spacecraft[] spacecrafts;

    public Planet(String planetName, int capacity) {
        this.planetName = planetName;
        this.spacecrafts = new Spacecraft[capacity];
    }

    // 탐사 장비 추가
    public void addSpacecraft(Spacecraft spacecraft, int index) {
        if (index < spacecrafts.length) {
            spacecrafts[index] = spacecraft;
            System.out.println(spacecraft.name + "가 " + planetName + "에 추가되었습니다.");
        } else {
            System.out.println("탐사 장비의 수용 능력을 초과했습니다.");
        }
    }

    public void showSpacecrafts() {
        System.out.println(planetName + "의 탐사 장비 목록:");
        for (Spacecraft spacecraft : spacecrafts) {
            if (spacecraft != null) {
                System.out.println("- " + spacecraft.name);
            }
        }
    }
}