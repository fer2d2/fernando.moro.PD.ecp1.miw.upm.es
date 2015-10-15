package es.upm.miw.pd.state.connection;

public class EstadoEsperando extends EstadoConexion {

    public EstadoEsperando(Conexion conexion) {
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
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void parar() {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public void recibir(int response) {
        EstadoConexion estado;

        if (response == 0) {
            estado = new EstadoPreparado(this.conexion);
        } else {
            estado = new EstadoCerrado(this.conexion);
        }

        this.conexion.setEstado(estado);
    }

    @Override
    public void enviar(String request) {
        throw new UnsupportedOperationException("Acción no permitida... ");

    }

    @Override
    public Estado getEstado() {
        return Estado.ESPERANDO;
    }
}
