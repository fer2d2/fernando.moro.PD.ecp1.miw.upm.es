package es.upm.miw.pd.state.connection;

public abstract class EstadoConexion {

    protected Conexion conexion;

    public EstadoConexion(Conexion conexion) {
        super();
        this.conexion = conexion;
    }

    public abstract void abrir();

    public abstract void cerrar();

    public abstract void iniciar();

    public abstract void parar();

    public abstract void recibir(int response);

    public abstract void enviar(String request);

    public Conexion getConexion() {
        return conexion;
    }

    public abstract Estado getEstado();
}
