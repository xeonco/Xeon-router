package cn.xeon.router.app;

import android.app.Application;

import cn.xeon.router.MainRouterHub;

/**
 * on 2017/10/20.
 *
 * @author LinZaixiong
 */

public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		MainRouterHub.getInstance().addCable(new ModuleBRouterCable());
	}
}
