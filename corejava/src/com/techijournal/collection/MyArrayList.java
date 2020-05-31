package com.techijournal.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import java.util.ListIterator;

public class MyArrayList {

	public static void main(String atgs []) {
		setAndAdd();
	}
	private static void arrayListExample() {
		//Creating a arraylist of default size i.e 10
		List<Integer> defaultList = new ArrayList<>();
		//Creating a ArrayList of capacity 5
		List<Integer> listOfCapaciyFive = new ArrayList<>(5);
		
		//Example for add()
		defaultList.add(33);
		defaultList.add(54);
		defaultList.add(66);
		defaultList.add(12);
		
		System.out.print("printing  elements of defaultList");
		System.out.println("defaultList elements are :"+defaultList);
		System.out.print("Creating ArrayList from existing list");
		List<Integer> listFromExistingList = new ArrayList<Integer>(defaultList);
		System.out.println("printing element of listFromExistingList");
		System.out.println("listFromExistingList elements are : " + listFromExistingList);
		
		
		System.out.println("adding element at index 3 in listFromExistingList");
		listFromExistingList.add(3,454);
		System.out.println("listFromExistingList elements after update are : " + listFromExistingList);
		
		System.out.println("Adding listFromExistingList to listOfCapaciyFive");
		listOfCapaciyFive.addAll(listFromExistingList);
		
		System.out.println("listOfCapaciyFive elements are :"+listOfCapaciyFive);
		
		
		System.out.println("Adding defaultList to listOfCapaciyFive at index 4");
		listOfCapaciyFive.addAll(4,defaultList);
		
		System.out.println("listOfCapaciyFive elements are :"+listOfCapaciyFive);
		
	}
	
	private static void remove() {
		List<String> list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("Initial List :"+ list);
		System.out.println("Removing element from list using list.remove(index)");
		String removedElement = list.remove(3);
		System.out.println(removedElement+" is element was present at index 3 got removed");
		
		
		System.out.println("Removing element using list.remove(object)");
		list.remove("US"); //returns boolean if successful
		System.out.println("US object got removed");
		
		list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		
		System.out.println("Re-Initializing List with elements :"+ list);
		List<String> listToRemoved = new ArrayList<>();
		listToRemoved.add("US");
		listToRemoved.add("India");
		System.out.println("List to be removed from list is "+ listToRemoved);
		System.out.print("Removing elements from arraylist using list.remove(collection)");
		list.removeAll(listToRemoved);
		
		System.out.println("List after removing collection "+ listToRemoved+ " is "+ list);
		list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		
		System.out.println("Re-Initializing List with elements :"+ list);

		System.out.println("Removing elements from list using predicate i.e using list.removeIf(predicate)");
		list.removeIf(s-> s.equals("Rome") || s.equals("India"));
		System.out.println("List after removing is "+ list);

		System.out.println("Remvoing all elements using list.clear()");
		list.clear();
		System.out.println("List after calling clear is "+list);
		
		list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("removing elements from list using list.retainAll()");
		System.out.println("Re-Initializing List with elements :"+ list);
		List<String> listToRetain = new ArrayList<>();
		listToRetain.add("US");
		listToRetain.add("India");
		System.out.println(" List to retain is :"+ list);
		list.retainAll(listToRetain);
		System.out.println("Now, updated list is "+ list);

		
		
	}
	
	private static void fetchingElement() {
		List<String> list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("Initial List :"+ list);
		
		System.out.println("fetching element from list using list.get(index)");
		System.out.println("Element at index 3 of list is : "+list.get(3));
		
		System.out.println("fetching element from list using list.sublist(fromIndex, toIndex)");
		System.out.println("Element from index 1 to index 3 of list is : "+list.subList(1, 3));


		
	}
	
	private static void IteratingOverList() {
		List<String> list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("Initial List :"+ list);
		
		System.out.print("Using for Loop to Iterate ArrayList");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i)+ " ");
		}
		System.out.println("Iterating ArrayList using list.Iterator()");
		Iterator<String> iterator = list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		
		System.out.println("Iterating ArrayList using list.ListIterator()");
		ListIterator<String> listIterator = list.listIterator();
		System.out.println("Traversing in front direction");
		while(listIterator.hasNext()) {
			String country = listIterator.next();
			System.out.println("current element: " +country);
			if(country.equals("US"))
			  listIterator.add("Japan");
			if(country.equals("China"))
				  listIterator.set("Nepal");
			
		} 
		System.out.println("Updated List: " + list);

		
		System.out.println("Traversing in backword direction");
		while(listIterator.hasPrevious()) {
			String country = listIterator.previous();
			System.out.println("current element: " +country);
			
		} 
		
	}
	
	private static void cloningArrayList() {
		
		ArrayList<Country> list = new ArrayList<>();
		list.add(new Country("US"));
		list.add(new Country("China"));
		list.add(new Country("India"));
		list.add(new Country("Rome"));
		list.add(new Country("Cannada"));
		System.out.println("Initial List :"+ list);
		
		List<Country> duplicateList = new ArrayList<>();
		duplicateList = (List<Country>) list.clone();
		System.out.println("Cloned list is :"+ duplicateList);
		duplicateList.get(0).setName("USD");
		System.out.println("Updated Initial List :"+ list);
		System.out.println("Updated Cloned List :"+ duplicateList);
		
	}
	
	private static void toArray() {
		List<String> list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("Initial List :"+ list);
		String [] objectArr = (String[]) list.toArray(new String[10]);
		System.out.println("Converted arraylist to array is : ");
		list.forEach(e -> System.out.println(String.valueOf(e)+" ") );
		String [] arr = (String[]) list.toArray(new String[10]);
		System.out.println("Converted arraylist to array is : ");
		list.forEach(e -> System.out.print(e+" ") );
	}
	
	private static void sortArrayList() {
		List<String> list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("Initial List :"+ list);
		
		list.sort((o1,o2) ->{
			return o1.compareTo(o2);
		});
		System.out.println("Sorted list is : "+list);
	}
	
	private static void setAndAdd() {
		List<String> list = new ArrayList<>();
		list.add("US");
		list.add("China");
		list.add("India");
		list.add("Rome");
		list.add("Cannada");
		System.out.println("Initial List :"+ list);
		//list.add(5,"Japan");
		System.out.println(list.set(4, "Russia"));
	}
	
}
class Country{
	Country(String name){
		this.name = name;
	}
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + "]";
	}
	

}
