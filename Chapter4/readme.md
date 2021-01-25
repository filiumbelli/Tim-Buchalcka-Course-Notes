# Referencing Values and Composition
- It is pretty common to use objects as references to mutate the value by using functions or methods. This is called referencing objects.
- I.e AnyClass anyClass is used in method(AnyClass x) and manipulated. 
* BUT in java objects can not be referenced. The copy of the objects and value are created to execute the methods.
* This means that we can not use the methods the change objects directly but we can change their state.
* It means "object references are passed by value".

# Basically
- A method cannot modify a parameter of a primitive type (that is, numbers or boolean values).
- A method can change the state of an object parameter.
- A method cannot make an object parameter refer to a new object
