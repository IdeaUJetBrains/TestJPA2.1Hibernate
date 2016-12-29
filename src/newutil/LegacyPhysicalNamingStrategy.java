package newutil;


import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.boot.model.naming.PhysicalNamingStrategy;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;

public class LegacyPhysicalNamingStrategy implements PhysicalNamingStrategy {
    private static final String SUFFIX = "TEST";
   // private final Pattern pattern = Pattern.compile("(\\p{Lower}+)(\\p{Upper}+)");
    public Identifier toPhysicalCatalogName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        return convert(name);
    }

    public Identifier toPhysicalSequenceName(Identifier name, JdbcEnvironment jdbcEnvironmen) {
        return convert(name);
    }

    public Identifier toPhysicalColumnName(Identifier name, JdbcEnvironment jdbcEnvironmen) {
        return convert(name);
    }

    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironmen) {
        return convert(name);
    }

    public Identifier toPhysicalSchemaName(Identifier name, JdbcEnvironment jdbcEnvironmen) {
        return convert(name);
    }

    private Identifier convert(Identifier identifier) {
        if (identifier == null || identifier.getText().trim().isEmpty()) {
            return identifier;
        }

        String text = identifier.getText();
        text =  text.concat(SUFFIX).toUpperCase();
        return Identifier.toIdentifier(text, identifier.isQuoted());
    }

}
