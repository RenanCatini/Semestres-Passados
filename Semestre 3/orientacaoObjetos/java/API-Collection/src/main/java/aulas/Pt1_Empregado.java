package aulas;

public class Pt1_Empregado {

    private int registro;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pt1_Empregado empregado = (Pt1_Empregado) o;
        return registro == empregado.registro;
    }

    @Override
    public int hashCode() {
        // return this.registro * 20;
        return 2000; // É correto mas ineficiente, pois todos os objetos estivessem no mesmo lugar
    }
}
