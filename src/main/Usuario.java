package main;

/**
 * Usuario
 */
public class Usuario {
    private String nombre;
    private char sexo;
    private byte edad;
    private short dni;
    private int añosTrabajo;
    private long mesesTrabajo;
    private float mesSalario;
    private double sueldo;
    private boolean activo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public short getDni() {
        return dni;
    }

    public void setDni(short dni) {
        this.dni = dni;
    }

    public int getAñosTrabajo() {
        return añosTrabajo;
    }

    public void setAñosTrabajo(int añosTrabajo) {
        this.añosTrabajo = añosTrabajo;
    }

    public long getMesesTrabajo() {
        return mesesTrabajo;
    }

    public void setMesesTrabajo(long mesesTrabajo) {
        this.mesesTrabajo = mesesTrabajo;
    }

    public float getMesSalario() {
        return mesSalario;
    }

    public void setMesSalario(float mesSalario) {
        this.mesSalario = mesSalario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}