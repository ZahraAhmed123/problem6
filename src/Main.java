//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
  PrimarySchool ps=new PrimarySchool();
  ps.pupils();

  PublicPrimarySchool pps=new PublicPrimarySchool();
  pps.pupils();
  pps.governments();

  HighSchool hs=new HighSchool();
  hs.pupils();
  hs.Exams();
    }
}