package paquete1;

/* *
 *
 * @author Usuario
 */
public class Herencia {

    public int getCantNaves() {
        return cantNaves;
    }

    public void setCantNaves(int cantNaves) {
        this.cantNaves = cantNaves;
    }

    public int getLitpar() {
        return litpar;
    }

    public void setLitpar(int litpar) {
        this.litpar = litpar;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public int getParsec() {
        return parsec;
    }

    public void setParsec(int parsec) {
        this.parsec = parsec;
    }
    protected int cantNaves; 
    protected int litpar; 
    protected int cap; 
    protected int parsec; 

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    protected String tipo; 
    public Herencia(){
        
    }
    public Herencia(int cantNaves, int litpar, int cap, int parsec, String tipo){
      this.cantNaves=cantNaves; 
      this.litpar=litpar; 
      this.cap=cap; 
      this.parsec=parsec; 
      this.tipo=tipo; 
    }
    public String imprimirdatos(){
        String datos;
        datos ="Tipo: "+tipo+"Cantidad de naves: "+cantNaves+"\n"+ "Litros por Parsec" + litpar+"Capacidad de pasajeros por nave: "+cap+"\n"+ "Parsec estimados de guerra: " + parsec;
        return datos; 
    }
    
}
