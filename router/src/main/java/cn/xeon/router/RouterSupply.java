package cn.xeon.router;

import android.content.Context;

/**
 * router supplier
 * @author LinZaixiong
 * @version 1.0
 * @created 19-ʮ��-2017 10:56:10
 */
public interface RouterSupply {

	/**
	 *  supply 启动
	 * 
	 * @param context    上下文
	 * @param cableInfo    router cable info
	 * @return  object
	 */
	Object on(Context context, RouterCableInfo cableInfo);

}