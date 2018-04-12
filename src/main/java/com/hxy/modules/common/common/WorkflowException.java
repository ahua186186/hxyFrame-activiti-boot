package com.hxy.modules.common.common;

/**
 * 类RRException的功能描述:
 * 自定义异常
 * @auther hxy
 * @date 2017-08-25 16:15:36
 */
public class WorkflowException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
    private String msg;
    private int code = 500;
    
    public WorkflowException(String msg) {
		super(msg);
		this.msg = msg;
	}
	
	public WorkflowException(String msg, Throwable e) {
		super(msg, e);
		this.msg = msg;
	}
	
	public WorkflowException(String msg, int code) {
		super(msg);
		this.msg = msg;
		this.code = code;
	}
	
	public WorkflowException(String msg, int code, Throwable e) {
		super(msg, e);
		this.msg = msg;
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
}