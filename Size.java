public enum Size{
     
    SMALL(32,36,"Pequeno",'S'),
    MEDIUM(37,44,"Médio",'M'),
    LARGE(45,52,"Grande",'L');
    
    /*
     * Atributos do Enumerado.
     */
    private final String description;
    private final int minValue;
    private final int maxValue;
    private final char code;
    
    /*
     * Construtor de inicialização.
     */
    private Size(int minValue, int maxValue, String description, char code){
        this.description=description;
        this.minValue=minValue;
        this.maxValue=maxValue;
        this.code=code;
    }
    
    /*
     * Retorna  a Descrição do Tamanho da Chávena.
     */
    @Override
    public String toString(){
        return this.description;
    }
    
    /*
     * Retorna  a Descrição do Tamanho da Chávena.
     */
    public String getDescription(){
        return description;
    }
    
    /*
     * Retorna a Capacidade Mínima da Chávena.
     */
    public int getMinValue(){
        return minValue;
    }
    
    /*
     * Retorna a Capacidade Máxima da Chávena.
     */
    public int getMaxValue(){
        return maxValue;
    }
    
    /*
     * Retorna o Dígito correspondente ao Tamanho.
     */
    public char getCode(){
        return code;
    }
}
