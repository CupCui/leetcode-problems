# Combine Two Tables

/*
Write an SQL query to report the first name, last name, city, and state of each person in the Person table. If the address of a personId is not present in the Address table, report null instead.
Return the result table in any order.
*/
SELECT
    pers.firstName, pers.lastName, addr.city, addr.state
FROM
    Person as pers
LEFT JOIN
    Address as addr
ON
    addr.personId = pers.personId;
