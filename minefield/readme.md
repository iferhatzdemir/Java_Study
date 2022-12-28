# Minefield Game
## This program is a text version of a simple minefield game.
--- 

### Details
Game Rules :
The game is text-based.
* It should be played over two-dimensional arrays and designed in MineSweeper class.
* The user must specify the matrix size, i.e. the number of rows and columns.
* A quarter of the number of elements of the array (elementNumber / 4) should be placed randomly. For example, if the array is 4x3 in size, the number of elements should be calculated with the formula (rowNumber * columnNumber) and the size should be 12. In this case the number of mines should be 12 / 4 = 3 (hint: you can create a second array to hold the positions of these mines).
* The user must select a point on the matrix. Enter row and column values for point selection.
* Check if the selected point is within the boundaries of the array and if the condition is not met, request the point again.
*If there is a mine at the point entered by the user, the game is lost.

* If there are no mines, look at all locations touching the point (right, left, up, down, upper left diagonal, upper right diagonal, lower right diagonal, lower left diagonal) and write the sum of the number of mines around the point. If there are no mines touching the point, the value "0" should be assigned.
* The user should win the game if he/she can select all the points without stepping on any mines.
---
# Ouput
```agsl
Welcome to Minesweeper
Please enter the dimensions you want to play with:
Rows:5
Colums:5
-------------------------
 0	 0	 0	 0	 0	 
 0	 0	 0	-1	 0	 
 0	-1	 0	 0	 0	 
-1	-1	 0	 0	 0	 
-1	-1	 0	 0	 0	 
-------------------------
Game has started!
-------------------------
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
-------------------------
Rows:0
Colums:0
-------------------------
 2	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
-------------------------
Rows:0
Colums:1
-------------------------
 2	 3	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
-------------------------
Rows:4
Colums:4
-------------------------
 2	 3	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 2	 
-------------------------
Rows:3
Colums:3
-------------------------
 2	 3	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 0	 4	 0	 
 0	 0	 0	 0	 2	 
-------------------------
Rows:2
Colums:2
-------------------------
 2	 3	 0	 0	 0	 
 0	 0	 0	 0	 0	 
 0	 0	 3	 0	 0	 
 0	 0	 0	 4	 0	 
 0	 0	 0	 0	 2	 
-------------------------
Rows:1
Colums:1
-------------------------
 2	 3	 0	 0	 0	 
 0	 3	 0	 0	 0	 
 0	 0	 3	 0	 0	 
 0	 0	 0	 4	 0	 
 0	 0	 0	 0	 2	 
-------------------------
Rows:0
Colums:4
-------------------------
 2	 3	 0	 0	 2	 
 0	 3	 0	 0	 0	 
 0	 0	 3	 0	 0	 
 0	 0	 0	 4	 0	 
 0	 0	 0	 0	 2	 
-------------------------
Rows:1
Colums:3
Game Over!
-------------------------
 0	 0	 0	 0	 0	 
 0	 0	 0	-1	 0	 
 0	-1	 0	 0	 0	 
-1	-1	 0	 0	 0	 
-1	-1	 0	 0	 0	 
-------------------------
```


---


## Installation
Clone the project.
https://github.com/iferhatzdemir/Java_Study/tree/main/minefiled/src

---

## Usage
After cloning the project, open it with the ide you used.

---

## Requirements
* JDK (version 19 is recommended)

---

## Author
**İbrahim Ferhat Özdemir**

* GitHub: [İbrahim Ferhat Özdemir](https://github.com/iferhatzdemir)
* LinkedIn: [İbrahim Ferhat Özdemir](https://www.linkedin.com/in/ibrahim-ferhat-%C3%B6zdemir-4304b4139/
  )
---

## Contributing
Contributions, issues, and feature requests are welcome.

---

## License

[MIT](https://choosealicense.com/licenses/mit/)

---

## Show Your Suport
Give me a &#11088; if you like the project.

---

## Acknowledgments
* This repo is created for my own projects on www.patika.dev