package org.firstinspires.ftc.robotcontroller.TeleOp;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcontroller.internal.Devices.DriveSystem;

/**
 * Created by abnaveed on 10/13/2016.
 */


public class TeleOp extends OpMode
{
    // TeleOp
    DriveSystem robot = null;

    @Override
    public void init()
    {

    }

    @Override
    public void loop()
    {
        // Getting joystick values
        double leftJoystick = gamepad1.left_stick_y;
        double rightJoystick = gamepad1.right_stick_y;
        double convertedPower_Left = leftJoystick*100;
        double convertedPower_Right = rightJoystick*100;
        // Converting joystick values to motor power values
        robot.setPower(convertedPower_Left,convertedPower_Right);

    }
}
