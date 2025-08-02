package br.com.dio.model;

public class Space {
    private Integer actual;

    private final int expected;

    private final boolean fixed;

    public Space(int expected, boolean fixed) {
        this.expected = expected;
        this.fixed = fixed;
        if (fixed){ //se o valor for fixo
            actual = expected; //ele não vai ser alterado
        }
    }

    public Integer getActual() {
        return actual;
    }

    public void setActual(Integer actual) { //permite a alteração
        if (fixed) return; //mantem a posição
        this.actual = actual; //edita
    }

    public void clearSpace(){
        setActual(null);
    }

    public int getExpected() {
        return expected;
    }

    public boolean isFixed() {
        return fixed;
    }
}
