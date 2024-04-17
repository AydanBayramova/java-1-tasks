package module01.Part02.generics;

public class GenericsMethods {
    public <A> boolean ISEqauals(Generics<A> A1,Generics<A> A2){
        return A1.getA().equals(A2.getA());
    }
}

