package cn.xeon.router;

import java.lang.CharSequence;
import java.io.Serializable;
import java.util.ArrayList;

import android.os.Parcelable;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;

/**
 * router cable 信息
 * @author LinZaixiong
 * @version 1.0
 * @created 19-10-2017 10:56:10
 */
public class RouterCableInfo {

	/**
	 *  类型
	 */
	private String group;

	/**
	 *  路径
	 */
	private String path;

	/**
	 *  router 提供器
	 */
	public RouterSupply m_RouterSupply;

	public RouterCableInfo(){

	}

	/**
	 *  执行导航
	 *
	 * @param context   上下文
	 */
	public Object navi(Context context){
		return m_RouterSupply != null ? m_RouterSupply.on(context, this) : null;
	}

	/**
	 * set a supply
	 *
	 * @param supply    a supplier
	 */
	public RouterCableInfo supply(RouterSupply supply){
		m_RouterSupply = supply;
		return this;
	}


	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * inserts a charsequence value into the mapping of this Bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a charsequence
	 */
	public RouterCableInfo withCharSequence(String key, CharSequence value){
		return this;
	}

	/**
	 * inserts a charseuence array into this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a charsequece array object
	 */
	public RouterCableInfo withCharSequenceArray(String key, CharSequence value){
		return this;
	}

	/**
	 * inserts a float array into this bundle
	 * 
	 * @param key    a String ,or null
	 * @param value    a float array object
	 */
	public RouterCableInfo withFloatArray(String key, float[] value){
		return this;
	}

	/**
	 * inserts a char array into this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a char array object
	 */
	public RouterCableInfo withCharArray(String key, char[] value){
		return this;
	}

	/**
	 * inserts a short array into this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a short array
	 */
	public RouterCableInfo withShortArray(String key, short[] value){
		return this;
	}

	/**
	 * inserts a byte array into this bundle
	 * 
	 * @param key
	 * @param value    a byte array
	 */
	public RouterCableInfo withByteArray(String key, byte[] value){
		return this;
	}

	/**
	 * inserts a serializable value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a serializable value
	 */
	public RouterCableInfo withSerializable(String key, Serializable value){
		return this;
	}

	/**
	 * inserts an arraylist value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    an arrayList object, or null
	 */
	public RouterCableInfo withCharSequenceArrayList(String key, ArrayList<CharSequence> value){
		return this;
	}

	/**
	 * inserts an arraylist value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 */
	public RouterCableInfo withStringArrayList(String key, ArrayList<String> value){
		return this;
	}

	/**
	 * inserts an arraylist value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 */
	public RouterCableInfo withIntegerArrayList(String key, ArrayList<Integer> value){
		return this;
	}

	/**
	 * inserts a sparseArray of parcelable values into the mapping to this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a SparseArray of Parcelable objects, or null
	 */
	public RouterCableInfo withSparseParcelableArray(String key, SparseArray<? extends Parcelable> value){
		return this;
	}

	/**
	 * inserts a list of parcelable values into bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 */
	public RouterCableInfo withParcelableArrayList(String key, ArrayList<? extends Parcelable> value){
		return this;
	}



	/**
	 * inserts a parcelable value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a Parcelable ojbect, or null
	 */
	public RouterCableInfo withParcelable(String key, Parcelable value){
		return this;
	}



	/**
	 * inserts a float value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a float
	 */
	public RouterCableInfo withFloat(String key, float value){
		return this;
	}

	/**
	 * inserts a char value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a char
	 */
	public RouterCableInfo withChar(String key, char value){
		return this;
	}

	/**
	 * inserts a byte value into the mapping of this bundle
	 * 
	 * @param key    a String. or null
	 * @param value    a byte
	 */
	public RouterCableInfo withByte(String key, byte value){
		return this;
	}

	/**
	 * inserts a double value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a double
	 */
	public RouterCableInfo withDouble(String key, double value){
		return this;
	}

	/**
	 * inserts a long value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value     a long
	 */
	public RouterCableInfo withLong(String key, long value){
		return this;
	}

	/**
	 * inserts an int value into the mapping of this bundle
	 * 
	 * @param key    a String,or null
	 * @param value    an int
	 */
	public RouterCableInfo withInt(String key, int value){
		return this;
	}

	/**
	 * inserts a short value into the mapping of this bundle
	 * 
	 * @param key    a String,or null
	 * @param value    a short
	 */
	public RouterCableInfo withShort(String key, short value){
		return this;
	}

	/**
	 * inserts a boolean value into the mapping of this bundle,replacing any existing
	 * value for the given key. wither key or value may be null
	 * 
	 * @param key    a String, or null
	 * @param value    a boolean
	 */
	public RouterCableInfo withBoolean(String key, boolean value){
		return this;
	}

	/**
	 * ��string
	 * 
	 * @param key    key value
	 * @param value    value
	 */
	public RouterCableInfo withString(String key, String value){
		return this;
	}

	/**
	 * set object value
	 * 
	 * @param key    key value
	 * @param value   a object
	 */
	public RouterCableInfo withObject(String key, Object value){
		return this;
	}

	/**
	 *  带bundle
	 * @param bundle    bundle
	 */
	public RouterCableInfo with(Bundle bundle){
		return this;
	}

	/**
	 * inserts an array of parcelable values into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 */
	public RouterCableInfo withParcelableArray(String key, Parcelable[] value){
		return this;
	}

}