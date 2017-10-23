package cn.xeon.router;


import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 *  router hub
 * @author LinZaixiong
 * @version 1.0
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
	 * supplier setter
	 *
	 * @param supply   supplier
	 * @return self
	 */
	public RouterHub setSupply(RouterSupply supply){
		m_RouterSupply = supply;
		return this;
	}

	/**
	 * add cable
	 * 
	 * @param cable
	 * @return self
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
	 *  delete cable
	 * 
	 * @param cable    cable
	 * @return self
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
	 *  clear cable
	 * @return self
	 */
	public RouterHub clearCables(){
		if(m_RouterCables != null){
			m_RouterCables.clear();
		}
		return this;
	}

	/**
	 * add child router hub
	 * 
	 * @param hub    add hub
	 * @return self
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
	 * delete child Routerhub
	 * 
	 * @param hub    router hub
	 * @return self
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
	 * clear all router hubs,only itself, not child
	 * @return self
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
	 * @param url    url param/Path param
	 * @return self
	 */
	public RouterCableInfo plug(String url){

		// find module
		RouterCableInfo info = findCableInfo(url);
		// can't find module, find child router hub
		if(info == null) {
			info = findChildRouterCableInfo(url);
		}

		return info;
	}

	/**
	 *  find module
	 * @param url
	 * @return self
	 */
	private RouterCableInfo findCableInfo(String url){

		RouterCableInfo info = null;
		String group = "";
		String path = "";

		// find module
		if(m_RouterCables != null){
			// it won't too much
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
	 *  find child hub
	 * @return self
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