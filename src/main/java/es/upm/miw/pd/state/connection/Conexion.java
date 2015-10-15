package es.upm.miw.pd.state.connection;

public class Conexion {
    private EstadoConexion estado;

    private Link link;

    public Conexion(Link link) {
        assert link != null;
        this.link = link;
        this.estado = new EstadoCerrado(this);
    }

    public Link getLink() {
        return link;
    }

    public Estado getEstado() {
        return this.estado.getEstado();
    }

    public void abrir() {
        this.estado.abrir();
    }

    public void cerrar() {
        this.estado.cerrar();
    }

    public void parar() {
        this.estado.parar();
    }

    public void iniciar() {
        this.estado.iniciar();
    }

    public void enviar(String msg) {
        this.estado.enviar(msg);
    }

    public void recibir(int respuesta) {
        this.estado.recibir(respuesta);
    }

}
