package pro.edu;
/*
  @author   george
  @project   vsemtheory
  @class  Student
  @version  1.0.0 
  @since 05.04.2021 - 19.21
*/

public class Student extends Person implements IMyInterface{
    private int course;

    @Override
    public boolean isRecruit() {
        return false;
    }

    @Override
    public boolean isAdult() {
        return false;
    }

    @Override
    public String getMaritalStatus() {
        return null;
    }
}
