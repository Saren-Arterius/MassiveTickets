package com.massivecraft.massivetickets;

import org.bukkit.permissions.Permissible;

import com.massivecraft.massivecore.util.PermUtil;

public enum Perm
{
	// -------------------------------------------- //
	// ENUM
	// -------------------------------------------- //
	
	BASECOMMAND("basecommand"),
	LIST("list"),
	SHOW("show"),
	SHOW_OTHER("show.other"),
	CREATE("create"),
	DONE("done"),
	DONE_OTHER("done.other"),
	PICK("pick"),
	YIELD("yield"),
	YIELD_OTHER("yield.other"),
	HIGHSCORE("highscore"),
	MODLIST("modlist"),
	WORKING("working"),
	CHEAT("cheat"),
	VERSION("version"),
	
	// END OF LIST
	;
	
	// -------------------------------------------- //
	// FIELDS
	// -------------------------------------------- //
	
	public final String node;
	
	// -------------------------------------------- //
	// CONSTRUCT
	// -------------------------------------------- //
	
	Perm(final String node)
	{
		this.node = "massivetickets."+node;
	}
	
	// -------------------------------------------- //
	// HAS
	// -------------------------------------------- //
	
	public boolean has(Permissible permissible, boolean informSenderIfNot)
	{
		return PermUtil.has(permissible, this.node, informSenderIfNot);
	}
	
	public boolean has(Permissible permissible)
	{
		return has(permissible, false);
	}
	
}
