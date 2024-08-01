package AbstractizareRestaurant;

public class RestaurantMeetLover extends Restaurant implements MeetLoverInterface{

    public RestaurantMeetLover(String numeRestaurant, String adresa, String meniu, Boolean delivery, String tipRestaurant) {
        super(numeRestaurant, adresa, meniu, delivery, tipRestaurant);
    }

    @Override
    public void prezentareMeniu() {

    }
}
