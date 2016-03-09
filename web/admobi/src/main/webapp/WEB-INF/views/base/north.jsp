<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div data-options="region:'north',border:false"
		style="height: 60px; background: #B3DFDA; padding: 10px">
<span>
						你好！[<shiro:principal />]
</span>		
</div>
