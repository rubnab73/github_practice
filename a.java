class Singleton {
    private static Singleton ins = null;
    private int cod;

    private Singleton(int co) {   // private constructor
        this.cod = co;
    }

    public static Singleton getInstance(int co) {
        if (ins == null) {
            ins = new Singleton(co);   // only first call sets cod
        }
        return ins;
    }

    public int getcod() {
        return cod;
    }
}
