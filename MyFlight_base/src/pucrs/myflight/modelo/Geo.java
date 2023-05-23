package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}

	@Override
	public String toString(){
		return " Latitude: " + latitude + " Longitude: " +  longitude;
	}

	  // Metodo para calcular a distancia entre
    // ESTA localizacao e o outra informada
	//Não testei
    public double distancia(Geo outra) {
        Geo obj = new Geo(getLatitude(), getLongitude());
        return distancia(obj, outra);
        //return distancia(this, outra);
    }
    
    // Metodo de classe (static) para calcular
	//Não testei
    public static double distancia(Geo geo1, Geo geo2) {
        double lat1 = Math.toRadians(geo1.getLatitude());
        double lat2 = Math.toRadians(geo2.getLatitude());
        double lon1 = Math.toRadians(geo1.getLongitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double diflat = (lat1-lat2)/2;
        double diflon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(diflat),2)+
                   Math.pow(Math.sin(diflon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
                
        return d;
	} 

	public double caldis(Geo geo2){
		double lon1 = Math.toRadians(this.longitude);
		double lat1 = Math.toRadians(this.latitude);
		double lat2 = Math.toRadians(geo2.getLatitude());
        double lon2 = Math.toRadians(geo2.getLongitude());
        
        double diflat = (lat1-lat2)/2;
        double diflon = (lon1-lon2)/2;
        
        double d = Math.pow(Math.sin(diflat),2)+
                   Math.pow(Math.sin(diflon),2)*
                   Math.cos(lat1) * Math.cos(lat2);
        
        d = 2 * 6371 * Math.asin(Math.sqrt(d));
		return d;

        
	}
}
