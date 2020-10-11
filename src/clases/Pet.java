
package clases;


public class Pet {
    
    String name;
    String animal;
    int age;
    
    public Pet(String name, String animal, int age){
        this.name=name;
        this.animal=animal;
        this.age=age;
    }
    
    public void setName (String name){
        this.name=name;
    }
    public void setAnimal(String animal){
        this.animal=animal;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public String getAnimal(){
        return this.animal;
    }
    public int getAge(){
        return this.age;
    }
}
