package class9_Constructor.InterfaceAbstract;

public class FordFactory implements InterfaceConcept, CarGuidelines

{
    @Override
    public void setEngine() {
        System.out.println("Ford extreme weather engine");
    }

    @Override
    public void setTyres() {
        System.out.println("Ford tyres");
    }

    @Override
    public void setSteeringWheel() {
        System.out.println("All weather ST - Ford");
    }

    @Override
    public void sayHello() {
        System.out.println("say hello method");
    }

    @Override
    public void sayBye() {
        System.out.println();
    }
}
