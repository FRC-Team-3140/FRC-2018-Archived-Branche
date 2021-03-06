package main.commands.intake;

import edu.wpi.first.wpilibj.command.Command;
import main.Constants;
import main.HardwareAdapter;
import main.Robot;

public class SpinOut extends Command implements Constants, HardwareAdapter {
	
	public SpinOut() {
		requires(Robot.it);
	}
	
    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.it.spinOut();
    }

    // Make this return true when this Command no longer needs to run execute()
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
