package cn.xeon.router;


/**
 *  Activity router cable info
 * @author LinZaixiong
 * @version 1.0
 * @created 19-10-2017 10:56:09
 */
public class ActivityRouterCableInfo extends RouterCableInfo {

	private int flag = -1;

	public ActivityRouterCableInfo(){

	}

	public RouterCableInfo addFlag(int flag){
		this.flag |= flag;
		return this;
	}



}