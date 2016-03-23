package com.szty.aihaonew;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import com.szty.aihao.impl.PropertyUtils;
import com.szty.aihao.myservice.myService;






/*
 * vogoalAPI 1.0
 * Auther SinNeR@blueidea.com
 * by vogoal.com
 * mail: vogoals@hotmail.com
 */
/**
 * JSP上传文件�?
 * 
 * @author SinNeR
 * @version 1.0
 */
public class JspFileUploadLimageA {

	public static String url = null;
	/** request对象 */
	private HttpServletRequest request = null;
	/** 上传文件的路�?*/
	private String uploadPath = null;
	/** 每次读取得字节的大小 */
	private static int BUFSIZE =1024;
	/** 存储参数的Hashtable */
	private Hashtable paramHt = new Hashtable();
	private static ArrayList<File> upfiles = null;
	private String albumid = "0";
	private String upFilename;

	public String getUpFilename() {
		return upFilename;
	}

	public void setUpFilename(String upFilename) {
		this.upFilename = upFilename;
	}
	public String getUrlStr() throws IOException {
		String ref = "";
		for (int i = 0; i < upfiles.size(); i++) {
			FileInputStream fis = new FileInputStream(upfiles.get(i));
			ref = ref + upfiles.get(i).getAbsolutePath();//去除分号
		}

		return ref;
	}

	public String getResUrlStr() throws IOException {
		String ref = "";
		for (int i = 0; i < upfiles.size(); i++) {
			FileInputStream fis = new FileInputStream(upfiles.get(i));
			ref = ref + upfiles.get(i).getAbsolutePath() +"@@"+ upfiles.get(i).length()+",";
		}
		String hh = "<script type='text/javascript'>alert('上传成功!');resStr('" + ref
				+ "');</script>";

		if (ref.equals("")) {
			return hh = "";
		}
		// return "<script type='text/javascript'>alert('asdf');</script>";
		hh=hh.replace("\\", "/");
		System.out.println(hh+",,"+PropertyUtils.getValue("uploadfile")+",,"+PropertyUtils.getValue("fileurl"));
		hh=hh.replace(PropertyUtils.getValue("uploadfile"),PropertyUtils.getValue("fileurl"));
		System.out.println(hh + ":kkkk");
		return hh;
	}

	/**
	 * 设定request对象�?
	 * 
	 * @param request
	 *            HttpServletRequest request对象
	 * @throws UnsupportedEncodingException
	 */
	public void setRequest(HttpServletRequest request)
			throws UnsupportedEncodingException {
		request.setCharacterEncoding("utf-8");
		this.request = request;
	}

	/**
	 * 设定文件上传路径�?
	 * 
	 * @param path
	 *            用户指定的文件的上传路径�?
	 */
	public void setUploadPath(String path) {
		this.uploadPath = path;
	}

	/**
	 * 文件上传处理主程序�?&#65533;&#65533;&#65533;&#65533;&#65533;&#65533;&#65533;B
	 * 
	 * @return int 操作结果 0 文件操作成功�? request对象不存在�? 2 没有设定文件保存路径或�?文件保存路径不正确；3
	 *         没有设定正确的enctype�? 文件操作异常�?
	 */

