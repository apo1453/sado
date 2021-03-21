# The Snake

A simple snake game with score log and speed selector in java. Using Threads and Java Swing to display the game.
The aim of this project is to improve my java GUI skills and learn other things.

- Name and Surname: Osman Yasir Ozyilmaz
- Email: Osmanyasir.ozyilmaz@iaau.edu.kg
- Computer Science Department of Alatoo International University.
- Final project for Java class.

## How it looks:

<img src="https://camo.githubusercontent.com/cb36b0a4fb7422ca7fd7cef38818ba1518c798e8/68747470733a2f2f692e696d6775722e636f6d2f42746335494f722e706e67" width="400">     <img src="https://camo.githubusercontent.com/0c34bf81edc4488f6923df3fb382d4f19bf2af7d/68747470733a2f2f692e696d6775722e636f6d2f525678694761642e706e67" width="400">

***I did not create this game. I only added some functions like speed selection.***

## Description of the Code;

I have added a new class called **SpeedFrame** which enables the user to select the speed of the snake; furthermore, it is extending **JFrame** and implementing **ActionListener**. JFrame is extended in order to use its funtions such as, JButton, Jlabel, setsize and etc. SpeedFrame class is creating a new window which has the size of *300×300* and it is displayed right before the game starts. The frame of the window includes: labels, a button and a slider. User will be able to select the speed of the snake by sliding the slider and by the help of the interface (ActionListener) the game's speed will be as the user wants.
The method **actionPerformed()** will get in action when the user clicks the button resulting in: setting the speed as wanted.

I have also added a method called **appendToLog()** to the class **ThreadsController**. The method's function is to write the scores achieved to a new file. Two error checkings are maintained;

``` Java
	 //Appends to log file
	 private void appendToLog(){
		 String filename = "scores.txt";
		 try {
		 	String line = "Score: "+ score +"\n";
			 Files.write(Paths.get(".\\scores.txt"), line.getBytes(), StandardOpenOption.APPEND);
		 }catch (IOException e) {
			 System.out.println("No file named "+filename);
		 }
		 catch (Exception e){
			 System.out.println("Error while creating the score log file");
		 }
	 }
```
> First exception handling is for catching an error if a file is not found and then to print out *("No file named "+filename)*.

> Second exception handling is for catching an error if a file couldn't be created, also the output will be: *("Error while creating the score log file")*.