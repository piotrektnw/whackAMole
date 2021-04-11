# WhackAMole v.1.0 - command line game

This project has been created as an exercise from Java classes.

## Description

This program is developed version of a simple 'WhackAMole' game, where users' task is to catch all moles hidden in a given grid. 
In version 1.0 user has possiblity to: 
* choose difficulty level of a game:
  * number of moles in the grid is set accordingly to the difficulty level,
  * number of attemtps is set accordingly to the difficulty level,
* choose size of a grid (fixed side length range (accepted side length is: 3 - 6 fields) in v. 1.0)

After users' deicison making, program populates grid on random positions (program is secured from populating the same field twice)

During the game user is informed about: 
* number of attempts left,
* number of moles left,
* current score,
* current grid look (hidden undiscovered moles).

## Getting Started

Game is available on command line level.  

## How to play/Executing the program

During the game user is asked to place a 'whack' on the grid: 
* e.g. 'Place row whack (horizontally in range 1-4):' 
* e.g. 'Place column whack (vertically in range 1-4):' (when side of a grid is 4 fields long)
* if user hits the mole, program does following: 
  * add 1 point to the score, 
  * subtract 1 mole, 
  * display information about score, moles left and attempts left,
  * print actual grid
 * if user misses, program does following: 
  * subtract 1 attempt, 
  * display all needed information
 * if user hits the same field, program does following: 
  * inform user about hit in the same field
  * asks to place new whack
  
 When the game is over: 
* when user is out of attempts,
* if user achieves the score which is equal to number of moles in the set


## Authors

Author: Piotr Panek
Contact me: p.panek [ at ] o2.pl


## Version History

* 0.1
    * Initial Release

## License

This project is license free.


