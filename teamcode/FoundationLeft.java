package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous

public class FoundationLeft extends LinearOpMode {
    DcMotor RightMotor = null;
    DcMotor LeftMotor = null;
    DcMotor ArmMotor = null;
    Servo Mozarella = null;
    



    @Override
    public void runOpMode() throws InterruptedException {
        RightMotor = hardwareMap.dcMotor.get("right_motor");
        LeftMotor = hardwareMap.dcMotor.get("left_motor");
        LeftMotor.setDirection(DcMotor.Direction.REVERSE);
        Mozarella = hardwareMap.servo.get("Amen");
        ArmMotor = hardwareMap.dcMotor.get("arm_motor");
      
        


        waitForStart();
        //Servo up
        Mozarella.setPosition(-1);
        Thread.sleep(750);
        //Arm up
        ArmMotor.setPower(1);
        Thread.sleep(1000);
        //Drive forward
        RightMotor.setPower(.5);
        LeftMotor.setPower(.5);
        Thread.sleep(400);
        //turn right
        RightMotor.setPower(-.5);
        LeftMotor.setPower(.5);
        Thread.sleep(425);
        //Drive forward
        RightMotor.setPower(.75);
        LeftMotor.setPower(.75);
        Thread.sleep(350);
        //turn right
        RightMotor.setPower(-.5);
        LeftMotor.setPower(.5);
        Thread.sleep(400);
        //Drive back
        RightMotor.setPower(-.3);
        LeftMotor.setPower(-.3);
        Thread.sleep(350);
        //Servo 0
        Mozarella.setPosition(1);
        Thread.sleep(1950);
        //Drive forward
        RightMotor.setPower(.75);
        LeftMotor.setPower(.5);
        Thread.sleep(1150);
        
        
        
        
        
        
    }
}
