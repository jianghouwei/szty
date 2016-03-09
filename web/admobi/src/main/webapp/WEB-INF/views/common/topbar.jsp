<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- topbar starts -->
<div class="navbar navbar-default" role="navigation">
	<div class="navbar-inner">
		<button type="button" class="navbar-toggle pull-left animated flip">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<a class="navbar-brand" href="login.html"> <img
			alt="Charisma Logo" src="img/logo20.png" class="hidden-xs" /> <span>数字天域</span></a>

		<!-- user dropdown starts -->
		<div class="btn-group pull-right">
			<button class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				<i class="glyphicon glyphicon-user"></i><span class="hidden-sm hidden-xs"> admin</span>
                    <span class="caret"></span>
			</button>
			<ul class="dropdown-menu">
				<li class="divider"></li>
				<li><a href="${logoutUrl}">退出</a></li>
			</ul>
		</div>
		<!-- user dropdown ends -->

		<!-- theme selector starts -->
		<div class="btn-group pull-right theme-container animated tada">
			<button class="btn btn-default dropdown-toggle"
				data-toggle="dropdown">
				<i class="glyphicon glyphicon-tint"></i> <span
					class="hidden-sm hidden-xs"> 主题 / Skin</span> <span
					class="caret"></span>
			</button>
			<ul class="dropdown-menu" id="themes">
				<li><a data-value="classic" href="#"><i class="whitespace"></i>
						Classic</a></li>
				<li><a data-value="cerulean" href="#"><i class="whitespace"></i>
						Cerulean</a></li>
				<li><a data-value="cyborg" href="#"><i class="whitespace"></i>
						Cyborg</a></li>
				<li><a data-value="simplex" href="#"><i class="whitespace"></i>
						Simplex</a></li>
				<li><a data-value="darkly" href="#"><i class="whitespace"></i>
						Darkly</a></li>
				<li><a data-value="lumen" href="#"><i class="whitespace"></i>
						Lumen</a></li>
				<li><a data-value="slate" href="#"><i class="whitespace"></i>
						Slate</a></li>
				<li><a data-value="spacelab" href="#"><i class="whitespace"></i>
						Spacelab</a></li>
				<li><a data-value="united" href="#"><i class="whitespace"></i>
						United</a></li>
			</ul>
		</div>
		<!-- theme selector ends -->
		<ul class="collapse navbar-collapse nav navbar-nav top-menu">
			<li><a href="#">
			<i class="glyphicon glyphicon-globe">
			 </i>常用网址</a></li>
			<li class="dropdown">
			      <a href="#" data-toggle="dropdown">
			      <i class="glyphicon glyphicon-star"></i>下拉 <span class="caret"></span>
			      </a>
				<ul class="dropdown-menu" role="menu">
					<li><a href="https://www.baidu.com/">百度</a></li>
					<li><a href="http://fanyi.baidu.com/#auto/zh/">百度翻译</a></li>
					<li class="divider"></li>
					<li><a href="https://www.taobao.com/">淘宝</a></li>
					<li><a href="https://www.jd.com/">京东</a></li>
				</ul></li>
			<!-- <li>
				<form class="navbar-search pull-left">
					<input placeholder="Search"
						class="search-query form-control col-md-10" name="query"
						type="text">
				</form>
			</li> -->
		</ul>

	</div>
</div>
<!-- topbar ends -->