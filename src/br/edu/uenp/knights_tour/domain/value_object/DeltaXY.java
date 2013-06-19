package br.edu.uenp.knights_tour.domain.value_object;

public class DeltaXY {
    
    private Integer dX;
    private Integer dY;

    public Integer getdX() {
        return dX;
    }

    public Integer getdY() {
        return dY;
    }
    
    public DeltaXY(Integer dX, Integer dY) {
        this.dX = dX;
        this.dY = dY;
    }
}
