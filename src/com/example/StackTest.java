<<<<<<< HEAD
//20161027KCH
=======
//20161027 0609 KCH
>>>>>>> 102e33ba9a2fc6c6bead30dd88a4c3a51d6fb6d4
package com.example;
import com.example.Stack;

public class StackTest {
	public static void main(String[] args) {
		String input = "124*5/+7-36/+";
		Stack theStack;
		int stackSize = input.length();
		ClassInt a=null, b=null, c=null;
    	boolean ret=true;

    	theStack = new Stack(stackSize);
	    for (int j = 0; j < stackSize; j++) {
	    	char ch = input.charAt(j);
	    	switch (ch) {    	    
	    		case '+': 
	    			b = theStack.pop(); 
	    			a = theStack.pop(); 
	    			c = new ClassInt(a.data + b.data); 
	    			ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR A !!! ");
	    			}
	    			break;
   	            case '-':
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data - b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR B !!! ");
	    			}
   	            	break;
   	            case '*': 
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data * b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR C !!! ");
	    			}
   	            	break;
   	            case '/': 
   	            	b = theStack.pop(); 
   	            	a = theStack.pop(); 
   	            	c = new ClassInt(a.data / b.data); 
   	            	ret = theStack.push(c); 
	    			if ((a == null)||(b == null)||(ret == false)) {
	    				System.out.println("The Stack operation ERROR D !!! ");
	    			}
   	            	break;
   	            default: 
   	            	c = new ClassInt(Integer.parseInt(""+ch));
   	            	ret = theStack.push(c); 
	    			if (ret == false) {
	    				System.out.println("The Stack operation ERROR E!!! ");
	    			}
   	                break;
   	         }
	    }
	    a = theStack.pop();
	    System.out.println("The value is " + a.data);
	}
}
