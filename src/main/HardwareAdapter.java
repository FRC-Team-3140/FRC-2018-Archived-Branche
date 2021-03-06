package main;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import lib.joystick.XboxController;
import Util.RevRoboticsAnalogPressureSensor;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Ultrasonic;

public interface HardwareAdapter extends Constants{
	//OI
	public static XboxController xbox = new XboxController(Xbox_Port);
	public static XboxController xbox2 = new XboxController(Xbox_Port2);
	
	//DRIVETRAIN
	public static WPI_TalonSRX leftDriveMaster = new WPI_TalonSRX(LEFT_Drive_Master);
	public static WPI_TalonSRX leftDriveSlave1 = new WPI_TalonSRX(LEFT_Drive_Slave1);
	public static WPI_TalonSRX rightDriveMaster = new WPI_TalonSRX(RIGHT_Drive_Master);
	public static WPI_TalonSRX rightDriveSlave1 = new WPI_TalonSRX(RIGHT_Drive_Slave1);
	public static WPI_TalonSRX leftDriveSlave2 = new WPI_TalonSRX(LEFT_Drive_Slave2);
	public static WPI_TalonSRX rightDriveSlave2 = new WPI_TalonSRX(RIGHT_Drive_Slave2);
	
	//INTAKE
	public static WPI_TalonSRX leftIntakeMotor = new WPI_TalonSRX(LEFT_Intake);
	//public static WPI_TalonSRX rightIntakeMotor = new WPI_TalonSRX(RIGHT_Intake);
	
	//ELEVATOR
	public static WPI_TalonSRX leftElevatorMaster = new WPI_TalonSRX(LEFT_Elevator_Master);
	//public static WPI_TalonSRX rightElevatorMaster = new WPI_TalonSRX(RIGHT_Elevator_Master);
	
	//SENSORS
	public static RevRoboticsAnalogPressureSensor analogPressureSensor1 = new RevRoboticsAnalogPressureSensor(analogSensor);
	public static DigitalInput stage1BottomSwitch = new DigitalInput(STAGE1_Bottom);
	public static DigitalInput stage1TopSwitch = new DigitalInput(STAGE1_Top);
	public static DigitalInput cubeSensor1 = new DigitalInput(cubeSensor);
	//public static DigitalInput stage2BottomSwitch = new DigitalInput(STAGE2_Bottom);
	//public static DigitalInput stage2TopSwitch = new DigitalInput(STAGE2_Top);
	public static DigitalOutput driverAlerts = new DigitalOutput(driverAlertsPort);
	//public static DigitalInput intakeSwitch = new DigitalInput(INTAKE_Switch);
	
	//PNEUMATICS
	public static DoubleSolenoid shifter = new DoubleSolenoid(PCM_Port1, SHIFTER_EXT, SHIFTER_RET);
	public static DoubleSolenoid tilter = new DoubleSolenoid(PCM_Port1, TILT_EXT, TILT_RET);
	public static Compressor comp = new Compressor(PCM_Port1);
	public static DoubleSolenoid arm = new DoubleSolenoid(PCM_Port1, INTAKE_EXT, INTAKE_RET);
	public static DoubleSolenoid pto = new DoubleSolenoid(PCM_Port1, PTO_EXT, PTO_RET);
}
