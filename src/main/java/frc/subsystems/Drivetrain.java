package frc.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private CANSparkMax rightLeader;
  
  private CANSparkMax rightFollower;
  
  private CANSparkMax leftLeader;
  
  private CANSparkMax leftFollower;
  
  private Ultrasonic coneSensorBottom;
  
  private DutyCycleEncoder wristAbsoluteEncoder;
  
  public Drivetrain() {
    this.wristAbsoluteEncoder = new DutyCycleEncoder(0);
    this.rightLeader = new CANSparkMax(3, CANSparkMaxLowLevel.MotorType.kBrushless);
    this.rightFollower = new CANSparkMax(4, CANSparkMaxLowLevel.MotorType.kBrushless);
    this.rightLeader.setInverted(true);
    this.rightFollower.setInverted(true);
    this.leftLeader = new CANSparkMax(1, CANSparkMaxLowLevel.MotorType.kBrushless);
    this.leftFollower = new CANSparkMax(2, CANSparkMaxLowLevel.MotorType.kBrushless);
    this.leftLeader.setInverted(false);
    this.leftFollower.setInverted(false);
  }
  
  public void drive(double throttle, double rot, boolean isQuickTurn) {
    this.rightLeader.set(throttle + rot);
    this.rightFollower.set(throttle + rot);
    this.leftLeader.set(throttle - rot);
    this.leftFollower.set(throttle - rot);
  }
}
