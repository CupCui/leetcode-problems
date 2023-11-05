-- Write an SQL query to report the nth highest salary from the Employee table. If there is no nth highest salary, the query should report null.
--
-- 来源：力扣（LeetCode）
-- 链接：https://leetcode.cn/problems/nth-highest-salary
-- 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

# Create table If Not Exists Employee (Id int, Salary int)
#     Truncate table Employee
#     insert into Employee (id, salary) values ('1', '100')
#     insert into Employee (id, salary) values ('2', '200')
#     insert into Employee (id, salary) values ('3', '300')

# declare m int;
#     m = 2;
SELECT IFNULL(
               (SELECT DISTINCT e.salary
                FROM Employee e
                ORDER BY e.salary DESC LIMIT 1, 1)
           , NULL)