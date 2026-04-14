## Title
BrainQuest: A JavaFX-Based Interactive Trivia & Study Management System

## Brief Description
An interactive desktop learning tool developed with JavaFX and SQLite.  The application features a dual-user system (Regular/Admin), enabling students to engage with multiple-choice quizzes and track progress via a dynamic leaderboard, while administrators manage the question bank and oversee user performance.

## Project Organization
1. src/main/java/trivia/: Contains Java logic (Controllers, DAOs, Database management).
2. src/main/resources/trivia/: Contains FXML UI files.
3. src/test/java/trivia/: Contains JUnit 5 unit tests.

## IDE Setup (IntelliJ)
1. **Right-click** on `src/main/java` and select **Mark Directory as -> Sources Root**.
2. **Right-click** on `src/main/resources` and select **Mark Directory as -> Resources Root**.
3. **Right-click** on `src/test/java` and select **Mark Directory as -> Test Sources Root**.
4. Ensure JDK 21 (or higher) and JavaFX 21 (or higher) are configured in the Project Structure.

## Environment Setup Guide (Manual Configuration)
Since this project is a Plain Java Project (not Gradle), everyone needs to manually link the libraries. Please follow these three steps to fix the red imports and execution errors:

1. Download JavaFX SDK
   - Download JavaFX SDK (version 21 or higher): https://gluonhq.com/products/javafx/
   - Unzip the file and remember the path to the lib folder.

2. Add JavaFX Libraries (Fix Red Imports)
   - Go to: File -> Project Structure -> Libraries.
   - Click the "+" icon -> Select Java.
   - Navigate to and select the lib folder inside your downloaded JavaFX SDK.
   - Click OK and apply it to the project module.
  
3. Fix JUnit 5 Errors (For Unit Testing)  
   If you see red imports in the test folder:
     
   Option A (recommended):
     - Go to File -> Project Structure -> Libraries
     - Click + → From Maven
     - Add: org.junit.jupiter:junit-jupiter:5.10.0
  
   Option B (quick fix):
     - Press Alt + Enter (Windows) / Option + Enter (Mac)
     - Select “Add JUnit to classpath”
  
4. Set VM Options (Fix Runtime Errors)  
Even after the red lines are gone, Java needs to know where the JavaFX modules are located to run the app.
   - Go to: Run -> Edit Configurations...
   - Click Modify options -> Add VM options.
   - Paste the following command into the field (replace the path with your actual JavaFX lib path):
     - **--module-path `"/YOUR/PATH/TO/javafx-sdk/lib"` --add-modules javafx.controls,javafx.fxml**
     - PLEASE DO NOT remove the double quotes (" ") around your path.
  
5. Add SQLite JDBC Driver (Important)
   - Download SQLite JDBC driver: https://github.com/xerial/sqlite-jdbc
   - Then:
     - Go to Project Structure -> Libraries
     - Click + → Java
     - Add the .jar file


## Database
The project uses SQLite.  The database file trivia_game.db will be automatically generated upon first run via DatabaseManager.  
Currently implemented tables: USERS, QUESTIONS, SCORES.
