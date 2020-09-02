package org.firstinspires.ftc.teamcode.opmode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
@Autonomous

public class right extends LinearOpMode {
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
        //turn left
        RightMotor.setPower(.5);
        LeftMotor.setPower(-.5);
        Thread.sleep(350);
         //Drive forward
        RightMotor.setPower(.5);
        LeftMotor.setPower(.5);
        Thread.sleep(350);
    }
}
