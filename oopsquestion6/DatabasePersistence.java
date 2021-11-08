package oopsquestion6;

public class DatabasePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in file persistence");
    }
}