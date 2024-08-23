package br.com.fabio.main;

import br.com.fabio.conta.Conta;

public class PrincipalConta {

    public static void main(String[] arg) {
        
        Conta objConta = new Conta ("Fábio", 444-2, 21);

        System.out.println( objConta.saldo() );
        
    }
    
}
