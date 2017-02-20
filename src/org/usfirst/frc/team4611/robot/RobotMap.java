package org.usfirst.frc.team4611.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //Drive motor ports. They're numbered clockwise, starting with zero at the front right.
    public static int frontRightWheel = 0;
    public static int backRightWheel = 1;
    public static int backLeftWheel = 2;
    public static int frontLeftWheel = 3;
    //CANTalon Ports
    public static int turretcim = 48;
    //shooter ports (motor-PWM)
    public static int leftShooter = 4;
    public static int rightShooter = 5;
    public static int singleShooter = 6;
    //speed variables
    public static final double singleShooterSpeed = -0.5; //tentative
    public static int ultraSonicPort = 3;
}
