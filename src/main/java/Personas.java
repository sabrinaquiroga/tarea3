
public class Personas {


    String nombre;
    String apellido;
    int edad;
    String direccion;

    public Personas(){
        nombre="Diego";
        apellido="touchard";
        edad=    22;
        direccion="Achumani C29";
    }
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;

    }
    public void setApellido (String apellido){
        this.apellido=apellido;

    }
    public String getApellido(){
        return apellido;

    }
    public void setEdad (int edad){
        this.edad=edad;

    }
    public int getEdad(){
        return edad;

    }
    public void setDireccion (String direccion){
        this.direccion=direccion;

    }
    public String getDireccion(){
        return direccion;

    }

}

