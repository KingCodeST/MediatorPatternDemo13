public class FrenchBuyer extends Buyer {

    public FrenchBuyer(Mediator mediator, String unitOfCurrency) {
        super(mediator, unitOfCurrency);
        this.mediator.registerFrenchBuyer(this);
    }

    public FrenchBuyer(Mediator mediator) {
        super(mediator);
    }
}
