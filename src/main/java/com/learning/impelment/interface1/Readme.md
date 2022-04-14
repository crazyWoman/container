We know that Java doesn’t allow us to extend multiple classes because 
it will result in the “Diamond Problem” where compiler can’t decide which superclass method to use. 
With the default methods, the diamond problem would arise for interfaces too.
Because if a class is implementing both Interface1 and Interface2 and doesn’t implement the common default method,
compiler can’t decide which one to chose.

Java interface static method is similar to default method except that we can’t override them in the implementation classes.
This feature helps us in avoiding undesired results incase of poor implementation in implementation classes