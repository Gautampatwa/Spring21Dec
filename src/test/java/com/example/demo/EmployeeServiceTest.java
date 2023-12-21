package com.example.demo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(value = {MockitoExtension.class})
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class EmployeeServiceTest {
    

    private EmployeeService employeeService;
    @BeforeAll
    public void setUp()
    {
        employeeService=mock(EmployeeService.class);
    }

    @Test
    public void testEmployeeById()
    {
     Employee  employee=getEmp();
     when(employeeService.getEmpById(20L)).thenReturn(employee);
        System.out.println(employeeService.getEmpById(20L));
       // assertEquals("Gautam",employeeService.getEmpById(3L).getName());
        //assertEquals(77,employeeService.getEmpById(3L).getRollno());
    }

    private Employee getEmp()
    {
        Employee employee=new Employee();
        employee.setId(3L);
        employee.setName("Gautam");
        employee.setRollno(77);
        employee.setAddress("Delhi");
        return employee;
    }
}
