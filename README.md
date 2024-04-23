<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h2>DSA Module 08.5: Linked List ➤ Implement a paper-storing facility using a Stack📝</h2>
<img src="dunder.png" style="width:810px;height:180px;">
<h1></h1>
<p><b>Instructions:</b></p>
<p>You work at Dunder Mifflin, a small but spunky paper company.  The warehouse manager, Darryl is in charge of storing excess boxes of paper in a backroom of the warehouse.  Each box is exactly 2 feet wide, 2 feet long, and 6 feet high.  Due to these dimensions, Darryl decides to store each box so that the minimum floor footprintLinks to an external site. is used.  He figures that, with a backroom size of 20 feet by 20 feet - along with 8 foot high ceilings - he should be able to comfortably store all 100 of his boxes until they are needed.  The only thing he needs now is an automated box mover.  This box mover will be responsible for taking each box of paper off the loading dock, and placing it somewhere in the storage room.  The mover will remember where each box was placed, and use that information to successfully remove all the boxes when they are needed.</p>
<p>The box mover order is handled by Dwight.  He orders the mover, and has it delivered to the warehouse.  Darryl sets up the mover, has his boxes on the loading dock, turns the mover on, and presses the start button.  And the mover...  DOES NOTHING!  Turns out that Dwight forgot to order the program that runs the machine!  This is where you come in.</p>
<p>Darryl asks you to write a program that will assign each box to a storage position in the back room.  But he wants the boxes to be assigned to a storage position in a very specific way.  They can not be chosen at random; they can not be assigned sequentially.  They must be assigned in order of distance from the front door.  Here is a diagram of the storage spaces, numbered sequentially.</p>
<img src="warehouse.png" style="width:500px;height:500px;">
<p><p>The front door is a 4 foot opening, indicated with a thick red line.  Your box storage program must assign each box - which you will receive in order from 1 to 100 - to a storage space, in order of furthest distance from the front door.  Once all the boxes are stored, the program must have a way of outputting the order of which boxes will be removed, when the time to empty the backroom comes.  Therefore, as each box is assigned a space, the program must output "Box number (the box's number) has been assigned to space (the space number)".  When it comes time to unload, the program must output, "Unloading box from space (its space number)".  There is one output line for each of the 100 boxes for both loading and unloading.</p></p>
<p>Your program's user interface design is up to you.  You just must have a way to trigger the loading and the unloading.  The only proviso is that all box storage information must be kept on a stack.  In other words, when a box is placed, it's storage information goes on a stack.  When it is time to unload, boxes are taken off the stack one at a time.  Stack manipulation must be used in the placing and removal of boxes.</p>
<p>Write your program in eclipse.  To implement your stack, use the IStackLinkedList and StackLinkedList files from your previous assignment.   Name your main class DunderMifflin.  Keep in mind that your DunderMifflin class creates an instance of a StackLinkedList object, and uses it to store your box data.</p>

</body>
</html>

