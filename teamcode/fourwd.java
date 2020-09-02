package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.Range;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

@TeleOp

public class fourwd extends LinearOpMode {
    ElapsedTime Runtime = new ElapsedTime();
    
    DcMotor RightF;
    DcMotor RightR;
    DcMotor LeftF;
    DcMotor LeftR;
    
    
    public void runOpMode(){
        
        LeftR = hardwareMap.get(DcMotor.class, "left_rear");
        LeftR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LeftR.setDirection(DcMotor.Direction.FORWARD);
        
        RightR = hardwareMap.get(DcMotor.class, "right_rear");
        RightR.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RightR.setDirection(DcMotor.Direction.REVERSE);

        LeftF = hardwareMap.get(DcMotor.class, "left_front");
        LeftF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        LeftF.setDirection(DcMotor.Direction.FORWARD);
        
        RightF = hardwareMap.get(DcMotor.class, "right_front");
        RightF.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        RightF.setDirection(DcMotor.Direction.REVERSE);
    
        
        double speedAdjust = 10;
        
        
        waitForStart();
        Runtime.reset();
        
        
        while (opModeIsActive()){
            if (gamepad1.dpad_up == true){
                speedAdjust += 1;
            }
            if (gamepad1.dpad_down == true){
                speedAdjust -= 1;
            }
            LeftR.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x) * (-speedAdjust/10));
            RightR.setPower((gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x) * (-speedAdjust/10));
            LeftF.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x) * (-speedAdjust/10));
            RightF.setPower((gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x) * (-speedAdjust/10));
            
            
            telemetry.addData("speed Adjust", speedAdjust); 
        }
    }
}
