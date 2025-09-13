# Campus Administration System

This is a small Java console project I made for my coursework.  
It lets us manage students, courses and enrollments in a menu system.  

-------------------------------------------------------------------------------------------------------

## How to Run
1. Launch PowerShell in the project directory.  
2. To compile all source files, use:
   ```
   javac -d bin (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
   ```
3. To start the application:
   ```
   java -cp bin edu.ccrm.cli.ConsoleApp
   ```
-------------------------------------------------------------------------------------------------------
## Features done
- Add and list learners  
- Add and list subjects  
- Register and deregister learners for subjects 
- Show all registrations  

## Java topics used
- OOP principles (custom classes, encapsulation, inheritance, polymorphism)  
- Enums (Term: FIRST, SECOND, THIRD)  
- ArrayList for dynamic data storage  
- Control flow: switch-case, loops, user input via Scanner  

-------------------------------------------------------------------------------------------------------

## Future work
Later I can add:
- Grades and GPA calculation  
- Transcript printing  
- File import/export (CSV)  
- Backup system  

-------------------------------------------------------------------------------------------------------

## Author
**Name:** Akshai Hari

