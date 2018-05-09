package com.yp.aspect;

public class XmlAspect {
public void before() {
	System.out.println("执行前");
}
public void after() {
	System.out.println("执行后");
}
public void afterRunning() {
	System.out.println("正常执行");
}
public void afterThrow() {
	System.out.println("错误执行");
}
}
