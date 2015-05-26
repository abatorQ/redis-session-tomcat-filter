/**
 * <b>��Ŀ����</b>redis-filter-tomcat-session<br/>
 * <b>������</b>com.xuwei.session<br/>
 * <b>�ļ�����</b>CatalinaHttpSessionFaced.java<br/>
 * <b>�����ˣ�</b>xuwei<br/>
 * <b>�汾��Ϣ��</b><br/>
 * <b>���ڣ�</b>2015��3��4��-����4:34:24<br/>
 * <b>Copyright (c)</b> 2015XX��˾-��Ȩ����<br/>
 * 
 */
package com.xuwei.session;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;

import org.apache.catalina.session.StandardSessionFacade;

/**
 * 
 * <b>�����ƣ�</b>CatalinaHttpSessionFaced<br/>
 * <b>��������</b><br/>
 * <b>�����ˣ�</b>xuwei<br/>
 * <b>�޸��ˣ�</b>xuwei<br/>
 * <b>�޸�ʱ�䣺</b>2015��3��4�� ����4:34:24<br/>
 * <b>�޸ı�ע��</b><br/>
 * @version 1.0.0<br/>
 * 
 */
public class CatalinaHttpSessionFaced extends StandardSessionFacade{

	/**
	 * ����һ���µ�ʵ�� CatalinaHttpSessionFaced.
	 *
	 * @param session
	 */
	public CatalinaHttpSessionFaced(HttpSession session) {
		super(session);
	}

	@Override
	public String getId() {
		return super.getId();
	}

	@Override
	public void setMaxInactiveInterval(int interval) {
		super.setMaxInactiveInterval(interval);
	}

	@Override
	public Object getAttribute(String name) {
		return super.getAttribute(name);
	}

	@Override
	public Object getValue(String name) {
		return super.getValue(name);
	}

	@Override
	public Enumeration<String> getAttributeNames() {
		return super.getAttributeNames();
	}

	@Override
	public String[] getValueNames() {
		return super.getValueNames();
	}

	@Override
	public void setAttribute(String name, Object value) {
		super.setAttribute(name, value);
	}

	@Override
	public void putValue(String name, Object value) {
		super.putValue(name, value);
	}

	@Override
	public void removeAttribute(String name) {
		super.removeAttribute(name);
	}

	@Override
	public void removeValue(String name) {
		super.removeValue(name);
	}

	@Override
	public void invalidate() {
		super.invalidate();
	}
	
	

}
