package main.commands.drivetrain;

import edu.wpi.first.wpilibj.command.Command;
import main.Robot;
import main.OI;

/**
 *
 */
public class Drive extends Command {

    public Drive() {
    	requires(Robot.dt);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {    	
    	Robot.dt.driveVelocity(-OI.getXbox().getSmoothedMainY(), -OI.getXbox().getSmoothedAltX());
    	//Robot.dt.driveVelocity(OI.getXbox().getSmoothedMainY(), OI.getXbox().getSmoothedAltY());
    }
    
    protected boolean isFinished() {
        return true;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}