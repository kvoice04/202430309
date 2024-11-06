public class SpaceExploration {
    public static void main(String[] args) {
        // Spacecraft 객체 생성
        Rocket rocket = new Rocket("Apollo", 100, 10000);
        Satellite satellite = new Satellite("Hubble", 80, 5000);
        Rover rover = new Rover("Curiosity", 60, 200);

        // Planet 객체 생성하고 탐사 장비 추가
        Planet mars = new Planet("Mars", 3);
        mars.addSpacecraft(rocket, 0);
        mars.addSpacecraft(satellite, 1);
        mars.addSpacecraft(rover, 2);

        //기능
        rocket.launchToSpace();
        satellite.orbit();
        rover.explore();

        // 탐사장비 목록
        mars.showSpacecrafts();
    }
}