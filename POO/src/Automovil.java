public class Automovil implements Comparable<Automovil> {
    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS = "Gris Oscuro";

    private int id;

    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;

    public static Estanque estanque;

    private Persona conductor;

    private Rueda[] ruedas = new Rueda[5];
    private int indiceRuedas;
    private static Color colorPatente = Color.NARANJA;

    private static int ultimoId;


    private TipoAutomovil tipo;
    public Automovil(){
        this.id = ++ultimoId;
    }

    public Automovil(String fabricante,String modelo){
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color){
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }



    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque){
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque,Persona conductor, Rueda[] ruedas) {
        this(fabricante,modelo,color,motor,estanque);
        this.conductor = conductor;
        this.ruedas = ruedas;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(this.indiceRuedas <this.ruedas.length){
        this.ruedas[this.indiceRuedas++] = rueda;
        }
        return this;
    }

    public int getId(){
        return this.id;
    }

    public static Color getColorPatente(){
        return colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public static Estanque getEstanque() {
        if(estanque == null){
            estanque = new Estanque();
        }

        return estanque;
    }

    public static void setEstanque(Estanque estanque) {
        Automovil.estanque = estanque;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public String detalle(){

        String sb = "auto.fabricante = " + this.fabricante +
                "\nauto.modelo = " + this.modelo;
        if(this.getTipo() != null) {
            sb+="\nauto.tipo = " + this.getTipo().getDescripcion();

        }
        sb+="\nauto.color = " + this.color +
                    "\nauto.patenteColor = "+ colorPatente+
                    "\nauto.cilindrada = " + this.motor.getCilindrada() +
                    "\nauto.id = " + this.id;
        if(getConductor() != null){
            sb+="\nConductor :"+this.getModelo()+" "+this.getConductor();
        }
        if(getRuedas() != null){
            sb+="\n Ruedas del automovil: ";
            for(Rueda r: this.getRuedas()){
                sb+="\n"+r.getFabricante()+" , aro: "+r.getAro()+" , ancho "+r.getAncho();
            }
        }

        return sb;
    }

    public String acelerar(int rpm){
        return "El auto "+this.fabricante+" acelerando a "+rpm+" rpm";
    }

    public String frenar(){
        return fabricante+" "+modelo+" frenando";
    }

    public String acelerarFrenar(int rpm){
        String  acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar+" \n"+frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km/(porcentajeBencina*getEstanque().getCapacidad());
    }
    public static float calcularConsumoStatic(int km, float porcentajeBencina){
        return km/(porcentajeBencina*estanque.getCapacidad());
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km/(getEstanque().getCapacidad()*(porcentajeBencina/100f));
    }
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Automovil)){
            return false;
        }

        if(this == obj){
            return true;
        }

        Automovil a = (Automovil) obj;
        return (this.fabricante != null
                &&this.modelo != null
                &&this.fabricante.equals(a.getFabricante())
                &&this.modelo.equals(a.getModelo()));
    }

    @Override
    public String toString() {
        return this.id+" : "+fabricante+" "+modelo;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    @Override
    public int compareTo(Automovil auto){ //Compara un objeto con otro
        return this.fabricante.compareTo(auto.fabricante);
    }

}
