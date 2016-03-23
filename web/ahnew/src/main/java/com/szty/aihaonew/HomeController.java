package com.szty.aihaonew;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.szty.aihao.dao.fitwear_app_Dao;
import com.szty.aihao.dao.sc_category_Dao;
import com.szty.aihao.myservice.myService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/admin")
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "admin/login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Locale locale, Model model) {
		return "admin/login";
	}

	@RequestMapping(value = "/rand", method = RequestMethod.GET)
	public String rand(Locale locale, Model model) {
		return "admin/checkCode";
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Locale locale, Model model) {
		return "admin/index";
	}

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public String top(Locale locale, Model model) {
		return "admin/top";
	}

	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String menu(Locale locale, Model model) {
		return "admin/menu";
	}

	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(Locale locale, Model model) {
		return "admin/main";
	}

	/*
	 * @RequestMapping(value = "/addapp") public String addapp(Locale locale,
	 * Model model, HttpServletRequest request) { logger.info("addapp get");
	 * String action = request.getParameter("action") == null ? "" :
	 * request.getParameter("action"); if (action.equals("edit")) { String aid =
	 * request.getParameter("aid"); try { com.szty.aihao.dao.fitwear_app_Dao fit
	 * = myService._fitwear_app .get_fitwear_appDao(Integer.parseInt(aid));
	 * StringBuilder str = new StringBuilder();
	 * str.append("document.getElementById('ddappname').value='" +
	 * fit.getAppname() + "';");
	 * str.append("document.getElementById('ddcategory').value='" +
	 * fit.getCategory() + "';");
	 * str.append("document.getElementById('dddeveloper').value='" +
	 * fit.getDeveloper() + "';");
	 * str.append("document.getElementById('ddvername').value='" +
	 * fit.getVername() + "';");
	 * str.append("document.getElementById('ddvercode').value='" +
	 * fit.getVercode() + "';");
	 * str.append("document.getElementById('ddsummary').value='" +
	 * fit.getSummary() + "';");
	 * str.append("document.getElementById('dddescript').value='" +
	 * fit.getDescript() + "';");
	 * str.append("document.getElementById('ddlogourl').value='" + fit.getLogo()
	 * + "';"); str.append("document.getElementById('dddetailurl').value='" +
	 * fit.getImgs() + "';");
	 * str.append("document.getElementById('ddmapk').value='" + fit.getM_apk() +
	 * "';"); str.append("document.getElementById('ddfapk').value='" +
	 * fit.getF_apk() + "';");
	 * str.append("document.getElementById('ddpackagebody').value='" +
	 * fit.getPackagename() + "';");
	 * str.append("document.getElementById('ddmapksize').value='" +
	 * fit.getM_apk_size() + "';");
	 * str.append("document.getElementById('ddfapksize').value='" +
	 * fit.getF_apk_size() + "';");
	 * 
	 * model.addAttribute("result", "<script type='text/javascript'>" +
	 * str.toString() + "</script>");
	 * 
	 * model.addAttribute("category", getCate()); return "admin/addapp";
	 * 
	 * } catch (NumberFormatException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (Exception e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); }
	 * 
	 * }
	 * 
	 * model.addAttribute("script", ""); try { model.addAttribute("category",
	 * getCate()); } catch (Exception e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } return "admin/addapp"; }
	 */

	@RequestMapping(value = "/addapp")
	public String addapp_post(Locale locale, Model model, HttpServletRequest request) {
		logger.info("addapp post");
		try {
			request.setCharacterEncoding("utf-8");
			String action = request.getParameter("action") == null ? "" : request.getParameter("action");
			String aid = request.getParameter("aid") == null ? "0" : request.getParameter("aid");
			String ddpost = request.getParameter("ddpost") == null ? "" : request.getParameter("ddpost");
			if (action.equals("edit")) {
				if (ddpost.equals("posted")) {
					
					String pakagename=request.getParameter("ddpackagebody");
					if(pakagename.equals("")){
						model.addAttribute("result",
								"<script type='text/javascript'>alert('包名不能为空!!');</script>");
						model.addAttribute("category", getCate());
						return "admin/addapp";
					}
					
					
					String ddappname = request.getParameter("ddappname");
					String ddcategory = request.getParameter("ddcategory");
					String dddeveloper = request.getParameter("dddeveloper");
					String ddvername = request.getParameter("ddvername");
					String ddvercode = request.getParameter("ddvercode");
					String ddsummary = request.getParameter("ddsummary").replace("\r", "").replace("\n", "");
					String dddescript = request.getParameter("dddescript").replace("\r", "").replace("\n", "");
					String ddlogourl = request.getParameter("ddlogourl");
					String dddetailurl = request.getParameter("dddetailurl");
					String ddmapk = request.getParameter("ddmapk");
					String ddfapk = request.getParameter("ddfapk");
					String ddmapksize = request.getParameter("ddmapksize");
					String ddfapksize = request.getParameter("ddfapksize");
					String ddpackagebody = request.getParameter("ddpackagebody");
					String ddsortorder = request.getParameter("ddsortorder");
					try{
						if(ddmapksize.equals("0"))
							ddmapksize=getRemoteFileSize(new URL(ddmapk))+"";
						if(ddfapksize.equals("0"))
							ddfapksize=getRemoteFileSize(new URL(ddfapk))+"";}
						catch(Exception ce){
							ce.printStackTrace();
						}
					com.szty.aihao.dao.fitwear_app_Dao fit = myService._fitwear_app
							.get_fitwear_appDao(Integer.parseInt(aid));
					/// fit.setId(0);
					fit.setAppname(ddappname);
					fit.setCategory(ddcategory);
					fit.setCreatetime(new Date());
					fit.setDescript(dddescript);
					fit.setDeveloper(dddeveloper);
					fit.setF_apk(ddfapk);
					fit.setImgs(dddetailurl);
					fit.setLogo(ddlogourl);
					fit.setM_apk(ddmapk);
					fit.setOperater("operate");
					fit.setSummary(ddsummary);
					fit.setVercode(ddvercode);
					fit.setVername(ddvername);
					fit.setIsdel(0);
					//fit.setSortorder("0");
					fit.setM_apk_size(ddmapksize);
					fit.setF_apk_size(ddfapksize);
					fit.setPackagename(ddpackagebody);
					fit.setSortorder(ddsortorder);
					myService._fitwear_app.update_fitwear_app(fit);
					model.addAttribute("result",
							"<script type='text/javascript'>alert('修改成功!!');location.href='sapp?action=normal;';</script>");
					model.addAttribute("category", getCate());
					return "admin/addapp";
				} else {
					com.szty.aihao.dao.fitwear_app_Dao fit = myService._fitwear_app
							.get_fitwear_appDao(Integer.parseInt(aid));
					StringBuilder str = new StringBuilder();
					str.append("document.getElementById('ddappname').value='" + fit.getAppname() + "';");
					str.append("document.getElementById('ddcategory').value='" + fit.getCategory() + "';");
					str.append("document.getElementById('ddcategorys').value='" + fit.getCategory() + "';");
					str.append("document.getElementById('dddeveloper').value='" + fit.getDeveloper() + "';");
					str.append("document.getElementById('ddvername').value='" + fit.getVername() + "';");
					str.append("document.getElementById('ddvercode').value='" + fit.getVercode() + "';");
					str.append("document.getElementById('ddsummary').value='" + fit.getSummary() + "';");
					str.append("document.getElementById('dddescript').value='"
							+ fit.getDescript().replace("\"", "").replace("\r", "").replace("\n", "") + "';");
					str.append("document.getElementById('ddlogourl').value='" + fit.getLogo() + "';");
					str.append("document.getElementById('dddetailurl').value='" + fit.getImgs() + "';");
					str.append("document.getElementById('ddmapk').value='" + fit.getM_apk() + "';");
					str.append("document.getElementById('ddfapk').value='" + fit.getF_apk() + "';");
					str.append("document.getElementById('ddpackagebody').value='" + fit.getPackagename() + "';");
					str.append("document.getElementById('ddmapksize').value='" + fit.getM_apk_size() + "';");
					str.append("document.getElementById('ddfapksize').value='" + fit.getF_apk_size() + "';");
					str.append("document.getElementById('ddsortorder').value='" + fit.getSortorder() + "';");
					System.out.println(str.toString());
					;
					model.addAttribute("result", "<script type='text/javascript'>" + str.toString() + "</script>");

					model.addAttribute("category", getCate());
					return "admin/addapp";
				}

			} else {
				if (aid.equals("0") && ddpost.equals("posted")) {
					String ddappname = request.getParameter("ddappname");
					String ddcategory = request.getParameter("ddcategory");
					String dddeveloper = request.getParameter("dddeveloper");
					String ddvername = request.getParameter("ddvername");
					String ddvercode = request.getParameter("ddvercode");
					String ddsummary = request.getParameter("ddsummary").replace("\r", "").replace("\n", "");
					String dddescript = request.getParameter("dddescript").replace("\r", "").replace("\n", "");
					String ddlogourl = request.getParameter("ddlogourl");
					String dddetailurl = request.getParameter("dddetailurl");
					String ddmapk = request.getParameter("ddmapk");
					String ddfapk = request.getParameter("ddfapk");
					String ddmapksize = request.getParameter("ddmapksize");
					String ddfapksize = request.getParameter("ddfapksize");
					String ddpackagebody = request.getParameter("ddpackagebody");
					String ddsortorder = request.getParameter("ddsortorder");
					try{
						List<com.szty.aihao.dao.fitwear_app_Dao> list_p=myService._fitwear_app.get_fitwear_app_All(" packagename='"+ddpackagebody+"' ");
						if(list_p!=null&&list_p.size()>0){
							model.addAttribute("result",
									"<script type='text/javascript'>alert('包名重复!!');</script>");
							model.addAttribute("category", getCate());
							return "admin/addapp";
							
							
						}
					if(ddmapksize.equals("0"))
						ddmapksize=getRemoteFileSize(new URL(ddmapk))+"";
					if(ddfapksize.equals("0"))
						ddfapksize=getRemoteFileSize(new URL(ddfapk))+"";}
					catch(Exception ce){
						ce.printStackTrace();
					}
					//int count=myService._fitwear_app.get_fitwear_appCount(" 1=1");
					com.szty.aihao.dao.fitwear_app_Dao fit = new com.szty.aihao.dao.fitwear_app_Dao();
					fit.setId(0);
					fit.setAppname(ddappname);
					fit.setCategory(ddcategory);
					fit.setCreatetime(new Date());
					fit.setDescript(dddescript);
					fit.setDeveloper(dddeveloper);
					fit.setF_apk(ddfapk);
					fit.setImgs(dddetailurl);
					fit.setLogo(ddlogourl);
					fit.setM_apk(ddmapk);
					fit.setOperater("");
					fit.setSummary(ddsummary);
					fit.setVercode(ddvercode);
					fit.setVername(ddvername);
					fit.setIsdel(0);
					fit.setSortorder("0");
					fit.setM_apk_size(ddmapksize);
					fit.setF_apk_size(ddfapksize);
					fit.setPackagename(ddpackagebody);
					myService._fitwear_app.insert_fitwear_app(fit);
					model.addAttribute("result",
							"<script type='text/javascript'>alert('上传成功!!');location.href='sapp?action=normal;';</script>");
					model.addAttribute("category", getCate());
					return "admin/addapp";
				} else {
					model.addAttribute("category", getCate());
					return "admin/addapp";
				}

			}
		} catch (Exception ce) {
			ce.printStackTrace();
		}
		model.addAttribute("script", "");
		try {
			model.addAttribute("category", getCate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "admin/addapp";
	}
	 /**
     * @category 获得远程文件大小
     * @return
     */
    public long getRemoteFileSize( URL url) {
        long size = 0;
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            size = conn.getContentLength();
            conn.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(size+":remotefile");;
        return size;
    }
	fitwear_app_Dao appDao = new fitwear_app_Dao();
	java.util.Dictionary<Integer, com.szty.aihao.dao.sc_category_Dao> dic_cate = null;

	@RequestMapping(value = "/sapp", method = RequestMethod.GET)
	public String sapp(Locale locale, Model model, HttpServletRequest request) {

		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		String page = request.getParameter("pageselect") == null ? "1" : request.getParameter("pageselect");
		String action = request.getParameter("action") == null ? "" : request.getParameter("action");
		String cateselect = request.getParameter("cateselect") == null ? "" : request.getParameter("cateselect");
		String dk = request.getParameter("d") == null ? "" : request.getParameter("d");
		
		
		
		if (cateselect.equals(""))
			cateselect = "-1";
		if (action.equals("del")) {
			String aid = request.getParameter("aid") == null ? "0" : request.getParameter("aid");
			// MySqlHelper.executeInt("delete from product where pid=" + aid);
			try {
				appDao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(aid));
				appDao.setIsdel(1);
				myService._fitwear_app.update_fitwear_app(appDao);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				model.addAttribute("cate", getCate());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("result",
					"<script type='text/javascript'>alert('删除成功!!');location.href='sapp?action=normal;';</script>");
			return "admin/resultapp";
		}
		if (action.equals("comment")) {
			String aid = request.getParameter("aid") == null ? "0" : request.getParameter("aid");
			// MySqlHelper.executeInt("delete from product where pid=" + aid);
			try {
				appDao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(aid));
				if (appDao.getCategory().indexOf("14") > -1) {
					appDao.setCategory(appDao.getCategory().replace(",14", ""));
					appDao.setCategory(appDao.getCategory().replace("14", ""));
				} else {
					appDao.setCategory(appDao.getCategory() + ",14");
				}
				myService._fitwear_app.update_fitwear_app(appDao);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				model.addAttribute("cate", getCate());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("result",
					"<script type='text/javascript'>alert('推荐成功!!');location.href='sapp?action=normal;';</script>");
			return "admin/resultapp";
		}
		if (action.equals("sortup")) {
			String aid = request.getParameter("aid") == null ? "0" : request.getParameter("aid");
			// MySqlHelper.executeInt("delete from product where pid=" + aid);
			try {
				appDao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(aid));
				appDao.setSortorder((Integer.parseInt(appDao.getSortorder()) + 1) + "");
				myService._fitwear_app.update_fitwear_app(appDao);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				model.addAttribute("cate", getCate());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("result",
					"<script type='text/javascript'>alert('排序成功!!');location.href='sapp?action=normal;';</script>");
			return "admin/resultapp";
		}
		if (action.equals("sortdown")) {
			String aid = request.getParameter("aid") == null ? "0" : request.getParameter("aid");
			// MySqlHelper.executeInt("delete from product where pid=" + aid);
			try {
				appDao = myService._fitwear_app.get_fitwear_appDao(Integer.parseInt(aid));
				int sort = Integer.parseInt(appDao.getSortorder()) - 1;
				appDao.setSortorder(sort + "");
				myService._fitwear_app.update_fitwear_app(appDao);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				model.addAttribute("cate", getCate());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			model.addAttribute("result",
					"<script type='text/javascript'>alert('排序成功!!');location.href='sapp?action=normal;';</script>");
			return "admin/resultapp";
		}

		logger.info("page.{}", page);
		int start = (Integer.parseInt(page) - 1) * 20;
		int end = start + 20;
		logger.info("start.{}|end.{}", start, end);
		model.addAttribute("title", "APP管理");
		try {
			dic_cate = myService._sc_category.get_sc_category_Dictionary(" isdel=0");
			System.out.println(dic_cate.size() + ":dic_size");
			String sqlStr = " isdel=0 order by cast(sortorder  as integer)  desc, id desc";
			// System.out.println(cateselect+"cateselect");
			
			if(dk.equals("")){
			
			if (cateselect.equals("") || cateselect.equals("-1"))
				sqlStr = " isdel=0 order by cast(sortorder as integer)  desc, id desc";
			else
				sqlStr = " category like '%" + cateselect
						+ "%' and isdel=0 order by cast(sortorder  as integer) desc, id desc";
			}
			else
			{
				sqlStr=" isdel=0 and appname like '%"+dk+"%' order by cast(sortorder as integer)  desc, id desc";
			}
			System.out.println("sqlStr"+sqlStr);
			int count = myService._fitwear_app.get_fitwear_appCount(sqlStr);
			int pagecount = (int) ((count / 20.0) + 1);
			logger.info("pagecount.{}", pagecount);
			StringBuilder strpage = new StringBuilder();
			for (int i = 0; i < pagecount; i++) {
				strpage.append("<option value='" + (i + 1) + "'>" + (i + 1) + "</option>");
			}
			strpage.append("<script type='text/javascript'>document.getElementById('pageselect').value='" + page
					+ "';</script>");
			model.addAttribute("page", strpage.toString());

			List<com.szty.aihao.dao.fitwear_app_Dao> list_dao = myService._fitwear_app.get_fitwear_app_Page(20,
					Integer.parseInt(page), sqlStr);
			StringBuilder str = new StringBuilder();
			str.append("<tr class='title'>");
			str.append(
					"<td width='10%'>ID</td><td width='20%'>名称</td><td width='10%'>分类</td><td width='10%'>LOGO</td><td width='40%'>操作</td>");
			str.append("</tr>");
			for (fitwear_app_Dao u : list_dao) {
				str.append("<tr>");
				str.append("<td ><input type='checkbox'  onclick=\"alert('ss');setchecked(this,'" + u.getId()
						+ "');\" />" + u.getId() + "</td>");
				str.append("<td>" + u.getAppname() + "</td>");
				// System.out.println(u.getCategory() + ":u.getCategory()");
				String cate = "";
				try {
					String[] arr_gcate = u.getCategory().split(",");
					for (int c = 0; c < arr_gcate.length; c++) {
						cate = cate + dic_cate.get(Integer.parseInt(arr_gcate[c])).getCatename() + ",";
					}

				} catch (Exception ce) {

				}
				str.append("<td>" + cate + "</td>");

				// String[] picarr = u.getImgs().split(",");
				// StringBuilder picstr = new StringBuilder();
				// for (int j = 0; j < picarr.length; j++) {
				// picstr.append("<img src='" + picarr[j] + "'
				// style='width:60px;' />&nbsp;");
				// }
				str.append("<td>" + "<img src='" + u.getLogo().replace(",", "") + "' style='width:60px;' />" + "</td>");
				str.append("<td><a href='sapp?action=sortup&aid=" + u.getId()
						+ "'>向上</a>|<a href='sapp?action=sortdown&aid=" + u.getId()
						+ "'>向下</a>&nbsp;&nbsp;<a href='sapp?action=comment&aid=" + u.getId()
						+ "'>推荐</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href='addapp?action=edit&aid=" + u.getId()
						+ "'>修改</a>&nbsp;&nbsp;&nbsp;&nbsp;<a onclick=\"disp_confirm('sapp?action=del&aid=" + u.getId()
						+ "')\">删除</a></td>");
				str.append("</tr>");
			}
			str.append("<script type='text/javascript'>document.getElementById('cateselect').value='" + cateselect
					+ "';function disp_confirm(obj) {var r=confirm('确认删除?');if (r==true) { location.href=obj;}else{ }}</script>");
			model.addAttribute("result", str.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			model.addAttribute("cate", getCate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "admin/resultapp";

	}

	@RequestMapping(value = "/uploadlimage")
	public String uploadlimage(Locale locale, Model model) {
		return "admin/uploadlimage";
	}

	@RequestMapping(value = "/sclass")
	public String sclass(Locale locale, Model model) {
		return "admin/result";
	}

	@RequestMapping(value = "/addclass")
	public String addclassp(Locale locale, Model model, HttpServletRequest request) {

		try {
			request.setCharacterEncoding("utf-8");
			String action = request.getParameter("action") == null ? "" : request.getParameter("action");
			String ddpost = request.getParameter("ddpost") == null ? "" : request.getParameter("ddpost");
			if (ddpost.equals("posted")) {
				String appname = request.getParameter("ddappname");
				com.szty.aihao.dao.sc_category_Dao me = new com.szty.aihao.dao.sc_category_Dao();
				me.setCateflag("");
				me.setCatename(appname);
				me.setIsdel(0);
				me.setParantid("0");
				myService._sc_category.insert_sc_category(me);
				model.addAttribute("result",
						"<script type='text/javascript'>alert('上传成功!!');location.href='sapp?action=normal;';</script>");
			}
		} catch (Exception ce) {
			ce.printStackTrace();
		}

		try {
			model.addAttribute("category", getCate());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "admin/addclass";
	}

	public static String getCate() throws Exception {
		List<com.szty.aihao.dao.sc_category_Dao> list = myService._sc_category.get_sc_category_All();

		StringBuilder str = new StringBuilder();
		str.append("<option  value='-1'>所有</option>");
		for (sc_category_Dao u : list) {
			str.append("<option  value='" + u.getId() + "'>" + u.getCatename() + "</option>");
		}
		return str.toString();
	}

	@RequestMapping(value = "/ticwearin")
	public String tiwwearin(Locale locale, Model model, HttpServletRequest request) {

		String url = "http://appstore.ticwear.com/api/applist/2/2/20/";
		String ddurl = request.getParameter("ddinurl") == null || request.getParameter("ddinurl").equals("") ? url
				: request.getParameter("ddinurl");
		System.out.println(ddurl);

		String html = getHTML(ddurl);
		JSONObject json = (JSONObject) JSONValue.parse(html);
		JSONArray arr = (JSONArray) json.get("data");
		StringBuilder str = new StringBuilder();
		str.append("<tr class='title'>");
		str.append("<td>导入网址</td><td><input type='text' id='ddinurl' name='ddinurl' value='" + ddurl
				+ "'  style='width:100%'/></td><td colspan='5'><button>确定</button></td></tr>");
		str.append("<tr class='title'>");
		str.append(
				"<td width='10%'>ID</td><td width='30%'>名称</td><td width='10%'>分类</td><td>手机APK</td><td>手表APK</td><td width='20%'>LOGO</td><td width='20%'>操作</td>");
		str.append("</tr>");
		for (int i = 0; i < arr.size(); i++) {
			JSONObject temp = (JSONObject) arr.get(i);
			str.append("<tr>");
			str.append("<td >" + temp.get("id") + "</td>");
			str.append("<td>" + temp.get("name") + "</td>");
			str.append("<td>" + temp.get("category_name") + "</td>");
			str.append("<td>" + temp.get("apk_url") + "</td>");
			str.append("<td>" + temp.get("wear_apk_url") + "</td>");
			str.append("<td>" + "<img src='" + temp.get("logo_url") + "' style='width:60px;' />" + "</td>");

			str.append("<td><a onclick=\"document.getElementById('frame1').src='addticwear?action=" + ddurl + "&aid="
					+ temp.get("id") + "';\">导入</a>&nbsp;&nbsp;&nbsp;&nbsp;</td>");
			str.append("</tr>");

		}

		// str.append("<script type='text/javascript'>function disp_confirm(obj)
		// {var r=confirm('确认删除?');if (r==true) { location.href=obj;}else{
		// }}</script>");
		model.addAttribute("result", str.toString());

		return "admin/result";
	}

	static List<com.szty.aihao.dao.sc_category_Dao> arr_cate = null;

	@RequestMapping(value = "/addticwear")
	public String addticwear(Locale locale, Model model, HttpServletRequest request) {

		String url = request.getParameter("action");
		String id = request.getParameter("aid");
		String html = getHTML(url);
		JSONObject json = (JSONObject) JSONValue.parse(html);
		JSONArray arr = (JSONArray) json.get("data");
		for (int i = 0; i < arr.size(); i++) {
			JSONObject temp = (JSONObject) arr.get(i);
			long tid = (Long) temp.get("id");
			if ((int) tid == Integer.parseInt(id)) {
				try {
					arr_cate = myService._sc_category.get_sc_category_All();
					com.szty.aihao.dao.fitwear_app_Dao fit = new com.szty.aihao.dao.fitwear_app_Dao();
					fit.setAppname((String) temp.get("name"));
					String cate_name = (String) temp.get("category_name");
					int cate = 13;
					for (int k = 0; k < arr_cate.size(); k++) {

						if (arr_cate.get(k).getCatename().equals(cate_name)) {
							cate = arr_cate.get(k).getId();
							break;
						}

					}

					fit.setCategory(cate + "");
					fit.setCreatetime(new Date());
					fit.setDescript((String) temp.get("description"));
					fit.setDeveloper((String) temp.get("developer_name"));
					fit.setF_apk((String) temp.get("wear_apk_url"));
					fit.setF_apk_size((Long) temp.get("wear_file_size") + "");
					fit.setImgs((String) temp.get("name"));
					fit.setLogo((String) temp.get("logo_url"));
					fit.setM_apk((String) temp.get("apk_url"));
					fit.setM_apk_size((Long) temp.get("file_size") + "");
					fit.setOperater("");
					fit.setPackagename((String) temp.get("apk_package_name"));
					fit.setSortorder("0");
					fit.setSummary((String) temp.get("summary"));
					fit.setVercode((Long) temp.get("version_code") + "");
					fit.setVername((String) temp.get("version"));

					myService._fitwear_app.insert_fitwear_app(fit);
					model.addAttribute("result",
							"<script type='text/javascript'>alert('" + fit.getAppname() + "导入成功!');</script>");

					return "admin/result";
				} catch (Exception ce) {
					ce.printStackTrace();
				}

			}

		}

		model.addAttribute("result", url + "@@@@" + id);

		return "admin/result";
	}

	public static String getHTML(String url) {
		{
			DefaultHttpClient httpClient = new DefaultHttpClient();
			if (url == null || url.length() <= 0)
				return null;
			HttpGet httpGet = new HttpGet(url);
			try {

				HttpResponse response = httpClient.execute(httpGet);
				HttpEntity entity = response.getEntity();

				Header[] hs = response.getAllHeaders();
				String charSet = null;
				charSet = "utf-8";
				if (entity == null) {
					return null;
				}
				String htmlData = EntityUtils.toString(entity, charSet);
				return htmlData;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		}
	}
}
