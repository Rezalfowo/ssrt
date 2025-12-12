package semcomdt.swsecurity.web.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Database {
	static String url;

	public Database(String url) {
		Database.url = url;
	}

	public static void setUrl(String url) {
		Database.url = url;
	}

	public static void connect() {
		// connection string

		try (Connection conn = DriverManager.getConnection(url)) {
			if (conn != null) {
				DatabaseMetaData meta = conn.getMetaData();
				System.out.println("Database launched with driver " + meta.getDriverName());
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static List<DslFile> selectAll() {
		List<DslFile> dslfiles = new ArrayList<DslFile>();
		String sql = "SELECT ROWID,*  FROM dsl_files";
		try (Connection conn = DriverManager.getConnection(url);

				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				dslfiles.add(new DslFile(rs.getInt("id"), rs.getString("filename"), rs.getString("extension"),
						rs.getString("file")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dslfiles;
	}

	public static List<DslFile> selectAllFiltered(String extensionfilter) {
		List<DslFile> dslfiles = new ArrayList<DslFile>();
		String sql = "SELECT ROWID,*  FROM dsl_files WHERE extension='" + extensionfilter + "'";
		try (Connection conn = DriverManager.getConnection(url);

				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				dslfiles.add(new DslFile(rs.getInt("ROWID"), rs.getString("filename"), rs.getString("extension"),
						rs.getString("file")));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dslfiles;
	}

	public static DslFile loadFile(String filenameextension) {
		String[] file = filenameextension.split("\\.");
		String sql = "SELECT ROWID,filename,extension,file FROM dsl_files WHERE filename='" + file[0]
				+ "' AND extension='" + file[1] + "'";
		List<DslFile> result = new ArrayList<DslFile>();
		try (Connection conn = DriverManager.getConnection(url);

				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(sql)) {

			while (rs.next()) {
				result.add(new DslFile(rs.getInt("ROWID"), rs.getString("filename"), rs.getString("extension"),
						rs.getString("file")));

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		if (!result.isEmpty())
			return result.getFirst();
		return null;
	}

	public static boolean checkFileExists(DslFile dslfile) {
		if (dslfile.getId() != null) {
			String sql = "SELECT COUNT(*) FROM dsl_files WHERE ROWID=" + dslfile.getId();
			try (Connection conn = DriverManager.getConnection(url);

					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(sql)) {
				if (rs.next())
					return rs.next();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}

		return false;
	}

	public static void updateFile(DslFile dslfile) {
		String sql = "";
		boolean fileexists = checkFileExists(dslfile);
		if (fileexists) {
			sql = "UPDATE dsl_files " + "SET filename = ?, extension = ? file = ? " + "WHERE ROWID = ?";
		} else {
			sql = "INSERT INTO dsl_files " + "(filename,extension,file)" + "VALUES(?,?,?);";
		}

		try (Connection conn = DriverManager.getConnection(url);) {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, dslfile.getFilename());
			stmt.setString(2, dslfile.getExtension());
			stmt.setString(3, dslfile.getContent());
			if (fileexists) {
				stmt.setInt(4, dslfile.getId());
			}
			stmt.executeUpdate();
			System.out.println("Updated file:" + dslfile.getFilename() + "." + dslfile.getExtension());

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
