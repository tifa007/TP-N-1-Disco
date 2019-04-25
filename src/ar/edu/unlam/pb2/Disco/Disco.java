package ar.edu.unlam.pb2.Disco;

public class Disco {
	
	private Float radioInterior;
	private Float radioExterior;
	private Float perimetroInterior;
	private Float perimetroExterior;
	private Float superficie;
	
	public Disco(Float radioInterior, Float radioExterior){
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
		
	}

	public Float getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(Float radioInterior) {
		this.radioInterior = radioInterior;
	}

	public Float getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(Float radioExterior) {
		this.radioExterior = radioExterior;
	}

	public Float getPerimetroInterior() {
		return perimetroInterior;
	}

	public void setPerimetroInterior(Float perimetroInterior) {
		this.perimetroInterior = perimetroInterior;
	}

	public Float getPerimetroExterior() {
		return perimetroExterior;
	}

	public void setPerimetroExterior(Float perimetroExterior) {
		this.perimetroExterior = perimetroExterior;
	}

	public Float getSuperficie() {
		return superficie;
	}

	public void setSuperficie(Float superficie) {
		this.superficie = superficie;
	}
	
	
	 public Float calculoDelPerimetroInterior() {
		 Float Resultado;
    	
    	perimetroInterior=(float)(2*Math.PI*radioInterior);
    	Resultado=perimetroInterior;
		return Resultado;
	}
	 
	 public Float calculoDelPerimetroExterior() {
		 Float Resultado;
    
    	perimetroExterior=(float)(2*Math.PI*radioExterior);
    	Resultado=perimetroExterior;
		return Resultado;
	}
	 
    public Float calculoDeSuperficieDelDisco() {
    	Float Resultado;
    	Float SuperficieInterior;
    	Float SuperficieExterior;
    
    	SuperficieInterior= (float)(Math.PI* Math.pow(radioInterior,2));
    	SuperficieExterior= (float)(Math.PI* Math.pow(radioExterior,2));
    	superficie=SuperficieExterior-SuperficieInterior;
    	
    	Resultado =superficie;		
		return Resultado;
		
	}
    
}
