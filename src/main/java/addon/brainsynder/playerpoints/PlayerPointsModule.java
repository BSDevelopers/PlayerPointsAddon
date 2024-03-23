package addon.brainsynder.playerpoints;

import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.PlayerPointsAPI;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import simplepets.brainsynder.addon.presets.EconomyModule;
import simplepets.brainsynder.api.Namespace;
import simplepets.brainsynder.api.plugin.SimplePets;
import simplepets.brainsynder.debug.DebugLevel;

import java.util.UUID;
import java.util.function.Consumer;

@Namespace(namespace = "PlayerPoints")
public class PlayerPointsModule extends EconomyModule {
    private PlayerPointsAPI pointsAPI;

    @Override
    public void init() {
        super.init();

        pointsAPI = PlayerPoints.getInstance().getAPI();
    }

    @Override
    public boolean shouldEnable() {
        Plugin plugin = Bukkit.getPluginManager().getPlugin("PlayerPoints");
        if (plugin == null) {
            SimplePets.getDebugLogger().debug(DebugLevel.ERROR, "PlayerPoints wasn't found!");
            SimplePets.getDebugLogger().debug(DebugLevel.ERROR, "Please download it from: https://www.spigotmc.org/resources/80745/");
            return false;
        }
        return true;
    }

    @Override
    public int getDefaultPrice() {
        return 100;
    }

    @Override
    public void fetchBalance(UUID uuid, Consumer<Double> balanceConsumer) {
        pointsAPI.lookAsync(uuid).whenComplete((integer, throwable) -> {
            balanceConsumer.accept(Double.valueOf(integer));
        });
    }

    @Override
    public void withdraw(UUID uuid, double amount) {
        pointsAPI.takeAsync(uuid, (int) amount);
    }


    @Override
    public double getBalance(UUID uuid) {
        return 0;
    }
}
