# TechExpo Management System  

## Overview  
The **TechExpo Management System** is a Java-based GUI application developed as part of the *Programming Fundamentals (CM1601)* module for the academic year 2023-24. This project was designed to streamline the management of Sarah's "TechExpo," an annual technology showcase event. The system allows for efficient handling of project submissions, evaluations, and award recognition processes, demonstrating core object-oriented programming (OOP) concepts and JavaFX GUI development skills.  

---

## Key Features  
1. **Add Project Details**  
   - Input details for each project, including Project ID, Name, Category, Team Members, Country, Brief Description, and a Team Logo.  
   - Validation ensures all inputs meet predefined criteria.  

2. **Update Project Details**  
   - Modify project information before the random selection process for spotlight showcases.  
   - User-friendly GUI allows seamless updates.  

3. **Delete Project Details**  
   - Remove project data securely and efficiently.  
   - Option available only before the random spotlight selection process.  

4. **View Project Details**  
   - Display project information in a well-formatted table sorted by Project ID.  
   - Thumbnail images included for visual clarity.  

5. **Save Project Details**  
   - Save all changes to a text file categorized by project category.  
   - Automatically updates the file upon adding, updating, or deleting records.  

6. **Random Spotlight Selection**  
   - Simulate a random selection of projects for the spotlight showcase, ensuring fair selection across categories.  

7. **Record Awards**  
   - Judges can assign points (1-5) to spotlight projects.  
   - System calculates total points and ranks projects for 1st, 2nd, and 3rd places.  
   - Scores are displayed as star ratings.  

8. **Visualize Award-Winning Projects**  
   - A graphical representation of points scored by projects using bar charts for easy interpretation.  

9. **Exit Program**  
   - Provides a safe exit option with prompts for unsaved changes.  

---

## Technical Highlights  
- **Programming Language**: Java  
- **GUI Framework**: JavaFX  
- **Key Development Concepts**:  
  - Object-Oriented Programming (Encapsulation, Classes, and Objects)  
  - Custom Sorting Algorithms (No inbuilt libraries used)  
  - Exception Handling for robust operations  
  - File I/O for persistent data storage  
  - Collections Framework for data handling  

---

## Installation & Usage  
1. **Clone the Repository**  
   ```bash  
   git clone https://github.com/yourusername/TechExpo-Management-System.git  
