/**
 * <p>Title: FileOperation.java</p>
 * <p>Description: 
 *
 * </p>
 * <p>Copyright: </p>
 * <p>Company: </p>
 * @author huangpromise@gmail.com
 * @date 2012-11-1
 * @version 2.0
 */

package org.he.common.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.he.common.web.Constants;


/**
 * <p>
 * Title: FileOperation
 * </p>
 * <p> 
 * Description: 文件的有关操作 1.复制 2.获取文件类型字符串
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author huangpromise@gmail.com
 * @date 2012-11-1
 */

public class FileOper {
    /**
     * <p>
     * Title: copy
     * </p>
     * <p>
     * Description: 将上传文件保存到本地
     * </p>
     * 
     * @param src
     *            源文件
     * @param dst
     *            目标文件
     */
    public static void copy(File src, File dst) {
	try {
	    InputStream in = null;
	    OutputStream out = null;
	    try {
		in = new BufferedInputStream(new FileInputStream(src),
			Constants.BUFFER_SIZE);
		out = new BufferedOutputStream(new FileOutputStream(dst),
				Constants.BUFFER_SIZE);
		byte[] buffer = new byte[Constants.BUFFER_SIZE];
		while (in.read(buffer) > 0) {
		    out.write(buffer);
		}
	    } finally {
		if (null != in) {
		    in.close();
		}
		if (null != out) {
		    out.close();
		}
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

    /**
     * <p>
     * Title: getExtention
     * </p>
     * <p>
     * Description: 获取文件类型
     * </p>
     * 
     * @param fileName
     * @return 文件类型字符串
     */
    public static String getExtention(String fileName) {
	int pos = fileName.lastIndexOf(".");
	return fileName.substring(pos);
    }
    /**
     * <p>
     * Title: getExtention
     * </p>
     * <p>
     * Description: 获取文件名
     * </p>
     * 
     * @param fileName
     * @return 文件类型字符串
     */
    public static String getRealName(String fileName) {
	int pos = fileName.lastIndexOf(".");
	return fileName.substring(0,pos);
    }
    /**
    * <p>Title: deleteFile</p>
    * <p>Description: 删除文件</p>
    * @param path 文件地址
    */
    public static void deleteFile(String path){
	File file = new File(path);
	file.delete();
    }
}
