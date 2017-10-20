package cn.xeon.router.modulea;

import cn.xeon.annotation.route.Route;
import cn.xeon.router.RouterCable;

/**
 * on 2017/10/20.
 *
 * @author LinZaixiong
 */

public class ModuleARouterCable extends RouterCable {

	@Route(path = "cn.xeon.moduleb.ModuleBActivity")
	public static final String ROUTER_MODULEB_ACTIVITY = "moduleb";
}
