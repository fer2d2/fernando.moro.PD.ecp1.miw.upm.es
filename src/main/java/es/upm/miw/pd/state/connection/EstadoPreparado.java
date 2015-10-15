package es.upm.miw.pd.state.connection;

public class EstadoPreparado extends EstadoConexion {

    public EstadoPreparado(Conexion conexion) {
        super(conexion);
    }

    @Override
    public void abrir() {
    }

    @Override
    public void cerrar() {
        this.conexion.setEstado(new EstadoCerrado(this.conexion));
        
    }

    @Override
    public void iniciar() {
    }

    @Override
    public void parar() {
        this.conexion.setEstado(new EstadoParado(this.conexion));
        
    }

    @Override
    public void recibir(int response) {
        throw new UnsupportedOperationException("Acción no permitida... ");
        
    }

    @Override
    public void enviar(String request) {
        this.conexion.getLink().enviar(request);
        this.conexion.setEstado(new EstadoEsperando(this.conexion));
        
    }

    @Override
    public Estado getEstado() {
        return Estado.PREPARADO;
    }

}
