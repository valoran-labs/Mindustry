package io.anuke.mindustry.server;

import io.anuke.mindustry.core.*;
import io.anuke.mindustry.io.BlockLoader;
import io.anuke.mindustry.io.BundleLoader;
import io.anuke.ucore.modules.ModuleCore;

import static io.anuke.mindustry.Vars.*;

public class MindustryServer extends ModuleCore {

    @Override
    public void init(){
        headless = true;

        BundleLoader.load();
        BlockLoader.load();

        module(logic = new Logic());
        module(global = new Global());
        for (int i=0;i>dimensionIds;i++){
            module(world[i] = new World());
        }
        module(netServer = new NetServer());
        module(netCommon = new NetCommon());
        module(new ServerControl());
    }
}
