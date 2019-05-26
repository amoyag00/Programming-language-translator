package procesadores;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class JavaGenerator {
	private String code;
	private String filename;

	public JavaGenerator() {
		this.code = "package procesadores;\n"
				+ "import java.util.Scanner;\n"+
				"import java.util.Locale;\n"+
				"public class Main {\n";
	}

	public void generate() {
		
		try {
			FileOutputStream out = new FileOutputStream(System.getProperty("user.dir")+"/src/procesadores/Main.java");
			out.write(this.code.getBytes());
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void closeMain() {
		this.code +="\n}";
	}
	
	public void addCode(String code) {
		this.code +=code;
	}
}
