** An Abstract class can't be intantiated. I can contain both abstract and non-abstract properties and functions

** Any class that contains an abstract property or functions must be declared abstract

** A class that is not abstract is called concrete

** You implement abstract properties and functions by overriding them

** Abstract properties and functions must be overridden in any concrete subclass

** An interface lets you define common behavior(functions) outside a superclass hierarchy so that independent classes can still benefit from polymorphism

** Interfaces can have abstract or non-abstract functions

** A class can implement multiple interfaces

** If a subclass inherits from a superclass(or an interface) named A, you can use 
super<A>.myFunction 
to call the implementation defined in A