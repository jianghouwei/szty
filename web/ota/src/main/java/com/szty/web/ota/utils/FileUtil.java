package com.szty.web.ota.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

import org.apache.log4j.Logger;

/**
 * @author: hanchaoyong
 */
public class FileUtil {

    private static final Logger log = Logger.getLogger(FileUtil.class);
    /*单例设计模式*/
    private static FileUtil instance = new FileUtil();
    /*根目录*/
    private static String servletClassesPath = null;

    private FileUtil() {} // prevent instantiation 防止实例化

    /**
     * 得到跟路径
     * @return
     */
    public static String getServletClassesPath() {
        if (servletClassesPath == null) {
            String strPath = System.getProperty("core.context.path");
            if ((strPath != null) && (strPath.length() > 0)) {
                servletClassesPath = strPath;
            } else {
                ClassLoader classLoader = instance.getClass().getClassLoader();
                URL url = classLoader.getResource("/");
                if (url == null) {
                    // not run on the Servlet environment
                    servletClassesPath = ".";
                } else {
                    servletClassesPath = url.getPath();
                }
            }
            log.debug("servletClassesPath = " + servletClassesPath);
            if (servletClassesPath.endsWith(File.separator) == false) {
                servletClassesPath = servletClassesPath + File.separatorChar;
                //log.warn("servletClassesPath does not end with /: " + servletClassesPath);
            }
        }
        return servletClassesPath;
    }

