# Java_GUI_Swing

## Lab1

### Lab1Part1
Create a Java class called Lab1Part1. Extend this class from the JFrame class (remember
to import javax.swing). Make the frame 600 pixels wide and 300 pixels high. Carry out the
following operations on the JFrame you can go to the Oracle website or another web
source to find the correct method to use if needed:
https://docs.oracle.com/javase/10/docs/api/index.html?javax/swing/JFrame.html:

a) Set the location of the frame to 500, 500 on the screen (clue setLocation)
b) Make the frame so it is NOT resizable (clue setResizable)
c) Set the top of the frame to display your full name (clue: setTitle)
d) Create a variable called contentPane and assign it to the content pane of the
JFrame (clue getContentPane method)
e) Make sure the frame is set to visible (clue setVisible)
• Create class and ‘extends’ JFrame (4 points)
• Set location (3 points)
• Set Title to your full name (3 points)
• Set resizable (NOT resizable) (3 points)
• Set size and visibility of the JFrame (3 points)
• Set the variable contentPane to reference content pane of JFrame (4 points)

![alt text](/Lab1/images/lab1part1.png)

### Lab1Part2
Create a Java SWING JFrame (extends JFrame) class called Lab1Part2. Set the size of the
frame to whatever you wish (at least 100 x 100). Create a JPanel called labelHolderPanel.
Create THREE JLabels. Call the first JLabel labelNoImage and set the text in the label to
“Label with no image”. Call the second JLabel imageLabel and set the icon (clue: setIcon)
for the label to some small image of your choice (If the image is too big it will take up the
whole interface). Set the text of the second label to “Label with image”. Add a third label
with a picture of your choice (again not too big) and label what the picture shows by
setting the text. Call the third JLabel myImageChoiceLabel. Add ALL labels to the JPanel
called labelHolderPanel and add the panel to the content frame of the JFrame.

![alt text](/Lab1/images/lab1part2.png)

### Lab1Part3
Create a JFrame SWING class called Lab1Part3. One of the guiding principles to good GUI
design is familiarity, i.e., give the user what they are used to using (e.g., show images for
icons they expect). However, for the purposes of this lab we will deliberately break this
principle. Reinvent the icons used for “Save” and “Open”, “Delete” and “Undo”. Create a
panel called buttonPanel. Create FOUR JButtons and set an icon for each. Create a save
button that will have text “Save” and a new icon for save (you can be imaginative with the
icon but keep the icon small enough, so the button is not huge). Create an open button
with a new icon to represent “Open” and the text “Open” (again you can be imaginative
but keep it small). Create a delete button with a new icon to represent “Delete” with text
“Delete” (again you can be imaginative but keep it small). Create an undo button with a
new icon to represent “Undo” and text “Undo” (again you can be imaginative but keep it
small). Add ALL buttons to the panel and add the panel to the content pane of the frame.

![alt text](/Lab1/images/lab1part3.png)

### Lab1Part4
Create a JFrame SWING class called Lab1Part4. Make the frame large enough to hold
several components. Create a frame that either describes yourself or a pet dog/cat/animal
and include a picture with a label [Note: If you don’t have a pet or don’t want to describe
yourself then pick something else unique to yourself to construct the JFrame about, e.g.,
favourite car, pastime, possession, sport achievement etc.]. Carry out the following with
the JFrame:
a. Set the title of the frame to “About Me” or “About my Pet”
b. Create a JPanel called holderPanel to hold ALL components
c. Create a JTextField with your name or pet name in it
d. Create a JTextArea and add a small description of what is featured (you or your
pet etc.)
e. Create a JLabel with a picture of you or the pet etc. and set the text of the label
with a nice font to “This is me” or “This is my pet” etc.
f. Create a JButton with the text “Like” and a small thumbs up icon
g. ADD ALL OF THE COMPONENTS TO THE PANEL
h. Add the panel to the content pane of the JFrame

![alt text](/Lab1/images/lab1part4.png)

## Lab2

