package ar.edu.unlam.pb2.Disco;

public class Disco {
	
	private Float radioInterior;
	private Float radioExterior;
	
	public Disco(Float radioInterior, Float radioExterior){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	public Disco() {
		// TODO Auto-generated constructor stub
	}

	public Float getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Float radioInterior) {
		if(radioInterior>= 0)
		this.radioInterior = radioInterior;
	}

	public Float getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Float radioExterior) {
		if(radioExterior>0)
		this.radioExterior = radioExterior;
		//deberia ser siempre mayor que el radio interior sino no no seria un disco(?)
	}
	
	
	 public Float calculoDelPerimetroInterior(Float radioInt) {
		Float Resultado;
    	Resultado=(float)(2*Math.PI*radioInt);
		return Resultado;
	}
	 
	 public Float calculoDelPerimetroExterior(Float radioExt) {
		Float Resultado;
    	Resultado=(float)(2*Math.PI*radioExt);
		return Resultado;
	}
	 
    public Float calculoDeSuperficieDelDisco(Float radioInt, Float radioExt) {
    	Float superficieInterior= (float)(Math.PI* Math.pow(radioInterior,2));
    	Float superficieExterior= (float)(Math.PI* Math.pow(radioExterior,2));
    	return superficieExterior-superficieInterior;
		
	}
}
