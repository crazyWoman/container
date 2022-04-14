We know that Java doesn’t allow us to extend multiple classes because 
it will result in the “Diamond Problem” where compiler can’t decide which superclass method to use. 
With the default methods, the diamond problem would arise for interfaces too.
Because if a class is implementing both Interface1 and Interface2 and doesn’t implement the common default method, compiler can’t decide which one to chose.