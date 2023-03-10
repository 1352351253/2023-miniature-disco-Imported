package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
  public static OI oi = new OI();
  
  public void robotInit() {}
  
  public void robotPeriodic() {
    CommandScheduler.getInstance().run();
  }
  
  public void autonomousInit() {}
  
  public void autonomousPeriodic() {}
  
  public void teleopPeriodic() {}
  
  public void testPeriodic() {}
}
