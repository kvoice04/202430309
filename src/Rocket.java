class Rocket extends Spacecraft {
    public Rocket(String name, double fuelLevel, double speed) {
        super(name, fuelLevel, speed);
    }

    // launch 메소드 오버라이딩 - 로켓이 추진하는 이미지에 맞춰서 수정함
    @Override
    public void launch() {
        if (fuelLevel >= 70) {
            System.out.println(name + " 로켓이 " + currentPlanet.getPlanetName() + "에서 강력한 출발을 합니다!");
            fuelLevel -= 50;
        } else {
            System.out.println(name + " 로켓의 연료가 부족합니다.");
        }
    }

    public void launchToSpace() {
        if (fuelLevel >= 50) {
            System.out.println(name + "가 " + currentPlanet.getPlanetName() + "에서 우주로 출발합니다!");
            fuelLevel -= 50;
        } else {
            System.out.println(name + "의 연료가 우주 비행에 부족합니다.");
        }
    }

    //launch 오버로딩
    public void launchToSpace(int fuelLevel) {
        switch (fuelLevel) {
            case 70:
                launchToSpace();
                break;
            case 50:
                System.out.println("연료가 부족합니다.");
                break;
            default:
                System.out.println("출발할수없습니다.");
                break;
        }
    }
}

// 자식 클래스: Satellite : 위성
class Satellite extends Spacecraft {
    public Satellite(String name, double fuelLevel, double speed) {
        super(name, fuelLevel, speed);
    }

    // 착륙 메소드 오버라이딩 - 위성 착륙 불가 상황
    @Override
    public void land() {
        System.out.println(name + "는 착륙할 수 없습니다. 궤도에서 계속 운행 중입니다.");
    }

    public void orbit() {
        System.out.println(name + "가 " + currentPlanet.getPlanetName() + " 궤도에 진입했습니다.");
    }
}

// 자식 클래스: Rover : 방랑자, 우주탐사 관점 -> 자유탐사로봇
class Rover extends Spacecraft {
    public Rover(String name, double fuelLevel, double speed) {
        super(name, fuelLevel, speed);
    }

    // 탐사 메소드 오버로딩 - 탐사 대상 지정 가능
    public void explore() {
        System.out.println(name + "가 " + currentPlanet.getPlanetName() + "를 탐사 중입니다.");
    }

    public void explore(String target) {
        System.out.println(name + "가 " + currentPlanet.getPlanetName() + "에서 " + target + "을(를) 탐사 중입니다.");
    }

    // launch 메소드 오버라이딩 - 자유탐사 로봇의 특성에 맞게 수정
    @Override
    public void launch() {
        if (fuelLevel >= 5) {
            System.out.println(name + " 로버가 " + currentPlanet.getPlanetName() + "에서 탐사 지점으로 이동합니다.");
            fuelLevel -= 5;
        } else {
            System.out.println(name + " 로버의 연료가 부족합니다. 태양광 충전을 시작합니다.");
        }
    }
}

// 포함 관계: Planet 클래스에 탐사 장비 추가 및 관리가 포함
class Planet {
    private String planetName;
    private Spacecraft[] spacecrafts;

    public Planet(String planetName, int capacity) {
        this.planetName = planetName;
        this.spacecrafts = new Spacecraft[capacity];
    }

    public String getPlanetName() {
        return planetName;
    }

    public boolean addSpacecraft(Spacecraft spacecraft, int index) {
        if (index < spacecrafts.length) {
            spacecrafts[index] = spacecraft;
            spacecraft.setCurrentPlanet(this);
            return true;
        } else {
            System.out.println("탐사 장비의 수용 능력을 초과했습니다.");
            return false;
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

    public Spacecraft getSpacecraftByName(String name) {
        for (Spacecraft spacecraft : spacecrafts) {
            if (spacecraft != null && spacecraft.name.equals(name)) {
                return spacecraft;
            }
        }
        return null;
    }

    public int getCapacity() {
        return spacecrafts.length;
    }
}

//변경한 점 : launch, land, explore 3개의 메소드에 오버라이드 추가