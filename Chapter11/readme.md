# Debugging and Error Handling
-If an error occurs
* Return to a safe state and enable the user to execute command
* Allow the user to save all work and terminate program

- Problems That might occur:
    * User Input Errors 
    * Device Errors 
    * Physical limitation
    * Code Errors
# Exceptions
- Error -> The Error hierarchy describes internal errors and resource exhaustion situations inside the Java
  runtime system
  
- Exception
    * IOException
    * Runtime Exception -> A RuntimeException happens because you made a programming erro
      - A bad cast
      - An out-of-bounds array access
      - A null pointer access
    
    * exception can used as throw new Exception()
- Throwable

# Tips for Using Exceptions
- If it's possible to catch an error with a simple test use it. Exceptions are not simple test.
- Don't micromanage exceptions. -> Operate in a try and catch with multiple state.
- Make good use of exception hierarchy. -> Use specific exceptions for specific conditions
- Don't squelch exception. ->
- “throw early, catch late."

# Assertions
- Assertion failures are intended to be fatal, unrecoverable errors.
- Assertion checks are turned on only during development and testing. (This is sometimes
jokingly described as “wearing a life jacket when you are close to shore, and throwing it
overboard once you are in the middle of the ocean.”)

# Logging 
- Usefull for debugging
- Can handle many situation
- Logging Levels:
  * SEVERE
  * WARNING
  * INFO
  * CONFIG
  * FINE
  * FINER
  * FINEST

