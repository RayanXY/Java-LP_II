/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apresentacao;

/**
 *
 * @author rayan
 */
public class Person {
    
    private String name, age;
    
    public Person(String name, String age){
        
        this.name = name;
        this.age = age;
        
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setAge(String age){
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public String getAge(){
        return age;
    }
    
    @Override
    public String toString(){
        return getName() + " - " + getAge() + " anos";
    }
    
}
