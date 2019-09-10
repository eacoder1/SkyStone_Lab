package org.firstinspires.ftc.teamcode.Base.Controls;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.teamcode.Base.DriveTrains.MecanumDrive;


@Autonomous (name = "simple Auto Tester")

public class SimpleAutoTester extends LinearOpMode {


    @Override
    public void runOpMode() throws InterruptedException {
       MecanumDrive MechDrive = new MecanumDrive(hardwareMap.dcMotor.get("front_left_motor"), hardwareMap.dcMotor.get("front_right_motor"), hardwareMap.dcMotor.get("rear_left_motor"), hardwareMap.dcMotor.get("rear_right_motor"));
        MechDrive.setLinearOp(this);

        waitForStart();
        idle();

        while (opModeIsActive()) {

            //------------------------------------Power---------------------------------

            MechDrive.driveForward(1);
            sleep(1000);
            MechDrive.stopMotors();


//
//            MechDrive.strafeRight(1);
//            sleep(1000);
//            MechDrive.stopMotors();
//
//
//            MechDrive.driveBackward(1);
//            sleep(1000);
//            MechDrive.stopMotors();
//
//
//            MechDrive.strafeLeft(1);
//            sleep(1000);
//            MechDrive.stopMotors();
//
//            //-----------------------------------Encoders----------------------------------
//
//            MechDrive.driveForward(1, 1);
//
//            MechDrive.strafeRight(1, 1);
//
//            MechDrive.driveBackward(1, 1);
//
//            MechDrive.strafeLeft(1, 1);

            requestOpModeStop();

        }

        idle();
    }
}