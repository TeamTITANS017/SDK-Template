package org.firstinspires.ftc.teamcode.hardware;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.lib.interfaces.Updateable;

public class Robot implements Updateable {
    private final LynxManager lynxManager;

    public Robot(@NonNull HardwareMap hardwareMap) {
        this.lynxManager = new LynxManager(hardwareMap);
    }

    @Override
    public void update() {
        // Linia asta trebuie MEREU pastrata prima in update, NU O STERGETI!!!
        lynxManager.update();
    }
}
