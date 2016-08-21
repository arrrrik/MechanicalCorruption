package arrrrik.MechCor.proxy;

import arrrrik.MechCor.*;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.io.File;

public class CommonProxy {
    public void preInit(FMLPreInitializationEvent e) {
        ModBlocks.init();
        // ModItems.init();
        // ModCrafting.init();
    }

    public void init(FMLInitializationEvent e) {

    }

    public void init(FMLPostInitializationEvent e) {

    }

}
