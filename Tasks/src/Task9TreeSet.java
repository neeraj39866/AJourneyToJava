

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

import com.auribises.model1.Song;
public class Task9TreeSet implements Comparable<Task9TreeSet> {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList = new LinkedList<String>();
		
		linkedList.add("John");	
		linkedList.add("Fionna");
		linkedList.add("Jennie");
		linkedList.add("Jack");
		linkedList.add("Fionna");
		linkedList.add("Leo");
		linkedList.add("Kim");
		linkedList.add("Anna");
		linkedList.add("Fionna");	// duplicate data supported
		linkedList.add("Sia");	
		
		System.out.println(linkedList);
		
		// This shall not store the data with linked list approach
		// rather use Hashing as algorithm
		// Hence, we cannot access a single element and output is un-ordered
		//HashSet<String> set = new HashSet<String>();
		
		TreeSet<String> set = new TreeSet<String>();// additionally sorts the data as well
		TreeSet<Song> set1 = new TreeSet<Song>();
		set.add("John");	
		set.add("Fionna");
		set.add("Jennie");
		set.add("Jack");
		set.add("Fionna");
		set.add("Leo");
		set.add("Kim");
		set.add("Anna");
		set.add("Fionna");	// duplicate data not supported
		set.add("Sia");	
		Song song1 = new Song("Party All Night", "Honey Singh", 4.5);
		Song song2 = new Song("High Heels", "Honey Singh", 4.5);
		Song song3 = new Song("Sunny Sunny", "Honey Singh", 6.5);
		Song song4 = new Song("Blue Eyes", "Honey Singh", 8.5);
		Song song5 = new Song("Urvashi", "Honey Singh", 2.5);
		
		//System.out.println(set);
		//System.out.println(set.size());
		
		set.remove("Leo");
		//set.clear();
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			//System.out.println(name);
		}
		
		System.out.println(set1);
		

		// Assignemnt: Create a TreeSet of Song Objects, and see if Comparable works or we have to work with Comparator
		
	}

	
	

	@Override
	public int compareTo(Task9TreeSet o) {
		// TODO Auto-generated method stub
		
		return 0;
	}

}