package day9;


	import java.io.*;
	import java.nio.file.*;

	public class CompareFiles {
	    public static void main(String[] args) throws IOException {
	        String file1 = "D:\\File1.txt";
	        String file2 = "D:\\File2.txt";

	        String content1 = Files.readString(Path.of(file1));
	        String content2 = Files.readString(Path.of(file2));

	        if(content1.equals(content2)) {
	            System.out.println("Files are same");
	        } else {
	            System.out.println("Files are different");
	        }
	    }
	}


