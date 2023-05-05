package entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cardapio {
    private Map<String,Double> pratos= new HashMap<>();
    private Map<String,Double> bebidas= new HashMap<>();

    public void initdb(){
        List<String> nav = new ArrayList<>();
        nav.add("1. lasanha");

        pratos.put(nav.get(0), 64.0);
        pratos.put("2. costela",113.5);
        pratos.put("3. hotdog",25.5);
        bebidas.put("4. suco de maracuja",12.5);
        bebidas.put("5. coca",5.5);
        System.out.println(pratos.get(nav.get(0)));
    }

}
