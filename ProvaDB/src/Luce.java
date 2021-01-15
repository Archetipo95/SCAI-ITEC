public class Luce implements Dispositivo{
    private final int idDispositivo;
    private boolean isAcceso = false;

    public Luce(int idDispositivo){
        this.idDispositivo = idDispositivo;
    }
    
    public int getIdDispositivo() {
        return idDispositivo;
    }

    public boolean getStato() {
        return isAcceso;
    }

    public void setStato(boolean stato){
        this.isAcceso = stato;
    }

}