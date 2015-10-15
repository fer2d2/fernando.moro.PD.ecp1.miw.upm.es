package es.upm.miw.pd.state.connection;

public class EstadoCerrado extends EstadoConexion {

    public EstadoCerrado(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() {
        this.conexion.setEstado(new EstadoPreparado(this.conexion));
        
    }

    @Override
    public void cerrar() {
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
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void enviar(String request) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public Estado getEstado() {
        return Estado.CERRADO;
    }

}
