package back.controller;

import back.model.DataBaseConnection;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DataBaseConnection connection = new DataBaseConnection();

        connection.getConnection();
        Thread.sleep(5000);
        /*solo esperamos 5 segundos (5000 milisegundos) y despues se desconecta,
        no hay necesidad de ponerlo pero solo para simular que hace algo*/
        connection.disconnect();
    }
}
