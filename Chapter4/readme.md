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
    
# Class Design Hints
1. Always keep data private.
2. Always initialize data.
3. Don’t use too many basic types in a class.
4. Not all fields need individual field accessors and mutator
5. Break up classes that have too many responsibilities.
6. Make the names of your classes and methods reflect their responsibilities.
