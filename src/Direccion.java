
public class Direccion {
	

	private String id;
	private String calle;
	private String poblacion;
	private int cp;
	
	private Empresa empresa;
	
	
	public Direccion(){}

	
	


	public String getId() {
		return id;
	}





	public void setId(String id) {
		this.id = id;
	}





	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getCp() {
		return cp;
	}

	public void setCp(int cp) {
		this.cp = cp;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}





	public String getCalle() {
		return calle;
	}





	public void setCalle(String calle) {
		this.calle = calle;
	}


	
}
