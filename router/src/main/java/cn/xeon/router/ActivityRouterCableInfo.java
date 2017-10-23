package cn.xeon.router;


/**
 *  Activity router cable info
 * @author LinZaixiong
 * @version 1.0
 */
public class ActivityRouterCableInfo extends RouterCableInfo {

	private int flag = -1;

	public ActivityRouterCableInfo(){

	}

	/**
	 *  add flag to activity
	 * @param flag
	 * @return
	 */
	public RouterCableInfo addFlag(int flag){
		this.flag |= flag;
		return this;
	}



}