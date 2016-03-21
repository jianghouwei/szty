package com.szty.sms.utils;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * 短信验证码发送接口
 * ClassName: SendSms <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月18日 上午10:30:21 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
public class SendSms {

	public static String sendSms(String mobile, String content) {

		HttpClient client = new HttpClient();
		PostMethod method = new PostMethod(smsProperject.SMS_URL);
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType", "application/x-www-form-urlencoded;charset=UTF-8");
		String contents = new String("您的验证码是：【" + content + "】。请不要把验证码泄露给其他人。如非本人操作，可不用理会！");
		NameValuePair[] data = { // 提交短信
				new NameValuePair("account", smsProperject.SMS_ACCOUNT),
				new NameValuePair("password", smsProperject.SMS_PSSWORD), // 密码可以使用明文密码或使用32位MD5加密
				// new NameValuePair("password",
				// StringUtil.MD5Encode("密码")),
				new NameValuePair("mobile", mobile), 
				new NameValuePair("content", contents), };
		method.setRequestBody(data);
		try {
			client.executeMethod(method);
			String SubmitResult = method.getResponseBodyAsString();
			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();
			String code = root.elementText("code");
			String msg = root.elementText("msg");
			String smsid = root.elementText("smsid");
			System.out.println(code);
			System.out.println(msg);
			System.out.println(smsid);
			if ("2".equals(code)) {
				System.out.println("短信提交成功");
				return content;
			}else{
				return  code;
			}
		} catch (HttpException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		
		return "error";

	}
}
