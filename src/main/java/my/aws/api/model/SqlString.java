package my.aws.api.model;
public class SqlString {
  public String toLogback(String sql) {
    return sql.replaceAll("\\?", "[{}]");
  }
}
