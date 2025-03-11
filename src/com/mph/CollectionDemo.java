package com.mph;
import java.util.*;
public class CollectionDemo {

	public static void main(String[] args) {
		//List list=new ArrayList();
		//List list=new LinkedList();
		List list=new Vector();
		list.add("Shanthosh");
		list.add(2629071);
		list.add(17);
		list.add("August");
		list.add(2003);
		list.add(null);
		list.add(null);
		//System.out.println(list);
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		Set set=new HashSet();
		//Set set=new TreeSet();
		set.add("Shanthosh");
		set.add("Shanthosh");
		set.add("shanthosh");
		set.add(2629071);
		set.add(17);
		set.add("August");
		set.add(2003);
		set.add(null);
		set.add(null);
		//System.out.println(set);
		Iterator iset=set.iterator();
		while(iset.hasNext()) {
			System.out.println(iset.next());
		}
		System.out.println();
		
		//Map map=new HashMap();
		//Map map=new Hashtable();
		Map map=new TreeMap();
		map.put(1, "Shanthosh");
		map.put(2, "Saravanan");
		map.put(3, 17);
		map.put(5,2003 );
		map.put(6,"August");
		map.put(4,null);
		//map.put(null,null);
		//System.out.println(map);
		Collection c=map.keySet();
		//Collection c=map.values();
		Iterator imap=c.iterator();
		while(imap.hasNext()) {
			System.out.println(imap.next());
		}
	}

}
