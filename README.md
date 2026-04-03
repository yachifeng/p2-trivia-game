Project 02: Part 00 The Team SOLO

As with any great undertaking, the first step is assembling the team. For this project you will work with 2–3 of your classmates to form a team of 3 or 4. Each student will be responsible for submitting work to each assignment; you will work together to build something great.

Goal
The goal of this assignment is to form your project team and tell me who they are. You will set up a shared GitHub repository and sketch out an initial project concept. This assignment is intended to be easy points — show up with a team and a plan.

What We Will Do
Form a team of 3 or 4 students.
ONE student creates a public GitHub repository for the project.
The repository must be set to Public.
All other teammates must be added as collaboratorsLinks to an external site..
As a team, discuss what type of project you will create based on the Project 2 requirements.
Prepare a PDF with all required information (see What You Submit below).
What You Submit
Each student submits a PDF to Canvas. All teammates may submit the same PDF.

The PDF must include:

The full name and GitHub username of every team member
A link to your team's shared GitHub repository
A screenshot of the repository collaborators page showing all team members added
If you are the repository owner, your GitHub username should be visible in the browser URL bar
A brief description of your initial project idea, based on the Project 2 requirements
How it will be graded
See included rubric

 

Zero-score policy: An empty submission or a PDF that does not contain the required information constitutes a non-submission and will receive a score of 0 for the entire assignment, regardless of other criteria.
Learning Outcomes
Comprehend and discuss different software development process models by planning a collaborative software project (CLO 1.4)
Apply object-oriented design thinking to Android development by forming a team and proposing an app concept (CLO 3.2)




Project 02: Part 01 The Plan

Part 1: The Plan
Create a plan for your application. Use the example projects listed at the bottom of this document for inspiration, or propose your own. All projects must meet the requirements in this document.

GitHub Repository
Requirement: A public GitHub repository with all teammates as contributors
One team member creates a public GitHub repository and invites the rest of the team.

 

Steps:

Create a new JavaFX project (IntelliJ IDEA with Gradle or Maven)
Create, commit, and push a .gitignore file (use gitignore.ioLinks to an external site. or the JetBrains plugin)
Invite teammates as contributors
Teammates clone the repo
Branch Naming Convention
All branches must follow this format: yourname/feature-name

 

Examples: alice/login-scene, bob/scene-factory, carol/user-dao

 

This convention is required because it allows individual contributions to be verified automatically. Branches that do not follow this pattern will not count toward your GitHub process requirement.

Pull Requests
All merges into main must go through a Pull Request. Each PR must:

 

Reference the GitHub Issue it resolves (use "Closes #N" in the description)
Be reviewed by at least one teammate before merging
Design Document
Requirement: A PDF of the initial design document
Each team submits one design document. The document must include:

 

What is the application? Title and short description.
6–8 use cases (2 per teammate). Each use case must include a main flow and at least one alternate flow.
Entity Relationship Diagram (ERD) showing all database tables and relationships
A testing plan
Mockups of all major scenes. Acceptable formats: IntelliJ FXML editor screenshots, Draw.io, tablet sketch, paper sketch.
A link to the GitHub repository
 

The document will be updated throughout the semester. The final submission must reflect the completed project and have all completed rubric items highlighted.

Menu Signup: Project Spreadsheet
Requirement: Each student claims their items in the Project Spreadsheet before development begins
A template spreadsheet is provided in the Project 2 module. Before coding, each student fills in the items they plan to claim. 

Use the Status column to track progress: planned → in progress → complete
Link every completed item to its Issue, Branch, and PR
One student is the spreadsheet coordinator (worth points; see the menu)
The completed spreadsheet is submitted as part of the final deliverable
 

Items can be re-claimed if a student drops the course or a teammate is not completing their work. Contact Dr. C if this happens.

GitHub Issues
Requirement: At least 3 issues per student, assigned and completed
Create GitHub Issues before you start work on each item. Issues must be:

 

Assigned to the student doing the work
Written as specific, actionable tasks (see SMART criteria below)
Linked to the Pull Request that resolves them
 

Good example:

 

Create the UserDao interface and User entity with insert, update, delete, and query-by-username methods. Add JUnit tests for insert, update, and delete using an in-memory database. Due end of Sprint 1.

 

Bad example:

 

Make a database table.
