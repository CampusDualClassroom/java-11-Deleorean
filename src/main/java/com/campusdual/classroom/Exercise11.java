package com.campusdual.classroom;

public class Exercise11 {
    public static void main(String[] args) {
        TVRemote redRemote = new TVRemote("Rojo");
        TVRemote blackRemote = new TVRemote("Negro");

        redRemote.turnOn();
        System.out.println(redRemote.on);

        redRemote.channelUp();
        System.out.println(redRemote.channel);

        redRemote.channelDown();
        System.out.println(redRemote.channel);

        redRemote.setChannel(0);
        System.out.println(redRemote.channel);

        redRemote.channelDown();
        System.out.println(redRemote.channel);

        redRemote.setVolume(0);
        redRemote.volumeDown();
        System.out.println(redRemote.volume);

        System.out.println(redRemote.getColor());

        redRemote.turnOff();
        System.out.println(redRemote.on);

        /*
    Encender la TV
    Subir un canal
    Bajar un canal
    Establecer el canal en 0, intentar bajar un canal y comprobar que no se puede
    Subir el volumen
    Bajar el volumen
    Establecer el volumen en 0, intentar bajar el volumen y comprobar que no se puede
    Obtener el color del mando a distancia y mostrarlo por pantalla
     System.out.println(redRemote.getColor());
        System.out.println(blackRemote.getColor());
    Apagar la TV
    */
    }

}