package org.assigment1;

public class Container<T extends Comparable<? super T>> {
	private T z;
	
	public void addElementsToContainer(T z){ 
		this.z = z;
	}
	
	public T getTheElement(){
		return z;
	}
	public int compareTo(T o) {
		if(z.compareTo((T) o)>0){
			return 1;
		}else{
			return 0;
		}
	}
	
	public void displayContainerTop(){
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Container<Integer> cont = new Container<>();
		Container<String> scont = new Container<>();
		cont.addElementsToContainer(97);
		scont.addElementsToContainer("a");
		cont.displayContainerTop();
		scont.displayContainerTop();
	}
}
