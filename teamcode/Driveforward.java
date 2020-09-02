package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class Driveforward extends LinearOpMode {

    DcMotor RightMotor = null;
    DcMotor LeftMotor =null;
  
     @Override
    public void runOpMode() throws InterruptedException {
        RightMotor = hardwareMap.dcMotor.get("right_motor");
        LeftMotor = hardwareMap.dcMotor.get("left_motor");
        LeftMotor.setDirection(DcMotor.Direction.REVERSE);


        waitForStart();
        //Drive forward
        RightMotor.setPower(1);
        LeftMotor.setPower(1);
        Thread.sleep(150);
    

}
}
