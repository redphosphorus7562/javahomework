package 作业4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class hash {
    public static void main(String[] args) {
        try {
            byte[] sha1= dfs("D:\\notebook");
            String result="";
            for(int i=0;i<sha1.length;i++){
                   result+=Integer.toString(sha1[i]&0xFF,16);
            }
            System.out.println(result);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static byte[] dfs(String path) throws Exception{
        File dir= new File(path);
        File[] fs=dir.listFiles();
        byte[] buffer=new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        for(int i=0;i<fs.length;i++){
            if(fs[i].isFile()){
                FileInputStream is= new FileInputStream(fs[i]);
                int numRead=0;
                do{
                    numRead=is.read(buffer);
                    if(numRead>0){
                        complete.update(buffer,0,numRead);
                    }
                }while (numRead!=-1);
                is.close();
            }
            if(fs[i].isDirectory()){
                dfs(path+File.separator+fs[i].getName());
            }
        }
        return complete.digest();
    }
}
