package com.szty.admobi.user.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.szty.commos.shiro.button.BaseButCode;
import com.szty.commos.shiros.model.SysAuthRoles;
import com.szty.commos.shiros.model.SysAuthority;
import com.szty.commos.shiros.model.SysResources;
import com.szty.commos.shiros.model.dto.OntreeModel;
import com.szty.commos.shiros.service.ResAuthService;
import com.szty.commos.shiros.service.SysResourcesService;
import com.szty.framework.base.msg.ControllerMsg;

/**
 *  资源权限请求
 * ClassName: AuthResController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2016年3月9日 下午5:47:20 <br/>
 *
 * @author mao.ru
 * @version 
 * @since JDK 1.7
 */
@Controller
public class AuthResController {
	
   
	@Autowired
	private SysResourcesService sysResourcesService;
	
	@Autowired
	private ResAuthService resAuthService;
	
	
	@RequestMapping(value = "/authTrees")
	public @ResponseBody String getAuthTree(HttpServletRequest request) {
		List<OntreeModel>  trees = new ArrayList<OntreeModel>();
		SysResources SysResources = new SysResources();
		List<SysResources> list = sysResourcesService.queryList(SysResources);
		for(SysResources su : list){
			OntreeModel  onTree = new OntreeModel();
			onTree.setId(su.getResourcesCode()+":*");
			onTree.setText(su.getResourcesName());
			List<OntreeModel> children = this.getOntree(su);
			onTree.setChildren(children);
			trees.add(onTree);
		}
		return JSON.toJSONString(trees);

	} 
	
	protected List<OntreeModel> getOntree(SysResources su){
		List<OntreeModel> list = new ArrayList<OntreeModel>();
		if(BaseButCode.BUT_LAG.equals(su.getAdds())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_ADD);
			md.setText(BaseButCode.BUT_ADD_NAME);
			list.add(md);
		}
		if(BaseButCode.BUT_LAG.equals(su.getDeletes())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_DELETE);
			md.setText(BaseButCode.BUT_DELETE_NAME);
			list.add(md);
		}
		if(BaseButCode.BUT_LAG.equals(su.getEdits())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_EDIT);
			md.setText(BaseButCode.BUT_EDIT_NAME);
			list.add(md);
		}
		if(BaseButCode.BUT_LAG.equals(su.getExports())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_EXPORT);
			md.setText(BaseButCode.BUT_EXPORT_NAME);
			list.add(md);
		}
		if(BaseButCode.BUT_LAG.equals(su.getUploads())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_UPLOAD);
			md.setText(BaseButCode.BUT_UPLOAD_NAME);
			list.add(md);
		}
		if(BaseButCode.BUT_LAG.equals(su.getViews())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_VIEW);
			md.setText(BaseButCode.BUT_VIEW_NAME);
			list.add(md);
		}
		if(BaseButCode.BUT_LAG.equals(su.getImports())){
			OntreeModel md = new OntreeModel();
			md.setId(su.getResourcesCode()+":"+BaseButCode.BUT_IMPORT);
			md.setText(BaseButCode.BUT_IMPORT_NAME);
			list.add(md);
		}
		return list;
		
	}
	
	@RequestMapping(value = "/authResources")
	public @ResponseBody String setAuthResources(HttpServletRequest request,String auths ,String roleIds) {
		//1.插入权限表
		SysAuthority auth = new SysAuthority();
		auth.setResoucesAuth(auths);
		auth.setResoucesId(1L);
		Long authorityId = resAuthService.saveReroces(auth);
		//2.角色权限表
		String[] rIds = roleIds.split(",");
		for(int i = 0 ; i <rIds.length ; i++){
			SysAuthRoles authRoles = new SysAuthRoles();
			authRoles.setRoleId(Long.valueOf(rIds[i]));
			authRoles.setAuthorityId(authorityId);
			resAuthService.saveAuthRole(authRoles);
		}
		return JSON.toJSONString(new ControllerMsg("ok","成功"));

	} 

}
