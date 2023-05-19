/*
 * Tegan Jetton
 * CIS 244 IK
 * 05/10/23
 * Lab 10
 * This project simulates Stack operations using
 * an ArrayList. The push, pop, top, and isEmpty
 * methods are all written and utilized for quick
 * demonstration purposes.
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class ArrayListStack 
{
  // declare a class – level array list
  static ArrayList<String> list = new ArrayList<String>();
  
  public static void main(String args[])
  {
    // declare a date object
    Date myDate = new Date();
    String myDateFormat = "MM/dd/yyyy";
    SimpleDateFormat dtToday = new SimpleDateFormat(myDateFormat);
	
 // reverse the list to create the stack
    Collections.reverse(list);
    
    push("client 1");
    push("client 2");
    push("client 3");
    push("client 4");
    
    // store the stack elements in a StringBuilder object
    StringBuilder sb = new StringBuilder();
    // declare an Iterator object
    Iterator<String> itr = list.iterator();
    // iterate through the list of elements in the ArrayList
    System.out.println("iterate through ArrayList elements");
    while(itr.hasNext())
    {
      sb.append(itr.next() + "\n");
    }
    
    // display the stack elements in a Dialog Box
    JOptionPane.showMessageDialog(null, dtToday.format(myDate) +
      "\n" + "display elements \n" + sb);
    // pop an element
    pop();
    // pop an element
    pop();

    // clear the StringBuilder object
    sb.setLength(0);

    // update the Iterator object
    itr = list.iterator();

    // store the updated stack elements in a StringBuilder object
    System.out.println("iterate through ArrayList elements");
    while(itr.hasNext())
    {
      sb.append(itr.next() + "\n");
    }
    
    // display the current stack elements in a Dialog Box
    JOptionPane.showMessageDialog(null, dtToday.format(myDate) +
      "\n" + "display elements \n" + sb);
    // clear the StringBuilder
    sb.setLength(0);
    
    // display whether the list is empty or not
    if(list.isEmpty()) {
    	sb.append("The Stack is Empty");
    }
    else {
    	sb.append("The Stack is not Empty");
    }
    JOptionPane.showMessageDialog(null, sb);
    
    // display next top element
    JOptionPane.showMessageDialog(null, "The next element is: "+ top());
  }

  // define the pop() method
  public static void pop()
  {
    // declare an object to manipulate the list
    Object obj = new Object();

    if (list.size() > 0)
    {
      obj = list.remove(0);
      System.out.println(obj + " is removed from ArrayList");
    }
    else
      System.out.println("empty list");
  }
  
  // define the push() method
  public static void push(String obj) {
	  list.add(0, obj);
  }
  // define the top() method
  public static String top() {
	  return list.get(0);
  }
  
  // define the isEmpty() method
  public static boolean isEmpty() {
	  return(list.size() < 1);
  }
}