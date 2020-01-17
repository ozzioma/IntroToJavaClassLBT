import javax.sound.midi.Sequence;

public class WelcomeApp {

    public static void main(String[] args) {
        System.out.println("Chief Ozzy o jare, you are issa too much");

        //RunExamples1();
//        RunExamples2();

        exceptionExample2();

        //WelcomeApp app=new WelcomeApp();
        //app.RunExamples2();

    }


    private static void RunExamples1() {

        SequenceDemo demo1 = new SequenceDemo();
        demo1.Example1();

        SequenceDemo demo2 = new SequenceDemo();
        demo2.Example1();

        //SequenceDemo.Example1();

        //print Tunji lga
        SequenceDemo.printTunjiLGA();

        //print Deji lga
        demo1.printDejiLGA();

        demo1.ifExample1();
    }

    public static void RunExamples2() {
        System.out.println("Hello from Example2");

        SalaryLevel level1 = new SalaryLevel(100, "111");
        level1.setGrade("100");
        level1.setSalary(10000);


        ArmySalaryLevel level2 = new ArmySalaryLevel();
        level2.setGrade("120");
        level2.setSalary(20000);
        level2.setDeductions(1000);
        level2.setOverTime(500);


        NNPCSalaryLevel level3 = new NNPCSalaryLevel();
        level3.setGrade("130");
        level3.setSalary(30000);
        level3.setBonus(3500);

    }

    public static void exceptionExample1() {
        ArmySalaryLevel level = new ArmySalaryLevel();
        level.setSalary(2000);


        try {

            double salary = level.calculateSalary(6000, 200);
            System.out.println("salary is->" + salary);

        } catch (InvalidDeductionException ex) {
            //handler code
            ex.printStackTrace();

            System.out.println("exception message is->" + ex.getMessage());
            System.out.println("invalid deduction amount is->" + ex.getAmount());

        } catch (Exception ex) {
            //handler code
            System.out.println("exception message is->" + ex.getMessage());
            //System.out.println("invalid deduction amount is->" + ex.getAmount());

        } finally {
            //close open resources
            // jdbc connections
            // network sockets
            //etc
        }


    }

    public static void exceptionExample2() {
        ArmySalaryLevel level = new ArmySalaryLevel();
        level.setSalary(2000);

        double salary = level.calculateSalary2(6000, 200);
        System.out.println("salary is->" + salary);

    }

}



