package cn.xeon.router;


import cn.xeon.annotation.route.template.IConnector;

/**
 *  router cable
 * @author LinZaixiong
 * @version 1.0
 * @created 19-10-2017 10:56:09
 */
public class RouterCable {

	public IConnector m_IConnector;

	public RouterCable(){
		m_IConnector = findInjectObj(this);
	}

	/**
	 * 获取group 类型
	 * 
	 * @param key  值
	 */
	public String getGroup(String key){
		return m_IConnector != null ? m_IConnector.getGroup(this, key) : "";
	}

	/**
	 * 获取path路径
	 * 
	 * @param key    值
	 */
	public String getPath(String key){
		return m_IConnector != null ? m_IConnector.getPath(this, key) : "";
	}

	/**
	 * 找出需要注入的对象
	 * @param target    找到要注入的对象
	 */
	protected IConnector findInjectObj(Object target){

		IConnector ret = null;
		Class<?> targetClass = target.getClass();
		String clsName = targetClass.getName();
		if (clsName.startsWith("android.") || clsName.startsWith("java.")) { // 到framework层就不搜索，包括java.lang.Object
			return ret;
		}

		try {

			Class<?> viewBindingClass = Class.forName(clsName + IConnector.NAME_OF_ROUTE);
			//noinspection unchecked
			ret =  (IConnector)viewBindingClass.newInstance();
		} catch (ClassNotFoundException e) { // 从父类查看是否有这个函数
			ret = findInjectObj(targetClass.getSuperclass());
		} catch (InstantiationException e) {
			throw new RuntimeException("Unable to create view binder for " + clsName, e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException("Unable to create view binder for " + clsName, e);
		}

		return ret;
	}

}