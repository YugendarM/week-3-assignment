public abstract class Book{
    String title;
    public abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book
{
    @Override
    public void setTitle(String s)
    {
        this.title=s;
    }
}