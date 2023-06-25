public enum EstadoBrasileiro {
    SAO_PAULO("SP", "São Paulo",11),
    RIO_JANEIRO("RJ", "Rio de Janeiro",12),
    PIAUI("PI", "Piauí",13),
    MARANHAO("MA", "Maranhão", 14),
    CEARA("CE", "Ceará", 15);

    private String sigla;
    private String nome;
    private int ibge;


    //Construtor é privado porque ninguem precisa contruir um enum de fora da classe
    private EstadoBrasileiro(String sigla, String nome, int ibge) {
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public int getIbge() {
        return ibge;
    }

    public String getNomeMaiusculo() {
        return nome.toUpperCase();
    }
}
