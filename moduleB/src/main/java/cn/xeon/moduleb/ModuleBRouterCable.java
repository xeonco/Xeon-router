package cn.xeon.moduleb;

import cn.xeon.annotation.route.Route;
import cn.xeon.router.RouterCable;

/**
 * on 2017/10/20.
 *
 * @author LinZaixiong
 */

public class ModuleBRouterCable extends RouterCable {

	@Route(path = "cn.xeon.router.modulea.RouterAActivity")
	public static final String ROUTER_MODULEA_ACTIVITY = "moduleb";
}
