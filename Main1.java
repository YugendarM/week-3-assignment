public class Main1
{
    public static void main(String[] args)
    {
        Sports obj;
        obj=new Sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
        obj=new Soccer();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers();
    }
}
