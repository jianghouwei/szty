package com.org.szty.mybatis.plugin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

/**
 * 实体类生成javaBean ClassName: EntityBeanUtil <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月22日 下午5:17:30 <br/>
 *
 * @author mao.ru
 * @version
 * @since JDK 1.7
 */
public class EntityBeanUtil {

	public static final String bean_path = CreateStart.PATH + "model";
	public static final String bean_package = CreateStart.PACKAGE + "model";

	public static void buildEntityBean(List<String> columns, List<String> types, List<String> comments,
			String tableComment) throws IOException {
		File folder = new File(bean_path);
		if (!folder.exists()) {
			folder.mkdir();
		}
		// 生成Javabean
		File beanFile = new File(bean_path, TabClassUtil.beanName + ".java");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(beanFile)));
		bw.write("package " + bean_package + ";");
		bw.newLine();
		bw.newLine();
		bw = OtherUtil.buildClassComment(bw, tableComment);
		bw.newLine();
		bw.write("public class " + TabClassUtil.beanName + " {");
		bw.newLine();
		bw.newLine();
		int size = columns.size();
		for (int i = 0; i < size; i++) {
			bw.write("\t/**" + comments.get(i) + "**/");
			bw.newLine();
			bw.write("\t private " + OtherUtil.processType(types.get(i)) + " " + TabClassUtil.processField(columns.get(i))
					+ ";");
			bw.newLine();

		}
		bw.newLine();
		// 生成get 和 set方法
		String tempField = null;
		String _tempField = null;
		String tempType = null;
		for (int i = 0; i < size; i++) {
			tempType = OtherUtil.processType(types.get(i));
			_tempField = TabClassUtil.processField(columns.get(i));
			tempField = _tempField.substring(0, 1).toUpperCase() + _tempField.substring(1);
			bw.newLine();
			bw.write("\t public void set" + tempField + "(" + tempType + " " + _tempField + "){");
			bw.newLine();
			bw.write("\t\t this." + _tempField + " = " + _tempField + ";");
			bw.newLine();
			bw.write("\t}");
			bw.newLine();
			bw.newLine();
			bw.write("\t public " + tempType + " get" + tempField + "(){");
			bw.newLine();
			bw.write("\t\treturn this." + _tempField + ";");
			bw.newLine();
			bw.write("\t}");
			bw.newLine();
			bw.newLine();
		}
		bw.newLine();
		bw.write("}");
		bw.newLine();
		bw.flush();
		bw.close();

	}
}
