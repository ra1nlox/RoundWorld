package md.rainlox.roundWorldPlugin.handlers;

import md.rainlox.roundWorldPlugin.Main;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Objects;

import static java.lang.Math.abs;

public class MainHandler implements Listener {

    private final Main plugin;

    private final double MAX_X = 30719;
    private final double MIN_X = 0;
    private final double MAX_Z = 15817;
    private final double MIN_Z = 0;

    public MainHandler(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void walk(PlayerMoveEvent e) {
        Player p = e.getPlayer();
        World w = Bukkit.getServer().getWorld("world");

        double x = p.getLocation().getX();
        double y = p.getLocation().getY();
        double z = p.getLocation().getZ();

        float yaw = p.getLocation().getYaw();
        float pitch = p.getLocation().getPitch();

        if (Objects.requireNonNull(p.getLocation().getWorld()).getName().equals("world")) {
            if (z < MIN_Z) {
                p.teleport(new Location(w, (MAX_X - x) + 3, y, z + 3, -yaw, pitch));
            } else if (z > MAX_Z) {
                p.teleport(new Location(w, (MAX_X - x) + 3, y, z + 3, -yaw, pitch));
            }

            if (x < MIN_X) {
                p.teleport(new Location(w, MAX_X - 3, y, z, yaw, pitch));
            } else if (x > MAX_X) {
                p.teleport(new Location(w, MIN_X + 3, y, z, yaw, pitch));
            }
        }
    }
}
