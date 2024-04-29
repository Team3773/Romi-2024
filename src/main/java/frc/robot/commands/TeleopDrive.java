// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import java.util.function.DoubleSupplier;

import javax.xml.xpath.XPathExpression;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.RomiDrivetrain;

public class TeleopDrive extends Command {
  private RomiDrivetrain m_Drivetrain;
  private DoubleSupplier m_xaxis, m_yaxis;

  
  /** Creates a new TeleopDrive. */
  public TeleopDrive(RomiDrivetrain d, DoubleSupplier xaxis, DoubleSupplier yaxis) 
  {
    this.m_Drivetrain=d;
    this.m_xaxis=xaxis;
    this.m_yaxis=yaxis;
   addRequirements(d);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
  m_Drivetrain.arcadeDrive(m_yaxis.getAsDouble(), m_xaxis.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
