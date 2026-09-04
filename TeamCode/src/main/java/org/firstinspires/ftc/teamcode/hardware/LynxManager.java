package org.firstinspires.ftc.teamcode.hardware;

import androidx.annotation.NonNull;

import com.qualcomm.hardware.lynx.LynxModule;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.lib.interfaces.Updateable;

import java.util.List;

public class LynxManager implements Updateable {
    private final List<LynxModule> hubs;
    public LynxManager(@NonNull HardwareMap hardwareMap){
        hubs = hardwareMap.getAll(LynxModule.class);
        for (LynxModule hub : hubs) {
            hub.setBulkCachingMode(LynxModule.BulkCachingMode.MANUAL);
        }
    }
    @Override
    public void update() {
        for (LynxModule hub : hubs) {
            hub.clearBulkCache();
        }
    }
}