	public int process() {

		// uploadPath=com.gameappplat.common.sysFile.getSysConfig("upfile");
		upfiles = new ArrayList<File>();

		// 获得gameapp �?��编号
		//com.szty.pushapp.business.ReslibraryBLLBase bgame = new com.szty.pushapp.business.ReslibraryBLLBase();
		try {

			albumid =myService._fitwear_app.get_fitwear_appCount("1=1")+"/";
			System.out.println(albumid+":albumid");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		int status = 0;
		int cc = 0;
		// 文件上传前，对request对象，上传路径以及enctype进行check�?
		status = preCheck();

		// 出错的时候返回错误代码�?
		if (status != 0) {
			System.out.println(status + "error");
			return status;
		}

		try {

			// &#65533;&#65533;参数或�?文件�?#65533;u&#65533;&#65533;
			String name = null;
			// 参数的value
			String value = null;
			// 读取的流是否为文件的标志�?
			boolean fileFlag = false;
			// 要存储的文件�?
			File stmpFile = null;
			// 上传的文件的名字
			String sfName = null;
			FileOutputStream baos = null;
			BufferedOutputStream bos = null;
			// &#65533;&#65533;存储参数的Hashtable
			paramHt = new Hashtable();

			int rtnPos = 0;
			byte[] buffs = new byte[BUFSIZE];
			// &#65533;取得ContentType
			String contentType = request.getContentType();
			int index = contentType.indexOf("boundary=");
			String boundary = "--" + contentType.substring(index + 9);
			String endBoundary = boundary + "--";
			// &#65533;从request对象中取得流�?
			ServletInputStream sis = request.getInputStream();
			// 读取1�?
			while ((rtnPos = sis.readLine(buffs, 0, buffs.length)) != -1) {
				String strBuff = new String(buffs, 0, rtnPos);
				// 读取1行数�?#65533;n&#65533;&#65533;
				if (strBuff.startsWith(boundary)) {
					System.out.println("bounder1" + "sss");
					if (name != null && name.trim().length() > 0) {
						if (fileFlag) {

							bos.flush();
							baos.close();
							bos.close();
							baos = null;
							bos = null;
							// updFileArr.add(sfName);

						} else {
							Object obj = paramHt.get(name);
							ArrayList al = new ArrayList();
							if (obj != null) {
								al = (ArrayList) obj;
							}
							al.add(value);

							paramHt.put(name, al);
						}
					}
					name = new String();
					value = new String();
					fileFlag = false;
					sfName = new String();
					rtnPos = sis.readLine(buffs, 0, buffs.length);
					System.out.println("bounder2" + "sss");
					if (rtnPos != -1) {
						strBuff = new String(buffs, 0, rtnPos);
						if (strBuff.toLowerCase().startsWith(
								"content-disposition: form-data; ")) {
							int nIndex = strBuff.toLowerCase().indexOf(
									"name=\"");
							int nLastIndex = strBuff.toLowerCase().indexOf(
									"\"", nIndex + 6);
							name = strBuff.substring(nIndex + 6, nLastIndex);
						}
						int fIndex = strBuff.toLowerCase().indexOf(
								"filename=\"");
						if (fIndex != -1) {
							fileFlag = true;
							int fLastIndex = strBuff.toLowerCase().indexOf(
									"\"", fIndex + 10);
							sfName = strBuff.substring(fIndex + 10, fLastIndex);
							sfName = getFileName(sfName);
							if (sfName == null || sfName.trim().length() == 0) {
								fileFlag = false;
								sis.readLine(buffs, 0, buffs.length);
								sis.readLine(buffs, 0, buffs.length);
								sis.readLine(buffs, 0, buffs.length);
								continue;
							} else {
								sfName = getFileNameByTime(sfName);
								sis.readLine(buffs, 0, buffs.length);
								sis.readLine(buffs, 0, buffs.length);
							}
						}
					}
				} else if (strBuff.startsWith(endBoundary)) {
					if (name != null && name.trim().length() > 0) {
						if (fileFlag) {
							bos.flush();
							baos.close();
							bos.close();
							baos = null;
							bos = null;
							// updFileArr.add(sfName);
						} else {
							Object obj = paramHt.get(name);
							ArrayList al = new ArrayList();
							if (obj != null) {
								al = (ArrayList) obj;
							}
							al.add(value);
							paramHt.put(name, al);
						}
					}
				} else {

					if (fileFlag) {
						//System.out.println("bounder3" + "sss");
						// String albumid = "-1";
						if (baos == null && bos == null) {
							String mvalue = getParameter("dvalue").replace(
									"\r", "").replace("\n", "");
							// String[] row = mvalue.split(";");
							// albumid = row[cc].split(",")[1];
							File tepDic = new File(uploadPath + albumid + "/");
							if (!tepDic.exists()) {
								tepDic.mkdirs();
							}
							// System.out.println("albumid" + albumid);
							stmpFile = new File(uploadPath + albumid + "/"
									+ sfName);

							baos = new FileOutputStream(stmpFile);
							bos = new BufferedOutputStream(baos);
							FileInputStream fis = new FileInputStream(stmpFile);
							upfiles.add(stmpFile);
							cc++;
						}

						bos.write(buffs, 0, rtnPos);
						baos.flush();

					} else {
						// System.out.println("test :" + value + "--" +
						// strBuff);
						System.out.println("bounder4" + "sss");
						value = value + strBuff;
					}
				}
			}
		} catch (Exception e) {
			status = 4;

		}
		// 加入数据�?
		System.out.println("bounder6" + "sss");
		String dvalue = "";
		try {
			dvalue = getParameter("dvalue").replace("\r", "").replace("\n", "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(dvalue + "dvalue");

		return status;
	}

	/*
	 * public static ArrayList reg1(String xml) { ArrayList list=new
	 * ArrayList(); Pattern reg = Pattern.compile("[^;]([^;]*);"); Matcher match
	 * = reg.matcher(xml); while(match.find()){ list.add(match.group(1));
	 * 
	 * } return list;
	 * 
	 * } public static ArrayList reg2(String xml) { ArrayList list=new
	 * ArrayList(); Pattern reg = Pattern.compile("[^,]([^,]*),"); Matcher match
	 * = reg.matcher(xml); while(match.find()){ list.add(match.group(1));
	 * 
	 * } return list;
	 * 
	 * }
	 */
	public static String regfileName(String filename) {
		int i = filename.lastIndexOf("\\");
		if (i > 0) {
			return filename.substring(i + 1);
		} else {
			i = filename.lastIndexOf("/");
			if (i > 0) {
				return filename.substring(i + 1);
			}
		}
		return filename;

	}

	private int preCheck() {

		int errCode = 0;
		if (request == null) {
			System.out.println("" + "null:errorCheck");
			return 1;
		}
		if (uploadPath == null || uploadPath.trim().length() == 0) {
			System.out.println(uploadPath + ":errorCheck");
			return 2;
		} else {
			File tmpF = new File(uploadPath);
			if (!tmpF.exists()) {
				tmpF.mkdirs();
				// return 2;
			}
		}
		String contentType = request.getContentType();
		if (contentType == null)
			return 4;
		if (contentType.indexOf("multipart/form-data") == -1)
			return 3;
		return errCode;
	}

	public String getParameter(String name) throws Exception {
		request.setCharacterEncoding("utf-8");
		String value = "";
		if (name == null || name.trim().length() == 0)
			return value;
		value = (paramHt.get(name) == null) ? ""
				: (String) ((ArrayList) paramHt.get(name)).get(0);
		return value;
	}

	public String[] getParameters(String name) {
		if (name == null || name.trim().length() == 0)
			return null;
		if (paramHt.get(name) == null)
			return null;
		ArrayList al = (ArrayList) paramHt.get(name);
		String[] strArr = new String[al.size()];
		for (int i = 0; i < al.size(); i++)
			strArr[i] = (String) al.get(i);
		return strArr;
	}

	public int getUpdFileSize() {
		return upfiles.size();
	}

	public String[] getUpdFileNames() {
		String[] strArr = new String[upfiles.size()];
		for (int i = 0; i < upfiles.size(); i++)
			strArr[i] = (String) upfiles.get(i).getAbsolutePath();
		return strArr;
	}

	private String getFileName(String input) {
		System.out.println(input+":input1");
//		int index = input.lastIndexOf(".");
//		//MD5 md=new MD5();
//		String ext=input.substring(index, input.length());
//		System.out.println(ext+":input1");
//		int fIndex = input.lastIndexOf("\\");
//		if (fIndex == -1) {
//			fIndex = input.lastIndexOf("/");
//			if (fIndex == -1) {
//				System.out.println(input+":input2");
//				
//				return md.GetMD5Code(input+(new Date()).getTime())+ext;
//			}
//		}
//		input = input.substring(fIndex + 1);
//		System.out.println(input+":input3");
		return input;
	}

	private String getFileNameByTime(String input) {
		int index = input.indexOf(".");
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

		// return input.substring(0,index) + sdf.format(dt) +
		// input.substring(index);
		String ref = this.getUpFilename() == null ? "" : this.getUpFilename();

		setUpFilename(ref + input);
		return input;
	}
}
