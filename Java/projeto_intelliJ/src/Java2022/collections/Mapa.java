package Java2022.collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        //O put irá adicionar se não existir, e substituir caso ja exista
        usuarios.put(1, "Roberto");
        usuarios.put(2, "Ricado");
        usuarios.put(3, "Rafaela");
        usuarios.put(4, "Rebeca");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        //Vai retornar todas as chaves. Não matém as chaves de ordem ordenada, nem mesmo
        //ordem numérica ou alfabética
        System.out.println(usuarios.keySet());

        //Retorna só os valores
        System.out.println(usuarios.values());

        //Retorna chave e valor juntos
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("Rebeca"));

        //Obter o valor a partir da chave
        System.out.println(usuarios.get(20));
        //Remover a partir da chave
        System.out.println(usuarios.remove(1));
        //Remover por chave e valor
        System.out.println(usuarios.remove(2, "Ricardo"));

        //Percorrer apenas a chave
        for (int chave: usuarios.keySet()){
            System.out.println(chave);
        }
        //Percorrer apenas o valor
        for (String valor: usuarios.values()){
            System.out.println(valor);
        }

        //Percorrer chave e valor
        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.println(registro.getKey() + " ==> ");
            System.out.println(registro.getValue());
        }
    }
}
