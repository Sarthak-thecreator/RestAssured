package com.lti.collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
public class LinkedHashMapEg 
{

	public static void main(String[] args)
	{
		LinkedHashMap<String,String> lHashMap=new LinkedHashMap<String,String>();
		lHashMap.put("1","One");
		lHashMap.put("2","Two");
		lHashMap.put("2","Three");
		lHashMap.put("4","Four");
		Set st=lHashMap.keySet();
		Iterator itr = st.iterator();

		while (itr.hasNext())
		{
		System.out.println(itr.next());

		}

		lHashMap.remove("2");

		boolean blnExists = lHashMap.containsKey("2");

		System.out.println(blnExists);
	
	}

}
