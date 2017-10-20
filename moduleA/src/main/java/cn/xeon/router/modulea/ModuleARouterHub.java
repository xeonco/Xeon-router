package cn.xeon.router.modulea;

import cn.xeon.router.RouterHub;

/**
 * on 2017/10/20.
 *
 * @author LinZaixiong
 */

public class ModuleARouterHub extends RouterHub {
	private static final ModuleARouterHub INSTANCE = new ModuleARouterHub();
	private  ModuleARouterHub() {
		super();
		addCable(new ModuleARouterCable());
	}

	public static ModuleARouterHub getInstance(){
		return INSTANCE;
	}


}
