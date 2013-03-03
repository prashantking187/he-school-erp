/**  
* @Title: BaseAction.java 
* @Package org.he.base.action 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-2-26 下午2:50:16 
* @version V1.0  
*/ 
package org.he.base.action;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.he.base.service.BaseService;
import org.he.common.vo.PageBean;

import com.opensymphony.xwork2.ActionSupport;

/** 
 * @ClassName: BaseAction 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-2-26 下午2:50:16 
 *  
 */
public class BaseAction extends ActionSupport {
	//began of 上传文件属性
	private List < File > upload = new ArrayList < File > ();
    private List < String > uploadFileNames = new ArrayList < String > ();
    private List < String > uploadContentTypes = new ArrayList < String > ();

    public List < File > getUpload( ) {
        return this .upload;
   } 
    public void setUpload(List < File > upload) {
        this .upload = upload;
   } 

    public List < String > getUploadFileName() {
        return this .uploadFileNames;
   } 
    public void setUploadFileName(List < String > uploadFileNames) {
        this .uploadFileNames = uploadFileNames;
   } 

    public List < String > getUploadContentType() {
        return this .uploadContentTypes;
   } 
    public void setUploadContentType(List < String > contentTypes) {
        this .uploadContentTypes = contentTypes;
   } 
    //end 
    
    
    
	/** 
	* @Fields baseService : TODO 基本功能服务
	*/ 
	public BaseService baseService;
	/** 
	* @Fields message : TODO 与页面传递的消息
	*/ 
	private String message;
	
	/** 
	* @Fields pageBean : TODO 分页类
	*/ 
	private PageBean pageBean;
	
	/** 
	* @Fields currentPage : TODO 当前页面，默认为1
	*/ 
	private int currentPage = 1;
	
	/** 
	* @Fields pageSize : TODO 页面大小，默认为10
	*/ 
	private int pageSize = 10;
	private Long id ;//id
	private int status;//代码执行结果（ 1 成功   2失败）

	/** 
	 * @return message 
	 */
	public String getMessage() {
		return message;
	}

	/** 
	 * @param message 要设置的 message 
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/** 
	 * @return pageBean 
	 */
	public PageBean getPageBean() {
		return pageBean;
	}

	/** 
	 * @param pageBean 要设置的 pageBean 
	 */
	public void setPageBean(PageBean pageBean) {
		this.pageBean = pageBean;
	}

	/** 
	 * @return currentPage 
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/** 
	 * @param currentPage 要设置的 currentPage 
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/** 
	 * @return pageSize 
	 */
	public int getPageSize() {
		return pageSize;
	}

	/** 
	 * @param pageSize 要设置的 pageSize 
	 */
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	/** 
	 * @param baseService 要设置的 baseService 
	 */
	public void setBaseService(BaseService baseService) {
		this.baseService = baseService;
	}

	/** 
	 * @return id 
	 */
	public Long getId() {
		return id;
	}

	/** 
	 * @param id 要设置的 id 
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/** 
	 * @return status 
	 */
	public int getStatus() {
		return status;
	}

	/** 
	 * @param status 要设置的 status 
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/** 
	 * @return baseService 
	 */
	public BaseService getBaseService() {
		return baseService;
	}

	
	
}
