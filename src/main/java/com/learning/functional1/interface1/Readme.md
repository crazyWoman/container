An interface with exactly one abstract method is called Functional Interface.

A functional interface can have any number of default methods.

@FunctionalInterface annotation is added so that we can mark an interface as functional interface.

Runnable, ActionListener, Comparable are some of the examples of functional interfaces.

Functional Interface is additionally recognized as Single Abstract Method Interfaces. 
In short, they are also known as SAM interfaces

As described earlier, functional interfaces can contain only one abstract method.
However, they can include any quantity of default and static methods.

It is not mandatory to use it, but it’s best practice to use it with functional interfaces 
to avoid addition of extra methods accidentally.
If the interface is annotated with @FunctionalInterface annotation and we try to have more than one abstract method, 
it throws compiler error.
==========================================================================================

Java SE 8 included four main kinds of functional interfaces which can be applied in multiple situations. These are:

Consumer
Predicate
Function
Supplier

midst the previous four interfaces, the first three interfaces,i.e., Consumer, Predicate, and Function, likewise have additions that are provided beneath –

Consumer -> Bi-Consumer
Predicate -> Bi-Predicate
Function -> Bi-Function, Unary Operator, Binary Operator

=====================================================================================



interface Foo { boolean equals(Object obj); }
// Not functional because equals is already an implicit member (Object class)

interface Comparator<T> {
boolean equals(Object obj);
int compare(T o1, T o2);
}
// Functional because Comparator has only one abstract non-Object method

interface Foo {
int m();
Object clone();
}
// Not functional because method Object.clone is not public

interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<String> arg); }
interface Z extends X, Y {}
// Functional: two methods, but they have the same signature

interface X { Iterable m(Iterable<String> arg); }
interface Y { Iterable<String> m(Iterable arg); }
interface Z extends X, Y {}
// Functional: Y.m is a subsignature & return-type-substitutable

interface X { int m(Iterable<String> arg); }
interface Y { int m(Iterable<Integer> arg); }
interface Z extends X, Y {}
// Not functional: No method has a subsignature of all abstract methods

interface X { int m(Iterable<String> arg, Class c); }
interface Y { int m(Iterable arg, Class<?> c); }
interface Z extends X, Y {}
// Not functional: No method has a subsignature of all abstract methods

interface X { long m(); }
interface Y { int m(); }
interface Z extends X, Y {}
// Compiler error: no method is return type substitutable

interface Foo<T> { void m(T arg); }
interface Bar<T> { void m(T arg); }
interface FooBar<X, Y> extends Foo<X>, Bar<Y> {}
// Compiler error: different signatures, same erasu