package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class Servos1_Copy extends OpMode {
  DcMotor RightMotor ;
    DcMotor LeftMotor;
    DcMotor ArmMotor;
    Servo ServoLeft;
    Servo Mozarella;
    DcMotor Cheddar;
    Servo Mascarpone;





    public void loop() {

        double leftPower;
        double rightPower;

        double drive = -gamepad1.right_trigger;
        double driveB = gamepad1.left_trigger;
        double turn  =  -gamepad1.left_stick_x;
        leftPower    = Range.clip(drive + driveB + turn, -0.5, 0.5) ;
        rightPower   = Range.clip(drive + driveB - turn, -0.5, 0.5) ;
        
        LeftMotor.setPower(leftPower);
        RightMotor.setPower(rightPower);
        
        if (gamepad1.a ==  true) {
            ArmMotor.setPower(2);
        } else if (gamepad1.b == true) {
            ArmMotor.setPower(-2);
        } else if (gamepad1.a == false) {
            ArmMotor.setPower(0);
        } else if (gamepad1.b == false) {
            ArmMotor.setPower(0);
        }
        
        if (gamepad1.right_bumper == true) {
            ServoLeft.setPosition(1);
        } else if (gamepad1.left_bumper == true) {
            ServoLeft.setPosition(-.7);
        } else if (gamepad1.right_bumper == false) {
            ServoLeft.setPosition(.5);
        } else if (gamepad1.left_bumper == false) {
            ServoLeft.setPosition(.5);
        }
        
        if (gamepad1.dpad_up == true) {
            Mozarella.setPosition(1);
        } else if (gamepad1.dpad_down == true) {
            Mozarella.setPosition(-1);
        } 
        
        if (gamepad1.y == true) {
            Mascarpone.setPosition(1);
        } else if (gamepad1.x == true) {
            Mascarpone.setPosition(-.7);
        } else if (gamepad1.y == false) {
            Mascarpone.setPosition(.5);
        } else if (gamepad1.x == false) {
             Mascarpone.setPosition(.5);
        }
    }

    public void init() {

        LeftMotor  = hardwareMap.get(DcMotor.class, "left_motor");
        RightMotor = hardwareMap.get(DcMotor.class, "right_motor");
        Cheddar = hardwareMap.dcMotor.get("cheddar");
        Mascarpone = hardwareMap.servo.get("mascarpone");
        ArmMotor = hardwareMap.dcMotor.get("arm_motor");
        ServoLeft = hardwareMap.servo.get("Moto");
        Mozarella = hardwareMap.servo.get("Amen");
        LeftMotor.setDirection(DcMotor.Direction.FORWARD);
        RightMotor.setDirection(DcMotor.Direction.REVERSE);
        
    }

}
