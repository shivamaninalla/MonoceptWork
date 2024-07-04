use organization;

select * from table_emp;

#1 Display all employee names in ascending order
select ename from table_emp order by ename asc;
#2 Display all employee names, salary, commision of employees in dept 10
select ename, sal comm from table_emp where deptno=10;
#3 Display all employees in deptno 20 and 30
select * from table_emp where deptno in (20,30);
#4 Display all employees who are managers(job title)
select * from table_emp where job="MANAGER";
#5 Display all employees whose salary is between 2000 to 5000
select * from table_emp where sal between 2000 and 5000;
#6 Display all employees whose commision is NULL
select * from table_emp where comm is null;
#7 Display employee name, salary, commission in descending order based on salary
select ename, sal, comm from table_emp order by sal desc;
#8 Display average, max, min and sum of salaries of employees
select avg(sal) as average_salary, max(sal) as maximum_salary, min(sal) as minimum_salary, sum(sal) as sum_of_salaries from table_emp;
#9 Display hire date, current date and tenure(in months) of the employees
select hiredate ,current_date() as currentdate, concat(timestampdiff(year,hiredate,current_date())," years",timestampdiff(month,hiredate,current_date())%12," months") as tenure from table_emp;
#10 Display all employees whose name starts with 'S'.
select ename from table_emp where ename like 's%';
#11 Display unique deptno from emp table
select distinct deptno as department_number from table_emp;
#12 Display employee's job in lower case
select lower(job) as lower_job from table_emp;
#13 Select top 3 salary earning employees(employees can be more than 3)
select * from table_emp order by sal desc limit 3;
#14 Select all clerks and managers in dept 10
select job , deptno from table_emp where deptno=10 and job in("CLERK","MANAGER");
#15 Display all clerks in ascending order of deptno
select ename, job, deptno from table_emp where job="CLERK" order by deptno ;
#16 Display all employees department wise
select * from table_emp order by deptno;
select e.ename, d.deptname from table_emp e join table_dept d on e.deptno=d.deptno order by d.deptname;
#17 Display how many employees are there for each job
select count(*) as total_number_of_employees, job from table_emp group by job;
#18 Display what jobs are there for each department and number of employees for each job
select  d.deptname, e.job, count(job) as number_of_employees from table_emp e join table_dept d on e.deptno=d.deptno group by e.job , d.deptname, d.deptname, e.job;
#19 Display how many employees are there for each department
select count(*) as Number_of_employees, d.deptname employees from table_emp e join table_dept d on e.deptno=d.deptno group by  d.deptname;
#20 Display the rank of each employee with respect to their salary (highest salary will be rank 1)
select ename , sal, rank() over (order by sal desc) as salary_rank from table_emp;