    public static boolean writeByteToFile(byte[] bytes, String savePath) {
        File newFile = new File(savePath);
        //判断文件夹是否创建,这里需要系统权限
        if (!newFile.exists()) {
            File file = new File(newFile.getParentFile().toString());
            if(!file.exists()){
                file.mkdir();
            }
        }
        OutputStream os = null;
        try {
            os = new FileOutputStream(newFile);
            os.write(bytes);
            os.flush();
            os.close();
            return true;
        } catch (FileNotFoundException fe) {
            log.error("Error", fe);
            return false;
        } catch (IOException e) {
            log.error("Error", e);
            return false;
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
            } catch (IOException ex) {
                // ignore
            }
        }
    }

    public static void createDirs(String dir, boolean ignoreIfExitst) throws IOException {
        File file = new File(dir);

        if (ignoreIfExitst && file.exists()) {
            return;
        }

        if (!file.mkdirs()) {
            throw new IOException("Cannot create directories = " + dir);
        }
    }

    /** 目录下的子文件夹数 */
    public static int getSubDirCount(String srcDir) throws IOException {

        int count = 0;
        File dir = new File(srcDir);
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                count = count + 1;
            }
        }
        return count;
    }

    /**
     * 得到目录下的文件数
     * @param srcDir
     * @return
     * @throws IOException
     */
    public static int getDirFileCount(String srcDir) throws IOException {

        int count = 0;
        File dir = new File(srcDir);
        File[] files = dir.listFiles();

        for (int i = 0; i < files.length; i++) {
            count = count + 1;
            count = count + 1;
            count = count + 1;
            count = count + 1;
            count = count + 1;
            count = count + 1;
        }
        return count;
    }

    public static File[] getFiles(String dir) throws IOException {

        File diskFolderOfMemberFile = new File(dir);
        if (diskFolderOfMemberFile.isFile()) {
            throw new IOException("IOException -> not a directory: " + dir);
        }
        File[] mediaFiles = diskFolderOfMemberFile.listFiles();
        return mediaFiles;
    }

    /**
     * 读取文本文件内容
     * @param filePathAndName 带有完整绝对路径的文件名
     * @param encoding 文本文件打开的编码方式
     * @return 返回文本文件的内容
     */
    public static String readTxt(String filePathAndName, String encoding) throws IOException {
        encoding = encoding.trim();
        StringBuffer str = new StringBuffer("");
        String st = "";
        try {
            FileInputStream fs = new FileInputStream(filePathAndName);
            InputStreamReader isr;
            if (encoding.equals("")) {
                isr = new InputStreamReader(fs);
            } else {
                isr = new InputStreamReader(fs, encoding);
            }
            BufferedReader br = new BufferedReader(isr);
            try {
                String data = "";
                while ((data = br.readLine()) != null) {
                    str.append(data + " ");
                }
            } catch (Exception e) {
                str.append(e.toString());
            }
            st = str.toString();
        } catch (IOException es) {
            st = "";
        }
        return st;
    }

    /**
     * 新建目录
     * @param folderPath 目录
     * @return 返回目录创建后的路径
     */
    public static String createFolder(String folderPath) {
        String txt = folderPath;
        try {
            java.io.File myFilePath = new java.io.File(txt);
            txt = folderPath;
            if (!myFilePath.exists()) {
                myFilePath.mkdir();
            }
        }
        catch (Exception e) {
            log.error("创建目录操作出错" + e);
        }
        return txt;
    }

    /**
     * 多级目录创建
     * @param folderPath 准备要在本级目录下创建新目录的目录路径 例如 c:myf
     * @param paths 无限级目录参数，各级目录以单数线区分 例如 a|b|c
     * @return 返回创建文件后的路径 例如 c:myfac
     */
    public static String createFolders(String folderPath, String paths) {
        String txts = folderPath;
        try {
            String txt;
            txts = folderPath;
            StringTokenizer st = new StringTokenizer(paths, "|");
            for (int i = 0; st.hasMoreTokens(); i++) {
                txt = st.nextToken().trim();
                if (txts.lastIndexOf("/") != -1) {
                    txts = createFolder(txts + txt);
                } else {
                    txts = createFolder(txts + txt + "/");
                }
            }
        } catch (Exception e) {
            log.error("创建目录操作出错！" + e);
        }
        return txts;
    }


    /**
     * 新建文件
     * @param filePathAndName 文本文件完整绝对路径及文件名
     * @param fileContent 文本文件内容
     * @return
     */
    public static void createFile(String filePathAndName, String fileContent) {

        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            FileWriter resultFile = new FileWriter(myFilePath);
            PrintWriter myFile = new PrintWriter(resultFile);
            String strContent = fileContent;
            myFile.println(strContent);
            myFile.close();
            resultFile.close();
        }
        catch (Exception e) {
            log.error("创建文件操作出错" + e);
        }
    }


    /**
     * 有编码方式的文件创建
     * @param filePathAndName 文本文件完整绝对路径及文件名
     * @param fileContent 文本文件内容
     * @param encoding 编码方式 例如 GBK 或者 UTF-8
     * @return
     */
    public static void createFile(String filePathAndName, String fileContent, String encoding) {

        try {
            String filePath = filePathAndName;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            if (!myFilePath.exists()) {
                myFilePath.createNewFile();
            }
            PrintWriter myFile = new PrintWriter(myFilePath,encoding);
            String strContent = fileContent;
            myFile.println(strContent);
            myFile.close();
        }
        catch (Exception e) {
            log.error("create file error -- createFile" + e);
        }
    }


    /**
     * 删除文件
     * @param filePathAndName 文本文件完整绝对路径及文件名
     * @return Boolean 成功删除返回true遭遇异常返回false
     */
    public static boolean delFile(String filePathAndName) {
        boolean bea = false;
        try {
            String filePath = filePathAndName;
            File myDelFile = new File(filePath);
            if (myDelFile.exists()) {
                myDelFile.delete();
                bea = true;
            } else {
                bea = false;
                log.error(filePathAndName + "删除文件操作出错");
            }
        }
        catch (Exception e) {
            log.error(e.toString());
        }
        return bea;
    }



    /**
     * 删除文件夹
     * @param folderPath 文件夹完整绝对路径
     * @return
     */
    public static void delFolder(String folderPath) {
        try {
            delAllFile(folderPath); //删除完里面所有内容
            String filePath = folderPath;
            filePath = filePath.toString();
            java.io.File myFilePath = new java.io.File(filePath);
            myFilePath.delete(); //删除空文件夹
        }
        catch (Exception e) {
            log.error("delete folder error -- delFolder" + e);
        }
    }


    /**
     * 删除指定文件夹下所有文件
     * @param path 文件夹完整绝对路径
     * @return
     * @return
     */
    public static boolean delAllFile(String path) throws IOException {
        boolean bea = false;
        File file = new File(path);
        if (!file.exists()) {
            return bea;
        }
        if (!file.isDirectory()) {
            return bea;
        }
        String[] tempList = file.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
            } else {
                temp = new File(path + File.separator + tempList[i]);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
                delFolder(path + "/" + tempList[i]);//再删除空文件夹
                bea = true;
            }
        }
        return bea;
    }


    /**
     * 复制单个文件
     * @param oldPathFile 准备复制的文件源
     * @param newPathFile 拷贝到新绝对路径带文件名
     * @return
     */
    public static void copyFile(String oldPathFile, String newPathFile) throws IOException{
        int bytesum = 0;
        int byteread = 0;
        File oldfile = new File(oldPathFile);
        if (oldfile.exists()) { //文件存在时
            InputStream inStream = new FileInputStream(oldPathFile); //读入原文件
            FileOutputStream fs = new FileOutputStream(newPathFile);
            byte[] buffer = new byte[1444];
            while((byteread = inStream.read(buffer)) != -1){
                bytesum += byteread; //字节数 文件大小
                fs.write(buffer, 0, byteread);
            }
            inStream.close();
        }
    }


    /**
     * 复制整个文件夹的内容
     * @param oldPath 准备拷贝的目录
     * @param newPath 指定绝对路径的新目录
     * @return
     */
    public static void copyFolder(String oldPath, String newPath) {
        try {
            new File(newPath).mkdirs(); //如果文件夹不存在 则建立新文件夹
            File a = new File(oldPath);
            String[] file = a.list();
            File temp = null;
            for (int i = 0; i < file.length; i++) {
                if (oldPath.endsWith(File.separator)) {
                    temp = new File(oldPath + file[i]);
                } else {
                    temp = new File(oldPath + File.separator + file[i]);
                }
                if (temp.isFile()) {
                    FileInputStream input = new FileInputStream(temp);
                    FileOutputStream output = new FileOutputStream(newPath + "/" +
                            (temp.getName()).toString());
                    byte[] b = new byte[1024 * 5];
                    int len;
                    while ((len = input.read(b)) != -1) {
                        output.write(b, 0, len);
                    }
                    output.flush();
                    output.close();
                    input.close();
                }
                if (temp.isDirectory()) {//如果是子文件夹
                    copyFolder(oldPath + "/" + file[i], newPath + "/" + file[i]);
                }
            }
        } catch (Exception e) {
            log.info("copy folder content error -- copyFolder" + e);
        }
    }


    /**
     * 移动文件
     * @param oldPath
     * @param newPath
     * @return
     */
    public static void moveFile(String oldPath, String newPath) throws IOException {
        copyFile(oldPath, newPath);
        delFile(oldPath);
    }


    /**
     * 移动目录
     * @param oldPath
     * @param newPath
     * @return
     */
    public static void moveFolder(String oldPath, String newPath) {
        copyFolder(oldPath, newPath);
        delFolder(oldPath);
    }

    /**
     * Return the extension portion of the file's name .
     * @see #getExtension
     */
    public static String getExtension(File f) {
        return (f != null) ? getExtension(f.getName()) : "";
    }

    /** 得到文件扩展名 */
    public static String getExtension(String filename) {
        return getExtension(filename, "");
    }

    public static String getExtension(String filename, String defExt) {
        if ((filename != null) && (filename.length() > 0)) {
            int i = filename.lastIndexOf('.');

            if ((i >-1) && (i < (filename.length() - 1))) {
                return filename.substring(i + 1);
            }
        }
        return defExt;
    }


    public static void emptyFile(String srcFilename) throws IOException {
        File srcFile = new File(srcFilename);
        if (!srcFile.exists()) {
            throw new FileNotFoundException("Cannot find the file: " + srcFile.getAbsolutePath());
        }
        if (!srcFile.canWrite()) {
            throw new IOException("Cannot write the file: " + srcFile.getAbsolutePath());
        }

        FileOutputStream outputStream = new FileOutputStream(srcFilename);
        outputStream.close();
    }

    public static void copyFile(String srcFilename, String destFilename, boolean overwrite) throws IOException {

        File srcFile = new File(srcFilename);
        if (!srcFile.exists()) {
            throw new FileNotFoundException("Cannot find the source file: " + srcFile.getAbsolutePath());
        }
        if (!srcFile.canRead()) {
            throw new IOException("Cannot read the source file: " + srcFile.getAbsolutePath());
        }

        File destFile = new File(destFilename);
        if (overwrite == false) {
            if (destFile.exists()) {
                return;
            }
        } else {
            if (destFile.exists()) {
                if (!destFile.canWrite()) {
                    throw new IOException("Cannot write the destination file: " + destFile.getAbsolutePath());
                }
            } else {
                if (!destFile.createNewFile()) {
                    throw new IOException("Cannot write the destination file: " + destFile.getAbsolutePath());
                }
            }
        }

        BufferedInputStream inputStream = null;
        BufferedOutputStream outputStream = null;
        byte[] block = new byte[1024];
        try {
            inputStream = new BufferedInputStream(new FileInputStream(srcFile));
            outputStream = new BufferedOutputStream(new FileOutputStream(destFile));
            while (true) {
                int readLength = inputStream.read(block);
                if (readLength == -1) break;// end of file
                outputStream.write(block, 0, readLength);
            }
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException ex) {
                    log.error("Cannot close stream", ex);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException ex) {
                    log.error("Cannot close stream", ex);
                }
            }
        }
    }

    //@todo: why this method does not close the inputStream ???
    public static byte[] getBytes(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        byte[] block = new byte[4096];
        while (true) {
            int readLength = bufferedInputStream.read(block);
            if (readLength == -1) break;// end of file
            byteArrayOutputStream.write(block, 0, readLength);
        }
        byte[] retValue = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return retValue;
    }

    public static String getFileName(String fullFilePath) {
        if (fullFilePath == null) {
            return "";
        }
        int index1 = fullFilePath.lastIndexOf('/');
        int index2 = fullFilePath.lastIndexOf('\\');

        //index is the maximum value of index1 and index2
        int index = (index1 > index2) ? index1 : index2;
        if (index == -1) {
            // not found the path separator
            return fullFilePath;
        }
        String fileName = fullFilePath.substring(index + 1);
        return fileName;
    }

    public static String getFileNameNotExtension(String fullFilePath) {
        if (fullFilePath == null) {
            return "";
        }
        int index1 = fullFilePath.lastIndexOf('/');
        int index2 = fullFilePath.lastIndexOf('\\');

        //index is the maximum value of index1 and index2
        int index = (index1 > index2) ? index1 : index2;
        if (index == -1) {
            // not found the path separator
            return fullFilePath;
        }
        String fileName = fullFilePath.substring(index + 1);
        if (fileName.indexOf(".") > 0) {
            fileName = fileName.substring(0,fileName.lastIndexOf("."));
        }
        return fileName;
    }

    /** 得到文件所在目录的完整路径 */
    public static String getFolder_inFile(String filename) {
        filename = filename.replace('\\', '/');
        return filename.substring(0, filename.lastIndexOf("/"));
    }

    /** 在文件完整中得到文件名，不包括扩展名 */
    public static String getOnyFileName(String filename) {
        filename = filename.replace('\\', '/');
        if (filename.indexOf("/") > 0 && filename.indexOf(".") > 0) {
            filename = filename.substring(filename.lastIndexOf("/")+1,filename.lastIndexOf("."));
        }
        return filename;
    }

    /**
     * This method write srcFile to the output, and does not close the output
     * @param srcFile File the source (input) file
     * @param output OutputStream the stream to write to, this method will not buffered the output
     * @throws IOException
     */
    public static void popFile(File srcFile, OutputStream output) throws IOException {

        BufferedInputStream input = null;
        byte[] block = new byte[4096];
        try {
            input = new BufferedInputStream(new FileInputStream(srcFile), 4096);
            while (true) {
                int length = input.read(block);
                if (length == -1) break;// end of file
                output.write(block, 0, length);
            }
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    log.error("Cannot close stream", ex);
                }
            }
        }
    }

    /**
     * This method could be used to override the path to WEB-INF/classes
     * It can be set when the web app is inited
     * @param path String : new path to override the default path
     */
    public static void setServletClassesPath(String path) {
        log.debug("FileUtil.setServletClassesPath called with path = " + path);

        servletClassesPath = path;

        if (servletClassesPath == null) {
            // From mvnForum.com thread 2243:
            // I am deploying the MVNForum as an ear in Linux box so context real path turns out to be null.
            return;
        }
        if (servletClassesPath.endsWith(File.separator) == false) {
            servletClassesPath = servletClassesPath + File.separatorChar;
            log.debug("FileUtil.setServletClassesPath change path to value = " + servletClassesPath);
        }
    }

    /**
     * 创建一个 text/css 文件
     * This method create a file text/css
     * NOTE: This method closes the inputStream after it have done its work.
     *
     * @param inputStream     the stream of a text/css file
     * @param textFile   the output file, have the ".css" extension or orther extension
     * @throws IOException
     */
    public static void createTextFile(InputStream inputStream, String textFile)
            throws IOException {

        if (inputStream == null) {
            throw new IllegalArgumentException("Does not accept null input");
        }
        OutputStream outputStream = null;
        try {
            byte[] srcByte = FileUtil.getBytes(inputStream);
            outputStream = new FileOutputStream(textFile);
            outputStream.write(srcByte);
            return;
        } catch (IOException e) {
            log.error("Error", e);
            throw e;
        } finally { // this finally is very important
            inputStream.close();
            if (outputStream != null) outputStream.close();
        }
    }

    public static void writeTextToFile(String text, String filename)
            throws IOException {

        FileOutputStream stream = null;
        OutputStreamWriter writer = null;
        try {
            stream = new java.io.FileOutputStream(filename);   //, true);  // 若增加一个boolean参数，则写入一个已存在的文件，true是附加在未尾，否则从头开始
            writer = new java.io.OutputStreamWriter(stream, "GBK");
            writer.write(text);   // 写入字符串或chat[] : str
        } catch(IOException e) {
            log.error("Error", e);
            throw e;
        } finally {
            writer.close();
            stream.close();
        }
    }

    /**
     * Write content to a fileName with the destEncoding
     *
     * @param content String
     * @param fileName String
     * @param destEncoding String
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void writeFile(String content, String fileName, String destEncoding)
            throws FileNotFoundException, IOException {

        File file = null;
        try {
            file = new File(fileName);
            if (file.isFile() == false) {
                throw new IOException("'" + fileName + "' is not a file.");
            }
            if (file.canWrite() == false) {
                throw new IOException("'" + fileName + "' is a read-only file.");
            }
        } finally {
            // we don't have to close File here
        }

        BufferedWriter out = null;
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            out = new BufferedWriter(new OutputStreamWriter(fos, destEncoding));

            out.write(content);
            out.flush();
        } catch (FileNotFoundException fe) {
            log.error("Error", fe);
            throw fe;
        } catch (IOException e) {
            log.error("Error", e);
            throw e;
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException ex) {}
        }
    }

    public static String readFile(String fileName, String srcEncoding)
            throws FileNotFoundException, IOException {

        File file = null;
        try {
            file = new File(fileName);
            if (file.isFile() == false) {
                throw new IOException("'" + fileName + "' is not a file.");
            }
        } finally {
            // we don't have to close File here
        }

        BufferedReader reader = null;
        try {
            StringBuffer result = new StringBuffer(1024);
            FileInputStream fis = new FileInputStream(fileName);
            reader = new BufferedReader(new InputStreamReader(fis, srcEncoding));

            char[] block = new char[512];
            while (true) {
                int readLength = reader.read(block);
                if (readLength == -1) break;// end of file
                result.append(block, 0, readLength);
            }
            return result.toString();
        } catch (FileNotFoundException fe) {
            log.error("Error", fe);
            throw fe;
        } catch (IOException e) {
            log.error("Error", e);
            throw e;
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException ex) {
            }
        }
    }

    /**
     * 将内容写入文件中
     * @param filepath 文件所在物理路径
     * @param content 写入内容
     */
    public static void writeFile(String filepath, String content)
            throws IOException {
        try {
            FileWriter filewriter = new FileWriter(filepath, true);
            PrintWriter printwriter = new PrintWriter(filewriter);
            printwriter.println(content);
            printwriter.flush();
            printwriter.close();
            filewriter.close();
        } catch (IOException e) {
            log.error("Error:FileUtil->writeFile");
        }
    }

    /*
     *  1  ABC
     *  2  abC Gia su doc tu dong 1 lay ca thay 5 dong => 1 --> 5
     *  3  ABC
     */
    public static String[] getLastLines(File file, int linesToReturn)
            throws IOException, FileNotFoundException {

        final int AVERAGE_CHARS_PER_LINE = 250;
        final int BYTES_PER_CHAR = 2;

        RandomAccessFile randomAccessFile = null;
        StringBuffer buffer = new StringBuffer(linesToReturn * AVERAGE_CHARS_PER_LINE);
        int lineTotal = 0;
        try {
            randomAccessFile = new RandomAccessFile(file, "r");
            long byteTotal = randomAccessFile.length();
            long byteEstimateToRead = linesToReturn * AVERAGE_CHARS_PER_LINE * BYTES_PER_CHAR;

            long offset = byteTotal - byteEstimateToRead;
            if (offset < 0) {
                offset = 0;
            }

            randomAccessFile.seek(offset);
            //log.debug("SKIP IS ::" + offset);

            String line = null;
            String lineUTF8 = null;
            while ((line = randomAccessFile.readLine()) != null) {
                lineUTF8 = new String(line.getBytes("ISO8859_1"), "UTF-8");
                lineTotal++;
                buffer.append(lineUTF8).append('\n');
            }
        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException ex) {
                }
            }
        }

        String[] resultLines = new String[linesToReturn];
        BufferedReader in = null;
        try {
            in = new BufferedReader(new StringReader(buffer.toString()));

            int start = lineTotal /* + 2 */ - linesToReturn; // Ex : 55 - 10 = 45 ~ offset
            if (start < 0) start = 0; // not start line
            for (int i = 0; i < start; i++) {
                in.readLine(); // loop until the offset. Ex: loop 0, 1 ~~ 2 lines
            }

            int i = 0;
            String line = null;
            while ((line = in.readLine()) != null) {
                resultLines[i] = line;
                i++;
            }
        } catch (IOException ie) {
            log.error("Error" + ie);
            throw ie;
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException ex) {
                }
            }
        }
        return resultLines;
    }

    public static String getHumanSize(long size) {

        int sizeToStringLength = String.valueOf(size).length();
        String humanSize = "";
        DecimalFormat formatter = new DecimalFormat("##0.##");
        if (sizeToStringLength > 9) {
            humanSize += formatter.format((double) size / (1024 * 1024 * 1024)) + " GB";
        } else if (sizeToStringLength > 6) {
            humanSize += formatter.format((double) size / (1024 * 1024)) + " MB";
        } else if (sizeToStringLength > 3) {
            humanSize += formatter.format((double) size / 1024) + " KB";
        } else {
            humanSize += String.valueOf(size) + " Bytes";
        }
        return humanSize;
    }

    /** 得到文件大小 */
    public static long getFileSize(String filename) throws IOException {
        File file = new File(filename);
        return file.length() / 1024;
    }

    public static boolean touch(String fileName) {
        try {
            File file = new File(fileName);
            if (file.exists() == false) {
                file.createNewFile();
            } else {
                file.setLastModified(System.currentTimeMillis());
            }
        } catch (Throwable t) {
            return false;
        }
        return true;
    }

    /**
     * 修改文件的最后访问时间。
     * 如果文件不存在则创建该文件。
     * <b>目前这个方法的行为方式还不稳定，主要是方法有些信息输出，这些信息输出是否保留还在考

     虑中。</b>
     * @param file 需要修改最后访问时间的文件。
     * @since  0.1
     */
    public static void touch(File file) {
        long currentTime = System.currentTimeMillis();
        if (!file.exists()) {
            System.err.println("file not found:" + file.getName());
            System.err.println("Create a new file:" + file.getName());
            try {
                if (file.createNewFile()) {
                    //  System.out.println("Succeeded!");
                }
                else {
                    //  System.err.println("Create file failed!");
                }
            }
            catch (IOException e) {
                //  System.err.println("Create file failed!");
                e.printStackTrace();
            }
        }
        boolean result = file.setLastModified(currentTime);
        if (!result) {
            //  System.err.println("touch failed: " + file.getName());
        }
    }

    /**
     * 修改文件的最后访问时间。
     * 如果文件不存在则创建该文件。
     * <b>目前这个方法的行为方式还不稳定，主要是方法有些信息输出，这些信息输出是否保留还在考

     虑中。</b>
     * @param files 需要修改最后访问时间的文件数组。
     * @since  0.1
     */
    public static void touch(File[] files) {
        for (int i = 0; i < files.length; i++) {
            touch(files);
        }
    }

    /**
     * 判断指定的文件是否存在。
     * @param fileName 要判断的文件的文件名
     * @return 存在时返回true，否则返回false。
     * @since  0.1
     */
    public static boolean isFileExist(String fileName) {
        return new File(fileName).isFile();
    }

    /**
     * 创建指定的目录。
     * 如果指定的目录的父目录不存在则创建其目录书上所有需要的父目录。
     * <b>注意：可能会在返回false的时候创建部分父目录。</b>
     * @param file 要创建的目录
     * @return 完全创建成功时返回true，否则返回false。
     * @since  0.1
     */
    public static boolean makeDirectory(File file) {
        File parent = file.getParentFile();
        if (parent != null) {
            return parent.mkdirs();
        }
        return false;
    }

    /**
     * 创建指定的目录。
     * 如果指定的目录的父目录不存在则创建其目录书上所有需要的父目录。
     * <b>注意：可能会在返回false的时候创建部分父目录。</b>
     * @param fileName 要创建的目录的目录名
     * @return 完全创建成功时返回true，否则返回false。
     * @since  0.1
     */
    public static boolean makeDirectory(String fileName) {
        File file = new File(fileName);
        return makeDirectory(file);
    }

    /**
     * 返回文件的URL地址。
     * @param file 文件
     * @return 文件对应的的URL地址
     * @throws MalformedURLException
     * @since  0.4
     * @deprecated 在实现的时候没有注意到File类本身带一个toURL方法将文件路径转换为URL。
     *             请使用File.toURL方法。
     */
    public static URL getURL(File file) throws MalformedURLException {
        String fileURL = "file:/" + file.getAbsolutePath();
        URL url = new URL(fileURL);
        return url;
    }

    /**
     * 从文件名得到文件绝对路径。
     * @param fileName 文件名
     * @return 对应的文件路径
     * @since  0.4
     */
    public static String getFilePath(String fileName) {
        File file = new File(fileName);
        return file.getAbsolutePath();
    }

    /**
     * 将DOS/Windows格式的路径转换为UNIX/Linux格式的路径。
     * 其实就是将路径中的"\"全部换为"/"，因为在某些情况下我们转换为这种方式比较方便，
     * 某中程度上说"/"比"\"更适合作为路径分隔符，而且DOS/Windows也将它当作路径分隔符。
     * @param filePath 转换前的路径
     * @return 转换后的路径
     * @since  0.4
     */
    public static String toUNIXpath(String filePath) {
        return filePath.replace('\\', '/');
    }

    /**
     * 从文件名得到UNIX风格的文件绝对路径。
     * @param fileName 文件名
     * @return 对应的UNIX风格的文件路径
     * @since  0.4
     * @see #toUNIXpath(String filePath) toUNIXpath
     */
    public static String getUNIXfilePath(String fileName) {
        File file = new File(fileName);
        return toUNIXpath(file.getAbsolutePath());
    }

    /**
     * 得到文件的类型。
     * 实际上就是得到文件名中最后一个“.”后面的部分。
     * @param fileName 文件名
     * @return 文件名中的类型部分
     * @since  0.5
     */
    public static String getTypePart(String fileName) {
        int point = fileName.lastIndexOf('.');
        int length = fileName.length();
        if (point == -1 || point == length - 1) {
            return "";
        }
        else {
            return fileName.substring(point + 1, length);
        }
    }

    /**
     * 得到文件的类型。
     * 实际上就是得到文件名中最后一个“.”后面的部分。
     * @param file 文件
     * @return 文件名中的类型部分
     * @since  0.5
     */
    public static String getFileType(File file) {
        return getTypePart(file.getName());
    }

    /**
     * 得到文件的名字部分。
     * 实际上就是路径中的最后一个路径分隔符后的部分。
     * @param fileName 文件名
     * @return 文件名中的名字部分
     * @since  0.5
     */
    public static String getNamePart(String fileName) {
        int point = getPathLsatIndex(fileName);
        int length = fileName.length();
        if (point == -1) {
            return fileName;
        }
        else if (point == length - 1) {
            int secondPoint = getPathLsatIndex(fileName, point - 1);
            if (secondPoint == -1) {
                if (length == 1) {
                    return fileName;
                }
                else {
                    return fileName.substring(0, point);
                }
            }
            else {
                return fileName.substring(secondPoint + 1, point);
            }
        }
        else {
            return fileName.substring(point + 1);
        }
    }

    /**
     * 得到文件名中的父路径部分。
     * 对两种路径分隔符都有效。
     * 不存在时返回""。
     * 如果文件名是以路径分隔符结尾的则不考虑该分隔符，例如"/path/"返回""。
     * @param fileName 文件名
     * @return 父路径，不存在或者已经是父目录时返回""
     * @since  0.5
     */
    public static String getPathPart(String fileName) {
        int point = getPathLsatIndex(fileName);
        int length = fileName.length();
        if (point == -1) {
            return "";
        }
        else if (point == length - 1) {
            int secondPoint = getPathLsatIndex(fileName, point - 1);
            if (secondPoint == -1) {
                return "";
            }
            else {
                return fileName.substring(0, secondPoint);
            }
        }
        else {
            return fileName.substring(0, point);
        }
    }

    /**
     * 得到路径分隔符在文件路径中首次出现的位置。
     * 对于DOS或者UNIX风格的分隔符都可以。
     * @param fileName 文件路径
     * @return 路径分隔符在路径中首次出现的位置，没有出现时返回-1。
     * @since  0.5
     */
    public static int getPathIndex(String fileName) {
        int point = fileName.indexOf('/');
        if (point == -1) {
            point = fileName.indexOf('\\');
        }
        return point;
    }

    /**
     * 得到路径分隔符在文件路径中指定位置后首次出现的位置。
     * 对于DOS或者UNIX风格的分隔符都可以。
     * @param fileName 文件路径
     * @param fromIndex 开始查找的位置
     * @return 路径分隔符在路径中指定位置后首次出现的位置，没有出现时返回-1。
     * @since  0.5
     */
    public static int getPathIndex(String fileName, int fromIndex) {
        int point = fileName.indexOf('/', fromIndex);
        if (point == -1) {
            point = fileName.indexOf('\\', fromIndex);
        }
        return point;
    }

    /**
     * 得到路径分隔符在文件路径中最后出现的位置。
     * 对于DOS或者UNIX风格的分隔符都可以。
     * @param fileName 文件路径
     * @return 路径分隔符在路径中最后出现的位置，没有出现时返回-1。
     * @since  0.5
     */
    public static int getPathLsatIndex(String fileName) {
        int point = fileName.lastIndexOf('/');
        if (point == -1) {
            point = fileName.lastIndexOf('\\');
        }
        return point;
    }

    /**
     * 得到路径分隔符在文件路径中指定位置前最后出现的位置。
     * 对于DOS或者UNIX风格的分隔符都可以。
     * @param fileName 文件路径
     * @param fromIndex 开始查找的位置
     * @return 路径分隔符在路径中指定位置前最后出现的位置，没有出现时返回-1。
     * @since  0.5
     */
    public static int getPathLsatIndex(String fileName, int fromIndex) {
        int point = fileName.lastIndexOf('/', fromIndex);
        if (point == -1) {
            point = fileName.lastIndexOf('\\', fromIndex);
        }
        return point;
    }

    /**
     * 将文件名中的类型部分去掉。
     * @param filename 文件名
     * @return 去掉类型部分的结果
     * @since  0.5
     */
    public static String trimType(String filename) {
        int index = filename.lastIndexOf(".");
        if (index != -1) {
            return filename.substring(0, index);
        }
        else {
            return filename;
        }
    }
    /**
     * 得到相对路径。
     * 文件名不是目录名的子节点时返回文件名。
     * @param pathName 目录名
     * @param fileName 文件名
     * @return 得到文件名相对于目录名的相对路径，目录下不存在该文件时返回文件名
     * @since  0.5
     */
    public static String getSubpath(String pathName,String fileName) {
        int index = fileName.indexOf(pathName);
        if (index != -1) {
            return fileName.substring(index + pathName.length() + 1);
        }
        else {
            return fileName;
        }
    }

    /**
     * 得到后数第几个文件夹名
     * @param fileName
     * @return
     */
    public static String getLastFolderPartName(String fileName, int lastNum) {
        for (int i=1; i<=lastNum; i++) {
            fileName = getPathPart(fileName);
//            log.info(fileName);
        }
        int point = getPathLsatIndex(fileName);
        int length = fileName.length();
        if (point == -1) {
            return "";
        } else {
            return fileName.substring(point + 1, length);
        }
    }

    /** 得到去除文件扩展名后的文件名 */
    public static String trimExtension(String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int i = filename.lastIndexOf('.');
            if ((i >-1) && (i < (filename.length()))) {
                return filename.substring(0, i);
            }
        }
        return filename;
    }

	/**
	 * @title 替换字符
	 * @param s
	 * @return
	 * @description 
	 *              在regex中"\\"表示一个"\"，在java中一个"\"也要用"\\"表示。这样，前一个"\\"代表regex中的"\"，
	 *              后一个"\\"代表java中的"\"。所以要想使用replaceAll方法将字符串中的反斜杠("\")替换成空字符串("")，
	 *              则需要这样写：str.replaceAll("\\\\","");
	 */
    public static String tranCharset(String s) {
        s = s.replaceAll("-", "");		// 将中文(全角)字符‘-’替换为空格space
        s = s.replaceAll("！", "");		// 将中文(全角)字符‘！’替换为空格space
        s = s.replaceAll("\\—", "");	// 将英文字符‘-’替换为空格space
        s = s.replaceAll("\\!", "");	// 将英文字符‘!’替换为空格space
        s = s.replaceAll("\\&", "");	// 将英文字符‘&’替换为空格space
        s = s.replaceAll("\\#", "");	// 将英文字符‘#’替换为空格space
        s = s.replaceAll("\\?", "");	// 将英文字符‘?’替换为空格space
        s = s.replaceAll("\\$", "");	// 将英文字符‘$’替换为空格space
        s = s.replaceAll("\\%", "");	// 将英文字符‘%’替换为空格space
        s = s.replaceAll("\\*", "");	// 将英文字符‘*’替换为空格space
        s = s.replaceAll("\\^", "");	// 将英文字符‘^’替换为空格space
        s = s.replaceAll("\\@", "");	// 将英文字符‘@’替换为空格space
        s = s.replaceAll("\\|", "");	// 将英文字符‘|’替换为空格space
        return s;
    }
    public static void main(String[] args) {
		String string = "！!where-@*&*&it&is?-———";
		String tranCharset = tranCharset(string);
		System.out.println(tranCharset);
	}
}