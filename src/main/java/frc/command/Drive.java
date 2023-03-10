package frc.command;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.OI;
import frc.robot.Robot;
import frc.subsystems.Drivetrain;

public class Drive extends CommandBase {
  private Drivetrain drivetrain;
  
  public Drive() {
    this.drivetrain = OI.drivetrain;
    addRequirements(new Subsystem[] { (Subsystem)this.drivetrain });
  }
  
  public void execute() {
    double throttle = Robot.oi.driveLeftY();
    double rotation = -Robot.oi.driveRightX();
    boolean isQuickTurn = Robot.oi.driveLeftBumper();
    this.drivetrain.drive(throttle, rotation, isQuickTurn);
  }
}
