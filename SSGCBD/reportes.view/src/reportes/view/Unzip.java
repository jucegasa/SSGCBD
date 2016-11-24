package reportes.view;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Unzip {
	
	public  void copyInputStream(InputStream in, OutputStream out) throws IOException {
		byte[] buffer = new byte[1024];
		int len;
		while ((len = in.read(buffer)) >= 0)
			out.write(buffer, 0, len);
		in.close();
		out.close();
	}

	public String getDir(String url){
		String res="";
		for(int i=0;i<url.length()-5;i++){
			res+= url.charAt(i);
		}
		return  res;
	}
	
	public void unzip(String url,String di) {
		Enumeration<?> entries;
		ZipFile zipFile;
		
		String dir = getDir(di)+"/";
		
		System.out.println(dir);
		try {
			zipFile = new ZipFile(url);
			entries = zipFile.entries();
		
			while (entries.hasMoreElements()) {
				ZipEntry entry = (ZipEntry) entries.nextElement();

				if (entry.isDirectory()) {
					// Assume directories are stored parents first then
					// children.
					File parent = new File(entry.getName()).getParentFile();
					if (parent != null)
					{
					    parent.mkdirs();
					}
					System.err.println("Extracting directory: "+ entry.getName());
					(new File(entry.getName())).mkdirs();
					continue;
				}
				File parent = new File(dir+entry.getName()).getParentFile();
				if (parent != null)
				{
				    parent.mkdirs();
				}
				System.err.println("Extracting file: " + entry.getName());
				copyInputStream( zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(dir+entry.getName())));
			}
			zipFile.close();
		} catch (IOException ioe) {
			System.err.println("Unhandled exception:");
			ioe.printStackTrace();
			return;
		}
	}
}
