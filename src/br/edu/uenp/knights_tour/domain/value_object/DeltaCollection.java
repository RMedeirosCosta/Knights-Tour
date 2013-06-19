package br.edu.uenp.knights_tour.domain.value_object;

import java.util.HashSet;
import java.util.Set;


public class DeltaCollection {
    
    public static Set<DeltaXY> getDeltaCollection() {
        Set<DeltaXY> colecao = new HashSet<>();
        colecao.add(new DeltaXY(2, 1));
        colecao.add(new DeltaXY(2, -1));
        colecao.add(new DeltaXY(-2, 1));
        colecao.add(new DeltaXY(-2, -1));
        
        return colecao;
    }    
}
