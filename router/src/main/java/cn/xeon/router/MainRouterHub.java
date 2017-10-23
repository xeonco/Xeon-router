package cn.xeon.router;


/**
 *  main router hub
 *  on 2017/4/21.
 * @author LinZaixiong
 * @version 1.0
 */
public class MainRouterHub extends RouterHub {

	private static MainRouterHub INSTANCE = new MainRouterHub();

	private MainRouterHub(){

	}

	public static MainRouterHub getInstance(){
		return INSTANCE;
	}

	@Override
	public RouterCableInfo plug(String url) {
		return super.plug(url);
	}
}