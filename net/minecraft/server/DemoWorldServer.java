package net.minecraft.server;

public class DemoWorldServer extends WorldServer {

    private static final long K = (long) "North Carolina".hashCode();
    public static final WorldSettings a = (new WorldSettings(DemoWorldServer.K, EnumGamemode.SURVIVAL, true, false, WorldType.NORMAL)).a();

    public DemoWorldServer(MinecraftServer minecraftserver, IDataManager idatamanager, WorldData worlddata, int i, MethodProfiler methodprofiler) {
        super(minecraftserver, idatamanager, worlddata, i, methodprofiler);
        this.worldData.a(DemoWorldServer.a);
    }
}
