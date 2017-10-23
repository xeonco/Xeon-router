package cn.xeon.router;

import android.content.Context;

/**
 * router supplier
 * @author LinZaixiong
 * @version 1.0
 */
public interface RouterSupply {

	/**
	 *  supply start
	 * 
	 * @param context    context
	 * @param cableInfo    router cable info
	 * @return  object
	 */
	Object on(Context context, RouterCableInfo cableInfo);

}