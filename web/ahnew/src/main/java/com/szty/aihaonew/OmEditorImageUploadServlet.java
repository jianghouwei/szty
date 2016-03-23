package com.szty.aihaonew;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItemIterator;
import org.apache.commons.fileupload.FileItemStream;
import org.apache.commons.fileupload.FileUploadBase.SizeLimitExceededException;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.ui.Model;

import com.szty.aihao.impl.PropertyUtils;
import com.szty.aihao.myservice.myService;
public class OmEditorImageUploadServlet extends HttpServlet {
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		// 上传文件的保存路径，相对于应用的根目录
          private static final String UPLOAD_PIC_PATH = "upload/";
         
          private static final long MAX_SIZE = 900000000;// 设置上传文件最大为 1MB
         
        byte[] imgBufTemp = new byte[8*1024];
        private ServletContext servletContext;
       
        private String OMEditorFuncNum;
        public void init(ServletConfig config) throws ServletException {
            this.servletContext = config.getServletContext();
          //2.getInitParameterNames  
            Enumeration enumeration = config.getInitParameterNames();  
            while(enumeration.hasMoreElements()){  
                String name = (String) enumeration.nextElement();  
                String value = config.getInitParameter(name);  
                System.out.println("name----------->"+name);  
                System.out.println("value----------->"+value);  
            }  
        }
       
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
            // 获取客户端回调函数名
        	System.out.println("post");;
            OMEditorFuncNum = request.getParameter("OMEditorFuncNum");
            response.setContentType("text/html;charset=UTF-8");
            defaultProcessFileUpload(request, response);
        }
        public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
        	System.out.println("get");;
            doPost(request, response);
        }
        String albumid ="";
        public String getSavePath(String fileName) {
        	String syspath=PropertyUtils.getValue("uploadfile");
        	
        	try {
				 albumid =myService._fitwear_app.get_fitwear_appCount("1=1")+"/";
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//            String realPath = servletContext.getRealPath("/");
//            System.out.println(realPath);;
//            System.out.println(realPath + UPLOAD_PIC_PATH + fileName);;
           File path=new File(syspath + albumid);
           if (!path.exists())
        	   path.mkdirs();
            return  syspath + albumid + fileName;
        }
       
        public String getFileUrl(String fileName){
            return PropertyUtils.getValue("fileurl")+albumid + fileName;
        }
        private void defaultProcessFileUpload(HttpServletRequest request, HttpServletResponse response)
                throws IOException {
            ServletFileUpload upload = new ServletFileUpload();
            upload.setHeaderEncoding("UTF-8");
            InputStream stream = null;
            BufferedOutputStream bos = null;
            String fileUrl = "";
            try {
                if (ServletFileUpload.isMultipartContent(request)) {
                    // 设置上传文件大小的最大限制为100KB
                    upload.setSizeMax(MAX_SIZE);
                    FileItemIterator iter = upload.getItemIterator(request);
                    while (iter.hasNext()) {
                        FileItemStream item = iter.next();
                        stream = item.openStream();
                        if (!item.isFormField()) {
                            String prefix = new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
                            // 得到文件的扩展名(无扩展名时将得到全名) 
                            String ext = item.getName().substring(item.getName().lastIndexOf(".") + 1);
                            String fileName = prefix + "." + ext;
                            String savePath = getSavePath(item.getName());
                            fileUrl = getFileUrl(fileName);
                            File file=new File(savePath);
                            fileUrl=fileUrl+"@@"+file.length();
                            System.out.println(savePath);
                            System.out.println(fileUrl);
                            bos = new BufferedOutputStream(new FileOutputStream(file));
                            int length;
                            while ((length = stream.read(imgBufTemp)) != -1) {
                                bos.write(imgBufTemp, 0, length);
                            }
                        }
                    }
                    StringBuilder script = new StringBuilder();
                    // 执行客户端回调函数
                    script.append("<script type='text/javascript'>alert('上传成功!';resStr('"+fileUrl+"');</script>");
                   
                    response.getWriter().write(script.toString());
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
                StringBuilder script = new StringBuilder();
                script.append("<script type='text/javascript'>alert('上传失败!');</script>");
                
                response.getWriter().write(script.toString());
            } finally {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (Exception e) {
                    }
                }
                if (bos != null) {
                    try {
                        bos.close();
                    } catch (Exception e) {
                    }
                }
            }
        }
}