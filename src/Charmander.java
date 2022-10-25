public class Charmander extends Pokemon implements IFuego{
    @Override
    public void atacarPunioFuego() {
        System.out.println("Yo soy tranquilo y mi corazón es puro... mi corazón tiene pura maldad.");
    }

    @Override
    public void atacarLanzaLlamas() {
        System.out.println("Soy el gobernante de todos los Saiyan, ¡hasta de ti Broly!");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Gracias por la oferta pero no puedo. Ese insecto de Kakaroto puede ser muy molesto, pero nuestra rivalidad es lo que me lleva a ser más fuerte. No puedo matarlo.");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Trunks, Bulma, esto es por ustedes. Esto también es por ti Kakaroto.");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("¿Eso es todo? ¿Se acabó? ¿Quieres decir que cuando ese tipo muere, las esferas del dragón son inútiles?");
    }
}
