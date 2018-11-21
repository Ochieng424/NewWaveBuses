# KISII UNIVERSITY

## FACULTY OF INFORMATION SCIENCE AND TECHNOLOGY

```
Department of Computer Science
Programming Project
COMP/SOEN 305 : Object-oriented Programming with Java
```
(^)
AIM:^
(^)
The aim of this assignment is to provide an opportunity to demonstrate that you have acquired skills
and abilities in the area of object-oriented programming. The assignment also provides you with an
opportunity to demonstrate that your knowledge and skills are hands-on and can be applied in real life
situations.
INSTRUCTIONS:
a) Deadline: 19 th Nov 2018 (The Deadline is fixed and CANNOT be extended).
b) Teamwork: You are allowed to work and hand in groups of up to 5 persons.
c) Deliverables:
i. A report (both as hard copy and PDF file). The report should describe your system
including output reports and design decisions, if any.
ii. Asingle file with source code files.
iii. Hand in your report (PDF file) and source code packaged(in CD) as a single .zip file
iv. The package containing your report and source files should be named
as: (groupname-1.zip). Example: Moonlight-1.zip.
v. The assignment will be graded during a defense (presentations).
(^)
ASSIGNMENT:^
New Wave Buses is a new bus company that will soon launch its services for Kisii and the surrounding
areas. In order to ease its operations the company plans to introduce pre-paid tickets that will be
dispensed by machines at various stages.
Ticket Pricing^
The bus company plans to use zonal pricing systems as follows:^

-^ The^ ticket^ price^ per^ day^ between^ Zone^2 (Mosocho,^ Oyugis or Kisumu)^ and^ Zone^1
    (Kisii town) is Ksh 200 per day
- The ticket price per day between Zone 3 (Kemera, Nyamira, or Kericho) and Zone 1 (Kisii
town) is Ksh 25 0 per day


- There is no direct bus connection between Zone 2 and Zone 3. If a passenger wants to travel
    between Zone 2 and Zone 3, he/she must first travel to Zone 1 and then from Zone 1 to the

destination zone.^
Discount^
In order to entice passengers to use pre-paid tickets, the bus company offers the following discounts^
i. A discount of 10% is given to a passenger who buys a ticket for 1 week (i.e., 7 days) or more
while passengers buying a 2-month ticket (i.e., 60 days) or more receive a 40% discount.
ii. Passengers who fall in the age bracket of 0 - 10 years or 50 years and more are entitled to a
discount of 40%

iii. A passenger is entitled to all the above (i-ii) discounts provided that he/she qualifies.^
You are required to develop a Java program that will be installed on the computers at the ticket
dispensing machines. The program prompts the user to input his/her name, age, origin zone (e.g., 2),
destination zone (e.g., 1), and the number of days (e.g., 7). The program then prints a ticket such as the
one shown in the sample output below.

```
Hint: Use object-oriented concepts (e.g., classes and methods) to structure your program. For instance,
you may implement methods to compute the discount, compute ticket rate, and a method to generate
and print a ticket (such as the one below).
public void generateTicket (...parameters go here...) {
//the implementation goes here
}^
Sample output:
New Wave Prepaid Ticket Dispensing Machine
Please enter your full names: Lisa Musisi
Enter your age: 21
Enter the origin Zone: 2
Enter the destination Zone: 3
Ticket for how many days?: 10
*******New Wave Buses Prepaid Ticket************
* Passenger name: Lisa Musisi
* Ticket valid for 10 day(s)
* Total amount paid: 4050.
* Discount received: 10.0%
* Thank you for travelling with us^
```
(^)
New Wave Prepaid Ticket Dispensing Machine
Please enter your full names: Joseph Okello
Enter your age: 51
Enter the origin Zone: 2
Enter the destination Zone: 1
Ticket for how many days?: 7
*******New Wave Buses Prepaid Ticket************
* Passenger name: Joseph Okello
* Ticket valid for 7 day(s)
* Total amount paid: 700. 0
* Discount received: 50.0%
* Thank you for travelling with us^


