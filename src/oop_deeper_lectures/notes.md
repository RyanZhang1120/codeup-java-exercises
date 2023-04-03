Inheritance and Poly:

"is there a way for me to take one class and the properties/fields within - and use it in another class"

Extending > Inherits

inheritingSubClass (Subclass)(Childclass) extends (Super)(Parent)Class

Today's workshop:
The idea is. . we have a main "Company" class that will run our other classes

To make the company run. . we need employees

Employees come in many types - think Codeup

Kenny - instruction staff (type1)
Trevor - instruction staff (type1)
** real technical - there's different types of instructional staff (web development, data science, cloud academy)
Keri C. - operations manager (type2)
financing department (type3)
Jeanice F - student experience (type4)
Christian T - placement (type5)

Salesperson . . a salesperson needs to be inheriting my 'Employee' class < I can do that by EXTENDING FROM Employee TO Salesperson

We use a super() method inside the subclass constructor to CALL the parent constructor

Salesperson subclass - can access parent methods and parent fields (name + sayHello())

Maintainance person. . a type of employeee needs to inherit from the super class

doWork . . would be different employee to employee

We need our salespersons to do work in one way and our maint. people to do work in a second way < we define two doWork methods and call them to see the results. . .

Well, 'we live in a society' - these subclasses probably don't get paid the same. Let us set up the dailyPay field. . in their subclasses vs the Employee super class to show that

Now we have sayHello - our employees would 'sayHello' in different and unique ways, we can OVERRIDE (similar to overload) a parent's method by following overload rules in our sub

"How do I get the private field in my subclass methods?"

A: public getters will be your path (this.getField())

Question: "What if I don't want the method to be changable or field to be changbale"

A: Bring out out our friend FINAL to make it a const(ant)

What if. . we need to update dailyPay per type of subclass?

Polymorphism - what comes to mind when I say that? for me it is warcraft 2 and 3, a transformation of an enemy unit from one thing to a sheep was in warcraft

similarly here. . polymorphism lets us set up an Employee declaration (super) with a Salesperson initialization (sub)

The usefulness of this wouldn't hit us quite yet, but I hope the idea opens up a wealth of possibilities in your imagination! 