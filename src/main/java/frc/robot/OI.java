package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.command.Drive;
import frc.subsystems.Drivetrain;

public class OI {
  public XboxController driveController;
  
  public XboxController manipController;
  
  private Drive drive;
  
  public static Drivetrain drivetrain;
  
  JoystickButton aBtn;
  
  JoystickButton bBtn;
  
  JoystickButton yBtn;
  
  JoystickButton xBtn;
  
  public OI() {
    drivetrain = new Drivetrain();
    this.drive = new Drive();
    initControllers();
    this.aBtn = new JoystickButton((GenericHID)this.driveController, XboxController.Button.kA.value);
    drivetrain.setDefaultCommand((Command)this.drive);
  }
  
  private void initControllers() {
    this.driveController = new XboxController(0);
  }
  
  public double driveLeftY() {
    return -this.driveController.getLeftY();
  }
  
  public double driveRightX() {
    return this.driveController.getRightX();
  }
  
  public boolean driveLeftBumper() {
    return this.driveController.getLeftBumper();
  }
}
