package Generics.InterfaceType;

//Eğer bir "generic interface" implement ederseniz

public class GenericClassimpl<T> implements GenericInterface<T>{


    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
