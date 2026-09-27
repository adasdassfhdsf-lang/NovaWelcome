/*    */ package com.novablox.welcome;
/*    */ 
/*    */ import org.bukkit.ChatColor;
/*    */ import org.bukkit.command.Command;
/*    */ import org.bukkit.command.CommandExecutor;
/*    */ import org.bukkit.command.CommandSender;
/*    */ import org.bukkit.entity.Player;
/*    */ import org.bukkit.event.EventHandler;
/*    */ import org.bukkit.event.Listener;
/*    */ import org.bukkit.event.player.PlayerJoinEvent;
/*    */ import org.bukkit.event.player.PlayerQuitEvent;
/*    */ import org.bukkit.event.server.ServerListPingEvent;
/*    */ import org.bukkit.plugin.Plugin;
/*    */ import org.bukkit.plugin.java.JavaPlugin;
/*    */ 
/*    */ public final class NovaWelcome extends JavaPlugin implements Listener, CommandExecutor {
/*    */   public void onEnable() {
/* 18 */     saveDefaultConfig(); getServer().getPluginManager().registerEvents(this, (Plugin)this); String[] arrayOfString; for (String str : arrayOfString = new String[] { "rules", "discord", "website", "setmotd" }) { if (getCommand(str) != null) getCommand(str).setExecutor(this);  }  getLogger().info("NovaWelcome aktif!");
/* 19 */   } private String c(String paramString) { return ChatColor.translateAlternateColorCodes('&', paramString); }
/* 20 */   private String f(String paramString, Player paramPlayer) { return paramString.replace("{player}", paramPlayer.getName()); } @EventHandler
/* 21 */   public void join(PlayerJoinEvent paramPlayerJoinEvent) { Player player = paramPlayerJoinEvent.getPlayer(); paramPlayerJoinEvent.setJoinMessage(c(f(getConfig().getString("messages.join", "&a{player}"), player))); if (!player.hasPlayedBefore()) { player.sendMessage(c(f(getConfig().getString("messages.first-join", "&bHoş geldin {player}!"), player))); for (String str : getConfig().getStringList("rules")) player.sendMessage(c(str));  }
/* 22 */      } @EventHandler public void quit(PlayerQuitEvent paramPlayerQuitEvent) { paramPlayerQuitEvent.setQuitMessage(c(f(getConfig().getString("messages.quit", "&c{player}"), paramPlayerQuitEvent.getPlayer()))); } @EventHandler
/* 23 */   public void ping(ServerListPingEvent paramServerListPingEvent) { paramServerListPingEvent.setMotd(c(getConfig().getString("motd", "&bNOVABLOX"))); }
/*    */ 
/*    */   
/*    */   public boolean onCommand(CommandSender paramCommandSender, Command paramCommand, String paramString, String[] paramArrayOfString) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   4: invokevirtual toLowerCase : ()Ljava/lang/String;
/*    */     //   7: astore #5
/*    */     //   9: iconst_m1
/*    */     //   10: istore #6
/*    */     //   12: aload #5
/*    */     //   14: invokevirtual hashCode : ()I
/*    */     //   17: lookupswitch default -> 121, 108873975 -> 60, 1224335515 -> 92, 1671380268 -> 76, 1985738484 -> 108
/*    */     //   60: aload #5
/*    */     //   62: ldc 'rules'
/*    */     //   64: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   67: ifeq -> 121
/*    */     //   70: iconst_0
/*    */     //   71: istore #6
/*    */     //   73: goto -> 121
/*    */     //   76: aload #5
/*    */     //   78: ldc 'discord'
/*    */     //   80: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   83: ifeq -> 121
/*    */     //   86: iconst_1
/*    */     //   87: istore #6
/*    */     //   89: goto -> 121
/*    */     //   92: aload #5
/*    */     //   94: ldc 'website'
/*    */     //   96: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   99: ifeq -> 121
/*    */     //   102: iconst_2
/*    */     //   103: istore #6
/*    */     //   105: goto -> 121
/*    */     //   108: aload #5
/*    */     //   110: ldc 'setmotd'
/*    */     //   112: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   115: ifeq -> 121
/*    */     //   118: iconst_3
/*    */     //   119: istore #6
/*    */     //   121: iload #6
/*    */     //   123: tableswitch default -> 394, 0 -> 152, 1 -> 244, 2 -> 268, 3 -> 292
/*    */     //   152: aload_1
/*    */     //   153: aload_0
/*    */     //   154: ldc '&8&m-----------------------'
/*    */     //   156: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   159: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   164: aload_1
/*    */     //   165: aload_0
/*    */     //   166: ldc '&b&lNOVABLOX KURALLARI'
/*    */     //   168: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   171: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   176: aload_0
/*    */     //   177: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   180: ldc 'rules'
/*    */     //   182: invokevirtual getStringList : (Ljava/lang/String;)Ljava/util/List;
/*    */     //   185: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   190: astore #7
/*    */     //   192: aload #7
/*    */     //   194: invokeinterface hasNext : ()Z
/*    */     //   199: ifeq -> 229
/*    */     //   202: aload #7
/*    */     //   204: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   209: checkcast java/lang/String
/*    */     //   212: astore #8
/*    */     //   214: aload_1
/*    */     //   215: aload_0
/*    */     //   216: aload #8
/*    */     //   218: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   221: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   226: goto -> 192
/*    */     //   229: aload_1
/*    */     //   230: aload_0
/*    */     //   231: ldc '&8&m-----------------------'
/*    */     //   233: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   236: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   241: goto -> 394
/*    */     //   244: aload_1
/*    */     //   245: aload_0
/*    */     //   246: aload_0
/*    */     //   247: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   250: ldc 'messages.discord'
/*    */     //   252: ldc '&bDiscord: &fdiscord.gg/novablox'
/*    */     //   254: invokevirtual getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   257: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   260: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   265: goto -> 394
/*    */     //   268: aload_1
/*    */     //   269: aload_0
/*    */     //   270: aload_0
/*    */     //   271: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   274: ldc 'messages.website'
/*    */     //   276: ldc '&bWeb: &fwww.novablox.net'
/*    */     //   278: invokevirtual getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   281: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   284: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   289: goto -> 394
/*    */     //   292: aload_1
/*    */     //   293: instanceof org/bukkit/entity/Player
/*    */     //   296: ifeq -> 317
/*    */     //   299: aload_1
/*    */     //   300: checkcast org/bukkit/entity/Player
/*    */     //   303: astore #7
/*    */     //   305: aload #7
/*    */     //   307: ldc 'novawelcome.setmotd'
/*    */     //   309: invokeinterface hasPermission : (Ljava/lang/String;)Z
/*    */     //   314: ifne -> 342
/*    */     //   317: aload_1
/*    */     //   318: ldc 'novawelcome.setmotd'
/*    */     //   320: invokeinterface hasPermission : (Ljava/lang/String;)Z
/*    */     //   325: ifne -> 342
/*    */     //   328: aload_1
/*    */     //   329: aload_0
/*    */     //   330: ldc '&cYetkin yok.'
/*    */     //   332: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   335: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   340: iconst_1
/*    */     //   341: ireturn
/*    */     //   342: aload #4
/*    */     //   344: arraylength
/*    */     //   345: ifne -> 362
/*    */     //   348: aload_1
/*    */     //   349: aload_0
/*    */     //   350: ldc '&cKullanım: /setmotd <mesaj>'
/*    */     //   352: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   355: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   360: iconst_1
/*    */     //   361: ireturn
/*    */     //   362: aload_0
/*    */     //   363: invokevirtual getConfig : ()Lorg/bukkit/configuration/file/FileConfiguration;
/*    */     //   366: ldc 'motd'
/*    */     //   368: ldc ' '
/*    */     //   370: aload #4
/*    */     //   372: invokestatic join : (Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;
/*    */     //   375: invokevirtual set : (Ljava/lang/String;Ljava/lang/Object;)V
/*    */     //   378: aload_0
/*    */     //   379: invokevirtual saveConfig : ()V
/*    */     //   382: aload_1
/*    */     //   383: aload_0
/*    */     //   384: ldc '&aMOTD güncellendi.'
/*    */     //   386: invokevirtual c : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   389: invokeinterface sendMessage : (Ljava/lang/String;)V
/*    */     //   394: iconst_1
/*    */     //   395: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #24	-> 0
/*    */     //   #25	-> 152
/*    */     //   #26	-> 244
/*    */     //   #27	-> 268
/*    */     //   #28	-> 292
/*    */     //   #29	-> 394
/*    */   }
/*    */ }


/* Location:              C:\Users\adasd\Downloads\NOVABLOX-5-PLUGIN-JARLARI\NovaWelcome.jar!\com\novablox\welcome\NovaWelcome.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */