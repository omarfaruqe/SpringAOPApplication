/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springaopapp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author faruqe
 */
@Aspect
public class LoggingAspect {
    
//    @Before("execution(public String getName())") for any class
//    @Before("execution(public String springaopapp.Triangle.getName())")    for Triangle Class only
//    @Before("execution(public String springaopapp.*.getName())")       for any class in this package 
//    @Before("execution(public * get*())") // Wild card 
//    @Before("execution(* get*())") // Wild card for no arguments
//    @Before("execution(* get*(*))") // Wild card for 1 or more arguments
//    @Before("execution(* get*(..))") // Wild card for 0 or more arguments
       @Before("allMethodForCircle()") // Pointcut
    public void LoggingAdvice(){
        System.out.println("Advice run. Get Method called");
    }
    
//    @Before("execution(* get*())") // Wild card for no arguments
    @Before("allGetters()") // Pointcut
    public void secondAdvice(){
        System.out.println("Second Advice executed");
    }
    
    @Before("allMethodForCircle()")
    public void thirdAdvice(){
        System.out.println("Only for Circle");
    }
    
    @Pointcut("execution(* get*())")  // Pointcut
    public void allGetters(){}
    
    @Pointcut("execution(* springaopapp.Circle.*(..))")  // Pointcut
    public void allMethodForCircle(){}

}
