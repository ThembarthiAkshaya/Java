// This program imports a class from the twoDFigure package and implements its functionalities.
package implementation;

import twoDFigure.Square; // Importing the Square class from the twoDFigure package

public class SquareOperation {

    public static void main(String[] args) {
        // Creating an instance of the Square class
        Square square = new Square();
        
        // Displaying the side length of the square
        square.displayData();
        
        // Calculating and displaying the perimeter of the square
        square.calculatePerimeter();
        
        // Calculating and displaying the area of the square
        square.calculateArea();
    }
}
