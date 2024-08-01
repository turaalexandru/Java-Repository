package AbstractizareRestaurant;

public class RestaurantMix extends Restaurant implements VeganInterface, MeetLoverInterface{

    public RestaurantMix(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void gatesteVegan() {

    }

    @Override
    public void prezentareMeniuVegan() {

    }

    @Override
    public void prezentareMeniu() {

    }
}

//de incercat sa reproduc nationala de fotbal
//primul nivel de persoane, mai departe mergem la fotbalist/antrenor/medic
//
