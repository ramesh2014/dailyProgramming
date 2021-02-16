package daily.samples.certification.nio;

import java.nio.file.Path;

public class PathsAndFolder {
	
	public static void main(String[] args) {
		
	   Path someFile = Path.of("/","users","joe","docs","some.txt");
	   System.out.println(someFile);
	   Path justSomeFile = someFile.getFileName();
	   System.out.println(justSomeFile);
	   Path docsFolder = someFile.getParent();
	   System.out.println(docsFolder);
	   Path currentFolder = docsFolder.relativize(someFile);
	   System.out.println(currentFolder);
		   
	}
}
