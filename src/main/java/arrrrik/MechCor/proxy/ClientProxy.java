package arrrrik.mechcor.proxy;

import arrrrik.mechcor.ModBlocks;
import arrrrik.mechcor.ModEntities;
import arrrrik.mechcor.ModItems;
import arrrrik.mechcor.MechCor;
import arrrrik.mechcor.InputHandler;
import net.minecraftforge.client.model.ModelLoaderRegistry;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {
    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        
        OBJLoader.INSTANCE.addDomain(MechCor.MODID);
        ModelLoaderRegistry.registerLoader(new BakedModelLoader());
        
        ModBlocks.initModels();
        ModItems.initModels();
        ModEntities.initModels();
    }
    
    @Override
    public voide init(FMLInitializationEvent e) {
        super.init(e);
        
        MinecraftForge.EVENT_BUS.register(new InputHandler());
        KeyBindings.init();
        
        ModBlocks.initItemModels();
    }    
}    
