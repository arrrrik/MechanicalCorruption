package arrrrik.mechcor;

import arrrrik.mechcor.blocks.*;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

  public static MultiTexturedBlock multiTexturedBlock;
  
  public static void init() {
    multiTexturedBlock = new MultiTexturedBlock();
  }
  
  @SideOnly(Side.CLIENT)
  public static void initModels() {
    multiTexturedBlock.initModel();
  }  
  
/*  @SideOnly(Side.CLIENT)
  public static void initItemModels() {
/
