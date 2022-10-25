public class Bulbasaur extends Pokemon implements IPlanta{
    @Override
    public void atacarDrenaje() {
        System.out.println("Si te rindes ahora, prometo que te convertiré en algo útil, como una tostadora o una lavadora.");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("El ser durmiente dentro de mí se ha despertado. Yo soy el príncipe de todos los Saiyan, una vez más... ¡He vuelto!");
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("¿Estás listo para ser testigo de un poder que no ha sido visto en miles de años?");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Un saiyan que no puede ni moverse es inútil para mí.");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("¿Qué sucede Freezer? ¿Tu cerebro es otro de tus músculos débiles y sin usar?");
    }
}
