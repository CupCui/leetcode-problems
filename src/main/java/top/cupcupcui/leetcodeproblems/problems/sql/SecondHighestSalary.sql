# Second Highest Salary
# Write an SQL query to report the second highest salary from the Employee table. If there is no second highest salary, the query should report null.

# Create table If Not Exists Employee (id int, salary int)
# Truncate table Employee
# insert into Employee (id, salary) values ('1', '100')
# insert into Employee (id, salary) values ('2', '200')
# insert into Employee (id, salary) values ('3', '300')

SELECT
    IFNULL(
        (SELECT DISTINCT e.salary FROM Employee e ORDER BY e.salary DESC LIMIT 1 OFFSET 1), NULL
        )
        AS SecondHighestSalary;

