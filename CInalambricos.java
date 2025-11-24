public class CInalambricos{
    
    private String nombreDispositivo;
    private int bateriaActual;
    private boolean enlazadoAOtroDispositivo;
    
    public CInalambricos(String nomDispositivo, int Bateria){
        nombreDispositivo = nomDispositivo;
        bateriaActual = Bateria;
        enlazadoAOtroDispositivo = false;
    }
    
    public String getNDispositivo(){
        return nombreDispositivo;    
    }
    
    public int getBatActual(){
        return bateriaActual;
    }
    
    public boolean getEnlazado(){
        return enlazadoAOtroDispositivo;
    }
    
    public void NombrarDispositivo(String nombre){
        nombreDispositivo = nombre;
    }
    
    public void DescargaDeBateria(int bateriaGastada){
        bateriaActual = bateriaActual - bateriaGastada;
    }
    
    public void CambioEstado(){
        enlazadoAOtroDispositivo = !enlazadoAOtroDispositivo;
    }
    
    public void ImprimirEstado(){
        System.out.println("Nombre: " + nombreDispositivo + " | " + "Batería(%): " + bateriaActual + "%" + " | " + "Enlazado: " + enlazadoAOtroDispositivo);
    }
    
    public String MostrarEstado(){
        return "Nombre: " + nombreDispositivo + " | " + "Batería(%): " + bateriaActual + "%" + " | " + "Enlazado: " + enlazadoAOtroDispositivo;
    }
}