package daily.samples.certification.files;

import java.nio.file.Path;

public class FilePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compilation Error for Java10:The method of(String, String, String, String, String) is undefined for the type Path
		Path someFile = Path.of("/","users","joe","docs","some.txt");
		Path justSomeFile = someFile.getFileName();
		Path docsFolder = someFile.getParent();
		Path currentFolder = docsFolder.relativize(someFile);
		System.out.println(someFile);
		System.out.println(justSomeFile);
		System.out.println(docsFolder);
		System.out.println(currentFolder);//Question here is: what it would print for currentFolder ?
		
//		Path someFolder = docsFolder.getParent();
//		Path currFolder = someFolder.relativize(someFile);
//		System.out.println(currFolder);
	}

}
