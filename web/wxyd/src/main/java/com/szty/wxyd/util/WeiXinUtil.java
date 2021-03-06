package com.szty.wxyd.util;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * 
 * @ClassName: WeiXinUtil
 * @Description: TODO(微信帮助类)
 * @author mao.ru
 * @date 2016年1月8日 上午11:52:37
 *
 */
public class WeiXinUtil {

	/**
	 * @Title: getHashSHA
	 * @author mao.ru
	 * @Description: TODO(sha-1加密)
	 * @param @param str
	 * @param @return 设定文件
	 * @return String 返回类型
	 * @throws
	 */
	public static String getHashSHA(String str) {
		try {
			if(str.isEmpty()){
				return null;
			}
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			byte[] b = md.digest(str.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < b.length; i++) {
				sb.append(Integer.toString((b[i] & 0xff) + 0x100, 16)
						.substring(1));
			}
			return sb.toString();
		} catch (NoSuchAlgorithmException e) {
		}
		return null;

	}
	
	 public static String SHA1(String decript) {
	        try {
	            MessageDigest digest = java.security.MessageDigest
	                    .getInstance("SHA-1");
	            digest.update(decript.getBytes());
	            byte messageDigest[] = digest.digest();
	            // Create Hex String
	            StringBuffer hexString = new StringBuffer();
	            // 字节数组转换为 十六进制 数
	            for (int i = 0; i < messageDigest.length; i++) {
	                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
	                if (shaHex.length() < 2) {
	                    hexString.append(0);
	                }
	                hexString.append(shaHex);
	            }
	            return hexString.toString();
	 
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        return "";
	    }
	 
	    public static String SHA(String decript) {
	        try {
	            MessageDigest digest = java.security.MessageDigest
	                    .getInstance("SHA");
	            digest.update(decript.getBytes());
	            byte messageDigest[] = digest.digest();
	            // Create Hex String
	            StringBuffer hexString = new StringBuffer();
	            // 字节数组转换为 十六进制 数
	            for (int i = 0; i < messageDigest.length; i++) {
	                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
	                if (shaHex.length() < 2) {
	                    hexString.append(0);
	                }
	                hexString.append(shaHex);
	            }
	            return hexString.toString();
	 
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        return "";
	    }
	 
	    public static String MD5(String input) {
	        try {
	            // 获得MD5摘要算法的 MessageDigest 对象
	            MessageDigest mdInst = MessageDigest.getInstance("MD5");
	            // 使用指定的字节更新摘要
	            mdInst.update(input.getBytes());
	            // 获得密文
	            byte[] md = mdInst.digest();
	            // 把密文转换成十六进制的字符串形式
	            StringBuffer hexString = new StringBuffer();
	            // 字节数组转换为 十六进制 数
	            for (int i = 0; i < md.length; i++) {
	                String shaHex = Integer.toHexString(md[i] & 0xFF);
	                if (shaHex.length() < 2) {
	                    hexString.append(0);
	                }
	                hexString.append(shaHex);
	            }
	            return hexString.toString();
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        }
	        return "";
	    }
	 
	    /**
	     * 加密
	     *
	     * @param content
	     *            需要加密的内容
	     * @param password
	     *            加密密码
	     * @return
	     */
	    public static byte[] encryptAES(String content, String password) {
	        try {
	            KeyGenerator kgen = KeyGenerator.getInstance("AES");
	            kgen.init(128, new SecureRandom(password.getBytes()));
	            SecretKey secretKey = kgen.generateKey();
	            byte[] enCodeFormat = secretKey.getEncoded();
	            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
	            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
	            byte[] byteContent = content.getBytes("utf-8");
	            cipher.init(Cipher.ENCRYPT_MODE, key);// 初始化
	            byte[] result = cipher.doFinal(byteContent);
	            return result; // 加密
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        } catch (NoSuchPaddingException e) {
	            e.printStackTrace();
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        } catch (UnsupportedEncodingException e) {
	            e.printStackTrace();
	        } catch (IllegalBlockSizeException e) {
	            e.printStackTrace();
	        } catch (BadPaddingException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
	 
	    /**
	     * 解密
	     *
	     * @param content
	     *            待解密内容
	     * @param password
	     *            解密密钥
	     * @return
	     */
	    public static byte[] decryptAES(byte[] content, String password) {
	        try {
	            KeyGenerator kgen = KeyGenerator.getInstance("AES");
	            kgen.init(128, new SecureRandom(password.getBytes()));
	            SecretKey secretKey = kgen.generateKey();
	            byte[] enCodeFormat = secretKey.getEncoded();
	            SecretKeySpec key = new SecretKeySpec(enCodeFormat, "AES");
	            Cipher cipher = Cipher.getInstance("AES");// 创建密码器
	            cipher.init(Cipher.DECRYPT_MODE, key);// 初始化
	            byte[] result = cipher.doFinal(content);
	            return result; // 加密
	        } catch (NoSuchAlgorithmException e) {
	            e.printStackTrace();
	        } catch (NoSuchPaddingException e) {
	            e.printStackTrace();
	        } catch (InvalidKeyException e) {
	            e.printStackTrace();
	        } catch (IllegalBlockSizeException e) {
	            e.printStackTrace();
	        } catch (BadPaddingException e) {
	            e.printStackTrace();
	        }
	        return null;
	    }
}
