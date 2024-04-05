My report of my IMAD project.
The main purpose of the project is to make an app that will input people’s ages and match it to any historical figure’s ages, when they passed away. The first step of this whole project is to access the virtual machine and login. When it has logged in, we have to access Blue stacks, then enable the emulator by typing 5555. If it doesn’t connect by the first try. Retry it again until it connects. That’s what I did. When everything has connected, this is where we access the Android Studio. 

On Android Studio, we are given code that is already implemented by the app and the code that’s already on is called “Hello World”. When we select the design, it will show the “Hello World “on the template. We have to remove the “Hello World”. I picked two buttons to become my main and clear button.  I changed the text of both button. One was written Clear and the other button I wrote generate history. From there, I picked a TextView and placed It directly across the generate history button. I put an EditText in between the TextView and the generate history button. I changed the text name of the TextView into” Enter age”. To notify where they should type their ages. The TextText was the final piece needed as it was the part where the final result should appear. I changed all the buttons and texts ids. My generate button’s id is changed to MainBtn and the clear button id is changed to ClearBtn. My enter age TextViews id is changed to EnterText, then I change the EditText’s id into NumberText and final TextView to change is the one where the result will show. I changed its id into FinalTextView. When done changing the Id’s. I added constrains on all of buttons and views.then when I was done with that, I can start looking for my background. Just go to google or Microsoft, from there I searched a picture that has some history on it. When I have spotted the picture I would like to have, I just save it on a file so that it can be accessed on Android Studio. In Android studio, you’ll find the picture on layout or can find it on drawable. The picture can be inserted by coding it in. After that, we have finished everything regarding with Activity Main.

 Now we need to select the Main Activity so that we can declare our buttons and etc. The first action I did was to remove excess information up to a certain point. The way I declare my buttons and views, as I have mentioned about the change of id, that’s the important part. I wrote down the ids of all my buttons and views.  Then I write findViewById. After that I say if the id was a button or a view. When I have written all that, the last and important part is the “R.id”. right next to it, we re-write all the id’s all over again at the end of the line. Then, I had to declare my two main buttons by add setOnClickListener. So, I write my ClearBtn id, then I add setOnClickListener so the clear button actually works. I do the same thing to my MainBtn. I still need to make my results to show up on the FinalTextView. I added code that will declare my famous dead people. So, I used “HistoricalFigures” as a string as all my people in history are labelled under the “historicalFigure” string. So every time I add an age, one of my historical figures must pop up. Now I nneed to add text on my FinalTextView. I used the “if” to make sure my text will be the show up if valid age is typed. I used “else” to tell the learner if they put an age that’s not in the coding, it will say “There is no historical figure in our records who was this age”. If they type anything that’s not a number, the text will say, “please enter valid age”. From there, I went to add my historical figures. I had 10 historical figures implemented and these are the ages they passed away at:
95 is Nelson Mandela,
39 is Martin Luther King Jr,
82 is Pele, 
20 is Pop Smoke,
50 is Michael Jackson,
76 is Albert Einstein,
51 is Napoleon,
74 is Ronald Dahl,
52 is William Shakespeare,
96 is Elizabeth the ||,
When I finished adding my historical figures, I checked to see if my app will run. I chose a device, debugged it, then I ran my app and my app runs perfectly.

Now I need to connect my app to Github. The way to do it, is to press the option VCS on the menu on top. Then select connect to Github repository. From there, Github shows an area where to comment. I comment for help if doesn’t run properly. The Github is used to help us keep track of any changes made of our coding, add projects together and also to manage different codebase. Github can be used to also check if the app will function seamlessly 

The whole purpose of the app, is that the learners can use it to find out at what ages did these historical figures passed away at. If a learner wants to know who passed away at the age of 96. They type the 96 and the historical figure will show up as Nelson Mandela. Not only Nelson Mandela will show, even the king of pop, Michael Jackson will appear, if the correct age is written. This can help learners about history. There are invalid ages added in the app. When the learner puts in an age that the app has no information of, the app will say that there is no historical figure with that age here. If a learner doesn’t type out actual numbers for the age, the app will say to the learner to put in a valid age.  My background design fits perfectly with the topic of this project. My background shows a lot of history. The problems I encountered is that when I have errors, it’s possible to hover over the error and it gives options of fixing it. Their options aren’t always correct. it makes the coding worse or makes more errors.

Reference:
https://www.bluestacks.com/
https://developer.android.com/guide/topics/ui/declaring-layout#java
https://guides.github.com/
https://www.youtube.com/watch?v=qkCDVt7b1tU
https://www.youtube.com/watch?v=0fKg7e37bQE

 




 






 
