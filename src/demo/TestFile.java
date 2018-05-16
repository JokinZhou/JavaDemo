/**
 * 
 */
package demo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author lenovo
 *
 */
public class TestFile {  
    
    public static void main(String[] args){  
          
        try{  
            //将文件加载实力化到内存里 
            File file = new File("d:\\filename.txt");  
              
            if(!file.exists()){  
                file.createNewFile();  
            }  
              
            PrintWriter pw = new PrintWriter(file);  
            pw.println("这是一个测试文件");  
            pw.println(1234567);  
            pw.close();  
            System.out.println("完成");  
        } catch (IOException e){  
              
            e.printStackTrace();  
        }  
    }  
      
}  