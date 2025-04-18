abstract class Decorator extends Offering{
    Offering Offering;
}
class Rum extends Decorator{
    Rum(Offering Offering){
        this.Offering=Offering;
    }
    String getName(){
        return Offering.getName() + " with Rum";
    }
    int getPrice(){
        return Offering.getPrice() + 55;
    }
}
class Gin extends Decorator{
    Gin(Offering Offering){
        this.Offering=Offering;
    }
    String getName(){
        return Offering.getName() + " with Gin";
    }
    int getPrice(){
        return Offering.getPrice() + 70;
    }
}
class Soda extends Decorator{
    Soda(Offering Offering){
        this.Offering=Offering;
    }
    String getName(){
        return Offering.getName() + " with Soda";
    }
    int getPrice(){
        return Offering.getPrice() + 45;
    }
}