package cn.xeon.router;

import android.content.Context;
import android.content.Intent;

/**
 *  default router supply, now only support activity element
 * @author LinZaixiong
 * @version 1.0
 */
public class DefaultRouterSupply implements RouterSupply {

	public DefaultRouterSupply(){

	}

	/**
	 *  start supply
	 * 
	 * @param context    context
	 * @param cableInfo    router cable info
	 * @return object
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