package Semana_1;

public class Bicicleta_POO_Session {
    // Características del objeto - Campos
    public int pinos, rodada;
    public double Velocidad;
    public String color;


    // Métodos
    public double getVelocidad(){return Velocidad;}
    public int getPinos(){return pinos;}
    public int getRodada(){return rodada;}
    public String getcolor(){return color;}

    public boolean setPinos(int pinos){
        if(pinos>0){
            this.pinos = pinos;
            return true;
        } else
            return false;
    }

    public boolean setRodada(int rodada){
        if(rodada>0){
            this.rodada = rodada;
            return true;
        } else
            return false;
    }

    public boolean setVelocidad(double Velocidad){
        if(Velocidad >= 0){
            this.Velocidad = Velocidad;
            return true;
        } else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        } else
            return false;
    }
    public String printState(){
        return "pinos: "+pinos+"\n"+
                "Rodada:"+rodada+"\n"+
                "Velocidad: "+Velocidad+"\n"+
                "Color: "+color+"\n";
    }

    //public void setRodada(int rodada){
      //  this.rodada = rodada; // This se utiliza para definifir variables
    //}
}
