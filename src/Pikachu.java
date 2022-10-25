import javax.swing.*;
public class Pikachu extends Pokemon implements IElectrico{
    @Override
    public void atacarImpactoTrueno() {
        System.out.println("“¡El equipo Rocket ha sido vencido otra vez!”");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("¡Come polvo de Ponyta!");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Mi nombre... Es... ¡salsa de tomate! ¡No, espera! ¡Mi nombre es Tom Ato!");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pokemon yo te elijo");
    }

    @Override
    protected void atacarMordisco() {

    }
}
