Creation and declaration of array in java.

Unlike primitive data types, any array has to be created using the new operator. A reference to an array can be declared without any elements and can be assigned to null. A reference can be further modified as well.
To create an array, you first must create an array variable of the desired type. The general form of a one-dimensional array declaration is
type var-name[] = new type[desired-length];

- type tells the element type e.g., int, float
- var-name gives the variable name e.g., student_marks, months
- new allocates memory required for the array with the size mentioned at desired-length e.g., 5, 12

The following code creates an array of student marks for a class with 25 students. And all elements in the array are initialized to zero automatically.
int student_marks[] = new int[25];
 - Arrays are allocated at run-time, hence we can use a variable to set their dimension.

Length of the array can be obtained using "length" 
 - to get array length: arr.length;

 