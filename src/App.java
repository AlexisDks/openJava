import main.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
        Usuario usuario = new Usuario();
        usuario.setNombre("Juan");
        usuario.setSexo('M');
        usuario.setEdad((byte) 2);
        usuario.setDni((short) 74123476);
        usuario.setAñosTrabajo(15);
        usuario.setMesesTrabajo(300);
        usuario.setMesSalario((float) 15.0);
        usuario.setSueldo(15000);
        usuario.setActivo(true);

        System.out.println("El usuario es: " + usuario.getNombre() + "\n");
        System.out.println("Es del sexo: " + usuario.getSexo() + "\n");
        System.out.println("Tiene " + usuario.getEdad() + " años" + "\n");
        System.out.println("Su dni es: " + usuario.getDni() + " dni" + "\n");
        System.out.println("Tiene " + usuario.getAñosTrabajo() + " años de trabajo" + "\n");
        System.out.println("Tiene " + usuario.getMesesTrabajo() + " meses de trabajo" + "\n");
        System.out.println("Tiene un salario de: " + usuario.getMesSalario() + "€/mes" + "\n");
        System.out.println("Tiene un sueldo de: " + usuario.getSueldo() + "€" + "\n");
        System.out.println("Es activo: " + usuario.isActivo() + "\n");
    }
}
