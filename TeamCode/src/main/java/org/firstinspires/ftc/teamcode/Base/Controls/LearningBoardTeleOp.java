package org.firstinspires.ftc.teamcode.Base.Controls;

import com.qualcomm.hardware.rev.RevTouchSensor;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

import org.firstinspires.ftc.robotcontroller.external.samples.SensorREVColorDistance;

@TeleOp (name = "LearningBoard")
public class LearningBoardTeleOp extends OpMode {

    DcMotor motor1;
    DcMotor motor2;
    DcMotor LinearSlideMotor;

    Servo servo1;
    Servo servo2;

    RevTouchSensor touchSensor;
    SensorREVColorDistance disColSesnor;

    public void init() {

        motor1 = hardwareMap.dcMotor.get("motor_1");
        motor2 = hardwareMap.dcMotor.get("motor_2");

        servo1 = hardwareMap.servo.get("servo_1");
        servo2 = hardwareMap.servo.get("servo_2");

        touchSensor = hardwareMap.get(RevTouchSensor.class, "touch_sensor");
        disColSesnor = hardwareMap.get(SensorREVColorDistance.class, "rev_distance_color_sensor"); //platypus

        LinearSlideMotor = hardwareMap.dcMotor.get("linear_slide_motor");
    }

    public void loop () {


    }

    //methods


public void motor1Control () {
        if(gamepad1.left_stick_y < -.1) {
            motor1.setPower (gamepad1.left_stick_y);
        }
        else if (gamepad1.left_stick_y > .1) {
            motor1.setPower(gamepad1.left_stick_y);
        }
        else {
            motor1.setPower(0);
        }
}






}



