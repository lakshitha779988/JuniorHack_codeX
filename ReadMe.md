//readme 
 Hostel Management System (HMS)

 Java Command-Line Interface (CLI) application for managing the hostel allocation process at ABC University. This  allows administrative staff to manage students, hostels, rooms, and their allocations effectively.

Features:

Student Management:
  - Add, view, update, and remove student details.
Hostel Management:
  - Add and view hostels.
Room Management:
  - Add, view, and update room details.
Student Allocation Management:
  - Allocate and deallocate students to/from rooms.
  - View current room allocations and capacities.

 Additional Features:
- Update hostel details.
- Remove students and rooms.
- Proper error handling and prevention of user-side mistakes.
- Prevent multiple room allocations for a single student.
- Decline allocation requests if no capacity is available.


Technologies Used
- Programming Language: Java
- Database: MySQL (with JDBC connector)
- IDE: IntelliJ IDEA 



 Database Schema

Tables:
1. Student: 
   student_id (Primary Key)
   name
   email
   phone_number
   allocated_room_id (Foreign Key, can be null)

2. Hostel: 
   hostel_id (Primary Key)
   name
   number_of_rooms
   total_capacity

3. Room:
   room_id (Primary Key)
   hostel_id (Foreign Key)
   capacity
   available_capacity

4. Allocations:
   allocation_id (Primary Key)
   student_id (Foreign Key)
   room_id (Foreign Key)
   allocation_date



Installation

1. Clone the repository:
   
   git clone [https://github.com/your-username/hostel-management-system.git](https://github.com/lakshitha779988/JuniorHack_codeX.git)



Contribution

Lakshitha --DataBase Creation/JDBC connector/Student Management/Hostel Management/Room Management
Buddika  - DataBase Creation/Test case write/Allocation Management
Tharushi  -- DataBase Creation/Test case write/Allocation Management
Raveesha -- DataBase Creation/Test case write/include the README file/Allocation Management

  

