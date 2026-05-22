package ro.ase.cts.telecomunicatii.main;

import ro.ase.cts.telecomunicatii.clase.*;

public class Main {
     static void main(String[] args) {
        TichetHandler chatbot = new HandlerChatbot();
        TichetHandler operator = new HandlerOperatorUman();
        TichetHandler inginer = new HandlerInginerSistem();

        chatbot.setSuccesor(operator);
        operator.setSuccesor(inginer);

        chatbot.proceseazaTichet(TipDificultate.RIDICATA,200);
        chatbot.proceseazaTichet(TipDificultate.MEDIE,120);
        chatbot.proceseazaTichet(TipDificultate.SCAZUTA,92);
    }
}
