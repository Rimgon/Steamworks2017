package org.usfirst.frc.team4611.robot.commands;

import org.usfirst.frc.team4611.robot.Robot;
import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay.Value;
import edu.wpi.first.wpilibj.command.Command;

public class SingleWheelShoot extends Command{
	
	private double speed;

	public SingleWheelShoot(double inputSpeed){
		this.speed = inputSpeed;
		this.requires(Robot.sw);
	}
	public SingleWheelShoot(){
		this.requires(Robot.sw);
	}
	 protected void initialize() {
	    }
	 protected void execute() {
	     //double joyVal = (Robot.oi.rightJoy.getZ()); //port one //no filter on this (run 40%) //Use the 'filter' function on the raw joystick input
	     //Robot.sw.shoot(joyVal); //Actually pass that value to the motors
	     Robot.sw.shoot(RobotMap.singleShooterSpeed); //button only
	    }
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	protected void end() {
        Robot.sw.shoot(0);
    }
	protected void interrupted(){
		this.end();
	}


}
