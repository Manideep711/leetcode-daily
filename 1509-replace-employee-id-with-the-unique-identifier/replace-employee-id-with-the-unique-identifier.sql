# Write your MySQL query statement below
select emp.unique_id,e.name from Employees e left join EmployeeUNI emp on emp.id=e.id