package com.starmediadev.plugins.spigotcore;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotCore extends JavaPlugin {

    /*
    Add the following commands/features
    
    Broadcast Command
    ClearInv command
    Feed Command
    Fly Command
    flyspeed command
    walkspeed command
    gamemode command (With specific shortcuts)
    god command
    heal command
    kill command
    spawn features (spawn itself, setting spawn, teleporting players on first login to spawn, teleporting players to spawn always (configurable)
    editsign
    repair
    weather
    time
    homes
    warps
    enderchest
    trash
    top (go to highest block at your location)
    spawnmob
    more (add more items based on what is holding)
    List (Add an API for this though and can make it based on the ranks)
    Item command (Spawn an item, will have support for StarItems, but does not replace this command)
    near
    enchant
    workbench
    Give
    Sudo (Add a hook for StarPerms/API for StarPerms to allow more control over this)
    Back
    
    Stuff to add here and add checks for the other more indepth plugins to disable
    spawner (change spawner type)
    invsee (and echest variant) will be in a moderator tools plugin eventually, this provides a very basic thing
    basic punishment commands (kick, warn, ban, tempban, mute, tempmute and kickall)
    Nicknames
    messaging commands (eventually add support for detecting StarChat), also toggle commands
    tp commands (tp, tpall, tphere, tpa, tpahere)
    Very basic economy system with Vault integration
    Ignore (StarChat overrides this)
    Socialspy
    Vanish
     */
    
    public void onEnable() {
        this.saveDefaultConfig();
    }
}