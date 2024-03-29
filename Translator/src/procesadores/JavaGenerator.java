package procesadores;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class JavaGenerator {
	private String code;
	private String filename;

	public JavaGenerator() {
		this.filename = "Main";
		this.code = "package procesadores;\n"
				+ "import java.util.Scanner;\n"+
				"import java.util.Locale;\n"+
				"public class "+filename+" {\nScanner in;";
	}

	public void generate() {
		
		try {
			
			FileOutputStream out = new FileOutputStream(System.clearProperty("user.dir")+"/src/procesadores/"+this.filename+".java");
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
	
	public void addFile(String name) {
		this.filename += name.replace(".txt", "");
	}


}
