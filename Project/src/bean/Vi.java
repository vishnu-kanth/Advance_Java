package bean;


public class Vi implements Sim {
    @Override
    public void calling() {
        System.out.println("Calling with Vi sim");
    }

    @Override
    public void data() {
        System.out.println("Using data of Vi");
    }

    @Override
    public Sim buyData(int amount) {
        return null;
    }
}