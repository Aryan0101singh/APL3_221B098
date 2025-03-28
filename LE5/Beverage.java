abstract class Beverage{
    protected void pour(int qty){
        System.out.println("add"+qty+"ml of beverage");
    }
    abstract void addCondiment();
    protected void stir(){
        
    };
    private void serve(){
        System.out.println("serve to waiter");
    }
    public void templateMethod(int qty){
        pour(qty);
        addCondiment();
        stir();
        serve();
    }
    
        
    
}