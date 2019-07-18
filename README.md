# model-1_school-day


A person has a firstName, lastName & email address.

**Teachers & Learners**


A teacher teach 1-more subjects. They can only teach subjects they are qualified for.

A Learner needs to be registered for 3 subjects before that can attend any lesson.

**Lessons & Subjects**


Lessons are for a given Subject. Learners can only attend Lessons for Subjects they are registered for.

A Lesson is taught by a teacher - attended by learners. If there are less than 5 learners attending a Lesson is cancelled. A teacher earn 5 tokens for each lesson teached. A Lesson has a teacher, time and subject. A learner can only attend one lesson at a time.

**Notes & Tokens**


Each time a learner attend a Lesson they are given notes. If a learner didn't attended a Lesson the can ask other learners who attended a Lesson for the notes.

Attending a Lesson earn a learner 3 tokens. Asking for notes costs 2 tokens. You can only ask for notes if you have enough tokens.

Asking for notes of Subjects you are not registered for costs 5 tokens.

Learners should keep track of Notes they have and if they earned it via lesson attendance or bought it.

At the end of each day a Learners should be able to see what notes and how much tokens they have.

**Cafeteria**


Tokens can be used at the Cafeteria to Buy Breakfast (4 tokens), Lunch (6 tokens) or an afternoon snack (3 tokens). A drink costs 2 tokens. The Cafeteria manager wants a total of daily tokens received. And also which Person bought what. Teacher gets a 25% discount in the cafeteria once they taught 5 lessons.

The Principal needs to know how many Lessons for each subject is taught on a day and how many Lessons have been cancelled for the day.

**Instructions**


Create all the Classes needed for this scenario. Wire them all together to model 1 school day.

- Use the the Java Collection Framework where needed.
- Focus on 1 school day only.
- Write JUnit tests. Use TDD! Write your tests first.
- No persistence is required.
