package Semana_1;

import sun.invoke.empty.Empty;

public class Task_1 {
    public int extremidades, ojos, cola, orejas;
    public float nivel_poder, size;
    public String color_pelo;

    //Metodos
    public int getExtremidades() {return extremidades;}
    public int getOjos() {return ojos;}
    public int getCola(){return cola;}
    public int getOrejas(){return orejas;}
    public float getNivel_poder() {return nivel_poder;}
    public float getSize() {return size;}
    public String getColor_pelo() {return color_pelo;}

    public boolean setExtremidades(int extremidades){
        if (extremidades == 4){
            this.extremidades=extremidades;
            return true;
        } else
            return false;
    }
    public boolean setOjos(int ojos){
        if (ojos == 2){
            this.ojos=ojos;
            return true;
        } else
            return false;
    }
    public boolean setCola(int cola){
        if (cola <= 1){
            this.cola = cola;
            return true;
        }else
            return false;
    }

    public boolean setOrejas(int orejas){
        if (orejas == 2){
            this.orejas = orejas;
            return true;
        } else
            return false;
    }

    public boolean setNivel_poder(float nivel_poder){
        if (nivel_poder >= 200){
            this.nivel_poder = nivel_poder;
            return true;
        } else
            return false;
    }

    public boolean setSize(float size){
        if (size <= 1){
            this.size = size;
            return true;
        } else
            return false;
    }

    public boolean setColor_pelo(String color_pelo){
        if (!color_pelo.isEmpty()){
            this.color_pelo= color_pelo;
            return true;
        } else
            return false;
    }
    public String pulbicState(){
        return "Extremidades: "+extremidades+
                "\nOjos: "+ojos+
                "\nCola: "+cola+
                "\nOrejas: "+orejas+
                "\nNivel dee Poder: "+nivel_poder+
                "\nTamaño: "+size+
                "\nColor: "+color_pelo;
    }



}
