package modelo;

public enum TipoElemento {
	
	AGUA("agua") {
		public double danioContra(TipoElemento t) {
			return t.danioQueTeHaceAgua();
		}
		public double danioQueTeHaceAgua() {
			return 0.5;
		}
		public double danioQueTeHaceFuego() {
			return 0.5;
		}
		public double danioQueTeHacePlanta(){
			return 2.0;
		}
		public double danioQueTeHaceNormal(){
			return 1.0;
		}
	},
	FUEGO("fuego") {
		public double danioContra(TipoElemento t) {
			return t.danioQueTeHaceFuego();
		}
		public double danioQueTeHaceAgua() {
			return 2.0;
		}
		public double danioQueTeHaceFuego() {
			return 0.5;
		}
		public double danioQueTeHacePlanta(){
			return 0.5;
		}
		public double danioQueTeHaceNormal(){
			return 1.0;
		}
	},
	PLANTA("planta") {
		public double danioContra(TipoElemento t) {
			return t.danioQueTeHacePlanta();
		}
		public double danioQueTeHaceAgua() {
			return 0.5;
		}
		public double danioQueTeHaceFuego() {
			return 2.0;
		}
		public double danioQueTeHacePlanta(){
			return 0.5;
		}
		public double danioQueTeHaceNormal(){
			return 1.0;
		}
	},
	NORMAL("normal") {
		public double danioContra(TipoElemento t) {
			return t.danioQueTeHaceNormal();
		}
		public double danioQueTeHaceAgua() {
			return 1.0;
		}
		public double danioQueTeHaceFuego() {
			return 1.0;
		}
		public double danioQueTeHacePlanta(){
			return 1.0;
		}
		public double danioQueTeHaceNormal(){
			return 1.0;
		}
	};
	
	private String tipoElemento;
	
	private TipoElemento(String tipo){
		this.tipoElemento = tipo;			
	}
	public abstract double danioContra(TipoElemento t);
	public abstract double danioQueTeHaceAgua();
	public abstract double danioQueTeHaceFuego();
	public abstract double danioQueTeHacePlanta();
	public abstract double danioQueTeHaceNormal();

}
