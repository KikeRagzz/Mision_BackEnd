package Semana_1;

public class Task_1_Implementation {
    public static void main(String[] args){
        def();
    }

    public static void def(){
        Task_1 Pikachu= new Task_1();
        Pikachu.setExtremidades(4);
        Pikachu.setCola(1);
        Pikachu.setColor_pelo("Amarillo");
        Pikachu.setNivel_poder(250.5f);
        Pikachu.setSize(0.5f);
        Pikachu.setOrejas(2);
        Pikachu.setOjos(2);
        String msg = "Pickachu es un pookemón con:";
        msg += "\n"+ Pikachu.getExtremidades()+" Patas";
        msg += "\nPelo color "+Pikachu.getColor_pelo();
        msg += "\n"+Pikachu.getCola()+" Cola";
        msg += "\n"+Pikachu.getOjos()+" Ojos";
        msg += "\n"+Pikachu.getOrejas()+" Orejas";
        msg += "\nSu impactrueno tiene una potencia de: "+Pikachu.getNivel_poder()+"MV";
        msg += "\n Mide "+Pikachu.getSize()+" metros";

        System.out.print(msg);
    }
    public static void show(){
    }
}
