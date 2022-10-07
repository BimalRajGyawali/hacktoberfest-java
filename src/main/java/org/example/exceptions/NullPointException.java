/*When a Java application tries to process an object that has a null value, a NullPointerException is raised.*/

public class NullPointException {
    	 public static void main(String[] args) {
    	    Integer number = null;

    	    if (number > 0) {
    	      System.out.println("Positive number");
    	    }
    	  }
    	}

/*A basic evaluation in the example above would fail since the number (Integer) object is null, 
resulting in a NullPointerException.*/
