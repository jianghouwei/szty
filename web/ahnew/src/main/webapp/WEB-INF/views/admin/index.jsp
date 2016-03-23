<%@ page contentType="text/html; charset=utf-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>后台管理系统</title>
        	<%String aScript = "";
		try {
			String cValue = "";
			Cookie[] cookie = request.getCookies();
			for (int i = 0; i < cookie.length; i++) {
				if (cookie[i].getName().equals("99managedff")) {
					cValue = cookie[i].getValue();
				}
			}

			// if(cValue.equals("")&& session.getAttribute("usrID")!=null){
			// usrID=session.getAttribute("usrID").toString();
			// usrName=session.getAttribute("usrName").toString();
			// usrFlag=session.getAttribute("usrFlag").toString();
			// usrNFlag=session.getAttribute("usrNFlag").toString();

			// }
			
			System.out.println(cValue+":cValue");
			if (cValue==null||cValue=="") {
				aScript = "<script type='text/javascript'>location.href='login';</script>";
				//return;
			}
			//	String[] aValue = cValue.split("@");

			//usrID = aValue[0];
			//usrName = aValue[1];
			//usrFlag = aValue[2];
			//System.out.println(usrFlag);
			//usrNFlag = aValue[3];
		} catch (Exception ce) {
			ce.printStackTrace();
		}
	%>
	<%=aScript %>
</head>

<frameset rows="60,*,30" frameborder="no" border="0" framespacing="0">
    <frame src="top" name="topFrame" scrolling="no" noresize="noresize" id="topFrame"
           style="border-bottom:1px #848284 solid;"/>
    <frameset cols="200,*" frameborder="no" border="0" framespacing="0">
        <frame src="menu" name="leftFrame" scrolling="auto" id="leftFrame" style="border-right:1px #848284 solid;"/>
        <frame src="main" name="mainFrame" id="mainFrame"/>
    </frameset>

</frameset>
<noframes>
    <body>

    
    </body>
</noframes>
</html>
