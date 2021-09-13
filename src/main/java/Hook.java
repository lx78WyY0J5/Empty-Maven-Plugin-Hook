import org.bukkit.plugin.java.JavaPlugin;

public class Hook extends JavaPlugin
{
public static void test() {
        Lib.setPlugin(Main.getPlugin(Main.class));
        Lib.debug();
}
}