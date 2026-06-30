CREATE TABLE Employee(

    empid NUMBER PRIMARY KEY,
    empname VARCHAR2(50),
    salary NUMBER

);

INSERT INTO Employee VALUES(101,'John',50000);
INSERT INTO Employee VALUES(102,'David',45000);
INSERT INTO Employee VALUES(103,'Sam',60000);

COMMIT;

CREATE OR REPLACE PROCEDURE GetSalary(

    id IN NUMBER

)

IS

    sal NUMBER;

BEGIN

    SELECT salary
    INTO sal
    FROM Employee
    WHERE empid=id;

    DBMS_OUTPUT.PUT_LINE('Salary = ' || sal);

END;
/

BEGIN
    GetSalary(101);
END;
/