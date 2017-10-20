package cn.xeon.router;


/**
 *  主要的router hub, 只记录当前程序内注册的
 * @author LinZaixiong
 * @version 1.0
 * @created 19-ʮ��-2017 10:56:09
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