package oopsquestion6;


public class FilePersistence extends Persistence{
    @Override
    public void persist()
    {
        System.out.println("Overiding in file persistence");
    }
}