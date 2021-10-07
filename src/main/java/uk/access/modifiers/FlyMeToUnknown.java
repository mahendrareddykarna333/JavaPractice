package uk.access.modifiers;

public class FlyMeToUnknown {

    public static void main(String args[]) {

        System.out.println(Boeing787AeroPlane.CLUB_WORLD);

        //Assume this main class acts as a pilot operating this
        Boeing787AeroPlane plane = new Boeing787AeroPlane();
        plane.takeOff();
        plane.setAltitude(20000);
        plane.increaseSpeedUpTo(800);
        plane.autoPilotMode(6);
        plane.decreaseSpeed(400);
        plane.land();
        plane.activateEmergencyExist();
        plane.publicInt = 23;
        plane.protectedInt = 56;


        IllegalModification plane3 =new IllegalModification();
        plane3.takeOff();
        plane3.setAltitude(20000);
        plane3.increaseSpeedUpTo(80000);
        plane3.autoPilotMode(6);
        plane3.decreaseSpeed(-230);


        System.out.println(plane3.toString());

        Boeing787AeroPlane plane1 = new Boeing787AeroPlane();
        plane1.takeOff();
        plane1.setAltitude(20000);
        plane1.increaseSpeedUpTo(800);
        plane1.autoPilotMode(6);
        plane1.decreaseSpeed(400);
        plane1.land();
        System.out.println(plane1);
    }
}
