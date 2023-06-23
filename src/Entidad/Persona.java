package Entidad;

import java.util.Date;

public class Persona {
    
    String name;
    Date birth;

    public Persona() {
    }

    public Persona(String name, Date birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public Date getBirth() {
        return birth;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Persona{" + "name= " + name + ", birth= " + birth + '}';
    }
    
    

}

//12. Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
//(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
