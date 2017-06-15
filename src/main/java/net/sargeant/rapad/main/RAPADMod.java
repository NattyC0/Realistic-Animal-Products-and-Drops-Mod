package net.sargeant.rapad.main;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.sargeant.rapad.proxy.CommonProxy;

/**
 * Created by Joshua on 6/14/2017.
 */
@Mod(modid = RAPADMod.MODID, version = RAPADMod.VERSION, name = RAPADMod.NAME)
public class RAPADMod
{
    public static final String MODID = "rapad";
    public static final String VERSION = "1.0";
    public static final String NAME = "Realistic Animal Products and Drops Mod";

    @SidedProxy(clientSide = "net.sargeant.rapad.proxy.ClientProxy", serverSide = "net.sargeant.rapad.proxy.CommonProxy")
    public static CommonProxy proxy;

    public void preInit(FMLPreInitializationEvent event)
    {

    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
