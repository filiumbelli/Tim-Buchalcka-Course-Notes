# Referencing Values and Composition
- It is pretty common to use objects as references to mutate the value by using functions or methods. This is called referencing objects.
- I.e AnyClass anyClass is used in method(AnyClass x) and manipulated. 
* BUT in java objects can not be referenced. The copy of the objects and value are created to execute the methods.
* This means that we can not use the methods to change the objects directly but we can change their states.
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
# Finalizing and Polymorphism
- Polymorphism helps to instantiate methods from each others.
- final keyword does not let the change the object/method/constant coming after that.
- final is usefull when a method in a class reaches the last form.
- it is also good to use final whenever it is required to prevent semantical changes.
- Calendar.getTime will always have the same meaning because of it is existential purposes
- (obj instanceof an obj) check the instance of the object
- dynamic binding helps polymorphism to work correctly in different layers.

#  Inheritance and Design
- Place common operations and fields in the superclass.
- Don't use protected fields.
- Use is-a relationship to model inheritance.
- Don't use inheritance unless all of the inherited methods make sense.
- Don't change the expected behavior when override a method.
- Use polymoprhism, not type information.
    * Do action1 and action2 represent a common concept? If so, make the concept a method of a
  common superclass or interface of both types
- Don't overuse reflection.

