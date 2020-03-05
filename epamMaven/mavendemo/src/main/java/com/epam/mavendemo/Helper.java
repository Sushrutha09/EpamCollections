package com.epam.mavendemo;

import java.util.Scanner;



public class Helper {

	public static void main(String[] args) {
		Collections coll=new Collections();
		coll.add("I");
		coll.add("L");
		coll.add("O");
		coll.add("V");
		coll.add("E");
		coll.add("I");
		coll.add("N");
		coll.add("D");
		coll.add("I");
		coll.add("A");
		System.out.println("The predefined elements in collection are:");
		coll.print();
		while("True"!=null)
		{
		System.out.println("\n1.Adding an element into the collection\n2.Retrieve an element from the collection\n3.Remove an elemnt from the collection");
		System.out.println("Enter your choice:");
		Scanner s=new Scanner(System.in);
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
		System.out.println("Enter the number of elements:");
		Scanner ss=new Scanner(System.in);
		int var1=ss.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<var1;i++)
		{
		Scanner sc=new Scanner(System.in);
		String vv=sc.next();
		coll.add(vv);
		}
		     coll.print();
		     break;
		case 2:
		System.out.println("Enter the index number of an element to retrieve:");
		Scanner sc=new Scanner(System.in);
		int g=sc.nextInt();
		Object o=coll.get(g);
		System.out.println("The element at index "+g +" is:"+o);
		break;
		case 3:
		System.out.println("Enter index number of an element to remove from the collection:");
		Scanner sss=new Scanner(System.in);
		int r=sss.nextInt();
		coll.remove(r);
		System.out.println();
		System.out.println("Elements in collection after removing an element are:");
		coll.print();
		break;
		default:
		System.out.println("Wrong selection");
		}
		
		}
		}
}
