SELECT MAX(e.salary) as secondHighestSalary from Employee e
where e.salary < (SELECT MAX(salary) from employee);