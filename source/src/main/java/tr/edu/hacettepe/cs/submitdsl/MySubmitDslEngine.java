package tr.edu.hacettepe.cs.submitdsl;

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.util.zip.*;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

  public class MySubmitDslEngine implements SubmitDslEngine {

	private SubmitModel submitModel = null;
	String subject;
	
	@Override
	public void parseInput(String input) throws RecognitionException {
		CharStream charstream = new ANTLRStringStream(input);
		SubmitDslLexer lexer = new SubmitDslLexer(charstream);
		TokenStream tokenStream = new CommonTokenStream(lexer);
		SubmitDslParser parser = new SubmitDslParser(tokenStream);
		submitModel = parser.parse();

	}

	@Override
	public SubmitModel getSubmitModel() {
		return submitModel;
	}
	
	private String getPath(String directory,String file) {
		directory=directory+file;
		return directory;
	}
	
	private String getDirectoryPath(String directory) {
		directory=directory+"/";
		return directory;
	}
	
	private String getPattern(String pattern)
	{
		int size=pattern.length();
		String temp=pattern.substring(1, size);
		return temp;
	}
	
	@Override
	public boolean checkSubmission(String zipFilePath) throws IOException {
		// TODO Auto-generated method stub
	
		MySubmitFormat taken = new MySubmitFormat();
		List<MySubmitFormat> directory = new ArrayList<MySubmitFormat>();
		List<MySubmitFormat> file = new ArrayList<MySubmitFormat>();
		List<MySubmitFormat> file_pattern = new ArrayList<MySubmitFormat>();
		List<ZipEntry> recursive = new ArrayList<ZipEntry>();
		

		int size=getSubmitModel().getSubmitFormat().size();
		for(int i=0;i<size;i++)
		{
			taken=getSubmitModel().getSubmitFormat().get(i);
			if(taken.numero==2)
			{
				String newDirectory=getDirectoryPath(taken.getElement_name());
				taken.setElement_name(newDirectory);
				directory.add(taken);
			}
			else if(taken.numero==0)
			{
				String newFile=getPath(directory.get(directory.size()-1).getElement_name(),taken.getElement_name());
			    taken.setElement_name(newFile);
			    file.add(taken);
			}
			else if(taken.numero==1)
			{			
				String newFile=getPath(directory.get(directory.size()-1).getElement_name(),getPattern(taken.getElement_name()));
				taken.setElement_name(newFile);
				file_pattern.add(taken);				
			}
		}
		for(int i=0;i<directory.size();i++){
			System.out.println("directorlar:"+directory.get(i).getElement_name());
		}
		int size_directory=directory.size();
		int size_file=file.size();
		ZipFile zf=new ZipFile(zipFilePath);
		Enumeration<?> e = zf.entries();
		 while(e.hasMoreElements()) {
			ZipEntry entry = (ZipEntry) e.nextElement();
            System.out.println("\nExtracting: " +entry.getName());
            if(entry.isDirectory()){
            	int directory_found=0;
            	MySubmitFormat test_directory= new MySubmitFormat();
            	for(int i=0;i<size_directory;i++)
            	{
            		int h;
            		test_directory=directory.get(i);
            		System.out.println(test_directory.getElement_name());	
            		h=test_directory.getElement_name().indexOf(entry.getName());
            		if(h!=-1)
            		{
            			directory_found=1;
            			directory.get(i).setItem(1);
            			break;
            		}
            	}
            	if(directory_found==0)
            		return false;
            }
            else//entry is not directory
            {
            	MySubmitFormat test_file= new MySubmitFormat();
            	int file_found=0;
            	for(int i=0;i<size_file;i++)
            	{
            		file_found=0;
            		test_file=file.get(i);
            		if(test_file.getElement_name().equals(entry.getName()))
            		{
            			file_found=1;
            			file.get(i).setItem(1);
            			System.out.println("I found it");
            			break;
            		}
            	}
            	if(file_found!=1)
            	{
        			System.out.println("I did not find it");
        			recursive.add(entry);
            	}
            }
		}
		
		for(int i=0;i<recursive.size();i++)//folder-recursive olanlarý tara
		{
			String str = recursive.get(i).getName();
		    String [] temp = null;
		    String hand2="";
		    temp = str.split("/");
		    String hand=temp[temp.length-1];
		    int b=hand.indexOf(".");
		    hand2=hand.substring(b,hand.length()); 
		    String road=temp[0];
		    for(int k=1;k<temp.length-1;k++)
		    {
		    	road=road+"/"+temp[k];
		    }
		    System.out.println("sebepýr road:"+road);
			System.out.println("sebep:"+hand2);
			int bulundu=0;
			for(int j=0;j<size_file;j++)
			{
				System.out.println("sonuc:"+file.get(j).getElement_name());
				int h=file.get(j).getElement_name().indexOf(hand);
				if(h!=-1)
				{
					System.out.println("buldum onu\n");
					if((file.get(j).getElement_order()[0]!=null && file.get(j).getElement_order()[0].equals("folder-recursive")) || (file.get(j).getElement_order()[1]!=null && file.get(j).getElement_order()[1].equals("folder-recursive")))
					{System.out.println("buldun ve recu\n"); bulundu=1; file.get(j).setItem(1);}
					break;
				}
			}
			for(int k=0;k<file_pattern.size();k++)
			{
				System.out.println("file patternlar:"+file_pattern.get(k).getElement_order()[0]);
				if((file_pattern.get(k).getElement_order()[0]!=null && file_pattern.get(k).getElement_order()[0].equals("folder-recursive"))||(file_pattern.get(k).getElement_order()[1]!=null && file_pattern.get(k).getElement_order()[1].equals("folder-recursive"))){
					int var=file_pattern.get(k).getElement_name().indexOf(road);
					if(var!=-1)
					{
						System.out.println("vay");
						int var2=file_pattern.get(k).getElement_name().indexOf(hand2);
						if(var2!=-1)
						{
							file_pattern.get(k).setItem(1);
							bulundu=1;
							System.out.println("o bulundu");
							break;
						}
					}
				}
				else if((file_pattern.get(k).getElement_order()[0]!=null && file_pattern.get(k).getElement_order()[0].equals("mandatory"))||(file_pattern.get(k).getElement_order()[1]!=null && file_pattern.get(k).getElement_order()[1].equals("mandatory"))){
					
					String [] tut = null;
					tut = str.split("/");
	 				String way=tut[0];
					for(int l=1;l<tut.length-1;l++)
						way=way+"/"+temp[l];
					System.out.println(way+" vs "+road);
					if(way.equals(road))
					{
						System.out.println("vay");
						int var2=file_pattern.get(k).getElement_name().indexOf(hand2);
						if(var2!=-1)
						{
							file_pattern.get(k).setItem(1);
							bulundu=1;
							System.out.println("oda bulundu");
							break;
						}
					}
				}
			}
			if(bulundu!=1){//fazladan dosya varsa hatalý girdidir!!!
				System.out.println("buraya girmeaa");
				return false;}
			
		}
		
		for(int i=0;i<size_directory;i++)//istenen directory zipte yok
		{
			MySubmitFormat test= new MySubmitFormat();
			test=directory.get(i);
			if(test.getItem()!=1 && test.getElement_order()[0].equals("mandatory")){
				System.out.println("false2"+test.getElement_name());
				return false;}
		}
		
		for(int i=0;i<size_file;i++)//istenen file zipte yok
		{
			MySubmitFormat test = new MySubmitFormat();
			test=file.get(i);
			if(test.getItem()!=1 && ((test.getElement_order()!=null && test.getElement_order()[0].equals("mandatory")) || (test.getElement_order()!=null&&test.getElement_order()[1].equals("mandatory")))){
				System.out.println("false3");return false;}
		}
		
		for(int i=0;i<file_pattern.size();i++)//istenen pattern zipte yok
		{
			MySubmitFormat test = new MySubmitFormat();
			test=file_pattern.get(i);
			if(test.getItem()!=1 && ((test.getElement_order()!=null && test.getElement_order()[0].equals("mandatory")) || (test.getElement_order()!=null&&test.getElement_order()[1].equals("mandatory")))){
				System.out.println("false4"+test.getElement_name());return false;}
		}
		
	   System.out.println("return true...");
		return true;
	}
	
}

