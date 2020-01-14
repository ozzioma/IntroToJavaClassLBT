public class SequenceDemo
{
    public static void main(String[] args)
    {

    }

    public void Example1()
    {
        System.out.println("Hello I am example");

        LGA data=new LGA();
        data.setLGACode("100");
        data.setLGAName("Shomolu");

        System.out.println("LGA name is->"+data.getLgaName());
    }

    //static method
    public static void printTunjiLGA()
    {
        System.out.println("Tunji's LGA is->Shagamu marlian");
    }

    //instance method
    public void printDejiLGA()
    {
        System.out.println("Deji's LGA is->Iseyin");
    }


    public void ifExample1()
    {
        LGA lga1=new LGA();
        lga1.setLGACode("100");
        lga1.setLGAName("Shomolu");

        processLGA(lga1);

        LGA lga2=new LGA();
        lga2.setLGACode("200");
        lga2.setLGAName("Asokoro");

        processLGA(lga2);

    }


    public void processLGA(LGA lga)
    {
        if(lga.getLgaName().equals("Asokoro"))
        {
            System.out.println("LGA name is->"+lga.getLgaName());
            System.out.println("Dimension of LGA is 2000ha");
        }

        if(lga.getLgaName().equals("Asokoro"))
        {
            System.out.println("LGA name is->"+lga.getLgaName());
            System.out.println("Dimension of LGA is 2000ha");
        }
        else if(lga.getLgaName().equals("Shomolu"))
        {
            System.out.println("LGA name is->"+lga.getLgaName());
            System.out.println("Dimension of LGA is 3000ha");
        }
        else if(lga.getLgaName().equals("Eti Osa"))
        {
            System.out.println("LGA name is->"+lga.getLgaName());
            System.out.println("Dimension of LGA is 4000ha");
        }
        else
        {
            System.out.println("Oga ur LGA no show for map!");
        }



    }

//    public LGA getLGADetails(String name)
//    {
//
//    }

}
