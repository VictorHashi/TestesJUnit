package sqlGenerator;

public class Gerador {

    private String nome;
    private String tipo;
    private boolean notNull;
    private boolean autoIncrement;

    public Gerador(String nome, String tipo, boolean notNull, boolean autoIncrement) {
        super();
        this.nome = nome;
        this.tipo = tipo;
        this.notNull = notNull;
        this.autoIncrement = autoIncrement;
    }

    public String gerar() {
        StringBuilder builder = new StringBuilder();
        builder.append(nome);
        builder.append(" ");
        builder.append(tipo);
        if (notNull) {
            builder.append(" NOT NULL");
        }
        if (autoIncrement) {
            builder.append(" AUTO INCREMENT");
        }
        builder.append(",");

        return builder.toString();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isNotNull() {
        return notNull;
    }

    public void setNotNull(boolean notNull) {
        this.notNull = notNull;
    }

    public boolean isAutoIncrement() {
        return autoIncrement;
    }

    public void setAutoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Gerador [nome=");
        builder.append(nome);
        builder.append(", tipo=");
        builder.append(tipo);
        builder.append(", notNull=");
        builder.append(notNull);
        builder.append(", autoIncrement=");
        builder.append(autoIncrement);
        builder.append("]");
        return builder.toString();
    }

}
