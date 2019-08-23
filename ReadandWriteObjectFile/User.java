package IO.ReadandWriteObjectFile;

import java.io.Serializable;

public class User implements Serializable {
   private String name;
   private String surname;
   private int age;
   public User(){
       
   }

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
   public User(String name){
       this.name=name;
   }
   public void setName(String name){
       this.name=name;}
   public String getName(){
       return this.name;
   }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
   
   @Override
    public String toString(){
        return "ad:"+name+"/nSoyad:"+surname+" age:"+age;
    }
   
}
