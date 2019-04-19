public class SwedishBuyer extends Buyer {


    public SwedishBuyer(Mediator mediator, String unitOfCurrency) {
        super(mediator, unitOfCurrency);
        this.mediator.registerSwedishBuyer(this);
    }


    public SwedishBuyer(Mediator mediator) {
        super(mediator);
        this.mediator.registerSwedishBuyer(this);
    }
}
