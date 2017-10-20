package cn.xeon.router;

import android.content.Context;
import android.content.Intent;

/**
 *  default router supply, now only support activity element
 * @author LinZaixiong
 * @version 1.0
 * @created 19-10-2017 10:56:09
 */
public class DefaultRouterSupply implements RouterSupply {

	public DefaultRouterSupply(){

	}

	/**
	 *  启动 supply
	 * 
	 * @param context    上下文
	 * @param cableInfo    router cable info
	 */
	@Override
	public Object on(Context context, RouterCableInfo cableInfo){

		startActivity(context, cableInfo);
		return null;
	}


	private void startActivity(Context context, RouterCableInfo cableInfo){

		if(cableInfo != null){
			Intent intent = new Intent();
			intent.setClassName(context, cableInfo.getPath());
			context.startActivity(intent);
		}

	}

}