package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Indexer extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private CANSparkMax index_leftMotor;
  private CANSparkMax index_rightMotor;
  private CANSparkMax feed_motor;

public Indexer() {
    index_leftMotor = new CANSparkMax(1);
    index_rightMotor = new CANSparkMax(2);
    feed_motor = new CANSparkMax(3);
}

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}

