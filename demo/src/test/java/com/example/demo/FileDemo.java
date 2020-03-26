package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.jupiter.api.Test;

class FileDemo {

	 @Test
	    public void writeFile() throws IOException {
	       
	        FileWriter fw=new FileWriter(new File("E:/data_test/cd_sfxx.txt"));
	        BufferedWriter  bw=new BufferedWriter(fw);
	        for(int i=1;i<=3000000;i++){
	            bw.write(i+ ","+ "测试" + i +"\n");
	        }
	        bw.close();
	        fw.close();
	    }

}
