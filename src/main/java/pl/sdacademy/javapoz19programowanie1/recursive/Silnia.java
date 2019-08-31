package pl.sdacademy.javapoz19programowanie1.recursive;

public class Silnia {

    public long silnia(long index){

        long accumulator = 1;
        for (int i = 1; i <= index ; i++) {
            accumulator *= i;

        }

        return accumulator;

    }

    public long fraction(long index){

        if (index == 0) return 1;

        return fraction(index) * fraction(index - 1);
    }
}
