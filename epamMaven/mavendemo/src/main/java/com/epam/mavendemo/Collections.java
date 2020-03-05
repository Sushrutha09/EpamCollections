package com.epam.mavendemo;

public class Collections {
	private Object[] arr = new Object[10];
	private int elc=0;
	public void add(Object ob){
		if(elc == arr.length){
			increaseCap();
		}
		arr[elc] = ob;
		elc++;
	}
	public void increaseCap() {
		// TODO Auto-generated method stub
		int newcap = arr.length*2;
		Object[] nextarr = new Object[newcap];
		for(int i=0;i<arr.length;i++){
			nextarr[i]=arr[i];
		}
		arr=nextarr;
	}
	public void print(){
		System.out.print("(");
		for(int i=0;i<elc;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print(")");
	}
	public int capac(){
		return arr.length;
	}
	int size(){
		return elc;
	}
	
	public Object get(int ind){
		//System.out.println("The element at index "+ind+"is "+arr[ind]);
		if(ind<0 ||ind>=size()){
			throw new IndexOutOfBoundsException("index is out of bounds");
		}
		return arr[ind];
	}
	public void remove(int ind){
		System.out.println("The element at index "+ind+"is"+arr[ind]);
		if(ind<0 ||ind>=size()){
			throw new IndexOutOfBoundsException("index is out of bounds");
		}
		while(ind<size()-1){
			arr[ind]=arr[ind+1];
			ind++;
		}
		arr[ind]=null;
		elc--;
	}
	
}
