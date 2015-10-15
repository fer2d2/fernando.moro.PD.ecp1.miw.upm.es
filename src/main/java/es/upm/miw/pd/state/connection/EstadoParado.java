package es.upm.miw.pd.state.connection;

public class EstadoParado extends EstadoConexion {

    public EstadoParado(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void cerrar() {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void iniciar() {
        this.conexion.setEstado(new EstadoPreparado(this.conexion));

    }

    @Override
    public void parar() {
    }

    @Override
    public void recibir(int response) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void enviar(String request) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public Estado getEstado() {
        return Estado.PARADO;
    }
}
