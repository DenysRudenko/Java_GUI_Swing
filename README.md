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





