# MAD-Project-Final
Syed Zayaan Nashrid(011161127). United International University(UIU) Spring 2022 Mobile Application and Development Final Project

As the title says, this is a repository for my Mobile Application Development class. It's a simple text adventure game made using fragments, textviews, and buttons.

Developed by: Zayaan Nashird(011161127)

Language: Java, XML

Note: In case the commits do not work because of an error on my part, I've provided a link to my google drive with the latest committed version of the project below:

Drive link: https://drive.google.com/drive/folders/1Ezp6n9BBn2364vwWoQUlLpXjbeaU30O4?usp=sharing

# Start Screen
This is the start screen. It's a simple activity that has three buttons. The play button that starts the main game, the score button that takes the player to a screen showing all the scores(as of yet incomplete), and an exit button. The exit button is simple, so I didn't waste time implementing it.

![image](https://user-images.githubusercontent.com/96722789/171670079-a1d04fc2-bde4-4d84-9cac-86f736800956.png)

# GameScreen
This is, as it states, the main game screen. It's one activity with one fragmentcontainerview. The fragments change as the user clicks button, bringing changes when necessary. As the player finds more items, the score increases and is kept track of internally by the game. The score is not shown to the player as a means of having a surprise. Unfortunately, it's not as fully developed as it could be due to time restraints. Originally, the plan was to use a bottom navigation bar to swap between two fragments.

One fragment was supposed to show the screen shown below and one button was intended to show the items(keys) the player was carrying at the time. As I said before, it remains unimplemented.

![image](https://user-images.githubusercontent.com/96722789/171670829-b28941b8-daac-45e4-add2-f35ebf1a8d3f.png)

# Score Screen(not fully implemented)

This screen is an activity that shows all the game scores. The scores are stored in a database("score.db"). There is a RecyclerView here and a button. The button's purpose is to send the user back to the main screen. Unfortunately, due to time constraints, the screen is unfinished.

![image](https://user-images.githubusercontent.com/96722789/171671649-1ddb3b50-5a41-4c06-a35f-35271e94e2ab.png)

# Result screen

This screen shows the score the player has accumulated throughout the game and a space for entering their names. Once the submit button is clicked, the name and score are written into the database and the activity is changed to that of the Score screen.

![image](https://user-images.githubusercontent.com/96722789/171672449-e8424a33-4fcd-4a47-a82e-37889813b70e.png)



