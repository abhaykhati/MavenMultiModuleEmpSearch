package org.empSearchData;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmpSearchDataHolder {
	
	static Map<String,Double> emp=new HashMap<String,Double>();
	
	public static  Map<String,Double>  searchEmpData(String empName) {
		  
		 emp.put("abhay", 50000d);
		 emp.put("bhagyashree", 100000d);
		 emp.put("prachi", 30000d);
		 emp.put("hiru", 10000d);
		 emp.put("akhilesh", 2000d);
		 
		 Set<Map.Entry<String, Double>> entrySet=emp.entrySet();
		 
		 
		 for (Entry<String, Double> entry : entrySet) {
			 
			 if(entry.getKey().equals(empName)) {
				 
				 System.out.println("Employee Name "+ "  "+entry.getKey()+"  Employee Salary=   "+ entry.getValue());
				 
			 }
		}
		return emp;
		
	}
	
	
/*	public static void main(String[] args) {

		EmpSearchDataHolder.setEmpData("abhay");

	}	
*/

}
