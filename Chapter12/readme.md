# Generic Programming
- Generic programming helps to make more reusable methods and classes.
- while the only one method in a class can be generic, It is also possible to have the whole class with a generic type.
- < T > is the keyword of generic classes.
- T can extends from any other interfaces

# Summary
- There are no generics in vm, only ordinary classes and methods.
- All type paramters are replaced by their bounds
- Bridge methods are synthesized to preserve polymorphism
- Casts are inserted as necessary to preserve type safety.

# Restrictions
- Type parameters cannot be instantiated with primitive types
    * Class< double > is not possible but Class < Double >
- Arrays of paramerterized types are not legal
    - Class < Double >[ ] is not valid
    - If you need to collect parameterized type objects, simply use an ArrayList: ArrayList<Pair<String>> is safe and effective.
- It is not possible to instantiate type variables.
- Type variables are not vaild in static contexts of generic classes
- Generic types cannot be thrown.

#WildCards
- Basically used to loose the rules of Generic programming
- < ? extends ParentClass > means any class extends from ParentClass can be used in the given method or class.
- Supertype wildCards
- Wildcard Capture

Page 659

# Reflection API usage in Generics
You can use the reflection API to determine that
- The generic method has a type parameter called T;
- The type parameter has a subtype bound that is itself a generic type;
- The bounding type has a wildcard parameter;
- The wildcard parameter has a supertype bound; and
- The generic method has a generic array parameter.
