package console_interpreter_alternative;

import java.util.*;

/**
* Given a package-qualified class name, return the names of the classes in
* the inheritance tree.
*/

public final class InheritanceInterpreter implements Interpreter {
	/**
	  * @param aLine is a non-null name of a class.
	  * @param aResult is a non-null, empty List which acts as an "out"
	  * parameter; when returned, aResult must contain a non-null, non-empty
	  * List of class names which form the inheritance tree of the input class.
	  *
	  * @return true if the user has requeseted to quit the Interpreter.
	  * @exception IllegalArgumentException if a param does not comply.
	  */
	  public boolean parseInput (String  aLine, final List aResult) {
	    if (aResult == null) {
	      throw new IllegalArgumentException("Result param cannot be null.");
	    }
	    if (!aResult.isEmpty()){
	      throw new IllegalArgumentException("Result param must be empty.");
	    }
	    if (aLine == null) {
	      throw new IllegalArgumentException("Line must not be null.");
	    }

	    boolean hasRequestedQuit = aLine.trim().equalsIgnoreCase(fQUIT) ||
	                               aLine.trim().equalsIgnoreCase(fEXIT);
	    if (hasRequestedQuit) {
	      aResult.add(fNEW_LINE);
	    }
	    else {
	      try {
	        Class theClass = Class.forName(aLine);
	        StringBuilder superclasses = new StringBuilder();
	        superclasses.append(fHEADER);
	        superclasses.append(fNEW_LINE);
	        while (theClass != null) {
	          superclasses.append(theClass);
	          superclasses.append(fNEW_LINE);
	          theClass = theClass.getSuperclass();
	        }
	        aResult.add(superclasses);
	        aResult.add(fDEFAULT_PROMPT);
	      }
	      catch (ClassNotFoundException ex){
	        //recover by asking the user for corrected input
	        aResult.clear();
	        aResult.add(fERROR_PROMPT);
	      }
	    }

	    assert !aResult.isEmpty(): "Result must be non-empty.";

	    return hasRequestedQuit;
	  }

	  /**
	  * Return the text to be displayed upon start-up of the Interpreter.
	  */
	  public String getHelloPrompt() {
	    return fHELLO_PROMPT;
	  }

	  // PRIVATE
	  private static final String fHELLO_PROMPT = "Please enter a class name>";
	  private static final String fDEFAULT_PROMPT = "Please enter a class name>";
	  private static final String fERROR_PROMPT = "Invalid.  Example:\"java.lang.String\">";
	  private static final String fHEADER = "The inheritance tree:";
	  private static final String fQUIT = "quit";
	  private static final String fEXIT = "exit";
	  private static final String fNEW_LINE = System.getProperty("line.separator");

}
