package dev.f.nomalluguespartner;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.math.BigDecimal;

public class MapsActivity extends FragmentActivity {

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    public static BigDecimal round(float d, int decimalPlace) {
        BigDecimal bd = new BigDecimal(Float.toString(d));
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        return bd;
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.setMyLocationEnabled(true);
        int h;
        int i=0;
        int id_mkt;
        String name_mkt ="";
        float lat_mkt = 0;
        float lon_mkt = 0;


        //ACTIVAR LOCALIZACIÓN DEL USUARIO Y SETEARLA
        LocationManager lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        Location location = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
        double latUsr = location.getLatitude();
        double lonUsr = location.getLongitude();

        Location locationUsr = new Location("LOCALIZACIÓN  DEL USUARIO");
        locationUsr.setLatitude(latUsr);
        locationUsr.setLongitude(lonUsr);

        //CENTRAR MAPA
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latUsr, lonUsr), 14));

        //AÑADIR MARCADORES

        mMap.addMarker(new MarkerOptions().position(new LatLng(19.404916,-99.201984)).title("AMERICA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.440242,-99.170318)).title("ANAHUAC ANEXO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.440755,-99.169975)).title("ANAHUAC ZONA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.452594,-99.201933)).title("ARGENTINA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.447243,-99.194527)).title("DIECIOCHO DE MARZO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.402665,-99.177415)).title("ESCANDON"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.44182,-99.192376)).title("GRANADA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.402816,-99.188894)).title("ING. GONZALO PEÑA MANTEROLA (CARTAGENA)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.450055,-99.186032)).title("LAGO GARDA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.461433,-99.191906)).title("LAGO GASCASONICA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.419255,-99.214744)).title("MONTE ATHOS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.410593,-99.190317)).title("PLUTARCO ELIAS CALLES       (EL CHORRITO)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.427347,-99.212449)).title("PRADO NORTE"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.421641,-99.209273)).title("PRADO SUR"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.429721,-99.221664)).title("SAN ISIDRO ANEXO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.429847,-99.220768)).title("SAN ISIDRO ZONA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.45811,-99.186657)).title("TACUBA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.398672,-99.187194)).title("TACUBAYA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.457971,-99.20775)).title("ZACATITO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.466271,-99.150715)).title("ARENAL"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.482872,-99.185439)).title("AZCAPOTZALCO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.475726,-99.176803)).title("BENITO JUAREZ"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.465003,-99.181152)).title("CLAVERIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.475223,-99.161796)).title("COSMOPOLITA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.482364,-99.215322)).title("JARDIN 23 DE ABRIL"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.480752,-99.205178)).title("JARDIN FORTUNA NACIONAL"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.480329,-99.155869)).title("LAMINADORES"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.464396,-99.16926)).title("NUEVA SANTA MARIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.463233,-99.173568)).title("OBRERO POPULAR"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.474433,-99.171229)).title("PANTACO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.496204,-99.197497)).title("PASTEROS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.475848,-99.153559)).title("PROHOGAR"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.4915,-99.213632)).title("PROVIDENCIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.49214,-99.183927)).title("REYNOSA TAMAULIPAS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.492959,-99.203381)).title("SAN JUAN TLIHUACA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.476417,-99.196399)).title("SANTA LUCIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.462054,-99.162595)).title("TLATILCO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.467591,-99.163067)).title("VICTORIA DE LAS DEMOCRACIAS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.398624,-99.144039)).title("ALAMOS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.380097,-99.150259)).title("INDEPENDENCIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.394121,-99.134015)).title("LA MODERNA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.380765,-99.138898)).title("LAGO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.395642,-99.166189)).title("LAZARO CARDENAS(DEL VALLE)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.372911,-99.18858)).title("MIXCOAC"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.372745,-99.144119)).title("PORTALES ANEXO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.371726,-99.143516)).title("PORTALES ZONA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.389153,-99.143874)).title("POSTAL ANEXO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.389408,-99.144284)).title("POSTAL ZONA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.399194,-99.154621)).title("PRIMERO DE DICIEMBRE"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.391847,-99.183519)).title("SAN PEDRO DE LOS PINOS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.37023,-99.160923)).title("SANTA CRUZ ATOYAC"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.388125,-99.147309)).title("SANTA MARIA NATIVITAS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.37702,-99.174209)).title("TLACOQUEMÉCATL"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.390121,-99.157566)).title("VEINTICUATRO DE AGOSTO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.437816,-99.128292)).title("ABELARDO L. RODRIGUEZ (CORONAS)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.437232,-99.127952)).title("ABELARDO L. RODRIGUEZ (ZONA)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.45941,-99.1301)).title("BEETHOVEN"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.45357,-99.152845)).title("BUGAMBILIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.429685,-99.166889)).title("CUAUHTEMOC"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.438418,-99.141615)).title("DOS DE ABRIL"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.457962,-99.137312)).title("FRANCISCO SARABIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.414703,-99.145741)).title("HIDALGO ANEXO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.413849,-99.146099)).title("HIDALGO ZONA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.424335,-99.165484)).title("INSURGENTES"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.407011,-99.139324)).title("ISABEL LA CATOLICA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.42614,-99.154583)).title("JUAREZ"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.452212,-99.160092)).title("LA DALIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.443168,-99.136323)).title("LAGUNILLA ROPA Y TELAS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.441979,-99.139032)).title("LAGUNILLA SAN CAMILITO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.441848,-99.13661)).title("LAGUNILLA VARIOS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.444028,-99.134657)).title("LAGUNILLA ZONA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.44547,-99.145389)).title("MARTINEZ DE LA TORRE (ANEXO)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.445212,-99.144294)).title("MARTINEZ DE LA TORRE (ZONA)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.410408,-99.163499)).title("MELCHOR OCAMPO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.434381,-99.125106)).title("MERCED MIXCALCO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.411327,-99.17446)).title("MICHOACAN"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.408564,-99.149795)).title("MORELIA"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.429778,-99.146059)).title("PALACIO DE LAS FLORES"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.412479,-99.128367)).title("PAULINO  NAVARRO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.422493,-99.135792)).title("PEQUEÑO COMERCIO"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.441825,-99.162254)).title("SAN COSME"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.461977,-99.139067)).title("SAN JOAQUIN (ANEXO)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.46269,-99.139324)).title("SAN JOAQUIN ZONA (PERALVILLO)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.427418,-99.142588)).title("SAN JUAN ARCOS DE BELEM"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.430175,-99.143085)).title("SAN JUAN CURIOSIDADES"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.430036,-99.144608)).title("SAN JUAN PUGIBET"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.424944,-99.131098)).title("SAN LUCAS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.447207,-99.128477)).title("TEPITO FIERROS VIEJOS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.44265,-99.12929)).title("TEPITO ROPA Y TELAS (granaditas)"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.447124,-99.127332)).title("TEPITO VARIOS"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(19.446418,-99.127453)).title("TEPITO ZONA"));

        Location locationMarket = new Location ("GRANADA");
        locationMarket.setLatitude(19.44182);
        locationMarket.setLongitude(-99.192376);

        //GET DISTANCE.
        float distance = (locationUsr.distanceTo(locationMarket))/1000;
        BigDecimal simDist;
        simDist=round(distance,1);

        //TOAST
        Context context = getApplicationContext();
        CharSequence text = "Estás a " + simDist + " km. del Mercado GRANADA";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
