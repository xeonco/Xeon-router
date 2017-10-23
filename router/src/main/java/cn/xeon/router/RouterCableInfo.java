package cn.xeon.router;

import java.lang.CharSequence;
import java.io.Serializable;
import java.util.ArrayList;

import android.os.Parcelable;
import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;

/**
 * router cable info
 * @author LinZaixiong
 * @version 1.0
 */
public class RouterCableInfo {

	/**
	 *  group type
	 */
	private String group;

	/**
	 *  path
	 */
	private String path;

	/**
	 *  router supplier
	 */
	public RouterSupply m_RouterSupply;

	public RouterCableInfo(){

	}

	/**
	 *  navigation
	 *
	 * @param context   context
	 * @return  router object
	 */
	public Object navi(Context context){
		return m_RouterSupply != null ? m_RouterSupply.on(context, this) : null;
	}

	/**
	 * set a supply
	 *
	 * @param supply    a supplier
	 * @return self
	 */
	public RouterCableInfo supply(RouterSupply supply){
		m_RouterSupply = supply;
		return this;
	}


	/**
	 *  get group value
	 * @return group value
	 */
	public String getGroup() {
		return group;
	}

	/**
	 *  set group value
	 * @param group
	 */
	public void setGroup(String group) {
		this.group = group;
	}

	/**
	 *  get path value
	 * @return path value
	 */
	public String getPath() {
		return path;
	}

	/**
	 *  set path value
	 * @param path
	 */
	public void setPath(String path) {
		this.path = path;
	}

	/**
	 * inserts a charsequence value into the mapping of this Bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a charsequence
	 * @return self
	 */
	public RouterCableInfo withCharSequence(String key, CharSequence value){
		return this;
	}

	/**
	 * inserts a charseuence array into this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a charsequece array object
	 * @return self
	 */
	public RouterCableInfo withCharSequenceArray(String key, CharSequence value){
		return this;
	}

	/**
	 * inserts a float array into this bundle
	 * 
	 * @param key    a String ,or null
	 * @param value    a float array object
	 * @return self
	 */
	public RouterCableInfo withFloatArray(String key, float[] value){
		return this;
	}

	/**
	 * inserts a char array into this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a char array object
	 * @return self
	 */
	public RouterCableInfo withCharArray(String key, char[] value){
		return this;
	}

	/**
	 * inserts a short array into this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a short array
	 * @return self
	 */
	public RouterCableInfo withShortArray(String key, short[] value){
		return this;
	}

	/**
	 * inserts a byte array into this bundle
	 * 
	 * @param key
	 * @param value    a byte array
	 * @return self
	 */
	public RouterCableInfo withByteArray(String key, byte[] value){
		return this;
	}

	/**
	 * inserts a serializable value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a serializable value
	 * @return self
	 */
	public RouterCableInfo withSerializable(String key, Serializable value){
		return this;
	}

	/**
	 * inserts an arraylist value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    an arrayList object, or null
	 * @return self
	 */
	public RouterCableInfo withCharSequenceArrayList(String key, ArrayList<CharSequence> value){
		return this;
	}

	/**
	 * inserts an arraylist value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 * @return self
	 */
	public RouterCableInfo withStringArrayList(String key, ArrayList<String> value){
		return this;
	}

	/**
	 * inserts an arraylist value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 * @return self
	 */
	public RouterCableInfo withIntegerArrayList(String key, ArrayList<Integer> value){
		return this;
	}

	/**
	 * inserts a sparseArray of parcelable values into the mapping to this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a SparseArray of Parcelable objects, or null
	 * @return self
	 */
	public RouterCableInfo withSparseParcelableArray(String key, SparseArray<? extends Parcelable> value){
		return this;
	}

	/**
	 * inserts a list of parcelable values into bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 * @return self
	 */
	public RouterCableInfo withParcelableArrayList(String key, ArrayList<? extends Parcelable> value){
		return this;
	}



	/**
	 * inserts a parcelable value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a Parcelable ojbect, or null
	 * @return self
	 */
	public RouterCableInfo withParcelable(String key, Parcelable value){
		return this;
	}



	/**
	 * inserts a float value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a float
	 * @return self
	 */
	public RouterCableInfo withFloat(String key, float value){
		return this;
	}

	/**
	 * inserts a char value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a char
	 * @return self
	 */
	public RouterCableInfo withChar(String key, char value){
		return this;
	}

	/**
	 * inserts a byte value into the mapping of this bundle
	 * 
	 * @param key    a String. or null
	 * @param value    a byte
	 * @return self
	 */
	public RouterCableInfo withByte(String key, byte value){
		return this;
	}

	/**
	 * inserts a double value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value    a double
	 * @return self
	 */
	public RouterCableInfo withDouble(String key, double value){
		return this;
	}

	/**
	 * inserts a long value into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value     a long
	 * @return self
	 */
	public RouterCableInfo withLong(String key, long value){
		return this;
	}

	/**
	 * inserts an int value into the mapping of this bundle
	 * 
	 * @param key    a String,or null
	 * @param value    an int
	 * @return self
	 */
	public RouterCableInfo withInt(String key, int value){
		return this;
	}

	/**
	 * inserts a short value into the mapping of this bundle
	 * 
	 * @param key    a String,or null
	 * @param value    a short
	 * @return self
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
	 * @return self
	 */
	public RouterCableInfo withBoolean(String key, boolean value){
		return this;
	}

	/**
	 * string
	 * 
	 * @param key    key value
	 * @param value    value
	 * @return self
	 */
	public RouterCableInfo withString(String key, String value){
		return this;
	}

	/**
	 * set object value
	 * 
	 * @param key    key value
	 * @param value   a object
	 * @return self
	 */
	public RouterCableInfo withObject(String key, Object value){
		return this;
	}

	/**
	 *  带bundle
	 * @param bundle    bundle
	 * @return self
	 */
	public RouterCableInfo with(Bundle bundle){
		return this;
	}

	/**
	 * inserts an array of parcelable values into the mapping of this bundle
	 * 
	 * @param key    a String, or null
	 * @param value
	 * @return self
	 */
	public RouterCableInfo withParcelableArray(String key, Parcelable[] value){
		return this;
	}

}