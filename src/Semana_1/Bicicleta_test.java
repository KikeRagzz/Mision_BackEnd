package Semana_1;

public class Bicicleta_test {
    public static void main(String[] args){
        def();

    }

    public static void def(){
        Bicicleta_POO_Session mountainBici = new Bicicleta_POO_Session();
        mountainBici.setColor("White");
        mountainBici.setPinos(6);
        mountainBici.setRodada(24);
        mountainBici.setVelocidad(22.3);
        String msg="Es una bici de montaña las specs son:";
        msg +="\nColor: "+ mountainBici.getcolor();
        msg +="\nVelocidad: " + mountainBici.getVelocidad();
        msg +="\nPinos: " + mountainBici.getPinos();
        msg +="\nRodada: " + mountainBici.getRodada();

        System.out.print(msg);
    }

    public static void show(){

    }
}
