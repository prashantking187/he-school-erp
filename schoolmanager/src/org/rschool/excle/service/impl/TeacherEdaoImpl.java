/**  
* @Title: TeacherEdaoImpl.java 
* @Package org.rschool.excledao 
* @Description: TODO 
* @author A18ccms A18ccms_gmail_com  
* @date 2013-3-2 下午2:21:41 
* @version V1.0  
*/ 
package org.rschool.excle.service.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.rschool.entity.hibernate.RTeacher;
import org.rschool.excledao.TeacherEdao;
import org.ruan.cou_sys.entity.RStudentInfo;

/** 
 * @ClassName: TeacherEdaoImpl 
 * @Description:  
 * @author: 黄鹤
 * @date 2013-3-2 下午2:21:41 
 *  
 */
public class TeacherEdaoImpl implements TeacherEdao {

	/* (非 Javadoc) 
	 * <p>Title: getTeacherList</p>
	 * <p>Description: </p>
	 * @see org.rschool.excledao.TeacherEdao#getTeacherList(java.io.InputStream) 
	 */
	public List<RTeacher> getTeacherList(InputStream inputStream) {
		List<RTeacher> list = new ArrayList<RTeacher>();
		HSSFWorkbook wb = new HSSFWorkbook(inputStream);
		Sheet sheet = wb.getSheetAt(0);
		for (Row row : sheet) {// 获取单行
			if (row.getRowNum() > 5) {
				RTeacher teacher = new RTeacher();
				for (Cell cell : row) {// 获取单元格
					cell.setCellType(Cell.CELL_TYPE_STRING);
					switch (cell.getColumnIndex()) {
					case 0:
						teacher.set
						break;
					case 1:
						student.setSn(cell.getRichStringCellValue().getString());
						break;
					default:
						break;
					}
				}
				list.add(student);
			}
		}
		return null;
	}

	/* (非 Javadoc) 
	 * <p>Title: wirteTeacherList</p>
	 * <p>Description: </p>
	 * @see org.rschool.excledao.TeacherEdao#wirteTeacherList(java.util.Collection, java.io.File) 
	 */
	public InputStream wirteTeacherList(Collection<RTeacher> collection) {
		Workbook wb = new HSSFWorkbook(); 
		Sheet sheet = wb.createSheet();
		Row row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("班号");
		row0.createCell(1).setCellValue("学号");
		row0.createCell(2).setCellValue("姓名");
		int i = 1;
		for (RStudentInfo student : list) {
			Row row = sheet.createRow(i);
			row.createCell(0).setCellValue(student.getSclass());//班号
			row.createCell(1).setCellValue(student.getSno());//学号
			row.createCell(2).setCellValue(student.getSn());//姓名
			i++;
		} 
		ByteArrayOutputStream  out = new ByteArrayOutputStream();
		wb.write(out);
		InputStream in = new ByteArrayInputStream(out.toByteArray());
		out.close();
		return in;
	}

}
