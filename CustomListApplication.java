package com.arraylist.adam;

public class CustomListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		
			myCustomList.add("element 1");
			myCustomList.add("element 2");
			myCustomList.add("element 3");
			myCustomList.add("element 4");
			myCustomList.add("element 5");
			myCustomList.add("element 6");
			myCustomList.add("element 7");
			myCustomList.add("element 8");
			myCustomList.add("element 9");
			myCustomList.add("element 10");
			myCustomList.add("element 11");
			myCustomList.add("element 12");
			myCustomList.add("element 13");
			myCustomList.add("element 14");
			myCustomList.add("element 15");
			myCustomList.add("element 16");
			myCustomList.add("element 17");
			myCustomList.add("element 18");
			myCustomList.add("element 19");
			myCustomList.add("element 20");
			myCustomList.add("element 21");
			
		for (int i = 0; i < myCustomList.getSize(); i++) {
				System.out.println(myCustomList.get(i));
			
		}
	}
}
