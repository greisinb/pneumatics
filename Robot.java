// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {
  private Joystick driverStick; //names the joystick
  Solenoid solenoid1 = new Solenoid(PneumaticsModuleType.CTREPCM, 4); //creates a single solenoid named solenoid1 on output 4
  DoubleSolenoid solenoid2 = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, 1, 2); //creates double solenoid (solenoid2) on output 1 and 2
  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    driverStick = new Joystick(0); //attaches driverStick to USB 0
  }

  @Override
  public void robotPeriodic() {}

  @Override
  public void autonomousInit() {}

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {
if(driverStick.getRawButtonPressed(1)){
  solenoid1.set(true); //turn on solenoid1
}
if(driverStick.getRawButtonReleased(1)){
  solenoid1.set(false); //turn on solenoid1
}
if(driverStick.getRawButtonPressed(2)){
  solenoid2.set(Value.kForward); //sets solenoid in forward position, can also set for kOff and kReverse
}
if(driverStick.getRawButtonReleased(2)){
  solenoid2.set(Value.kOff);
}

}

  

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
