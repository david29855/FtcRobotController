

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class firstRobotProgram extends LinearOpMode{

    @Override
    public void runOpMode() throws InterruptedException {
        DcMotorEx motor = hardwareMap.get(DcMotorEx.class, "FrontLeft");


        waitForStart();
        while (opModeIsActive()) {
            motor.setPower(-0.5);
        }

    }
}
