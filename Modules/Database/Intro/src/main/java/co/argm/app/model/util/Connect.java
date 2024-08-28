package co.argm.app.model.util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Clase utilitaria para manejar la conexión a la base de datos usando un pool de conexiones.
 */
public class Connect {
    private static BasicDataSource pool;

    /**
     * Obtiene una instancia del pool de conexiones.
     *
     * @return El pool de conexiones.
     */
    public static BasicDataSource getInstance() {
        if (pool == null) {
            pool = new BasicDataSource();
            pool.setUrl("jdbc:mysql://localhost:3306/java_course");
            pool.setUsername("root");
            pool.setPassword("ArGm_2005");
            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }

    /**
     * Obtiene una conexión desde el pool de conexiones.
     *
     * @return Una conexión a la base de datos.
     * @throws SQLException si ocurre un error al obtener la conexión.
     */
    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}