### Lab2Part1
Create a Java class called Lab2Part1. Make the class a JFrame and make it visible and set
the size to a medium size frame (you choose the exact dimensions). Add a panel to the
JFrame content pane so that it contains a club member details form made up of JLabels,
JTextFields and JPasswordFields (a form like when you are joining a club). Include
information like, first name, surname, city, age etc. to gather information about the joining
club member. Use JLabels to the left of the input field to indicate where the information
needs to be typed (in the field just next to it). Include a ‘Enter New Password’ field and
‘Verify New Password’ field in the form (note: this should use JPasswordField). All of the
components should be laid out neatly in a JPanel on the JFrame (hint: use an appropriate
layout manager set for the panel)

![alt text](/Lab1/images/lab2part1.png)


### Lab2Part2
Create a class called Lab2Part2. Create a JFrame that holds TWO JList’s. The first
JList allows the user to select from a list of all the provinces of Ireland (find out the
provinces somewhere if you don’t know them!) and the second JList allows the
user to select from a list of Ireland’s four biggest cities (find this info somewhere
also). Place the two JLists in the same JPanel on the top of the JFrame so that they
are side-by-side


![alt text](/Lab1/images/lab2part2.png)

### Lab2Part3
Create a class called Lab2Part3. Create a JFrame that has TWO JComboBox’s at
the top of the frame in a JPanel (or you can use more than one panel to hold the
ComboBoxes if you think you need more). Display the two JComboBox’s one on
top of the other at the top of the JFrame. The JComboBox’s must be filled with at
least five Strings each - but you choose what each ComboBox displays in the
dropdown menu (they could be two lists of favourite places or food or songs or
musicians or sports or anything else appropriate).
Create TWO JRadioButtons on the bottom of the JFrame (a second panel could be
needed for this). The buttons with state “Top Combo” or “Bottom Combo”. Make
it so that only ONE of the radio buttons can be selected at a time (hint: use a
ButtonGroup). Add a label above the radio buttons which states “Please select
which ComboBox you like the most from the two shown above”. Make the Font in
the label big and bold (you may choose how large the Font will be)


![alt text](/Lab1/images/lab2part3.png)

### Lab2Part4
Create a class called Lab2Part4. Create a JFrame that models the ATM machine
menu options using buttons (JButton) and labels (JLabel) only (panel(s) will be
needed also). The GUI should contain all of the usual menu options you see at your
ATM (minimum 6 menu options with a button to click; you should use labels to
help the user use the system properly, e.g., “Please select option” etc.). In this lab
section use a Layout manager to achieve the layout of the GUI. Use images and
change background colours in the GUI buttons\frame to the GUI to make it look
interesting\appealing (use the Oracle website to find out options for changes in
colour to panel backgrounds). Note: The objective this week is to try to make the
GUI look good but will not actually do anything yet (no balance returned etc.)!!

![alt text](/Lab1/images/lab2part4.png)

## Lab2

### Lab3Part1
a) Create a class called Lab3Part1a. Create a JFrame that contains a JLabel with
the text “My name is X” and a JButton with the text “Translate to Y” (where X
is your full name and Y is a language of your choice e.g., could become “Joe
Bloggs is aimn dom” in Irish). Both components should be in a JPanel.
Implement the action listener and corresponding event handler so that when
the button is pressed the text in the label changes stating in the chosen
language what your full name is.

![alt text](/Lab1/images/lab3part1a1.png)
![alt text](/Lab1/images/lab3part1a2.png)

b) Create a class called Lab3Part1b. Create a JFrame that contains a JButton with
the text “My Text Changes When You Push Me”. Add the button to a JPanel.
Implement the action listener and corresponding event handler so that when
the button is pressed the text in the button changes to “See, I Told You The Text
Would Change?”

