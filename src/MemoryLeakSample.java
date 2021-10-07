import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.List;

public class MemoryLeakSample {
	private List list = new LinkedList();
	private int index;
	
	public void load(File file) throws IOException {
		index = list.size();
		 BufferedReader reader = new BufferedReader(new FileReader(file));
		 String buf = reader.readLine();
		 while(buf != null) {
			 list.add(buf);
			 buf = reader.readLine();
		 }
	 }
	 
	public int printNextLine(OutputStream os) throws IOException {
		if(index >= list.size())
			return -1;
		String line = (String)list.get(index++);
		int len = line.length();
		os.write((index + ":").getBytes());
		os.write(line.getBytes());
		os.write('n');
		return len;
	}
}
