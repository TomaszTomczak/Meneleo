package com.aoxo.meneleo;

import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MarkerData {


    LatLng location;
    String description;
    MarkerOptions marker;
    Date date;
    private String dateFormat = "dd-MMM-yyyy";


    public MarkerData(MapPlaceType mp, LatLng location, String description, Date date)
    {
        SimpleDateFormat df = new SimpleDateFormat(dateFormat);

        BitmapDescriptor icon = BitmapDescriptorFactory.defaultMarker();
        this.date = date;

        this.location = location;
        this.description = description+ "\n" + df.format(date);
        marker = new MarkerOptions().position(
                location).title(description);

        // Changing marker icon
        switch(mp)
        {
            case PUB:       icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_pub);
                break;
            case COOLPLACE: icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_coolplace);
                break;
            case OTHER:     icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_other);
                break;
            case BEER:      icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_beer);
                break;
            case VODKA:     icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_vodka);
                break;
            case WHISKY:    icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_whiskey);
                break;
            case VINE:      icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_vine);
                break;
            case COGNAC:    icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_cognac);
                break;
            case DRINK:     icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_drink);
                break;
            default:        icon = BitmapDescriptorFactory.fromResource(R.drawable.marker_default);
                break;


        }
        marker.icon(icon);

    }

    public MarkerOptions getMarker()
    {
        return marker;
    }
}
