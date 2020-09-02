package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp

public class ForCam extends OpMode {
    DcMotor RightMotor ;
    DcMotor LeftMotor;
    DcMotor ArmMotor;
    Servo ServoLeft;
    Servo Mozarella;
    Servo Mascarpone;





    public void loop() {

        double leftPower;
        double rightPower;

        double drive = -gamepad1.left_stick_y;
        double turn  = gamepad1.right_stick_x;
        leftPower    = Range.clip(drive + turn, -1, 1) ;
        rightPower   = Range.clip(drive - turn, -1, 1) ;
        
        LeftMotor.setPower(leftPower);
        RightMotor.setPower(rightPower);
        
    }
     
        

    public void init() {

        LeftMotor  = hardwareMap.get(DcMotor.class, "left_motor");
        RightMotor = hardwareMap.get(DcMotor.class, "right_motor");

        LeftMotor.setDirection(DcMotor.Direction.FORWARD);
        RightMotor.setDirection(DcMotor.Direction.REVERSE);
        
    }

}
