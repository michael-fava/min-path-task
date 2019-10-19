# Mininal Path Task

Contact Email: mfava85@gmail.com

## Executing the project

Command to exectue the project below:

java -jar min-path-task-1.0-SNAPSHOT.jar


## Structure

Project is split in 3 main parts:

- Main class to invoke the project
- ValueService (used to either read values from console or generat random values)
- CalculationService (implements the logic to determine minimal path and its value)


## Development Explanation
________________________________________________________________________________________________________________________________________

### Value Service

Primarily the data triangle is stored in a 2-dimensional array. This is to be used for storage of the value triangle and subsequently for calculation of the minimal value path.

2 methods are available for this - 1 allows for user-input of the data triangle. Starting from the first row the user is expected to maintain the shape of the triangle by providing values per row according to which row they are on ie, row 5 requires 5 values and so forth. Each value must be seperated from the next by means of a single space character.

'EOF' signals the application that no more entries will be provided.


Another method (used in testing) generates a 2-dimensional array of values on a random basis and is supplied a count of required rows when invoked.

### Calculation Service

The Calculation service consists of one method findMinPath which takes a 2-dimesional array as input assuming this is a value triangle. The process starts by taking the lowermost row of the triangle (i.e.) the row which holds the bottom ends to all paths and these are translated to ValuePath objects.

'ValuePath' Object

A value path object contains an integer value of the total value of all elements in that instance at the moment as well as a list of all the element that at the particular moment make up the total value.

Following the completion of the translation of the bottom row of the triangle to valuepath(all with 1 node each) an ulterior step commences. This is made up of 2 nested loops. The outer most loop starts iteration backwards from the row before the last (first untouched row from the bottom) and works its way to the topmost row of the value triangle.

The nested for loop in the meantime, iterates the row in focus of the outer loop and carries out a comparison between  the two neighbouring values which are reachable from the selected value-path below. the lower value node, is added to the reference value-path and the nodevalue summed to the total of the reference path.

At the end of the two loops only one path will be competed and this will be the first ValuePath in the original array created from the bottom row of the value triangle.

Finally this value-path is used to output the total value and the path selected by the application as the minimal value path.


