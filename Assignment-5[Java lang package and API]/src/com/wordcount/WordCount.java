/**
 * 
 */
package com.wordcount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/**
 * @author SmPatel
 *
 */
public class WordCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Driver program for counting no. of times word present in string
		String str="If We Can Get To Mars , We Can Clean India - PM Narendra Modi";
		String[] words=str.split("\\s+");
		List<String> list = new ArrayList<String>();
		for(int i=0;i<words.length;i++){
			list.add(words[i]);
		}		

		Set<String> unique = new HashSet<String>(list);
		for (String key : unique) {
			System.out.println(key + ": " + Collections.frequency(list, key));
		}
	}

}