![alt text](/Lab1/images//lab3part1b1.png)
![alt text](/Lab1/images//lab3part1b2.png)

### Lab3Part2
Create a Java program called Lab3Part2. Add a JList to the top of the JFrame that
lists three types of animals (or sports, or anything that you can represent with an
image: you can even mix and match things, e.g,. animals and sports). Add a JLabel
to the center of the JFrame that will display an image: initially you can set a
message in the JLabel that states “Images will appear here: please select from the
above list”. When the user selects an item from the JList make an image of that
item appear in the label. Add a JTextArea to the bottom of the JFrame that says
something about the image shown, e.g., if it’s an image of a Tiger the text area could
state: “This is a Sumatran Tiger – largest cat in the world”. Use panels to contain
the components.

![alt text](/Lab1/images/lab3part2.png)

### Lab3Part3
Create a JFrame class called Lab3Part3. Create a JFrame with TWO JComboBox’s
at the top of the JFrame. The first combo box will contain a list of colours. The
second combo box will contain a list of images to do with your life, e.g., it could be
sporting achievements, sports team, your favorite possessions, your family, your
pet, images of books you’ve read….anything that is appropriate but unique to you.
There should be at least five things you include in the second combo box, e.g., the
combo box could contain a list of: “Favourite Team”, “Dream Car”, “Dream home”,
“Dream Job”, “My home town”. Add a JLabel to the center of the frame (place the
label in a panel) that will display images when the combo box of favourite things
is selected, e.g., selecting “Dream Home” in the Combo Box of favourite things will
display an image of your “Dream Home” in the label. Add a second label to the
bottom of the JFrame and set it to show the text “This label changes colour based
on what you select”. Place this label in a panel. Make the label change colour to the
colour selected in the colour changing combo box (the background colour must
change NOT the text colour!!). (Note: You may have to use a method called
setOpaque(true) on the JLabel to get it to show the change of colour)

![alt text](/Lab1/images/lab3part3.png)

### Lab3Part4
Create a class called Lab3Part4. Create a JFrame to model a simple Mobile top-up
system. The GUI should provide a Top-up button, a Make-call button and a Send-
text button that will reduce or add to the balance of the phone (you can use your
own pricing system). At all times the balance should be visible on the screen using
a label and the balance should not be allowed go below zero. It is up to you to
design the layout of the GUI, marks will be awarded for the quality of the ‘look’ of
the GUI.

![alt text](/Lab1/images/lab3part4.png)

## Lab4
### Lab4Part1
Create a class called Lab4Part1. Create a JFrame that contains a JPanel with FOUR
check boxes in it. The check boxes will have their text set to the following: “Small
Font”, “Big Font”, “Very Big Font”, “Huge Font”. Make the four check boxes so that
only ONE may be selected at a time (Hint: ButtonGroup). Add the check box panel
to the top of the JFrame. Create and add a JLabel to the center region of the JFrame
that has the text “Change Font with CheckBoxes”. Make the GUI work so that the
size of the text in the label changes size based on which check box is selected
(Small, Big, Very Big, Huge). You may decide the exact size of each text font used.

![alt text](/Lab1/images/lab4part1.png)

### Lab4Part2
Create a Java program called Lab4Part2. Create a JFrame that has a JMenu called
‘Streaming Services’. Add at least five menu items with five different Streaming
services of your choice (e.g. Netflix, NowTV etc.). Add a label to the main frame
window. Implement listeners on the menu items so that when a particular
Streaming Service is clicked an image of the correct company logo is shown in the
label, e.g., select ‘Netflix’ and a picture of the Netflix logo appears

![alt text](/Lab1/images/lab4part2.png)

### Lab4Part3
Create a JFrame class called Lab4Part3. Create a JFrame with a JMenu called
‘News’ and a second JMenu called ‘Weather’. Modify the menus as described
below:
The News Menu: Add at least TWO menu items to the news menu with the
following headings ‘Local News’, ‘International News’. When the user clicks the
corresponding menu option make a CURRENT news related image appear in the
GUI and also include a scrollable text area to describe the news item (e.g. The
minimum wage was increased in budget 2024 – the news MUST be current). Add
a mnemonic and appropriate accelerator to each of the menu items so that the
menu options can be short-cut.
The Weather Menu: Add at least TWO menu items to the menu with the following
headings ‘Local Weather’, ‘International Weather’. When the user clicks the
corresponding menu option make a CURRENT weather related image appear in
the GUI and also include a scrollable text area to describe the weather event (e.g.
Storm Babet, Floods in Cork! – the weather information or event MUST be
current). Add a mnemonic and appropriate accelerator to each of the menu items
so that the menu options can be short-cut, i.e., a key combination can be used

![alt text](/Lab1/images/lab4part3.png)

### Lab4Part4
Create a class called Lab4Part4. Create a JFrame which modifies the ATM Machine
created in Lab2Part4 so that at least THREE of the functionalities listed in the ATM
work using listeners for the buttons AND include menus with shortcuts to carry
out the same functions (any 3 functions can be chosen, e.g., lodge, withdraw, show
balance). Use at least TWO accelerators and TWO mnemonics in the menu. You
will need to add some sort of output label to show the response to the button
pushes and menu selections. [Note: If you didn’t get to do Lab2Part4 then you can
do the whole thing from the start, or you can focus on the menus only and receive
marks for those]

![alt text](/Lab1/images/lab4part4.png)

## Lab5

### Lab5Part1
Create a class called Lab5Part1. Create a JFrame that contains TWO components.
The first components is a JProgressBar with a minimum value of 0 and a
maximum value of 100. The second component is a JSlider also with a minimum
value of 0 and a maximum value of 100. Layout out both components so that they
are both clearly visible on the JFrame. Add listeners and handlers needed to make
the JProgressBar mirror the value in the JSlider bar, i.e., if you move the slider bar
up and down between 0 and 100 the progress bar moves up and down between 0
and 100 to exactly mirror the movements of the slider.

![alt text](/Lab1/images/lab5part1.png)

### Lab5Part2
Create a class called Lab5Part2. Create a JFrame that conducts a small survey
using four panels in a card layout (3 question panels and one for results). On the
first three cards present three questions to the user which must have ONE
response only (use radio buttons or check boxes that are contained in a button
group), e.g., pick your favourite snack from the following Chocolate, Crisps,
Popcorn etc. The questions should be chosen by you (about whatever you chose).
The fourth card should show the results chosen from the current user (e.g. this
user likes Crisps etc.). For full marks use at least one well-defined method to
modularize the creation of the panels.

![alt text](/Lab1/images/lab5part2.png)

### Lab5Part3
Create a class called Lab5Part3. Create a JFrame that contains a JPanel with FOUR
JLabels stacked vertically or horizontally using a box layout (you may choose the
orientation but you must use box layout). Place a Border around each of the labels
and fill each label with a blank square\rectangular image (small enough to fit four
of them in to the interface).
Add a slider (JSlider) to the interface so that when the user slides left and right on
the slider a particular image of your choice is shown in the corresponding label,
i.e., if the slider is all the way left the image shows in the left and all the rest remain
blank (see the diagram below showing what the interface should show when the
slider has the value 2 and 3).

![alt text](/Lab1/images/lab5part3.png)

### Lab5Part4
Create a Java program called Lab5Part4. Create a JFrame that displays
information about your favourite holiday destination in a JPanel and your
favourite pastime in a second JPanel. You may choose to display two other pieces
of information in both panels (cards) but it needs to be unique to you!, e.g., pets,
hobbies, cars etc. You will use CardLayout to switch between these panels by
using a JButton AND a JMenuitem (place the menu item to switch panels on a menu
called ‘View’ at the top of the JFrame, the button can be placed anywhere that
works on the frame without interfering with the display of the panels (cards)).
Add an accelerator to the menu so that clicking CTRL-S will switch between the
panels (cards).
Each of the panels should have a clearly defined title (with a nice Font) and an area
to show an image of the destination/pastime and a small description in a
JTextArea. The exact layout of the GUI is up to you but it must be well laid out in
each panel. Add both panels to the card layout for switching displays.
If you use modularization to create the two panels (cards) it will be rewarded in
this marking scheme (you can modularize the creation of the panels using
methods or classes).

![alt text](/Lab1/images//lab5part4.png)

## Lab6

### Lab6Part1
Create a class called Lab6Part1. Make this class a JFrame that is large (the exact
size is up to you). Add a menu to the JFrame called ‘Games Menu’ that contains two
menu items called ‘Launch Chess Game’ and ‘Launch Snakes and Ladders’. When
the user clicks the ‘Launch Chess Game’ menu item show a JInternalFrame within
the JFrame with a JLabel showing a picture of a chess board (it doesn’t have to
work as a game just show the image). When the user clicks the ‘Launch Snakes and
Ladders’ menu item make an internal frame appear in the JFrame with a label in it
showing an image of the game of Snakes and Ladders. You may choose to show
different board games if you like: none of them have to work as games but please
have the menu’s named correctly to reflect the game you are launching. Each game
image must be launched in a label within an internal frame inside of the JFrame.
Modularization in the form of methods or classes will be rewarded.

![alt text](/Lab1/images/lab6part1.png)

### Lab6Part2
Create a class called Lab6Part2. Make this class a JFrame. Create a panel inside
the JFrame to hold TWO bordered and stacked JLabels (they can be stacked
horizontally or vertically). Set the first JLabel with the text ‘Choose an image here’
and the second label should have the text ‘Choose a colour here’. Implement the
frame to respond to mouse movements so that when the user’s mouse enters
the first label a JFileChooser pops up and allows the user to choose and display
an image of their choice in the label. Make the image chosen appear in the label.
When the user exits the first label make the image disappear. When the user
mouse enters the second label make a JColorChooser appear and allow the user
to pick a colour to set the background of the label, i.e., if the user picks green from
the JColorChooser pallet then the background of the label background changes to
green (Note: You may have to use setOpaque on labels and you may need to add
additional panels and layouts to make this work and you could have a small test-
image in a specific folder to use when testing the file chooser).

![alt text](/Lab1/images/lab6part2.png)

### Lab6Part3
Create a class called Lab6Part3. Create a JFrame that mimics a space adventure
game using only dialogs (you can choose a different theme other than space but
you will have to come up with a way to launch the game to get it started!). The user
will be presented with portals (represented as dialog options) to enter at the
beginning of the game (use your imagination here but you must use Dialogs).
Once a user chooses a portal present at least ONE other decision for them to make
using dialogs before the games ends (e.g. You are presented with a cup of liquid to
drink by an alien, do you drink it? Yes No etc.; does drinking the cup kill you or
make you stronger? etc.). The options MUST be controlled by Dialogs. The end of
game status should be shown using a dialog. Use a least ONE custom image added
to a dialog in the dialog sequence (this means you override the default image in
the option dialog by passing a custom image!!).

![alt text](/Lab1/images/lab6part3.png)

### Lab6Part4
Create a Java program called Lab6Part4. Create a JFrame that will be used to draw
2D graphics of a snowman. I accept the drawing may be a little “rough” but try
and put some shapes together that at least resemble a snowman! Split up the
drawing using methods, e.g., drawHead(Graphics g), drawLimbs(Graphics g),
drawBody(Graphics g) – (Note: you will need to pass the graphics context as a
parameters to the methods when drawing with your own custom methods.)

![alt text](/Lab1/images/lab6part4.png)

## Exam
### Question1
Create a JFrame GUI in Java SWING that mimics a food ordering GUI capable of placing an order of drinks, main meals and desserts. The application will maintain a list of food items ordered in separate bordered sections of the GUI, e.g., drinks will be separated from the list of main meals ordered. Select the items from pre-defined lists or dropdown menus. The GUI will maintain a total cost of the order being placed (you can use arbitrary prices). Place an image of each item ordered on the lists, e.g., order coke and a coke image will appear in the drinks ordered list on the GUI. Include AT LEAST THREE types of order (e.g., drinks, main meal, desserts) and AT LEAST THREE ITEMS in each category (e.g., drinks = coke, water, sprite). Include a title section in the GUI to name the application (with a large font), e.g., “Must-Eat Food Ordering”

![alt text](/Lab1/images/exam.png)

### Question2
Create a JFrame GUI in Java SWING that contains a menu with listeners added. The menu will have TWO menu items added that will display a message dialog and an input dialog based on which menu item is selected. You may display whatever information you wish on the dialogs as long as they are the correct dialog types.

![alt text](/Lab1/images/exam2.png)















