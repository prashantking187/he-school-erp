/**
* <p>Title: SpringInit.java</p>
* <p>Description: 
*
* </p>
* <p>Copyright: </p>
* <p>Company: </p>
* @author huangpromise@gmail.com
* @date 2012-10-30
* @version 2.0
*/


package org.he.common.spring.support;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * <p>Title: SpringInit</p>
 * <p>Description: 	 
 *	获取webApplicationContext
 * </p>   
 * <p>Company: </p> 
 * @author    huangpromise@gmail.com
 * @date       2012-10-30
 */

public class SpringInit implements ServletContextListener{
    //context : spring的webApplicationContext
    public static ApplicationContext context;
    /* 
    * <p>Title: contextDestroyed</p>
    * <p>Description: </p>
    * @param arg0
    * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
    */
    
    public void contextDestroyed(ServletContextEvent arg0) {
    }

    /* 
    * <p>Title: contextInitialized</p>
    * <p>Description: 为context赋值</p>
    * @param arg0
    * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
    */
    
    public void contextInitialized(ServletContextEvent event) {
	context = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
    }
    
    public DataSource getDataSource(){
    	return (DataSource)context.getBean("dataSource");
    }
}
