package bean;

public interface Sim {

    void calling();

    void data();

    // add this method so Mobile can use it
    Sim buyData(int amount);
}