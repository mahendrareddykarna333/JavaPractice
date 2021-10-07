package uk.outside.package1;

import uk.access.modifiers.Boeing787AeroPlane;

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

        System.out.println(plane.toString());

        Boeing787AeroPlane plane1 = new Boeing787AeroPlane();
        plane1.takeOff();
        plane1.setAltitude(20000);
        plane1.increaseSpeedUpTo(800);
        plane1.autoPilotMode(6);
        plane1.decreaseSpeed(400);
        plane1.land();
       // plane1.activateEmergencyExist(); Outside the package
        // You can not access protected methods and protected members variables here

        plane.publicInt = 23;
        //plane.protectedInt = 56;
        System.out.println(plane1);
    }
}
