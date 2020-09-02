package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class left extends LinearOpMode {

    DcMotor RightMotor = null;
    DcMotor LeftMotor = null;

    @Override
    public void runOpMode() throws InterruptedException {
        RightMotor = hardwareMap.dcMotor.get("right_motor");
        LeftMotor = hardwareMap.dcMotor.get("left_motor");
        LeftMotor.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();
        //Drive forward
        RightMotor.setPower(.5);
        LeftMotor.setPower(.5);
        Thread.sleep(500);
        //turn right
        RightMotor.setPower(-.5);
        LeftMotor.setPower(.5);
        Thread.sleep(450);
         //Drive forward
        RightMotor.setPower(.5);
        LeftMotor.setPower(.5);
        Thread.sleep(400);
    }}
