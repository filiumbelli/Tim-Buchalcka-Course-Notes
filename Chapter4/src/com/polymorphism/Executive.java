package com.polymorphism;

final class  Executive extends Manager {
    public Executive(double salary, String name, double bonus) {
        super(salary, name, bonus);
    }
    // cannot inherit from final error
    // the final keyword will not let any other classes to be
    // extended from Executive
    // not possible to be sub classed

}
