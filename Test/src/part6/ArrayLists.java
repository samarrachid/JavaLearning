package part6;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;

public class ArrayLists{
	public static void main(String[] args) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("Dan");
		myArrayList.add("Samar");
		myArrayList.add("Hamode");
		myArrayList.add("Dania");
		myArrayList.add("Ghis");
		myArrayList.add("Samer");
		
		myArrayList.add(0, "Dad");
		myArrayList.set(1, "Mom");
		myArrayList.remove(3);
		
		for (int i = 0; i < myArrayList.size(); i ++) {
		System.out.println(myArrayList.get(i));
		}
		// making a copy of myArrayList
		ArrayList myArrayListCopy = new ArrayList();
		myArrayListCopy.addAll(myArrayList);
		System.out.println(myArrayListCopy);
		
		if(myArrayList.contains("Dania")) {
			System.out.println("Dania is in the arrayList");
		}
		if(myArrayList.containsAll(myArrayListCopy)) {
			System.out.println("Everything in myArrayListCopy is in myArrayList");
			
		}
		myArrayListCopy.clear(); 
		
		
		
		
		
		
	}

}
