package com.org.szty.mybatis.plugin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

public class MapperXmlUtil {

	public static final String xml_path = CreateStart.PATH + "dao";
	public static final String mapper_package = CreateStart.PACKAGE + "dao";
	/**
	 * 构建实体类映射XML文件
	 *
	 * @param columns
	 * @param types
	 * @param comments
	 * @throws IOException
	 */
	public static void buildMapperXml(List<String> columns, List<String> types,
			List<String> comments) throws IOException {

		int wheresize = columns.size();
		File folder = new File(xml_path);
		if (!folder.exists()) {
			folder.mkdirs();
		}
		String mapname = OtherUtil.processResultMapId(TabClassUtil.modelName) + "ResultMap";
		File mapperXmlFile = new File(xml_path, TabClassUtil.mapperName + ".xml");
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(mapperXmlFile)));
		bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		bw.newLine();
		bw.write("<!DOCTYPE mapper PUBLIC \"-//mybatis.org//DTD Mapper 3.0//EN\" ");
		bw.newLine();
		bw.write("    \"http://mybatis.org/dtd/mybatis-3-mapper.dtd\">");
		bw.newLine();
		bw.write("<mapper namespace=\"" + mapper_package + "." + TabClassUtil.mapperName
				+ "\">");
		bw.newLine();
		bw.newLine();
		// 实体map映射
		bw.write("\t<!--实体映射-->");
		bw.newLine();
		bw.write("\t<resultMap id=\"" + mapname + "\" type=\"" + TabClassUtil.modelName
				+ "\">");
		bw.newLine();
		int size = columns.size();
		for (int i = 0; i < size; i++) {
			bw.write("\t\t<!--" + comments.get(i) + "-->");
			bw.newLine();
			bw.write("\t\t<result column=\"" + columns.get(i)
					+ "\"  property=\"" + columns.get(i) //this.processField(columns.get(i))
					+ "\" />");
			bw.newLine();
		}
		bw.write("\t</resultMap>");
		bw.newLine();
		bw.newLine();
		bw.newLine();

		// 通用结果列
		bw.write("\t<!-- 通用查询结果列-->");
		bw.newLine();
		bw.write("\t<sql id=\"Base_Column_List\">");
		bw.newLine();
		for (int i = 0; i < size; i++) {
			bw.write("\t" + columns.get(i));
			if (i != size - 1) {
				bw.write(",");
			}
		}
		bw.newLine();
		bw.write("\t</sql>");
		bw.newLine();
		bw.newLine();
		bw.newLine();

		// where 条件生成
		bw.write("\t<!-- 查询条件-->");
		bw.newLine();
		bw.write("\t<sql id=\"modelwheresql\">");
		bw.newLine();
		bw.write("\t<where>");
		bw.newLine();
		// bw.write("\t 1=1");
		bw.newLine();
		String tepfile = null;
		for (int i = 0; i < wheresize; i++) {
			//tepfile = processField(columns.get(i));
			tepfile = columns.get(i);
			bw.write("\t\t\t<if test=\"" + tepfile + " != null and " + tepfile
					+ " != '' \">");
			bw.newLine();
			bw.write("\t\t\t\t and " + columns.get(i) + " = #{" + tepfile + "}");
			bw.newLine();
			bw.write("\t\t\t</if>");
			bw.newLine();
		}
		bw.newLine();
		bw.write("\t</where>");
		bw.newLine();
		bw.write("\t</sql>");
		bw.newLine();
		bw.newLine();
		bw.newLine();

		// where 分页条件生成
		bw.write("\t<sql id=\"limitsql\">");
		bw.newLine();
		bw.write("\t\t\t<if test=\"limitStart != null and pageSize != null\"" + ">");	
		bw.newLine();
		bw.write("\t\t\t\t <![CDATA[  ");
		bw.newLine();
		bw.write("\t\t\t\t order by id desc limit #{limitStart} , #{pageSize} " );
		bw.newLine();
		bw.write("\t\t\t\t ]]>  ");
		bw.newLine();
		bw.write("\t\t\t</if>");
		bw.newLine();
		bw.write("\t</sql>");
		// 下面开始写SqlMapper中的方法
		buildSQLNew(bw, columns, types);
		bw.write("</mapper>");
		bw.flush();
		bw.close();
	}

	public static void buildSQLNew(BufferedWriter bw, List<String> columns,
			List<String> types) throws IOException {
		int size = columns.size();

		String mapname = OtherUtil.processResultMapId(TabClassUtil.modelName) + "ResultMap";
		// 添加insert方法
		bw.write("\t<!-- 添加 -->");
		bw.newLine();
		bw.write("\t<insert id=\"save\" parameterType=\"" + TabClassUtil.modelName + "\">");
		bw.newLine();
		bw.write("\t\t <selectKey resultType=\"long\" keyProperty=\"id\">");
		bw.newLine();
		bw.write("\t\t SELECT LAST_INSERT_ID()");
		bw.newLine();
		bw.write("\t\t </selectKey>");
		bw.newLine();
		bw.write("\t\t INSERT INTO " + TabClassUtil.modelName);
		bw.newLine();
		bw.write(" \t\t(");
		for (int i = 0; i < size; i++) {
			if (!columns.get(i).equalsIgnoreCase(CreateStart.primary_key)) {
				bw.write(columns.get(i));
				if (i != size - 1) {
					bw.write(",");
				}
			}
		}
		bw.write(") ");
		bw.newLine();
		bw.write("\t\t VALUES ");
		bw.newLine();
		bw.write(" \t\t(");
		for (int i = 0; i < size; i++) {
			
			String tepfile = columns.get(i);//processField(columns.get(i));
			if (!columns.get(i).equalsIgnoreCase(CreateStart.primary_key)) {
				bw.write("#{" + tepfile + "}");
				if (i != size - 1) {
					bw.write(",");
				}
			}
		}
		bw.write(") ");
		bw.newLine();
		bw.write("\t</insert>");
		bw.newLine();
		bw.newLine();
		// 添加insert完
		bw.write("\t<!-- 添加 （匹配有值的字段）-->");
		bw.newLine();
		bw.write("\t<insert id=\"insertSelective\" parameterType=\""
				+ OtherUtil.processResultMapId(TabClassUtil.beanName) + "\">");
		bw.newLine();
		bw.write("\t\t INSERT INTO " + TabClassUtil.tableName);
		bw.newLine();
		bw.write("\t\t <trim prefix=\"(\" suffix=\")\" suffixOverrides=\",\" >");
		bw.newLine();

		String tempField = null;
		for (int i = 0; i < size; i++) {
			tempField =columns.get(i) ;// processField(columns.get(i));
			bw.write("\t\t\t<if test=\"" + tempField + " != null\">");
			bw.newLine();
			bw.write("\t\t\t\t " + columns.get(i) + ",");
			bw.newLine();
			bw.write("\t\t\t</if>");
			bw.newLine();
		}

		bw.newLine();
		bw.write("\t\t </trim>");
		bw.newLine();

		bw.write("\t\t <trim prefix=\"values (\" suffix=\")\" suffixOverrides=\",\" >");
		bw.newLine();

		tempField = null;
		for (int i = 0; i < size; i++) {
			tempField = columns.get(i); //processField(columns.get(i));
			bw.write("\t\t\t<if test=\"" + tempField + "!=null and "
					+ tempField + "!='' \">");
			bw.newLine();
			bw.write("\t\t\t\t #{" + tempField + "},");
			bw.newLine();
			bw.write("\t\t\t</if>");
			bw.newLine();
		}

		bw.write("\t\t </trim>");
		bw.newLine();
		bw.write("\t</insert>");
		bw.newLine();
		bw.newLine();
		
		// --------------- saveBatch方法（匹配有值的字段）
		// 添加insert方法
		bw.write("\t<!-- 添加 -->");
		bw.newLine();
		bw.write("\t<insert id=\"saveBatch" + TabClassUtil.modelName
				+ "\" parameterType=\"java.util.List\">");
		bw.newLine();
		bw.write("\t\t INSERT INTO " + TabClassUtil.tableName);
		bw.newLine();
		bw.write(" \t\t(");
		for (int i = 0; i < size; i++) {
			if (!columns.get(i).equalsIgnoreCase(CreateStart.primary_key)) {
				bw.write(columns.get(i));
				if (i != size - 1) {
					bw.write(",");
				}
			}
		}
		bw.write(") ");
		bw.newLine();
		bw.write("\t\t VALUES ");
		bw.newLine();
		bw.write(" \t\t <foreach collection=\"list\" item=\"item\" index=\"index\" separator=\",\" >  ");
		bw.newLine();
		bw.write(" \t\t(");
		for (int i = 0; i < size; i++) {
			if (!columns.get(i).equalsIgnoreCase(CreateStart.primary_key)) {
				bw.write("#{item." + TabClassUtil.processField(columns.get(i)) + "}");
				if (i != size - 1) {
					bw.write(",");
				}
			}
		}
		bw.write(") ");
		bw.newLine();
		bw.write(" \t\t </foreach>");
		bw.newLine();
		bw.write("\t</insert>");
		bw.newLine();
		bw.newLine();
		// 添加insert完
		// --------------- 完毕
		// 修改update方法
				bw.write("\t<!-- 修 改-->");
				bw.newLine();
				bw.write("\t<update id=\"updateByPrimaryKeySelective\" parameterType=\""
						+ OtherUtil.processResultMapId(TabClassUtil.modelName) + "\">");
				bw.newLine();
				bw.write("\t\t UPDATE " + TabClassUtil.tableName);
				bw.newLine();
				bw.write(" \t\t <set> ");
				bw.newLine();

				tempField = null;
				for (int i = 0; i < size; i++) {
					tempField = columns.get(i);//processField(columns.get(i));
					bw.write("\t\t\t<if test=\"" + tempField + "!=null and "
							+ tempField + "!='' \">");
					bw.newLine();
					bw.write("\t\t\t\t #{" + tempField + "},");
					bw.newLine();
					bw.write("\t\t\t</if>");
					bw.newLine();
				}

				bw.newLine();
				bw.write(" \t\t </set>");
				bw.newLine();
				bw.write("\t\t WHERE " + columns.get(0) + " = #{"
						+ columns.get(0) //processField(columns.get(0))
						+ "}");
				bw.newLine();
				bw.write("\t</update>");
				bw.newLine();
				bw.newLine();
				// update方法完毕

				// ----- 修改（匹配有值的字段）
				bw.write("\t<!-- 修 改-->");
				bw.newLine();
				bw.write("\t<update id=\"updateByPrimaryKey\" parameterType=\""
						+ OtherUtil.processResultMapId(TabClassUtil.beanName) + "\">");
				bw.newLine();
				bw.write("\t\t UPDATE " + TabClassUtil.tableName);
				bw.newLine();
				bw.write("\t\t SET ");

				bw.newLine();
				tempField = null;
				for (int i = 1; i < size; i++) {
					tempField = columns.get(i) ;//processField(columns.get(i));
					bw.write("\t\t\t<if test=\"" + tempField + " != null\">");
					bw.newLine();
					bw.write("\t\t\t\t " + columns.get(i) + " = #{" + tempField + "},");
					bw.newLine();
					bw.write("\t\t\t</if>");
					bw.newLine();
				}

				bw.write("\t\t WHERE " + columns.get(0) + " = #{"
						+ columns.get(0)
						// processField(columns.get(0))
						+ "}");
				bw.newLine();
				bw.write("\t</update>");
				bw.newLine();

		// ----- 修改（匹配有值的字段）

		// 查询（根据主键ID查询）
		bw.write("\t<!-- 查询（根据主键ID查询） -->");
		bw.newLine();
		bw.write("\t<select id=\"selectByPrimaryKey\"  resultMap=\"" + mapname
				+ "\" parameterType=\"java.lang." + OtherUtil.processType(types.get(0))
				+ "\">");
		bw.newLine();
		bw.write("\t\t SELECT");
		bw.newLine();
		bw.write("\t\t <include refid=\"Base_Column_List\" />");
		bw.newLine();
		bw.write("\t\t FROM " + TabClassUtil.tableName);
		bw.newLine();
		bw.write("\t\t WHERE " + columns.get(0) + " = #{"
				+ TabClassUtil.processField(columns.get(0)) + "}");
		bw.newLine();
		bw.write("\t</select>");
		bw.newLine();
		bw.newLine();

		// 查询list
		bw.write("\t<!-- 查询  List 查询 -->");
		bw.newLine();
		bw.write("\t<select id=\"queryList\" resultMap=\"" + mapname
				+ "\" parameterType=\"" + TabClassUtil.modelName + "\">");
		bw.newLine();
		bw.write("\t\t SELECT");
		bw.newLine();
		bw.write("\t\t <include refid=\"Base_Column_List\" />");
		bw.newLine();
		bw.write("\t\t FROM " + TabClassUtil.tableName);
		bw.newLine();
		bw.write("\t\t  ");
		bw.newLine();
		bw.write("\t\t <include refid=\"modelwheresql\" />");
		bw.newLine();
		bw.write("\t</select>");
		bw.newLine();
		bw.newLine();

		// 统计
		 bw.write("\t<!-- 查询 分页总数 -->");
		 bw.newLine();
		 bw.write("\t<select id=\"queryCount\"  resultType=\"java.lang.Integer\"  parameterType=\""
		 + TabClassUtil.modelName + "\">");
		 bw.newLine();
		 bw.write("\t\t SELECT");
		 bw.newLine();
		 bw.write("\t\t count(1)");
		 bw.newLine();
		 bw.write("\t\t FROM " + TabClassUtil.tableName);
		 bw.newLine();
		 bw.write("\t\t  ");
		 bw.newLine();
		 bw.write("\t\t <include refid=\"modelwheresql\" />");
		 bw.newLine();
		 bw.write("\t</select>");
		 bw.newLine();

		// 分页查询

		 bw.write("\t<!-- 查询 分页查询 -->");
		 bw.newLine();
		 bw.write("\t<select id=\"queryPageList\" resultMap=\""+ mapname +
		 "\"  parameterType=\""+ TabClassUtil.modelName + "\">");
		 bw.newLine();
		 bw.write("\t\t SELECT");
		 bw.newLine();
		 bw.write("\t\t <include refid=\"Base_Column_List\" />");
		 bw.newLine();
		 bw.write("\t\t FROM " + TabClassUtil.tableName);
		 bw.newLine();
		 bw.write("\t\t  ");
		 bw.newLine();
		 bw.write("\t\t <include refid=\"modelwheresql\" />");
		 bw.newLine();
		 bw.write("\t\t <include refid=\"limitsql\" />");
		 bw.newLine();
		 bw.write("\t</select>");
		 bw.newLine();
		 bw.newLine();
	}
}
