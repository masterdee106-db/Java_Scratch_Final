package Practice.FunctionalProgramming.FunctionalInterface;

import java.util.function.Supplier;

class KT {
    String name;
    int duration;

    KT(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }
}

public class SupplierFunctionalInterface {
    public static void main(String[] args) {
        Supplier<KT> ktSupplier =
                () -> new KT("Java", 4);

        KT kt = ktSupplier.get();
        System.out.println(kt.name);
    }
}
