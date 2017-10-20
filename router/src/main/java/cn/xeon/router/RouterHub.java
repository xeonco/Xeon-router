package cn.xeon.router;


import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *  router hub
 * @author LinZaixiong
 * @version 1.0
 * @created 19-10-2017 10:56:10
 */
public class RouterHub {

	private List<RouterCable> m_RouterCables;
	private RouterSupply m_RouterSupply = new DefaultRouterSupply();
	private List<RouterHub> m_ChildRouters;

	public RouterHub(){
		if(this.getClass() != MainRouterHub.class)
			MainRouterHub.getInstance().addChildRouterHub(this);
	}


	/**
	 * 设置提供器
	 *
	 * @param supply   提供器
	 */
	public RouterHub setSupply(RouterSupply supply){
		m_RouterSupply = supply;
		return this;
	}

	/**
	 * 添加 Cable , 尽量不添加多，让其最快速找到
	 * 
	 * @param cable
	 */
	public RouterHub addCable(RouterCable cable){
		if(cable == null)
			return this;
		if(m_RouterCables == null){
			m_RouterCables = new ArrayList<RouterCable>();
		}
		m_RouterCables.add(cable);
		return this;
	}

	/**
	 * 删除cable
	 * 
	 * @param cable    cable
	 */
	public RouterHub removeCable(RouterCable cable){

		if(m_RouterCables != null){
			if(m_RouterCables.contains(cable)){
				m_RouterCables.remove(cable);
			}
		}
		return this;
	}

	/**
	 * 清除cable
	 */
	public RouterHub clearCables(){
		if(m_RouterCables != null){
			m_RouterCables.clear();
		}
		return this;
	}

	/**
	 * 添加子child RouterHub， 尽量不添加多，让其快速找到hub
	 * 
	 * @param hub    添加hub
	 */
	public RouterHub addChildRouterHub(RouterHub hub){

		if(hub == null)
			return this;
		if(m_ChildRouters == null){
			m_ChildRouters = new ArrayList<RouterHub>();
		}
		m_ChildRouters.add(hub);


		return this;
	}

	/**
	 * 删除子child Routerhub
	 * 
	 * @param hub    router hub
	 */
	public RouterHub removeChildRouterHub(RouterHub hub){
		if(m_ChildRouters != null){
			if(m_ChildRouters.contains(hub)){
				m_ChildRouters.remove(hub);
			}
		}


		return this;
	}

	/**
	 * 清除所有router hub,只清除自身的，不帮忙清除子的
	 */
	public RouterHub clearChildRouterHub(){
		if(m_ChildRouters != null){
			m_ChildRouters.clear();
		}
		return this;
	}

	/**
	 * cable plug into hub
	 * 
	 * @param url    url参数/Path参数
	 */
	public RouterCableInfo plug(String url){

		// 找模块
		RouterCableInfo info = findCableInfo(url);
		// 找不到模块，找子hub
		if(info == null) {
			info = findChildRouterCableInfo(url);
		}

		return info;
	}

	/**
	 *  找模块的
	 * @param url
	 * @return
	 */
	private RouterCableInfo findCableInfo(String url){

		RouterCableInfo info = null;
		String group = "";
		String path = "";

		// 找模块
		if(m_RouterCables != null){
			// 一般模块不会太多
			for(int i = 0; i < m_RouterCables.size(); i++){
				RouterCable cable =  m_RouterCables.get(i);
				if(cable != null){
					group = cable.getGroup(url);
					path = cable.getPath(url);

					if(!TextUtils.isEmpty(group) || !TextUtils.isEmpty(path)){
						break;
					}
				}
			}
		}

		if(!TextUtils.isEmpty(group) || !TextUtils.isEmpty(path)){
			info = new RouterCableInfo();
			info.supply(m_RouterSupply);
			info.setGroup(group);
			info.setPath(path);
		}

		return info;
	}

	/**
	 *  找子hub
	 * @return
	 */
	private RouterCableInfo findChildRouterCableInfo(String url){
		RouterCableInfo info = null;

		if(m_ChildRouters != null){
			for(int i = 0; i < m_ChildRouters.size(); i++){
				info = m_ChildRouters.get(i).plug(url);
			}
		}

		return info;
	}


}